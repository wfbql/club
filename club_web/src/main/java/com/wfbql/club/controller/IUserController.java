package com.wfbql.club.controller;

import com.wfbql.club.daomain.IUhome;
import com.wfbql.club.daomain.IUserLogin;
import com.wfbql.club.service.IUservice;
import com.wfbql.club.service.impl.IUserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wfbql.club.utiles.UUIDUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Controller
@RequestMapping("/user")
public class IUserController {


    @Autowired
    private IUservice iUservice;

    @ResponseBody
    @RequestMapping(value ="/login.do",method = RequestMethod.POST)
    public Map<String,Object> Login(HttpServletRequest request,@RequestParam("username") String username,
                      @RequestParam("password") String password) throws Exception {
        System.out.println(username+"===="+password);
        Map<String,Object> map = new HashMap<String, Object>();
        IUserLogin iuser = new IUserLogin();
        iuser.setUsername(username);
        iuser.setPassword(password);
        IUserLogin iUserLogin = iUservice.Login(iuser);
        request.getSession().setAttribute("iuser",iUserLogin);
        map.put("iuser",iUserLogin);

        return map;
    }


    @ResponseBody
    @RequestMapping(value ="/login1.do",method = RequestMethod.POST)
    public Map<String,Object> getSuccess(HttpServletRequest request) throws Exception {

        Map<String,Object> map = new HashMap<String, Object>();

        IUserLogin iuser = (IUserLogin) request.getSession().getAttribute("iuser");
        //使用登录信息把主界面的信息查询出来
        IUhome iUhome = iUservice.FoundHomeByLogin(iuser);
        //System.out.println(iUhome.toString());
        //把主界面的信息放在iUhome中去
        if(iUhome !=null){
            map.put("Numberemail",iUhome.getNumberemail());
            map.put("Numberfollowers",iUhome.getNumberfollowers());
            map.put("Numberfriends",iUhome.getNumberfriends());
            map.put("iUhome",iUhome);
        }
        return map;
    }



    @ResponseBody
    @RequestMapping(value ="/register.do",method = RequestMethod.POST)
    public Map<String,Object> register(HttpServletRequest request,String username, String password,String bigName,String emil) throws Exception {
        Map<String,Object> map = new HashMap<String, Object>();
        IUserLogin iUserLogin = new IUserLogin();

        iUserLogin.setId(UUIDUtils.getId());
        iUserLogin.setUsername(username);
        iUserLogin.setBigName(bigName);
        iUserLogin.setPassword(password);
        iUserLogin.setChatHead("/page/picture");
        iUserLogin.setEmil(emil);

        System.out.println("前端传来的数据为:"+iUserLogin.toString());
        //调用后台的相关接口 进行注册
        IUhome register = iUservice.Register(iUserLogin);
        System.out.println("register"+register);

        IUserLogin iUserLogin1 =iUservice.FoundLoginIdByHome(register);

        request.getSession().setAttribute("iuser",iUserLogin1);

        return map;
    }

}
