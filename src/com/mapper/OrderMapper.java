package com.mapper;

import com.entity.Order;

import java.util.List;
import java.util.Map;

public interface OrderMapper {
    List<Order> findOrder(String dates);
}
