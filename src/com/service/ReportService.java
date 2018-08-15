package com.service;

import com.entity.Order;
import com.mapper.ReportMapper;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.util.List;

@Service
public class ReportService implements ReportMapper{
    @Override
    public int add(List<Order> list,String name)throws Exception {
        WritableWorkbook writeBook = Workbook.createWorkbook(new File("D://"+name+".xls"));
        WritableSheet firstSheet = writeBook.createSheet("工作报表", 1);
        Label label1 = new Label(0, 0, "订单编号");
        firstSheet.addCell(label1);
        Label label2 = new Label(1, 0, "需方");
        firstSheet.addCell(label2);
        Label label3 = new Label(2, 0, "供方");
        firstSheet.addCell(label3);
        Label label4 = new Label(3, 0, "价格");
        firstSheet.addCell(label4);
        Label label5 = new Label(4, 0, "状态");
        firstSheet.addCell(label5);
        Label label6 = new Label(5, 0, "描述");
        firstSheet.addCell(label6);
        Label label7 = new Label(6, 0, "日期");
        firstSheet.addCell(label7);
        Label label8 = new Label(7, 0, "提成");
        firstSheet.addCell(label8);
        int hang=0;
        int lie=1;
        for (Order order: list) {
            Label labes1=new Label(hang,lie,""+order.getO_id());
            firstSheet.addCell(labes1);
            Label labes2=new Label(hang+1,lie,""+order.getO_pid());
            firstSheet.addCell(labes2);
            Label labes3=new Label(hang+2,lie,""+order.getO_nid());
            firstSheet.addCell(labes3);
            Label labes4=new Label(hang+3,lie,""+order.getAmount());
            firstSheet.addCell(labes4);
            Label labes5=new Label(hang+4,lie,""+order.getState());
            firstSheet.addCell(labes5);
            Label labes6=new Label(hang+5,lie,""+order.getO_dese());
            firstSheet.addCell(labes6);
            Label labes7=new Label(hang+6,lie,""+order.getO_trading());
            firstSheet.addCell(labes7);
            Label labes8=new Label(hang+7,lie,""+order.getO_ticheng());
            firstSheet.addCell(labes8);
            lie++;
        }
        writeBook.write();
        writeBook.close();
        return 1;
    }
}
