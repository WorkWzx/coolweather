package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 15153 on 2018/8/28.
 */

public class City extends DataSupport {

    private int id;
    //市的名字
    private String cityName;
    //市的代号
    private int cityCode;
    //记录市的所属省的Id
    private int provinceId;

    public int getId() {
        return id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {

        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {

        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
