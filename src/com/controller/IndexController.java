package com.controller;

import com.entity.Order;
import com.service.Conformity;
import com.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class IndexController {
    @Autowired
    OrderService orderService;
    @Autowired
    Conformity conformity;
    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mva=new ModelAndView("index");
        mva.addObject("list",orderService.findOrder());
        return mva;
    }
    @RequestMapping("daying")
    public ModelAndView daying(String riqi,String ming){
        ModelAndView mav=new ModelAndView("redirect:index");
        try {
            conformity.conmity(ming,riqi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }
}
