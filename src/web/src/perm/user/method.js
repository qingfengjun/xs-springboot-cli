import {
  getUser,
  addUser,
  deleteUser,
  editUser,
  getRole
} from '../../api/cliapi'
export default {
  getTableData() { //---------------------获取列表数据
    let para = {

    };
    getUser(para).then((res) => {
      console.log(res);
      this.tableData3 = res.data;
    });
  },
  getRoleData() { //---------------------获取列表数据
    let _this = this;
    let para = {

    };
    getRole(para).then((res) => {
      console.log(res);
      var resdata = res.data;
      var data = [];
      for (var i = 0; i < resdata.length; i++) {
        data.push({
          key: resdata[i].id,
          label: resdata[i].name
        });
      }
      _this.roleDatas=data;
    });
  },
  addUser() {
    let _this = this;
    console.log(this.form);
    var userRoles=this.form.userRoles;
    var data = [];
    for (var i = 0; i < userRoles.length; i++) {
      data.push({
        roleId: userRoles[i]
      });
    }
    this.form.userRoles=data;
    addUser(this.form).then((res) => {
      _this.getTableData();
      _this.dialogAddFormVisible = false;
    });
  },
  editUserDetail(rows) {
    this.dialogEditFormVisible = true;
    this.editform = rows;

    var selectKeys = new Array();
    for (var i = 0; i < rows.userRoles.length; i++) {
      selectKeys.push(rows.userRoles[i].roleId);
    }
    this.editform.userRoles=selectKeys;
    // console.log(selectKeys);
    // console.log(this.$refs.edittree);
    // //解决第一次加载无此元素问题
    // //https://blog.csdn.net/qq_39861508/article/details/78955722
    // setTimeout(() => {
    //   this.$refs.edittree.setCheckedNodes(selectKeys);
    // }, 0);

  },
  editUser() {
    let _this = this;
    console.log(this.editform);
    var userRoles=this.editform.userRoles;
    var data = [];
    for (var i = 0; i < userRoles.length; i++) {
      data.push({
        roleId: userRoles[i]
      });
    }
    this.editform.userRoles=data;
    editUser(this.editform).then((res) => {
      _this.getTableData();
      _this.dialogEditFormVisible = false;
    });
  },
  deleteUser(row) {
    console.log(row);
    let _this = this;
    let para = {
      id: row.id
    };
    deleteUser(para).then((res) => {
      _this.getTableData();
    });
  }
}
