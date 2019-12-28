package cn.swc.test;

import cn.swc.dao.AccountDao;
import cn.swc.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description
 * @auther swc
 * @create 2019-12-24 16:09
 */
public class MybatisTest {

    @Test
    public void test1() throws Exception {
        //1.加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取sqlSession
        SqlSession sqlSession = factory.openSession();
        //4.操作
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> lists = mapper.findAll();
        for (Account list : lists) {
            System.out.println(list);
        }

        //5.释放资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void test2() throws Exception {
        //1.加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取sqlSession
        SqlSession sqlSession = factory.openSession();
        //4.操作
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);

        Account account = new Account();
        account.setName("熊熊");
        account.setMoney(2000.0);

        mapper.saveAccount(account);
        sqlSession.commit();

        sqlSession.close();
        in.close();

    }
}
