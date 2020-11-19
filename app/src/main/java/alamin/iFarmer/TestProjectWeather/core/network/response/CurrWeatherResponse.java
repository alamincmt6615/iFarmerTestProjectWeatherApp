package alamin.iFarmer.TestProjectWeather.core.network.response;

import alamin.iFarmer.TestProjectWeather.core.network.dto.MainDTO;
import alamin.iFarmer.TestProjectWeather.core.network.dto.SysDTO;
import alamin.iFarmer.TestProjectWeather.core.network.dto.WeatherDTO;
import alamin.iFarmer.TestProjectWeather.core.network.dto.WindDTO;
import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class CurrWeatherResponse extends BaseResponse {

    @SerializedName("sys")
    private SysDTO sysDTO;

    @SerializedName("weather")
    private List<WeatherDTO> weatherDTO;

    @SerializedName("main")
    private MainDTO mainDTO;

    @SerializedName("wind")
    private WindDTO windDTO;

    @SerializedName("name")
    private String cityName;

    @SerializedName("id")
    private String id;

    @SerializedName("dt")
    private long lastUpdateTime;

    public SysDTO getSys() {
        return sysDTO;
    }

    public List<WeatherDTO> getWeather() {
        return weatherDTO;
    }

    public MainDTO getMain() {
        return mainDTO;
    }

    public WindDTO getWind() {
        return windDTO;
    }

    public String getCityId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getLastUpdateTime() {
        Date date = new Date(lastUpdateTime * 1000);
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy HH:mm", Locale.getDefault());

        return format.format(date);
    }

    public void setCityName(String name) {
        this.cityName = name;
    }

}
