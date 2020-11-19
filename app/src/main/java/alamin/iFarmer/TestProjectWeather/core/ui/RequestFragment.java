package alamin.iFarmer.TestProjectWeather.core.ui;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alamin.iFarmer.TestProjectWeather.SendRequest;
import alamin.iFarmer.TestProjectWeather.core.network.interfaces.OnResponse;
import alamin.iFarmer.TestProjectWeather.core.network.response.BaseResponse;


public class RequestFragment extends PermissionFragment {

    protected SendRequest sendRequestInstance = null;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        sendRequestInstance = new SendRequest();

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void sendRequest(String url, OnResponse onResponse, Class<? extends BaseResponse> responseClass) {

        if (isAdded() && getActivity() instanceof RequestActivity) {
            ((RequestActivity) getActivity()).sendRequest(url, onResponse, responseClass);
        }
    }
}
