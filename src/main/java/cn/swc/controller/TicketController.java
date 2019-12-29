package cn.swc.controller;

import cn.swc.domain.TicketOne;
import cn.swc.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @Description 工票相关业务的控制器
 * @auther swc
 * @create 2019-12-28 12:31
 */

@Controller
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    @Qualifier("ticketService")
    private TicketService ticketService;

    /**
     * 计算工票控制流程,类型1
     */
    @RequestMapping("/toCalOnePage")
    public String toCalOne() {
        return "calOnePage";
    }


    @RequestMapping("/calOneResult")
    public String ResultCal(TicketOne one, Model model) {
        double totalCount = one.getTableNum()*2.5 +
                (one.getA4Num() + one.getA3Num()*2 + one.getA2Num()*4 + one.getA3Num()*8 + one.getA0Num()*16)*one.getPaperNum() +
                one.getAddNum();
        one.setTotalCount(totalCount);
        String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(one.getDate());
        one.setDateStr(dateStr);

        ticketService.saveTicket(one);
        model.addAttribute("controllerMsg","保存工票");
        return "success";
    }

    @RequestMapping("/showAllTickets")
    public String listAllTickets(Model model) {
        List<TicketOne> tickets = ticketService.findAllTickets();
        model.addAttribute("tickets",tickets);
        return "resultPage";
    }

    @RequestMapping("/deleteOne")
    public String deleteOne(int id,Model model) {
        ticketService.deleteOneTicket(id);
        model.addAttribute("controllerMsg","删除单张工票");
        return "success";
    }

    @RequestMapping("/toChangePage")
    public String toChangePage(int id,Model model) {
        //1.根据id查询数据库中对应的工票数据
        TicketOne preTicket = ticketService.findById(id);
        model.addAttribute("ticket",preTicket);
        return "changePage";
    }

    @RequestMapping("/calAndUpdate")
    public String updateOne(TicketOne one,Model model) {
        //1.重新计算
        double totalCount = one.getTableNum()*2.5 +
                (one.getA4Num() + one.getA3Num()*2 + one.getA2Num()*4 + one.getA3Num()*8 + one.getA0Num()*16)*one.getPaperNum() +
                one.getAddNum();
        //2.补充数据
        one.setTotalCount(totalCount);
        String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(one.getDate());
        one.setDateStr(dateStr);
        System.out.println(one);
        //3.更新数据库中的数据
        ticketService.updateOneTicket(one);

        model.addAttribute("controllerMsg","修改表单成功");
        return "success";
    }

}
