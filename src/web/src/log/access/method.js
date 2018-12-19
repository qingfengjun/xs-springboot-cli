import {
  getAccessLog
} from '../../api/cliapi'
export default {
  getTableData() { //---------------------获取列表数据
    let para = {

    };
    getAccessLog(para).then((res) => {
      // console.log(res);
      this.tableData3 = res.data;
    });
  }
}
