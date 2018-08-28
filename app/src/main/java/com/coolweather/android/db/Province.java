package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 15153 on 2018/8/28.
 */

public class Province extends DataSupport{
   //每个实体类都应该有的字段
    private int id;
    //省的名字
    private String provinceName;
    //省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {

        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
