package com.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/4/4.
 */

public class County extends DataSupport {
    private int id;
    private String weatherId;
    private String countyName;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
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

    public void setCityId(int cityCode) {
        this.cityId = cityCode;

    }
}
