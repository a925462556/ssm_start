package cn.swc.service.impl;

import cn.swc.dao.TicketDao;
import cn.swc.domain.TicketOne;
import cn.swc.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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

    @Override
    public void saveTicket(TicketOne ticket) {
        ticketDao.saveTicket(ticket);
    }
}
