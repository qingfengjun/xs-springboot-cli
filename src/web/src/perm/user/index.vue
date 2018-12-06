<template>
	<div > 
<el-row>
  <el-button @click="dialogFormVisible = true" class="el-icon-plus">新增</el-button>
</el-row>
<el-row>
<el-table
    :data="tableData3"
    height="500"
    border
    style="width: 100%">
	
    <el-table-column
      prop="date"
      label="用户ID"
      width="180">
    </el-table-column>
    <el-table-column
      prop="name"
      label="账号"
      width="180">
    </el-table-column>
    <el-table-column
      prop="address"
      label="显示名">
    </el-table-column>
	<el-table-column
      prop="address"
      label="密码">
    </el-table-column>
	<el-table-column
      prop="address"
      label="头像">
    </el-table-column>
		<el-table-column
      prop="address"
      label="邮箱">
    </el-table-column>
			<el-table-column
      prop="address"
      label="角色">
    </el-table-column>
	<el-table-column
      label="操作"
      width="120">
      <template slot-scope="scope">
	   <el-button
          type="text"
          size="small" @click="dialogFormVisible = true">
          编辑
        </el-button>
		<el-popover
  placement="top"
  width="160"
  v-model="visible2">
  <p>请确认是否删除?</p>
  <div style="text-align: right; margin: 0">
    <el-button size="mini" type="text" @click="visible2 = false">取消</el-button>
    <el-button type="primary" size="mini" @click="visible2 = false">确定</el-button>
  </div>
          <el-button
          type="text"
          size="small" slot="reference">
          删除
        </el-button>
</el-popover>
      </template>
    </el-table-column>
  </el-table>
</el-row>
<el-dialog title="新增用户" :visible.sync="dialogFormVisible">
  <el-form :model="form">
    <el-form-item label="账号" :label-width="formLabelWidth">
      <el-input v-model="form.name" ></el-input>
    </el-form-item>
	    <el-form-item label="显示名" :label-width="formLabelWidth">
      <el-input v-model="form.name" ></el-input>
    </el-form-item>
	    <el-form-item label="密码" :label-width="formLabelWidth">
      <el-input v-model="form.name" ></el-input>
    </el-form-item>
	    </el-form-item>
	    <el-form-item label="头像" :label-width="formLabelWidth">
      <el-input v-model="form.name" ></el-input>
    </el-form-item>
	    <el-form-item label="邮箱" :label-width="formLabelWidth">
      <el-input v-model="form.name" ></el-input>
    </el-form-item>
  </el-form>
  <div slot="footer" class="dialog-footer">
    <el-button @click="dialogFormVisible = false">取 消</el-button>
    <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
  </div>
</el-dialog>
	</div>
</template>
<script type="text/javascript">
  
    import data from './data'
    import methods from './method'

	export default{
		data(){
			return {
        tableData3: [{
          date: '2016-05-03',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-02',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-04',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-01',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-08',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-06',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-07',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }],
		dialogFormVisible: false,
		form: {
          name: '',
          region: '',
          date1: '',
          date2: '',
          delivery: false,
          type: [],
          resource: '',
          desc: ''
        },
        formLabelWidth: '120px' ,

      }
		},
		methods:methods,
		mounted(){
			
		}
	}
</script>
<style type="text/css"> 
</style>