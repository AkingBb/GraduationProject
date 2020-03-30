package com.lyq.edu.entity;

public class Chapter {
    private Integer id;

    private String name;

    private String rbfpath;

    private String virtualpanelpath;

    private String type;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRbfpath() {
        return rbfpath;
    }

    public void setRbfpath(String rbfpath) {
        this.rbfpath = rbfpath == null ? null : rbfpath.trim();
    }

    public String getVirtualpanelpath() {
        return virtualpanelpath;
    }

    public void setVirtualpanelpath(String virtualpanelpath) {
        this.virtualpanelpath = virtualpanelpath == null ? null : virtualpanelpath.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}