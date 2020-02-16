package com.wfbql.club.service;

import com.wfbql.club.daomain.IUSocityinfo;
import com.wfbql.club.daomain.IUserActivty;

import java.util.List;

public interface IUsocityService {



    /**
     * 查询出所有社团的接口
     * @return
     * @throws Exception
     */
    public List<IUSocityinfo> FoundAlls() throws Exception;

    /**
     *查询出活动信息
     * @param page
     * @return
     * @throws Exception
     */
    public List<IUserActivty> FoundActivtys(Integer page) throws Exception;

    /**
     * 通过Activty的oid查询Bigname
     * @param oid
     * @return
     * @throws Exception
     */
    public String FoundBigNameByOid(String oid) throws Exception;
}
