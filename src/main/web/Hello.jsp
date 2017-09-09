<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/7
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<h1>你好，世界！</h1>
<table class="table table-hover">
    <tr>
        <td>s</td>
        <td>se</td><td>ee</td><td>ee</td><td>ee</td>
    </tr>
    <tr>
        <td>see</td>
        <td>see</td><td>see</td><td>see</td><td>see</td>
    </tr>
    <tr>
        <td>see</td>
        <td>see</td><td>see</td><td>see</td><td>see</td>
    </tr>
</table>
<form>
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div class="form-group">
        <label for="exampleInputFile">File input</label>
        <input type="file" id="exampleInputFile">
        <p class="help-block">Example block-level help text here.</p>
    </div>
    <div class="checkbox">
        <label>
            <input type="checkbox"> Check me out
        </label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
</form>
<
<hr/>
<div class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Modal title</h4>
            </div>
            <div class="modal-body">
                <p>One fine body&hellip;</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
    Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-3.2.1.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<script>

    function query(){
        $.ajax({
            type:"post",      //提交方式 有get 和post
            url:"AdminServlet",      //请求地址
            async:true,       //是否异步，默认是true
            data:{            //请求附加的参数
                tNum:$("#tNum").val(),
                flag:"getInventorybyId"
            },
            success:function(result){
                //请求发送成功之后,要执行的函数,result指的是后台返回的数据
                $("#showI").empty();
                //eval获取返回的JSON对象集合
                var d = eval('(' + result + ')');
                //把数据显示到页面的方法
                showData(d);

            }

        });
    }
    /* 显示数据 */
    function showData(d) {
        //循环遍历一边d
        for ( var i = 0; i < d.length; i++) {

            var html = "<tr class='text-c' ><form action='AdminServlet?flag=alterInventory&page=1&invId="+d[i].invId+"' method='post'>"
                +"<td >"+d[i].invId+"</td>"
                +"<td>"+d[i].tNum+"</td>"
                +"<td>"+d[i].tSize+"</td>"
                +"<td ><input type='text' value='"+d[i].invNum+"'  name='amount'/></td>"
                +"<td ><input type='submit' title='确认修改' value='修改' /> </td></form></tr>";
            //通过表体id把显示文本显示到网页中
            $("#showI").append(html);
        }
    }




</script>
</body>
</html>
