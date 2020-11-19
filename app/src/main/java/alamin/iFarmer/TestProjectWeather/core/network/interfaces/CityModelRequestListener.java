package alamin.iFarmer.TestProjectWeather.core.network.interfaces;

import com.android.volley.VolleyError;
import alamin.iFarmer.TestProjectWeather.core.network.response.BaseResponse;
import alamin.iFarmer.TestProjectWeather.modelview.CityWeatherModelView;


public interface CityModelRequestListener {

    void onCityResponseArive(CityWeatherModelView model);

    void onCityResponseError(VolleyError error, Class<? extends BaseResponse> responseClass);
}
