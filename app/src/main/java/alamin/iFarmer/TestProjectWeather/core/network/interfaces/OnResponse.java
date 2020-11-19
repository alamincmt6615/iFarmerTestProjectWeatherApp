package alamin.iFarmer.TestProjectWeather.core.network.interfaces;

import com.android.volley.VolleyError;
import alamin.iFarmer.TestProjectWeather.core.network.response.BaseResponse;


public interface OnResponse {

    void onSuccessResponse(BaseResponse baseResponse);

    void onErrorResponse(VolleyError error, Class<? extends BaseResponse> responseClass);
}
