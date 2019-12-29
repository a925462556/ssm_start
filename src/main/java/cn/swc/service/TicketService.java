package cn.swc.service;

import cn.swc.domain.TicketOne;

import java.util.List;

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

    /**
     * 查询所有工票
     * @return 工票集合
     */
    List<TicketOne> findAllTickets();

    /**
     * 删除被选中的工票
     * @param id 编号
     */
    void deleteOneTicket(int id);

    /**
     * 更新选中的工票的方法
     * @param one 修改好后的工票
     */
    void updateOneTicket(TicketOne one);

    /**
     * 根据id查找对应的工票
     * @param id 工票id
     * @return 工票实体类对象
     */
    TicketOne findById(int id);
}
