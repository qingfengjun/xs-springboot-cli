import Home from './business/Home'
import Cli from './cli/Home'
import Login from './Login'
import index from './business/index'
import ask from './business/ask'
import discuss from './business/discuss'
import blog from './business/blog'
import wiki from './business/wiki'
import wikidetail from './business/wiki/detail'
import user from './cli/perm/user'
import role from './cli/perm/role'
import accessLog from './cli/log/access'
let router = [
  {
    path: '/login',
    component: Login,
    name: '',
    hidden: true
},{
    path: '/',
    name: '首页',
    component: Home,
    redirect: '/index',
    hidden:true,
    iconCls: 'el-icon-document',
    children: [{
      path: '/index',
      component: index,
      name: '首页'
    },{
      path: '/discuss',
      component: discuss,
      name: '首页'
    },{
      path: '/ask',
      component: ask,
      name: '首页'
    },{
      path: '/blog',
      component: blog,
      name: '首页'
    },{
      path: '/wiki',
      component: wiki,
      name: '首页'
    },{
      path: '/wiki/detail',
      component: wikidetail,
      name: '首页'
    }]
  }, {
    path: '/perm',
    name: '用户和权限',
    component: Cli,
    iconCls: 'el-icon-document',
    children: [
      {
        path: '/perm/role',
        component: role,
        perm:"perm.cli.role",
        name: '角色'
      },{
        path: '/perm/user',
        component: user,
        perm:"perm.cli.user",
        name: '用户'
      }
    ]
  },
  {
    path: '/log',
    name: '日志',
    component: Cli,
    iconCls: 'el-icon-document',
    children: [{
        path: '/log/access',
        component: accessLog,
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
    component: Cli,
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
    component: Cli,
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
    component: Cli,
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
    component: Cli,
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
    component: Cli,
    iconCls: 'el-icon-upload',
    children: [{
      path: '/upload/demo',
      component: user,
      name: 'DEMO'
    }]
  }, {
    path: '/language',
    name: '多语言',
    component: Cli,
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
    component: Cli,
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
