<template>
<section>
    <!--工具条-->
		<el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
			<el-form :inline="true" :model="filters">
				<el-form-item>
					<el-input v-model="filters.name" placeholder="姓名"></el-input>
				</el-form-item>
				<el-form-item>
          <el-button type="primary" @click="dialogAddFormVisible = true" class="el-icon-plus">新增</el-button>
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
      prop="id"
      label="用户ID"
      width="180">
    </el-table-column>
    <el-table-column
      prop="account"
      label="账号"
      width="180">
    </el-table-column>
    <el-table-column
      prop="name"
      label="显示名">
    </el-table-column>
	<el-table-column
      prop="password"
      label="密码">
    </el-table-column>
    	<el-table-column
      label="头像"
      >
      <template slot-scope="scope">
	    <img  :src="scope.row.face" class="avatar">
      </template>
    </el-table-column>
		<el-table-column
      prop="mail"
      label="邮箱">
    </el-table-column>
	<el-table-column
      label="操作"
      >
      <template slot-scope="scope">
	   <el-button
     type="primary" icon="el-icon-edit"
          size="small" @click="editUserDetail(scope.row)" >
          编辑
        </el-button>
		 <el-button
     type="danger" icon="el-icon-delete"
          size="small" @click="deleteUser(scope.row)">
          删除
        </el-button>
      </template>
    </el-table-column>
  </el-table>
</template>
<el-dialog title="新增用户" :visible.sync="dialogAddFormVisible">
  <el-form :model="form">
    <el-form-item label="账号" :label-width="formLabelWidth">
      <el-input v-model="form.account" ></el-input>
    </el-form-item>
	    <el-form-item label="显示名" :label-width="formLabelWidth">
      <el-input v-model="form.name" ></el-input>
    </el-form-item>
	    <el-form-item label="密码" :label-width="formLabelWidth">
      <el-input v-model="form.password" ></el-input>
    </el-form-item>
	    </el-form-item>
	    <el-form-item label="头像" :label-width="formLabelWidth">
<el-upload
  class="avatar-uploader"
  action="https://jsonplaceholder.typicode.com/posts/"
  :show-file-list="false"
  :on-success="handleAddAvatarSuccess"
  :before-upload="beforeAvatarUpload">
  <img v-if="form.face" :src="form.face" class="avatar">
  <i v-else class="el-icon-plus avatar-uploader-icon"></i>
</el-upload>

      <!-- <el-input v-model="form.face" ></el-input> -->
    </el-form-item>

	    <el-form-item label="邮箱" :label-width="formLabelWidth">
      <el-input v-model="form.mail" ></el-input>
    </el-form-item>
        </el-form-item>
	    <el-form-item label="权限" :label-width="formLabelWidth">
     <el-transfer v-model="form.userRoles" :data="roleDatas" :titles="['未拥有', '已拥有']"></el-transfer>
    </el-form-item>
   
  </el-form>
  <div slot="footer" class="dialog-footer">
    <el-button @click="dialogAddFormVisible = false">取 消</el-button>
    <el-button type="primary" @click="addUser">确 定</el-button>
  </div>
</el-dialog>
<el-dialog title="编辑用户" :visible.sync="dialogEditFormVisible">
  <el-form :model="editform">
    <el-form-item label="账号" :label-width="formLabelWidth">
      <el-input v-model="editform.account" ></el-input>
    </el-form-item>
	    <el-form-item label="显示名" :label-width="formLabelWidth">
      <el-input v-model="editform.name" ></el-input>
    </el-form-item>
	    <el-form-item label="密码" :label-width="formLabelWidth">
      <el-input v-model="editform.password" ></el-input>
    </el-form-item>
	    </el-form-item>
	    <el-form-item label="头像" :label-width="formLabelWidth">
      <el-input v-model="editform.face" ></el-input>
      <el-upload
  class="avatar-uploader"
  action="/api/upload/img"
  :show-file-list="false"
  :on-success="handleEditAvatarSuccess"
  :before-upload="beforeAvatarUpload">
  <img v-if="editform.face" :src="editform.face" class="avatar">
  <i v-else class="el-icon-plus avatar-uploader-icon"></i>
</el-upload>
    </el-form-item>
	    <el-form-item label="邮箱" :label-width="formLabelWidth">
      <el-input v-model="editform.mail" ></el-input>
    </el-form-item>
        </el-form-item>
        </el-form-item>
	    <el-form-item label="权限" :label-width="formLabelWidth">
     <el-transfer v-model="editform.userRoles" :data="roleDatas" :titles="['未拥有', '已拥有']"></el-transfer>
    </el-form-item>

  </el-form>
  <div slot="footer" class="dialog-footer">
    <el-button @click="dialogEditFormVisible = false">取 消</el-button>
    <el-button type="primary" @click="editUser">确 定</el-button>
  </div>
</el-dialog>
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
    this.getRoleData();
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