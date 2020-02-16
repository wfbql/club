package com.wfbql.club.dao;

import com.wfbql.club.daomain.IUhome;
import com.wfbql.club.daomain.IUserLogin;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserDao {

    /* @Results({
               @Result(id = true, property = "id", column = "id"),
               @Result(column = "username", property = "username"),
               @Result(column = "password", property = "password"),
               @Result(column = "bigName", property = "bigName"),
               @Result(column = "ChatHead", property = "ChatHead")
       })*/
    @Select("select * from userlogin where username=#{username} and password=#{password}")
    public IUserLogin Login(IUserLogin iUserLogin) throws Exception;

    @Select("select * from userhome where id=#{id}")
    public IUhome LoginAll(IUserLogin iUserLogin) throws Exception;

    @Insert("insert into userlogin (id,username,password,bigName,ChatHead,emil) values(#{id},#{username},#{password},#{bigName},#{ChatHead},#{emil})")
    public void register(IUserLogin iUserLogin) throws Exception;

    @Select("select * from userhome")
    public List<IUserLogin> FoundAll() throws Exception;

    @Select("select * from userhome where id=#{id}")
    public IUhome FounById(IUserLogin iUserLogin) throws Exception;


    @Insert("insert into userhome (id,HeadPortraits,bigName,Numberemail,Numberfollowers,Numberfriends) values(#{id},#{HeadPortraits},#{bigName},#{Numberemail},#{Numberfollowers},#{Numberfriends})")
    public void InsertIUhome(IUhome iUhome) throws Exception;


    @Select("select * from userlogin where id=#{id}")
    public IUserLogin FoundLoginIdByHomes(IUhome register)  throws Exception;


    @Select("select * from userhome where id=#{id}")
    public IUhome FoundHomeByLogins(IUserLogin iuser) throws Exception;
}
