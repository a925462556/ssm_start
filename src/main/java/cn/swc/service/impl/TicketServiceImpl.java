package cn.swc.service.impl;

import cn.swc.dao.TicketDao;
import cn.swc.domain.TicketOne;
import cn.swc.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @Description
 * @auther swc
 * @create 2019-12-28 21:49
 */
@Service("ticketService")
public class TicketServiceImpl implements TicketService {

    @Autowired
    @Qualifier("ticketDao")
    private TicketDao ticketDao;

    //保存
    @Override
    public void saveTicket(TicketOne ticket) {
        ticketDao.saveTicket(ticket);
    }

    //查询所有工票
    public List<TicketOne> findAllTickets() {
        List<TicketOne> tickets = ticketDao.findAll();
        for (TicketOne ticket : tickets) {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(ticket.getDate());
            ticket.setDateStr(format);
        }
        return tickets;
    }

    @Override
    public void deleteOneTicket(int id) {
        ticketDao.deleteTicket(id);
    }

    @Override
    public void updateOneTicket(TicketOne one) {
        ticketDao.changeOne(one);
    }

    @Override
    public TicketOne findById(int id) {
        return ticketDao.findTicketById(id);
    }
}
