import Vue from 'vue'
import Router from 'vue-router'
import App from './App'
import routes from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import NProgress from 'nprogress'
import 'nprogress/nprogress.css'
import './common/permUtils'
import {
  AddAccessLog
} from './cli/api'
Vue.use(Router)
Vue.use(ElementUI)
const router = new Router({
  routes
});

router.beforeEach((to, from, next) => {
  document.title = to.name;

  var logParas={
    modelName:to.matched[0].name,
     functionName:to.name,
     url:to.fullPath,
     params:JSON.stringify(to.params)
  }
  AddAccessLog(logParas).then((res) => {
    // console.log(res);
  });

  NProgress.start();
  if (to.path == '/login') {
    sessionStorage.removeItem('user');
  }
  let user = JSON.parse(sessionStorage.getItem('user'));
  if (!user && to.path != '/login') {
    next({ path: '/login' })
  } else {
    next()
  }
})

router.afterEach(transition => {
  NProgress.done();
});

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
