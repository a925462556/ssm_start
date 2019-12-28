package cn.swc.test;

import cn.swc.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 测试类
 * @auther swc
 * @create 2019-12-24 14:45
 */
public class SpringTest {

    @Test
    public void test1() {
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取对象
        AccountService as = (AccountService) ac.getBean("accountService");

        //操作
        as.findAll();
    }



}
