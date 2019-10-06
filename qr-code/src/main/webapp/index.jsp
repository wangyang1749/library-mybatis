<%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/3/16
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/yb_h5.js"></script>
    <meta name="viewport" content="width=device-width">
</head>
<body>
    <h1>Hello</h1>
    <div><a onClick="encode_fun();">调用二维码扫描器</a></div>
    <div id="yibanhtml5"></div>
    <div>直接获取二维码内容：<input id="returnValue" value="暂无结果" /></div>
    <hr>
    <img src="qr?name=yiban_scan_result123456" id="_img">
    <input type="text" id="txt">
    <button onclick="getQr()">获取二维码</button>
    <hr>
    <img src="/img">
<script>
    var _img = document.getElementById("_img");
    var txt = document.getElementById("txt");
    function getQr() {
        // _img.src="qr?name=yiban_scan_result"+txt.value;
         _img.src="qr?name="+txt.value;
    }

</script>
</body>
</html>
