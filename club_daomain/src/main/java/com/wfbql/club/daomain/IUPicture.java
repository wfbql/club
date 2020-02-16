package com.wfbql.club.daomain;

public class IUPicture {


    //图片的主键
    private String pid;
    //用户的外键
    private String oid;
    //虚拟名称
    private String virtual_name;
    //实现名称
    private String reality_name;

    private String path;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getVirtual_name() {
        return virtual_name;
    }

    public void setVirtual_name(String virtual_name) {
        this.virtual_name = virtual_name;
    }

    public String getReality_name() {
        return reality_name;
    }

    public void setReality_name(String reality_name) {
        this.reality_name = reality_name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "IUPicture{" +
                "pid='" + pid + '\'' +
                ", oid='" + oid + '\'' +
                ", virtual_name='" + virtual_name + '\'' +
                ", reality_name='" + reality_name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
