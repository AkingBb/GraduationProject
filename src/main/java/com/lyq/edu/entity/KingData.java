package com.lyq.edu.entity;

public class KingData {
    private Integer id;

    private String name;

    private String kdatapath;

    private String kanswerpath;

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

    public String getKdatapath() {
        return kdatapath;
    }

    public void setKdatapath(String kdatapath) {
        this.kdatapath = kdatapath == null ? null : kdatapath.trim();
    }

    public String getKanswerpath() {
        return kanswerpath;
    }

    public void setKanswerpath(String kanswerpath) {
        this.kanswerpath = kanswerpath == null ? null : kanswerpath.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}