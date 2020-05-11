package com.wfbql.club.daomain;

public class IUserLogin {

    //用户id
    private String id;
    //账号
    private String username;
    //密码
    private String password;
    //网名
    private String bigName;
    //头像信息
    private String ChatHead;
    //头像信息
    private String emil;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBigName() {
        return bigName;
    }

    public void setBigName(String bigName) {
        this.bigName = bigName;
    }

    public String getChatHead() {
        return ChatHead;
    }

    public void setChatHead(String chatHead) {
        ChatHead = chatHead;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    @Override
    public String toString() {
        return "IUserLogin{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", bigName='" + bigName + '\'' +
                ", ChatHead='" + ChatHead + '\'' +
                ", emil='" + emil + '\'' +
                '}';
    }
}
