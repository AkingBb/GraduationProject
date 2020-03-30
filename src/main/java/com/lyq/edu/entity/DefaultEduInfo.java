package com.lyq.edu.entity;

public class DefaultEduInfo {
    private Integer id;

    private String defaultschool;

    private String defaultcollege;

    private String defaultmajor;

    private String defaultcourse;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDefaultschool() {
        return defaultschool;
    }

    public void setDefaultschool(String defaultschool) {
        this.defaultschool = defaultschool == null ? null : defaultschool.trim();
    }

    public String getDefaultcollege() {
        return defaultcollege;
    }

    public void setDefaultcollege(String defaultcollege) {
        this.defaultcollege = defaultcollege == null ? null : defaultcollege.trim();
    }

    public String getDefaultmajor() {
        return defaultmajor;
    }

    public void setDefaultmajor(String defaultmajor) {
        this.defaultmajor = defaultmajor == null ? null : defaultmajor.trim();
    }

    public String getDefaultcourse() {
        return defaultcourse;
    }

    public void setDefaultcourse(String defaultcourse) {
        this.defaultcourse = defaultcourse == null ? null : defaultcourse.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}