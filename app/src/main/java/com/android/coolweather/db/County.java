package com.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/4/4.
 */

public class County extends DataSupport {
    private int id;
    private int weatherId;
    private String countyName;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityCode() {
        return cityId;
    }

    public void setCityCode(int cityCode) {
        this.cityId = cityCode;

    }
}
