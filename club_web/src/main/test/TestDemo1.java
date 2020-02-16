import com.wfbql.club.daomain.IUSocityinfo;
import com.wfbql.club.daomain.IUhome;
import com.wfbql.club.daomain.IUserActivty;
import com.wfbql.club.daomain.IUserLogin;
import com.wfbql.club.service.IUsocityInfoService;
import com.wfbql.club.service.IUsocityService;
import com.wfbql.club.utiles.UUIDUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//spring整合了junit,同时 只有spring引入外部文件时需要classpath
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestDemo1 {

        @Autowired
        private com.wfbql.club.service.IUservice IUservice;

        @Autowired
        private IUsocityService iUsocityService;

        @Autowired
        private IUsocityInfoService IUsocityInfoService;
        @Test
        public void test1() throws Exception {
           // IUserLogin  t1 = new IUserLogin();
            //t1.setPassword("666666");
         //   t1.setUsername("zhangsan");
         //  IUserLogin login = IUservice.Login(t1);
           // System.out.println(login);
        }

    @Test
    public void test2() throws Exception {
     //   IUserLogin  t1 = new IUserLogin();
      // t1.setId("1111");
      //  IUhome iUhome = IUservice.LoginAll(t1);
      //  System.out.println(iUhome);
    }

    @Test
    public void test3() throws Exception {
            //注册测试
        IUserLogin  t1 = new IUserLogin();
        String id = UUIDUtils.getId();
        t1.setId(id);
        t1.setUsername("hxh3");
        t1.setPassword("666666");
        t1.setBigName("无风不起浪3");
        t1.setChatHead("/page/lib");
        t1.setEmil("2282508910@qq.com");
        IUhome register = IUservice.Register(t1);
        System.out.println("这里有数据吗?"+register);
    }



    @Test
    public void test4() throws Exception {
        //查询所以社团信息测试
        List<IUSocityinfo> iuSocityinfos = iUsocityService.FoundAlls();

        System.out.println(iuSocityinfos.get(0).toString());
    }

    @Test
    public void test5() throws Exception {
        //查询所以社团信息测试
        List<IUserActivty> list = iUsocityService.FoundActivtys( 1);
        for (IUserActivty iu: list) {
            System.out.println(iu.toString());
        }
    }


    @Test
    public void test6() throws Exception {
        //查询所以社团信息测试
       // List<IUserActivty> list = iUsocityService.FoundActivtys( 1);
        String s = iUsocityService.FoundBigNameByOid("A3D6B84C982249C08FF18A7F5FBFD7CD");
        System.out.println(s);

    }

}
