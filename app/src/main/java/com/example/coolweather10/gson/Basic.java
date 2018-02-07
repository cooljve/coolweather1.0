package com.example.coolweather10.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/2/7 0007.
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
