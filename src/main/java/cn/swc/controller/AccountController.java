package cn.swc.controller;

import cn.swc.domain.Account;
import cn.swc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description web层
 * @auther swc
 * @create 2019-12-24 14:32
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    //注入service
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView test1() {
        System.out.println("表现层:查询所有账户");
        List<Account> list = accountService.findAll();

        ModelAndView mv = new ModelAndView();
        mv.addObject("accounts",list);
        mv.setViewName("findAll");

        return mv;
    }

    @RequestMapping("/save")
    public void test2(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        //保存账户
        accountService.saveAccount(account);
        //保存成功后重定向,查询所有账户
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
