package com.lyq.edu.entity;

import java.util.Date;

public class UseLab {
    private Integer id;

    private Integer userid;

    private Integer boardid;

    private Date lastoperatetime;

    private String description;

    private String type;

    private Date endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBoardid() {
        return boardid;
    }

    public void setBoardid(Integer boardid) {
        this.boardid = boardid;
    }

    public Date getLastoperatetime() {
        return lastoperatetime;
    }

    public void setLastoperatetime(Date lastoperatetime) {
        this.lastoperatetime = lastoperatetime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}