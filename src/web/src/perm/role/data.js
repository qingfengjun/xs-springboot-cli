export default {
  init: function () {
    return {
      tableData3: [],
      dialogAddFormVisible: false,
      dialogEditFormVisible: false,
      form: {},
      editform: {},
      formLabelWidth: '120px',
      actions: [{
        id: "perm.cli",
        label: "系统管理",
        children: [{
          id: "perm.cli.user",
          label: "用户",
          children: [{
              id: "perm.cli.user.query",
              label: "查询"
            },
            {
              id: "perm.cli.user.edit",
              label: "编辑"
            },
            {
              id: "perm.cli.user.add",
              label: "新增"
            }, {
              id: "perm.cli.user.delete",
              label: "删除"
            }
          ]
        }, {
          id: "perm.cli.role",
          label: "角色",
          children: [{
              id: "perm.cli.role.query",
              label: "查询"
            },
            {
              id: "perm.cli.role.edit",
              label: "编辑"
            },
            {
              id: "perm.cli.role.add",
              label: "新增"
            }, {
              id: "perm.cli.role.delete",
              label: "删除"
            }
          ]
        }]
      }]
    }
  }
}
