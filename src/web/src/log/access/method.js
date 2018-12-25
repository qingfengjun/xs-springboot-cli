import {
  getAccessLog
} from '../../api/cliapi'
export default {
  getTableData() { //---------------------获取列表数据
    getAccessLog(this.filters).then((res) => {
      // console.log(res);
      this.tableData3 = res.data.bo.content;
      this.filters.totalElements=res.data.bo.totalElements;
    });
  },
  handleSizeChange(val) {
    this.filters.size=val;
    this.getTableData();
  },
  handleCurrentChange(val) {
    this.filters.page=val;
    this.getTableData();
  }
}
