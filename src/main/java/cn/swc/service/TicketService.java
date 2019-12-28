package cn.swc.service;

import cn.swc.domain.TicketOne;

/**
 * @Description 工票服务接口
 * @auther swc
 * @create 2019-12-28 21:47
 */
public interface TicketService {

    /**
     * 保存工票的服务
     * @param ticket 封装类
     */
    void saveTicket(TicketOne ticket);
}
