package example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jingluyuan on 6/20/18.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
