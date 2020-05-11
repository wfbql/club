package com.wfbql.club.daomain;

import com.wfbql.club.utiles.DateUtile;

import java.util.Date;
import java.util.List;

public class IUserActivty {

    private String id;
    //登录用户的主键
    private  String oid;

    //private  String name;

    private  Date addtime;

    private  String stringtime;

    private  String text_content;

    private Integer giveup;

    private Integer giveoff;

    private List<IUPicture> pictures ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getText_content() {
        return text_content;
    }

    public void setText_content(String text_content) {
        this.text_content = text_content;
    }

    public List<IUPicture> getPictures() {
        return pictures;
    }

    public void setPictures(List<IUPicture> pictures) {
        this.pictures = pictures;
    }

    public String getStringtime() {
        String s = DateUtile.Date2String(addtime, "yyyy-mm-dd hh:ss");
        return  s;
    }

    public void setStringtime(String stringtime) {

        this.stringtime = stringtime;
    }

    public Integer getGiveup() {
        return giveup;
    }

    public void setGiveup(Integer giveup) {
        this.giveup = giveup;
    }

    public Integer getGiveoff() {
        return giveoff;
    }

    public void setGiveoff(Integer giveoff) {
        this.giveoff = giveoff;
    }

    @Override
    public String toString() {
        return "IUserActivty{" +
                "id='" + id + '\'' +
                ", oid='" + oid + '\'' +
                ", addtime=" + addtime +
                ", text_content='" + text_content + '\'' +
                ", pictures=" + pictures +
                ", giveup=" + giveup +
                ", giveoff=" + giveoff +
                '}';
    }
}
