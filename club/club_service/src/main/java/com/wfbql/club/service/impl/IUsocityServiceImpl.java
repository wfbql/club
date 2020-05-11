package com.wfbql.club.service.impl;

import com.wfbql.club.dao.IUsocityDao;
import com.wfbql.club.daomain.IUSocityinfo;
import com.wfbql.club.daomain.IUserActivty;
import com.wfbql.club.service.IUsocityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IUsocityServiceImpl implements IUsocityService {

    @Autowired
    private IUsocityDao iUsocityDao;

    @Override
    public List<IUSocityinfo> FoundAlls() throws Exception {
        List<IUSocityinfo> list = iUsocityDao.FoundAll();
        return list;
    }

    @Override
    public List<IUserActivty> FoundActivtys(Integer page) throws Exception {
        System.out.println("我来了*****"+page);
        List<IUserActivty> list = iUsocityDao.FoundActivty(page);
        return list;
    }

    @Override
    public String FoundBigNameByOid(String oid) throws Exception {
        System.out.println("这里报错了吗?:"+iUsocityDao.FoundBigNameByOidS(oid));
        return iUsocityDao.FoundBigNameByOidS(oid);
    }
}
