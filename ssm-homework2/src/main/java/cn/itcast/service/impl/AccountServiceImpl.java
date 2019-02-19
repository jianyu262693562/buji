package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by crowndint on 2019/2/13.
 */
@Service
public class AccountServiceImpl implements AccountService {
    /*
        找SqlSessionFactoryBean SqlSessionFactory的工厂去生产SqlSessionFactory
     */
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("AccountServiceImpl--->findAll");
        return accountDao.findAll();
    }

    @Transactional
    @Override
    public void saveAccount(Account account) {

        System.out.println("AccountServiceImpl--->saveAccount");
        accountDao.saveAccount(account);
    }
}
