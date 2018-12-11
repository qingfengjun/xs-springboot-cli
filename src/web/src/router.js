import Home from './Home'
import Login from './Login'
import index from './index'
import user from './perm/user'
import role from './perm/role'

let router = [
  {
    path: '/login',
    component: Login,
    name: '',
    hidden: true
},{
    path: '/',
    name: 'Dashbord',
    component: Home,
    redirect: '/index',
    iconCls: 'el-icon-document',
    children: [{
      path: '/index',
      component: index,
      name: '首页'
    }]
  }, {
    path: '/perm',
    name: '用户和权限',
    component: Home,
    iconCls: 'el-icon-document',
    children: [
      {
        path: '/perm/role',
        component: role,
        perm:"perm.cli.user",
        name: '角色'
      },{
        path: '/perm/user',
        component: user,
        perm:"perm.cli.role",
        name: '用户'
      }
    ]
  },
  {
    path: '/log',
    name: '日志',
    component: Home,
    iconCls: 'el-icon-document',
    children: [{
        path: '/log/opt',
        component: user,
        name: '操作日志'
      },
      {
        path: '/log/user',
        component: user,
        name: '系统日志'
      }
    ]
  },
  {
    path: '/timer',
    name: '定时任务',
    component: Home,
    iconCls: 'el-icon-time',
    children: [{
        path: '/timer/task',
        component: user,
        name: '任务'
      },
      {
        path: '/timer/log',
        component: user,
        name: '任务日志'
      }
    ]
  },
  {
    path: '/data',
    name: '数据字典',
    component: Home,
    iconCls: 'el-icon-document',
    children: [{
      path: '/data',
      component: user,
      name: '业务字典'
    }]
  },
  {
    path: '/mail',
    name: '邮件',
    component: Home,
    iconCls: 'el-icon-message',
    children: [{
        path: '/mail/config',
        component: user,
        name: '邮件配置'
      },
      {
        path: '/mail/log',
        component: user,
        name: '邮件日志'
      },
      {
        path: '/mail/template',
        component: user,
        name: '邮件模板'
      }
    ]
  }, {
    path: '/attach',
    name: '附件',
    component: Home,
    iconCls: 'el-icon-picture',
    children: [{
        path: '/attach/demo',
        component: user,
        name: 'DEMO'
      },
      {
        path: '/attach/log',
        component: user,
        name: '附件日志'
      }
    ]
  }, {
    path: '/upload',
    name: '导入导出',
    component: Home,
    iconCls: 'el-icon-upload',
    children: [{
      path: '/upload/demo',
      component: user,
      name: 'DEMO'
    }]
  }, {
    path: '/language',
    name: '多语言',
    component: Home,
    iconCls: 'el-icon-document',
    children: [{
      path: '/language/config',
      component: user,
      name: '语言配置'
    }, {
      path: '/language/user',
      component: user,
      name: '翻译'
    }]
  }, {
    path: '/basic',
    name: '基础功能',
    component: Home,
    iconCls: 'el-icon-document',
    children: [{
      path: '/basic/wangedit',
      component: user,
      name: '富文本框'
    }, {
      path: '/basic/markdown',
      component: user,
      name: 'MarkDown'
    }]
  }
];

export default router;
