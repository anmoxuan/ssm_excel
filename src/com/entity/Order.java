package com.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Order {
    private int o_id;
    private int o_pid;
    private int o_nid;
    private int amount;
    private String state;
    private String o_desc;
    private Date o_trading;
    private double o_ticheng;

    @Override
    public String toString() {
        return "Order{" +
                "o_id=" + o_id +
                ", o_pid=" + o_pid +
                ", o_nid=" + o_nid +
                ", amount=" + amount +
                ", state='" + state + '\'' +
                ", o_dese='" + o_desc + '\'' +
                ", o_trading=" + o_trading +
                ", o_ticheng=" + o_ticheng +
                '}';
    }

    public double getO_ticheng() {
        return o_ticheng;
    }

    public void setO_ticheng(double o_ticheng) {
        this.o_ticheng = o_ticheng;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public int getO_pid() {
        return o_pid;
    }

    public void setO_pid(int o_pid) {
        this.o_pid = o_pid;
    }

    public int getO_nid() {
        return o_nid;
    }

    public void setO_nid(int o_nid) {
        this.o_nid = o_nid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getO_dese() {
        return o_desc;
    }

    public void setO_dese(String o_dese) {
        this.o_desc = o_dese;
    }

    public Date getO_trading() {
        return o_trading;
    }

    public void setO_trading(Date o_trading) {
        this.o_trading = o_trading;
    }
}
