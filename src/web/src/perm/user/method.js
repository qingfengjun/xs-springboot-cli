import {
  getUser,
  addUser,
  deleteUser,
  editUser
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
  addUser() {
    let _this = this;
    console.log(this.form);
    addUser(this.form).then((res) => {
      _this.getTableData();
      _this.dialogAddFormVisible = false;
    });
  },
  editUser(){
	let _this = this;
    console.log(this.editform);
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
