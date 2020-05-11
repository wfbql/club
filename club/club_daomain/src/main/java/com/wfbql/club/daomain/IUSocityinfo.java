package com.wfbql.club.daomain;

public class IUSocityinfo {
    //主键
    private String id;
    //社团名称
    private String socity_name;
    //社团负责人
    private String socity_leader;
    //社团简介
    private String socity_info;
    //社团头像
    private String socity_picture;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSocity_name() {
        return socity_name;
    }

    public void setSocity_name(String socity_name) {
        this.socity_name = socity_name;
    }

    public String getSocity_leader() {
        return socity_leader;
    }

    public void setSocity_leader(String socity_leader) {
        this.socity_leader = socity_leader;
    }

    public String getSocity_info() {
        return socity_info;
    }

    public void setSocity_info(String socity_info) {
        this.socity_info = socity_info;
    }

    public String getSocity_picture() {
        return socity_picture;
    }

    public void setSocity_picture(String socity_picture) {
        this.socity_picture = socity_picture;
    }

    @Override
    public String toString() {
        return "IUSocityinfo{" +
                "id='" + id + '\'' +
                ", socity_name='" + socity_name + '\'' +
                ", socity_leader='" + socity_leader + '\'' +
                ", socity_info='" + socity_info + '\'' +
                ", socity_picture='" + socity_picture + '\'' +
                '}';
    }
}
