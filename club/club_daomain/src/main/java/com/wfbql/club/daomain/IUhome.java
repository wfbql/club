package com.wfbql.club.daomain;

public class IUhome {

    //主键
    private String id;
    //头像
    private String HeadPortraits;
    //网名
    private String bigName;
    //邮件数量
    private int Numberemail;
    //关注的人数
    private int Numberfollowers;
    //好友人数
    private int Numberfriends;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeadPortraits() {
        return HeadPortraits;
    }

    public void setHeadPortraits(String headPortraits) {
        HeadPortraits = headPortraits;
    }

    public String getBigName() {
        return bigName;
    }

    public void setBigName(String bigName) {
        this.bigName = bigName;
    }

    public Integer getNumberemail() {
        return Numberemail;
    }

    public void setNumberemail(Integer numberemail) {
        Numberemail = numberemail;
    }

    public Integer getNumberfollowers() {
        return Numberfollowers;
    }

    public void setNumberfollowers(Integer numberfollowers) {
        Numberfollowers = numberfollowers;
    }

    public Integer getNumberfriends() {
        return Numberfriends;
    }

    public void setNumberfriends(Integer numberfriends) {
        Numberfriends = numberfriends;
    }

    @Override
    public String toString() {
        return "IUhome{" +
                "id='" + id + '\'' +
                ", HeadPortraits='" + HeadPortraits + '\'' +
                ", bigName='" + bigName + '\'' +
                ", Numberemail=" + Numberemail +
                ", Numberfollowers=" + Numberfollowers +
                ", Numberfriends=" + Numberfriends +
                '}';
    }
}
