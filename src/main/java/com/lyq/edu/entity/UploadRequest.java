package com.lyq.edu.entity;

public class UploadRequest {
    private Integer id;

    private Integer chapterid;

    private String validfile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChapterid() {
        return chapterid;
    }

    public void setChapterid(Integer chapterid) {
        this.chapterid = chapterid;
    }

    public String getValidfile() {
        return validfile;
    }

    public void setValidfile(String validfile) {
        this.validfile = validfile == null ? null : validfile.trim();
    }
}