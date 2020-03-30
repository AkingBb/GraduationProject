package com.lyq.edu.entity;

import java.util.Date;

public class UserUseLog {
    private Integer id;

    private String username;

    private Date begintime;

    private Date endtime;

    private String labname;

    private String labtype;

    private String serverboardip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getLabname() {
        return labname;
    }

    public void setLabname(String labname) {
        this.labname = labname == null ? null : labname.trim();
    }

    public String getLabtype() {
        return labtype;
    }

    public void setLabtype(String labtype) {
        this.labtype = labtype == null ? null : labtype.trim();
    }

    public String getServerboardip() {
        return serverboardip;
    }

    public void setServerboardip(String serverboardip) {
        this.serverboardip = serverboardip == null ? null : serverboardip.trim();
    }
}