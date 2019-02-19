package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    @Test
    public void run1(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        AccountService accountService = ac.getBean("accountServiceImpl", AccountService.class);
//        List<Account> accountList = accountService.findAll();
//        for (Account account : accountList) {
//            System.out.println(account);
//        }

        SqlSessionFactory sessionFactory = ac.getBean(SqlSessionFactory.class);
        System.out.println(sessionFactory);
        System.out.println("--------------");
        AccountDao accountDao = ac.getBean(AccountDao.class);
        System.out.println(accountDao);
    }

}
