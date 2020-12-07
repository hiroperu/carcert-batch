package com.example.carcert.batch.common.dto;

import java.util.Date;

public class DeviceInfoDto {
    private int id;

    private String pushtoken;

    private Date exdate;

    private int notice_count;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPushtoken() {
        return this.pushtoken;
    }

    public void setPushtoken(String pushtoken) {
        this.pushtoken = pushtoken;
    }

    public int getNotice_count() {
        return this.notice_count;
    }

    public void setNotice_count(int notice_count) {
        this.notice_count = notice_count;
    }

    public Date getExdate() {
        return this.exdate;
    }

    public void setExdate(Date exdate) {
        this.exdate = exdate;
    }

}
