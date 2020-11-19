package alamin.iFarmer.TestProjectWeather.core.ui;

import alamin.iFarmer.TestProjectWeather.interfaces.PermissionListener;

import java.util.Map;


public class PermissionFragment extends BaseFragment {

    public void requestAppPermissions(PermissionActivity permissionActivity,
                                      final String[] requestedPermissions, final int requestCode,
                                      final Map<String,
                                              PermissionActivity.PermissionDialogMessage> messages,
                                      PermissionListener responseCallback) {

        permissionActivity.requestAppPermissions(requestedPermissions, requestCode, messages,
                responseCallback);
    }
}
