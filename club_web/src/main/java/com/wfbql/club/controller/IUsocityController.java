package com.wfbql.club.controller;


import com.wfbql.club.daomain.IUhome;
import com.wfbql.club.daomain.IUserActivty;
import com.wfbql.club.daomain.IUserLogin;
import com.wfbql.club.service.IUservice;
import com.wfbql.club.service.IUsocityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/socity")
public class IUsocityController {

    @Autowired
    private IUsocityService iUsocityService;

    @Autowired
    private IUservice iUservice;

    @ResponseBody
    @RequestMapping(value ="/logactivities.do",method = RequestMethod.POST)
    public Map<String ,Object> logactivities(HttpServletRequest request,Integer page) throws Exception {

        System.out.println("我 来 了!!!");

        //返回的数据集
        Map<String ,Object> map = new HashMap();

        //获得用户登录的信息
        IUserLogin iuser = (IUserLogin) request.getSession().getAttribute("iuser");
        System.out.println(iuser.toString());
        //使用登录信息把主界面的信息查询出来
        IUhome iUhome = iUservice.FoundHomeByLogin(iuser);
        System.out.println(iUhome.toString());

        //查询用户用户的名称

        //把主界面的信息放在iUhome中去
        if(iUhome !=null){
            map.put("Numberemail",iUhome.getNumberemail());
            map.put("Numberfollowers",iUhome.getNumberfollowers());
            map.put("Numberfriends",iUhome.getNumberfriends());
            map.put("iUhome",iUhome);

            //把其他的活动信息查询出来
            List<IUserActivty> activtys = iUsocityService.FoundActivtys(page);
            List<String> BigNames = new ArrayList<>();
            for (IUserActivty iu: activtys) {
                System.out.println(iu.getOid());
                String oid = iu.getOid();
                //System.out.println("******"+iUsocityService.FoundBigNameByOid(iu.getOid()));
                String s = iUsocityService.FoundBigNameByOid(oid);
                System.out.println(s);
                BigNames.add(s);
            }

            map.put("activtys",activtys);
            map.put("BigNames",BigNames);
        }
        return map;
    }
}
