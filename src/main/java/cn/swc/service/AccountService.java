package cn.swc.service;

import cn.swc.domain.Account;

import java.util.List;

/**
 * @Description 账户服务接口
 * @auther swc
 * @create 2019-12-24 14:32
 */
public interface AccountService {

    /**
     * 查询所有方法
     * @return 账户列表
     */
    List<Account> findAll();

    /**
     * 保存账户的方法
     * @param account 要保存的账户
     */
    void saveAccount(Account account);

}
