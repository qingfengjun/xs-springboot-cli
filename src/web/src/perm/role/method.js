import {
  getRole,
  addRole,
  deleteRole,
  editRole
} from '../../api/cliapi'
export default {
  getTableData() { //---------------------获取列表数据
    let para = {

    };
    getRole(para).then((res) => {
      console.log(res);
      this.tableData3 = res.data;
    });
  },
  addUser() {
    let _this = this;
    console.log(this.$refs.tree.getCheckedNodes());
    var nodes = this.$refs.tree.getCheckedNodes();
    var roleActions = new Array();
    for (var i = 0; i < nodes.length; i++) {
      roleActions.push({
        'actionName': nodes[i].id
      });
    }
    this.form.roleActions = roleActions;
    console.log(this.form);
    addRole(this.form).then((res) => {
      _this.getTableData();
      _this.dialogAddFormVisible = false;
    });
  },
  editRoleDetail(rows) {
    this.dialogEditFormVisible = true;
    this.editform = rows;

    var selectKeys = new Array();
    for (var i = 0; i < rows.roleActions.length; i++) {
      selectKeys.push({
        'id': rows.roleActions[i].actionName
      });
    }
    console.log(selectKeys);
    console.log(this.$refs.edittree);
    //解决第一次加载无此元素问题
    //https://blog.csdn.net/qq_39861508/article/details/78955722
    setTimeout(() => {
      this.$refs.edittree.setCheckedNodes(selectKeys);
    }, 0);

  },
  editUser() {
    let _this = this;
    console.log(this.editform);
    var nodes = this.$refs.edittree.getCheckedNodes();
    var roleActions = new Array();
    for (var i = 0; i < nodes.length; i++) {
      roleActions.push({
        'actionName': nodes[i].id
      });
    }
    this.editform.roleActions = roleActions;
    editRole(this.editform).then((res) => {
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
    deleteRole(para).then((res) => {
      _this.getTableData();
    });
  }
}
