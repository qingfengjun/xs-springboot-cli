import Vue from 'vue'
import Router from 'vue-router'
import App from './App'
import routes from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import NProgress from 'nprogress'
import 'nprogress/nprogress.css'

Vue.use(Router)
Vue.use(ElementUI)
const router = new Router({
  routes
});
//  判断是否需要登录权限 以及是否登录
router.beforeEach((to, from, next) => {
  console.log(to);

  //NProgress.start();
  next();
})
router.beforeEach((to, from, next) => {
  document.title = to.name;
  NProgress.start();
  next()
});

router.afterEach(transition => {
  NProgress.done();
});

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
