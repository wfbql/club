package com.wfbql.club.dao;

import com.wfbql.club.daomain.IUSocityinfo;
import com.wfbql.club.daomain.IUserActivty;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IUsocityDao {

    @Select("select * from socityinfo")
    List<IUSocityinfo> FoundAll();



    @Select("select * from  activty")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "oid",property = "oid"),
            @Result(column = "name",property = "name"),
            @Result(column = "addtime",property = "addtime"),
            @Result(column = "text_content",property = "text_content"),
            @Result(column = "giveup",property = "giveup"),
            @Result(column = "giveoff",property = "giveoff"),
            @Result(column = "oid", property = "pictures", javaType = List.class, many =
            @Many(select = "com.wfbql.club.dao.IUserActivtyDao.findPictByoId"))
    })
    List<IUserActivty> FoundActivty(Integer page);



    @Select("select BigName from userlogin where id=#{oid}")
    String FoundBigNameByOidS(String oid);
}
