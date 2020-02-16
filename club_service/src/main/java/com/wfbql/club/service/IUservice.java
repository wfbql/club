package com.wfbql.club.service;

import com.wfbql.club.daomain.IUhome;
import com.wfbql.club.daomain.IUserLogin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IUservice {

    /*
    用户登录
     */
    public IUserLogin  Login(IUserLogin iUserLogin) throws Exception;

    /*
    进入首页的相关信息
     */
    public IUhome LoginAll(IUserLogin iUserLogin) throws Exception;

    /*
    注册新的用户
     */
    public IUhome Register(IUserLogin iUserLogin) throws Exception;

    /*
    查询所以的用户,测试专用
     */
    public List<IUserLogin> FoundAll() throws Exception;

    /*
    通过UserLogin中的id查找出UserLogin
     */
    public IUhome FoundById(IUserLogin iUserLogin) throws Exception;



    /**
     *  使用界面信息查询出登录信息
     * @param register
     * @return
     * @throws Exception
     */
    public IUserLogin FoundLoginIdByHome(IUhome register) throws Exception;


    /**
     *通过登录信息查询出主界面信息
     * @param iuser
     * @return
     * @throws Exception
     */
    public IUhome FoundHomeByLogin(IUserLogin iuser) throws Exception;
}
