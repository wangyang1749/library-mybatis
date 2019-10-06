<%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/6/7
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>任务调度管理</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/index.css">
    <script src="<%=request.getContextPath()%>/resources/js/vue.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/vue-resource.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/index.js"></script>


    <style>
        #top {
            background:#20A0FF;
            padding:5px;
            overflow:hidden
        }
    </style>

</head>
<body>
<div id="test">

    <div id="top">
        <el-button type="text" @click="search" style="color:white">查询</el-button>
        <el-button type="text" @click="handleadd" style="color:white">添加</el-button>

    </div>

    <br/>

    <div style="margin-top:15px">

        <el-table
                ref="testTable"
                :data="tableData"
                style="width:100%"
                border
        >

            <%--{"id":9,"username":"brte","password":null,"sex":null,"email":null,"status":null,"collegename":"花材","collegenameId":null,"classname":null,"classnameId":null,"nickname":null,"img":null},--%>
            <el-table-column prop="id" label="用户id" sortable show-overflow-tooltip> </el-table-column>
            <el-table-column prop="username" label="username" sortable show-overflow-tooltip> </el-table-column>
            <el-table-column prop="nickname" label="nickname" sortable show-overflow-tooltip> </el-table-column>
            <el-table-column prop="classname" label="classname" sortable show-overflow-tooltip> </el-table-column>
            <el-table-column prop="collegename" label="collegename" sortable show-overflow-tooltip> </el-table-column>


            <el-table-column label="操作" width="300">
                <template scope="scope">
                    <el-button
                            size="small"
                            type="warning"
                            @click="handlePause(scope.$index, scope.row)">暂停</el-button>

                    <el-button
                            size="small"
                            type="info"
                            @click="handleResume(scope.$index, scope.row)">恢复</el-button>

                    <el-button
                            size="small"
                            type="danger"
                            @click="handleDelete(scope.$index, scope.row)">删除</el-button>

                    <el-button
                            size="small"
                            type="success"
                            @click="handleUpdate(scope.$index, scope.row)">修改</el-button>
                </template>
            </el-table-column>
        </el-table>

        <div align="center">
            <el-pagination
                    @size-change="handleSizeChange"
                    @current-change="handleCurrentChange"
                    :current-page="currentPage"
                    :page-sizes="[10, 20, 30, 40]"
                    :page-size="pagesize"
                    layout="total, sizes, prev, pager, next, jumper"
                    :total="totalCount">
            </el-pagination>

        </div>
    </div>

    <el-dialog title="添加任务" :visible.sync="dialogFormVisible">
        <el-form :model="form">
            <el-form-item label="任务名称" label-width="120px" style="width:35%">
                <el-input v-model="form.jobName" auto-complete="off"></el-input>
            </el-form-item>
            <el-form-item label="任务分组" label-width="120px" style="width:35%">
                <el-input v-model="form.jobGroup" auto-complete="off"></el-input>
            </el-form-item>
            <el-form-item label="表达式" label-width="120px" style="width:35%">
                <el-input v-model="form.cronExpression" auto-complete="off"></el-input>
            </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisible = false">取 消</el-button>
            <el-button type="primary" @click="add">确 定</el-button>
        </div>
    </el-dialog>

    <el-dialog title="修改任务" :visible.sync="updateFormVisible">
        <el-form :model="updateform">
            <el-form-item label="表达式" label-width="120px" style="width:35%">
                <el-input v-model="updateform.cronExpression" auto-complete="off"></el-input>
            </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
            <el-button @click="updateFormVisible = false">取 消</el-button>
            <el-button type="primary" @click="update">确 定</el-button>
        </div>
    </el-dialog>

</div>

<footer align="center">
    <p>&copy; Quartz 任务管理</p>
</footer>

<script>
    var vue = new Vue({
        el:"#test",
        data: {
            //表格当前页数据
            tableData: [],

            //请求的URL
            url:'userList?json',

            //默认每页数据量
            pagesize: 10,

            //当前页码
            currentPage: 1,

            //查询的页码
            start: 1,

            //默认数据总数
            totalCount: 1000,

            //添加对话框默认可见性
            dialogFormVisible: false,

            //修改对话框默认可见性
            updateFormVisible: false,

            //提交的表单
            form: {
                jobName: '',
                jobGroup: '',
                cronExpression: '',
            },

            updateform: {
                jobName: '',
                jobGroup: '',
                cronExpression: '',
            },
        },

        methods: {

            //从服务器读取数据
            loadData: function(pageNum, pageSize){
                // alert(pageNum+"--"+pageSize);
                this.$http.get('userList?json&' + 'page=' +  pageNum + '&rows=' + pageSize).then(function(res){
                    console.log(res);
                    this.tableData = res.body.rows;
                    this.totalCount = res.body.total;
                },function(){
                    console.log('failed');
                });
            },

            //单行删除
            handleDelete: function(index, row) {
                this.$http.post('job/deletejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
                    this.loadData( this.currentPage, this.pagesize);
                },function(){
                    console.log('failed');
                });
            },

            //暂停任务
            handlePause: function(index, row){
                this.$http.post('job/pausejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
                    this.loadData( this.currentPage, this.pagesize);
                },function(){
                    console.log('failed');
                });
            },

            //恢复任务
            handleResume: function(index, row){
                this.$http.post('job/resumejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
                    this.loadData( this.currentPage, this.pagesize);
                },function(){
                    console.log('failed');
                });
            },

            //搜索
            search: function(){
                this.loadData(this.currentPage, this.pagesize);
            },

            //弹出对话框
            handleadd: function(){
                this.dialogFormVisible = true;
            },

            //添加
            add: function(){
                this.$http.post('job/addjob',{"jobClassName":this.form.jobName,"jobGroupName":this.form.jobGroup,"cronExpression":this.form.cronExpression},{emulateJSON: true}).then(function(res){
                    this.loadData(this.currentPage, this.pagesize);
                    this.dialogFormVisible = false;
                },function(){
                    console.log('failed');
                });
            },

            //更新
            handleUpdate: function(index, row){
                console.log(row)4
                this.updateFormVisible = true;
                this.updateform.jobName = row.job_CLASS_NAME;
                this.updateform.jobGroup = row.job_GROUP;
            },

            //更新任务
            update: function(){
                this.$http.post
                ('job/reschedulejob',
                    {"jobClassName":this.updateform.jobName,
                        "jobGroupName":this.updateform.jobGroup,
                        "cronExpression":this.updateform.cronExpression
                    },{emulateJSON: true}
                ).then(function(res){
                    this.loadData(this.currentPage, this.pagesize);
                    this.updateFormVisible = false;
                },function(){
                    console.log('failed');
                });

            },

            //每页显示数据量变更
            handleSizeChange: function(val) {
                this.pagesize = val;
                this.loadData(this.currentPage, this.pagesize);
            },

            //页码变更
            handleCurrentChange: function(val) {
                this.currentPage = val;
                this.loadData(this.currentPage, this.pagesize);
            },

        },


    });
    vue.loadData(vue.currentPage, vue.pagesize);
    //载入数据
</script>

</body>
</html>
