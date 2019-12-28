package cn.swc.service.impl;

import cn.swc.dao.AccountDao;
import cn.swc.domain.Account;
import cn.swc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 账户服务实现类
 * @auther swc
 * @create 2019-12-24 14:34
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有账户...");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层:保存账户...");
        accountDao.saveAccount(account);
    }
}
