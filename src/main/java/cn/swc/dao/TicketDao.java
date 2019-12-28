package cn.swc.dao;

import cn.swc.domain.TicketOne;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /**
     * 查找所有录入工票的方法
     *
     * @return 工票的集合
     */
    @Select("select * from ticket")
    @Results(id = "ticketMap", value = {
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "tableNum", column = "tableNum"),
            @Result(property = "A0Num", column = "A0Num"),
            @Result(property = "A1Num", column = "A1Num"),
            @Result(property = "A2Num", column = "A2Num"),
            @Result(property = "A3Num", column = "A3Num"),
            @Result(property = "A4Num", column = "A4Num"),
            @Result(property = "pageNum", column = "pageNum"),
            @Result(property = "addNum", column = "addNum"),
            @Result(property = "totalCount", column = "totalCount"),
            @Result(property = "date", column = "date_")
    })
    List<TicketOne> findAll();
}
