<template>
	<div > 
<el-row>
  <el-button>新增</el-button>
</el-row>
<el-row>
<el-table
    :data="tableData3"
    height="500"
    border
    style="width: 100%">
    <el-table-column
      prop="date"
      label="角色ID"
      width="180">
    </el-table-column>
    <el-table-column
      prop="name"
      label="角色名称"
      width="180">
    </el-table-column>
	    <el-table-column
      prop="name"
      label="操作项"
      width="180">
    </el-table-column>
		    <el-table-column
      prop="name"
      label="用户"
      width="180">
    </el-table-column>
	<el-table-column
      label="操作"
      width="180">
      <template slot-scope="scope">
	   <el-button
          type="text"
          size="small">
          编辑
        </el-button>
		<el-button
          type="text"
          size="small">
          添加用户
        </el-button>
        <el-button
          type="text"
          size="small">
          删除
        </el-button>
      </template>
    </el-table-column>
  </el-table>
</el-row>
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
        }]
      }
		},
		methods:methods,
		mounted(){
			
		}
	}
</script>
<style type="text/css"> 
</style>