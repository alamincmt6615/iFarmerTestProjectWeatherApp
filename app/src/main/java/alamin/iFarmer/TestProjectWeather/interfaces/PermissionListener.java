package alamin.iFarmer.TestProjectWeather.interfaces;

import androidx.annotation.Nullable;

import java.util.List;


public interface PermissionListener {

    void onPermissionsGranted(int requestCode);

    void onPermissionsDenied(int requestCode, int errorType,
                             @Nullable List<String> permissionsThisTimeDenied,
                             @Nullable List<String> permissionsAlwaysDenied);
}
