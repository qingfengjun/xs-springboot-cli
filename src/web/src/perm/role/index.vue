<template>
	<div > 
<el-row>
  <el-button @click="dialogAddFormVisible = true" class="el-icon-plus">新增</el-button>
</el-row>
<el-row>
<el-table
    :data="tableData3"
    height="500"
    border
    style="width: 100%">
    <el-table-column
      prop="id"
      label="角色ID"
      width="180">
    </el-table-column>
    <el-table-column
      prop="name"
      label="角色名称"
      width="180">
    </el-table-column>
	<el-table-column
      label="操作"
      width="180">
      <template slot-scope="scope">
	   <el-button
          type="text"
          size="small" @click="editRoleDetail(scope.row)">
          编辑
        </el-button>
        <el-button
          type="text"
          size="small" @click="deleteUser(scope.row)">
          删除
        </el-button>
      </template>
    </el-table-column>
  </el-table>
</el-row>
<el-dialog title="新增角色" :visible.sync="dialogAddFormVisible">
  <el-form :model="form">
    <el-form-item label="角色名" :label-width="formLabelWidth">
      <el-input v-model="form.name" ></el-input>
    </el-form-item>
    <el-tree
  :data="actions"
  show-checkbox
  default-expand-all
  node-key="id"
  ref="tree"
  highlight-current
  >
</el-tree>
  </el-form>
  <div slot="footer" class="dialog-footer">
    <el-button @click="dialogAddFormVisible = false">取 消</el-button>
    <el-button type="primary" @click="addUser">确 定</el-button>
  </div>
</el-dialog>
<el-dialog title="编辑角色" :visible.sync="dialogEditFormVisible">
  <el-form :model="editform">
    <el-form-item label="角色名" :label-width="formLabelWidth">
      <el-input v-model="editform.name" ></el-input>
    </el-form-item>
    <el-tree
  :data="actions"
  show-checkbox
  default-expand-all
  node-key="id"
  ref="edittree"
  highlight-current
  >
</el-tree>
  </el-form>
  <div slot="footer" class="dialog-footer">
    <el-button @click="dialogEditFormVisible = false">取 消</el-button>
    <el-button type="primary" @click="editUser">确 定</el-button>
  </div>
</el-dialog>
	</div>
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
<style type="text/css">
</style>