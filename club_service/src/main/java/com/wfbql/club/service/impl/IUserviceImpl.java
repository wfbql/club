package com.wfbql.club.service.impl;

import com.wfbql.club.dao.IUserDao;
import com.wfbql.club.daomain.IUhome;
import com.wfbql.club.daomain.IUserLogin;
import com.wfbql.club.service.IUservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class IUserviceImpl implements IUservice {

    @Autowired
    private IUserDao IUserDao;
    @Override
    public IUserLogin Login(IUserLogin iUserLogin) throws Exception {
        IUserLogin login = IUserDao.Login(iUserLogin);
        System.out.println("这里是打印dao层登录的代码:"+iUserLogin.toString());
        return login;
    }

    @Override
    public IUhome LoginAll(IUserLogin iUserLogin) throws Exception {
        IUhome iUhome = IUserDao.LoginAll(iUserLogin);
        System.out.println(iUhome.toString());
        return iUhome;
    }

    @Override
    public IUhome Register(IUserLogin iUserLogin) throws Exception {
        System.out.println("我来到了注册的方法来了!!!");
        //实现在UserLogin中注册
        IUhome iUhome1 = new IUhome();
        try {
            IUserDao.register(iUserLogin);
            //创建一个登录主界面的信息
            IUhome iUhome = new IUhome();
            iUhome.setId(iUserLogin.getId());
            iUhome.setHeadPortraits(iUserLogin.getChatHead());
            iUhome.setBigName(iUserLogin.getBigName());
            iUhome.setNumberemail(0);
            iUhome.setNumberfollowers(0);
            iUhome.setNumberfriends(0);
            IUserDao.InsertIUhome(iUhome);
            System.out.println("这个是输出来的信息==="+iUhome.toString());
            //查询出来登录的数据是否存在
             iUhome1 = IUserDao.FounById(iUserLogin);
            System.out.println(iUhome1.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return iUhome1;

    }

    @Override
    public List<IUserLogin> FoundAll() throws Exception {
        List<IUserLogin> list =IUserDao.FoundAll();
        for (IUserLogin i:list) {
            System.out.println(i.toString());
        }
        return list;
    }

    @Override
    public IUhome FoundById(IUserLogin iUserLogin) throws Exception {
        IUhome iUhome = IUserDao.FounById(iUserLogin);
        return iUhome;
    }

    @Override
    public IUserLogin FoundLoginIdByHome(IUhome register) throws Exception {

        IUserLogin iUhome = IUserDao.FoundLoginIdByHomes(register);

        return iUhome;
    }

    @Override
    public IUhome FoundHomeByLogin(IUserLogin iuser) throws Exception {
        IUhome iUhome = IUserDao.FoundHomeByLogins(iuser);
        return iUhome;
    }
}
