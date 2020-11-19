package alamin.iFarmer.TestProjectWeather.core.ui;

import alamin.iFarmer.TestProjectWeather.core.network.VolleyManager;
import alamin.iFarmer.TestProjectWeather.core.network.interfaces.OnResponse;
import alamin.iFarmer.TestProjectWeather.core.network.response.BaseResponse;


public abstract class RequestActivity extends PermissionActivity {

    public VolleyManager volleyManager = null;


    public void sendRequest(String url, OnResponse onResponse, Class<? extends BaseResponse> responseClass) {

        volleyManager = new VolleyManager();
        volleyManager.sendRequest(url, onResponse, responseClass);
    }

    public void cancelAllRequests(Object tag) {

        volleyManager = new VolleyManager();
        volleyManager.cancelAllRequests(tag);
    }
}
