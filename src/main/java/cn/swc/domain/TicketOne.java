package cn.swc.domain;

import java.util.Date;

/**
 * @Description 工票类型一的实体类
 * @auther swc
 * @create 2019-12-28 12:54
 */
public class TicketOne {

    private int id;
    private int tableNum;
    private int A0Num;
    private int A1Num;
    private int A2Num;
    private int A3Num;
    private int A4Num;
    private int paperNum;
    private int addNum;
    private double totalCount;
    private Date date;
    private String dateStr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public int getA0Num() {
        return A0Num;
    }

    public void setA0Num(int a0Num) {
        A0Num = a0Num;
    }

    public int getA1Num() {
        return A1Num;
    }

    public void setA1Num(int a1Num) {
        A1Num = a1Num;
    }

    public int getA2Num() {
        return A2Num;
    }

    public void setA2Num(int a2Num) {
        A2Num = a2Num;
    }

    public int getA3Num() {
        return A3Num;
    }

    public void setA3Num(int a3Num) {
        A3Num = a3Num;
    }

    public int getA4Num() {
        return A4Num;
    }

    public void setA4Num(int a4Num) {
        A4Num = a4Num;
    }

    public int getPaperNum() {
        return paperNum;
    }

    public void setPaperNum(int paperNum) {
        this.paperNum = paperNum;
    }

    public int getAddNum() {
        return addNum;
    }

    public void setAddNum(int addNum) {
        this.addNum = addNum;
    }

    public double getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(double totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "TicketOne{" +
                "id=" + id +
                ", tableNum=" + tableNum +
                ", A0Num=" + A0Num +
                ", A1Num=" + A1Num +
                ", A2Num=" + A2Num +
                ", A3Num=" + A3Num +
                ", A4Num=" + A4Num +
                ", paperNum=" + paperNum +
                ", addNum=" + addNum +
                ", totalCount=" + totalCount +
                ", date=" + date +
                ", dateStr='" + dateStr + '\'' +
                '}';
    }
}
