package cn.swc.dao;

import cn.swc.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description 账户操作dao接口
 * @auther swc
 * @create 2019-12-24 14:30
 */

@Repository("accountDao")
public interface AccountDao {

    /**
     * 查询所有方法
     * @return 账户列表
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 保存账户的方法
     * @param account 要保存的账户
     */
    @Insert("insert into account (name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
