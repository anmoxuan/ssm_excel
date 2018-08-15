package com.service;

import com.entity.Order;
import com.mapper.OrderMapper;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class Conformity {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    ReportService reportService;
    @Autowired
    DeductService deductService;

    public int conmity(String name, String dates) throws Exception {
        List<Order> list = new ArrayList<Order>();
        if (dates == null || dates.equals("")) {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            dates = sf.format(new Date());
        }
        List<Order> lists = orderMapper.findOrder(dates);
        for (Order order : lists) {
            double moeny = deductService.deduct(order.getAmount());
            order.setO_ticheng(moeny);
            list.add(order);
        }
        int dd = reportService.add(list, name);
        return dd;
    }
}
