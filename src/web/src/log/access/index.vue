<template>
<section>
    <!--工具条-->
		<el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
			<el-form :inline="true" :model="filters">
				<el-form-item>
					<el-input v-model="filters.name" placeholder="姓名"></el-input>
				</el-form-item>
			</el-form>
		</el-col>
<template>
<el-table
    :data="tableData3"
    height="500"
    border
    style="width: 100%">
	
    <el-table-column
      prop="functionName"
      label="模块"
      width="180">
    </el-table-column>
    <el-table-column
      prop="modelName"
      label="功能"
      width="180">
    </el-table-column>
    <el-table-column
      prop="url"
      label="访问链接">
    </el-table-column>
		<el-table-column
      prop="params"
      label="参数">
    </el-table-column>
			<el-table-column
      prop="lastUpdateBy"
      label="访问人">
    </el-table-column>
    			<el-table-column
      prop="lastUpdateTime"
      label="访问时间">
    </el-table-column>
  </el-table>
</template>

</section>
</template>
<script type="text/javascript">
import data from "./data";
import methods from "./method";

export default {
  data() {
    return data.init();
  },
  methods: methods,
  mounted() {
    this.getTableData();
  }
};
</script>
<style>
.avatar-uploader .el-upload {
  border: 1px dashed #d9d9d9;
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
}
.avatar-uploader .el-upload:hover {
  border-color: #409eff;
}
.avatar-uploader-icon {
  font-size: 28px;
  color: #8c939d;
  width: 40px;
  height: 40px;
  line-height: 40px;
  text-align: center;
}
.avatar {
  width: 40px;
  height: 40px;
  display: block;
  border-radius: 20px;
}
</style>