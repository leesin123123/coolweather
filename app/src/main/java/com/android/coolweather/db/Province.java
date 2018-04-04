package com.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/4/4.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provincecode;

    public Province() {
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }



    public int getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(int provincecode) {
        this.provincecode = provincecode;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

}
