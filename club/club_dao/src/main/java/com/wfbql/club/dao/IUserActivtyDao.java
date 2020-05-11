package com.wfbql.club.dao;

import com.wfbql.club.daomain.IUPicture;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserActivtyDao {

    @Select("select * from picture where oid=#{oid}")
    public List<IUPicture> findPictByoId(String oid);
}
