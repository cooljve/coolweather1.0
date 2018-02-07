package com.example.coolweather10.gson;

import com.google.gson.annotations.SerializedName;

import java.security.PublicKey;

/**
 * Created by Administrator on 2018/2/7 0007.
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
