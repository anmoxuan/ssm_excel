package com.mapper;

import com.entity.Order;

import java.util.List;

public interface ReportMapper {
    int add(List<Order> list,String name) throws Exception;
}
