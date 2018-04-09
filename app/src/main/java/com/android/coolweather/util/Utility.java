package com.android.coolweather.util;

import android.text.TextUtils;
import android.util.Log;

import com.android.coolweather.db.City;
import com.android.coolweather.db.County;
import com.android.coolweather.db.Province;
import com.android.coolweather.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2018/4/4.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response){         //处理省份
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces= new JSONArray(response);
                for(int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject=allProvinces.getJSONObject(i);
                    Province province=new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvincecode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;

            }catch (JSONException e){
                e.printStackTrace();
            }

        }
        return false;
    }

    public static boolean handleCityResponse(String response ,int provinceId){         //处理城市
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCities= new JSONArray(response);
                for(int i=0;i<allCities.length();i++){
                    JSONObject cityObject=allCities.getJSONObject(i);
                    City city=new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;

            }catch (JSONException e){
                e.printStackTrace();
            }

        }
        return false;
    }

    public static boolean handleCountyResponse(String response ,int cityId){
      //处理县城
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCounties= new JSONArray(response);
                for(int i=0;i<allCounties.length();i++){
                    JSONObject countyObject=allCounties.getJSONObject(i);
                    County county=new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;

            }catch (JSONException e){
                e.printStackTrace();
            }

        }
        return false;
    }


    public static Weather handleWeatherResponse(String response){
        try{
            JSONObject jsonObject=new JSONObject(response);
            JSONArray jsonArray=jsonObject.getJSONArray("HeWeather");
            String weatherContent=jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent, Weather.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}



