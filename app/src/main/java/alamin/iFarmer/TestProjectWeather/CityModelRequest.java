package alamin.iFarmer.TestProjectWeather;

import com.android.volley.VolleyError;
import alamin.iFarmer.TestProjectWeather.core.network.interfaces.CityModelRequestListener;
import alamin.iFarmer.TestProjectWeather.core.network.interfaces.OnResponse;
import alamin.iFarmer.TestProjectWeather.core.network.model.CityWeatherModel;
import alamin.iFarmer.TestProjectWeather.core.network.response.BaseResponse;
import alamin.iFarmer.TestProjectWeather.core.network.response.CurrWeatherResponse;
import alamin.iFarmer.TestProjectWeather.core.network.response.FiveDaysWeatherResponse;
import alamin.iFarmer.TestProjectWeather.modelview.CityWeatherModelView;


public class CityModelRequest implements OnResponse {

    private CityWeatherModel cityWeather;
    private boolean isCurrWeatherArrived, isFiveDaysWeatherArrived;
    private boolean isFailed;

    private CityModelRequestListener mCallBack;


    public CityModelRequest(int cursorIndex, String shownName, boolean isCurrentLocation,
                            CityModelRequestListener mCallBack) {

        cityWeather = new CityWeatherModel();

        cityWeather.setCursorIndex(cursorIndex);
        cityWeather.setCurrentLocation(isCurrentLocation);

        if (shownName != null)
            cityWeather.setShownName(shownName);

        this.mCallBack = mCallBack;
    }

    @Override
    public void onSuccessResponse(BaseResponse baseResponse) {

        if (baseResponse instanceof CurrWeatherResponse) {

            CurrWeatherResponse response = (CurrWeatherResponse) baseResponse;

            cityWeather.setCurrentWeather(response);

            isCurrWeatherArrived = true;

        } else if (baseResponse instanceof FiveDaysWeatherResponse) {

            FiveDaysWeatherResponse response = (FiveDaysWeatherResponse) baseResponse;

            cityWeather.setFiveDaysWeather(response);

            isFiveDaysWeatherArrived = true;

        }

        checkReponseOK();
    }

    @Override
    public void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass) {

        if (!isFailed) {
            isFailed = true;
            mCallBack.onCityResponseError(error, responseClass);
        }
    }

    private void checkReponseOK() {

        if (isCurrWeatherArrived && isFiveDaysWeatherArrived) {

            CityWeatherModelView modelView = new CityWeatherModelView(cityWeather);

            mCallBack.onCityResponseArive(modelView);
        }
    }
}
