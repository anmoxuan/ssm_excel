<%--
  Created by IntelliJ IDEA.
  User: 丶安沫轩
  Date: 2018/8/5
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
      <c:set var="ctx" value="${pageContext.request.contextPath}" />
      <script type="text/javascript">
          var contextPath = "${ctx}";
      </script>
    <title>后台管理系统</title>
    <script src="js/vue.min.js"></script>
    <script src="js/vue-router.min.js"></script>
    <script src="js/fetch.min.js"></script>
      <script type="text/javascript" src="Bootstrap/js/jquery-3.3.1.min.js"></script>
      <script type="text/javascript" src="Bootstrap/js/bootstrap.min.js"></script>
      <%--浏览器logo--%>
      <link rel="shortcuut icon" href="imgs/favicon.ico">
      <link rel="icon" href="imgs/favicon.ico" type="image/x-ico">
      <link rel="bookmark" href="imgs/favicon.ico">
      <style>
          li{
            margin-top: 20px;
          }
          #ding{
              margin-left: -2%;width: 80%;margin: auto;
          }
          .xin{
              width: 100%;border: 1px black solid;border-radius:15px 15px 15px 15px;background-color: #ffffff;box-shadow: 10px 10px 5px #888888;
          }
          .xinxi{
              border: 1px black solid;border-radius:15px 15px 15px 15px;width: 80%;margin: auto;
          }
          .span1{
              margin-left: 10%;
          }
          #xin2 tr td{
              width: 30%;text-align: center
          }
      </style>
  </head>
  <body>
        <div style="width: 100%;height: 1800px;background-color: #ffffff">
            <form action="daying" method="post">
            <div id="ding" >
                <ul type="none">
                    <c:forEach items="${list}" var="temp">
                    <li >
                        <div class="xin">
                            <div class="xinxi" style="background-color: aquamarine">
                                <span class="span1">[订单详情]</span><span class="span1" name="o_id">${temp.o_trading}</span><span class="span1">订单编号：${temp.o_id}<input value="${temp.o_id}" name="o_id" type="hidden"></span>
                            </div>
                            <div>
                                <table  width="60%;" style="margin: auto" id="xin2">
                                    <tr>
                                        <td style="">
                                            供方：<span>${temp.o_nid}</span><br>
                                            需方：<span>${temp.o_pid}</span>
                                        </td>
                                        <td>
                                            <span>${temp.amount}</span><br>
                                            <span style="color: red">${temp.o_ticheng}</span>
                                        </td>
                                        <td>
                                            ${temp.state}<br>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </li>
                    </c:forEach>
                </ul>
                <div style="margin-left: 50%;">
                   请输入报表名称：<input name="ming" value="">&nbsp;&nbsp;请查看日期：<input name="riqi" value="" type="date">&nbsp;&nbsp;<button type="submit" style="border-radius: 15px 15px 15px 15px;background-color: white;width: 150px;height: 60px">打印报表</button>
                </div>
            </div>
            </form>
        </div>
  <script>
      new Vue({
          el:"",
          data:{
              baseStyles: {
                  color: 'green',
              },
          }
      })
      $(function () {

      });
      function  leijia() {
          var check = $("[name=box]");
          console.log(check.checked);
          if(check.checked){
              alert(123);
          }

      }
  </script>
  </body>
</html>
