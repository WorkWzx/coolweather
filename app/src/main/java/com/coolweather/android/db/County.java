package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

import java.io.Serializable;

/**
 * Created by 15153 on 2018/8/28.
 */

public class County extends DataSupport {

    private int id;
    //县的名字
    private String countyName;
    //记录当前县所属市的Id
    private int cityId;
    //记录县对应天气的ID
    private String weatherId;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {

        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {

        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
