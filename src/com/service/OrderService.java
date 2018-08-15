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
public class OrderService {
    @Resource
    OrderMapper orderMapper;
    @Resource
    DeductService deductService;
    public List<Order> findOrder(){
        List<Order> list=new ArrayList<Order>();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        String dates=sf.format(new Date());
        for (Order order: orderMapper.findOrder(dates)) {
            double moeny=deductService.deduct(order.getAmount());
            order.setO_ticheng(moeny);
            list.add(order);
        }
        return list;
    }
}
