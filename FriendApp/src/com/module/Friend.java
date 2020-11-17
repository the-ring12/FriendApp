package com.module;

public class Friend {
    private Integer fid = 0;
    private String fname = "";
    private String fgender = "男";
    private String ftelephone ="";
    private String fcellphone = "";
    private String fremark = "";
    private String username = "";

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFgender() {
        return fgender;
    }

    public void setFgender(String fgender) {
        this.fgender = fgender;
    }

    public String getFtelephone() {
        return ftelephone;
    }

    public void setFtelephone(String ftelephone) {
        this.ftelephone = ftelephone;
    }

    public String getFcellphone() {
        return fcellphone;
    }

    public void setFcellphone(String fcellphone) {
        this.fcellphone = fcellphone;
    }

    public String getFremark() {
        return fremark;
    }

    public void setFremark(String fremark) {
        this.fremark = fremark;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
