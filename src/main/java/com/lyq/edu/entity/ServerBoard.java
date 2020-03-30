package com.lyq.edu.entity;

public class ServerBoard {
    private Integer id;

    private String ipaddress;

    private Integer pcrecvport;

    private Integer boardrecvport;

    private String status;

    private String verifycode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public Integer getPcrecvport() {
        return pcrecvport;
    }

    public void setPcrecvport(Integer pcrecvport) {
        this.pcrecvport = pcrecvport;
    }

    public Integer getBoardrecvport() {
        return boardrecvport;
    }

    public void setBoardrecvport(Integer boardrecvport) {
        this.boardrecvport = boardrecvport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode == null ? null : verifycode.trim();
    }
}