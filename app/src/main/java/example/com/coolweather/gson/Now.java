package example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jingluyuan on 6/20/18.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
