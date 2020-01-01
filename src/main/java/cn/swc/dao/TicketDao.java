package cn.swc.dao;

import cn.swc.domain.TicketOne;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


import java.sql.Date;
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
            @Result(property = "paperNum", column = "paperNum"),
            @Result(property = "addNum", column = "addNum"),
            @Result(property = "totalCount", column = "totalCount"),
            @Result(property = "date", column = "date_")
    })
    List<TicketOne> findAll();

    /**
     * 删除单一选定的工票
     *
     * @param id 要删除的工票id
     */
    @Delete("delete from ticket where id = #{id}")
    void deleteTicket(int id);

    /**
     * 修改单一选定的工票
     * 注意:修改好以后需要重新计算,再调用该更新方法
     * @param one 修改好后的工票实体对象
     */
    @Update("update ticket set tableNum=#{tableNum},A0Num=#{A0Num},A1Num=#{A1Num},A2Num=#{A2Num}," +
            "A3Num=#{A3Num},A4Num=#{A4Num},paperNum=#{paperNum},addNum=#{addNum},totalCount=#{totalCount},date_=#{date} " +
            "where id=#{id}")
    void changeOne(TicketOne one);

    /**
     * 根据id查询工票的方法
     * @param id 工票的id
     * @return 相应id的工票
     */
    @Select("select * from ticket where id=#{id}")
    @ResultMap("ticketMap")
    TicketOne findTicketById(int id);

    /**
     * 根据日期查询工票的方法
     * @param date 要查询的日期
     * @return 该日的记录集合
     */
    //测试:能否使用util的date 如果不行再转化为sql的date进行注入
    //结论:不能
    @Select("select * from ticket where date_=#{date}")
    @ResultMap("ticketMap")
    List<TicketOne> findTicketByDate(Date date);
}
