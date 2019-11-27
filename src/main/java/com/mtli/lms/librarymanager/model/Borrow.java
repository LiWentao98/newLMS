package com.mtli.lms.librarymanager.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Description:借阅实体类
 * @Author: Mt.Li
 * @Create: 2019-11-16 16:26
 */
public class Borrow  {
    private Integer borrow_id;
    private Integer r_id;
    private Integer b_id;
    private Integer id_continue_times;
    private Date id_date_out;
    private Date id_date_ret_plan;
    private Date id_date_ret_act;
    private Integer id_over_day;
    private BigDecimal id_over_money;
    private BigDecimal id_punish_money;
    private boolean is_has_return;
    private String b_name;
    private String b_author;
    private String r_name;

    public Integer getBorrow_id() {
        return borrow_id;
    }

    public void setBorrow_id(Integer borrow_id) {
        this.borrow_id = borrow_id;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public Integer getId_continue_times() {
        return id_continue_times;
    }

    public void setId_continue_times(Integer id_continue_times) {
        this.id_continue_times = id_continue_times;
    }

    public Date getId_date_out() {
        return id_date_out;
    }

    public void setId_date_out(Date id_date_out) {
        this.id_date_out = id_date_out;
    }

    public Date getId_date_ret_plan() {
        return id_date_ret_plan;
    }

    public void setId_date_ret_plan(Date id_date_ret_plan) {
        this.id_date_ret_plan = id_date_ret_plan;
    }

    public Date getId_date_ret_act() {
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        ft.setTimeZone(TimeZone.getTimeZone("GMT+12"));
//        return ft.format(id_date_ret_act);
        return id_date_ret_act;
    }

    public void setId_date_ret_act(Date id_date_ret_act) {
        this.id_date_ret_act = id_date_ret_act;
    }

    public Integer getId_over_day() {
        return id_over_day;
    }

    public void setId_over_day(Integer id_over_day) {
        this.id_over_day = id_over_day;
    }

    public BigDecimal getId_over_money() {
        return id_over_money;
    }

    public void setId_over_money(BigDecimal id_over_money) {
        this.id_over_money = id_over_money;
    }

    public BigDecimal getId_punish_money() {
        return id_punish_money;
    }

    public void setId_punish_money(BigDecimal id_punish_money) {
        this.id_punish_money = id_punish_money;
    }

    public boolean isIs_has_return() {
        return is_has_return;
    }

    public void setIs_has_return(boolean is_has_return) {
        this.is_has_return = is_has_return;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }
}
