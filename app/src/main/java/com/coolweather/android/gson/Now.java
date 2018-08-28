package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15153 on 2018/8/28.
 */

public class Now {
    @SerializedName("tmp")
    public String temperatur;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String into;
    }
}
