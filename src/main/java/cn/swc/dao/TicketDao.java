package cn.swc.dao;

import cn.swc.domain.TicketOne;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @Description 工票数据交互类
 * @auther swc
 * @create 2019-12-28 20:58
 */
@Repository("ticketDao")
public interface TicketDao {

    /**
     * 保存工票的方法
     *
     * @param ticket 工票实体类对象
     */
    @Insert("insert into ticket(tableNum,A0Num,A1Num,A2Num,A3Num,A4Num,paperNum,addNum,totalCount,date_) " +
            "values(#{tableNum},#{A0Num},#{A1Num},#{A2Num},#{A3Num},#{A4Num},#{paperNum},#{addNum},#{totalCount},#{date})")
    void saveTicket(TicketOne ticket);
}
