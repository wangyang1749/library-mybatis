<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="keywords" content="jquery,ui,easy,easyui,web">
    <meta name="description" content="easyui help you build your web page easily!">
    <title>jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
</head>
<body>
<h1>DataGrid</h1>
<table id="tt" class="easyui-datagrid" style="width:600px;height:250px"
       url="resources/treegrid_data2.json"
       title="Load Data" iconCls="icon-save"
       rownumbers="true" pagination="true" method="get">
    <thead>
    <tr>
        <th field="itemid" width="80">Item ID</th>
        <th field="productid" width="80">Product ID</th>
        <th field="listprice" width="80" align="right">List Price</th>
        <th field="unitcost" width="80" align="right">Unit Cost</th>
        <th field="attr1" width="150">Attribute</th>
        <th field="status" width="60" align="center">Stauts</th>
    </tr>
    </thead>
</table>
</body>
</html>