/**
 * http配置
 */
import axios from 'axios'
import {
  Message
} from 'element-ui'
import NProgress from 'nprogress'
import 'nprogress/nprogress.css'
// 超时时间
axios.defaults.timeout = 5000
// http请求拦截器
axios.interceptors.request.use(config => {
  NProgress.start();
  return config
}, error => {
  Message.error({
    message: '加载超时'
  })
  NProgress.done();
  return Promise.reject(error)
})
// http响应拦截器
axios.interceptors.response.use(data => { // 响应成功关闭loading
  NProgress.done();
  return data
}, error => {
  NProgress.done();
  Message.error({
    message: '加载失败'
  })
  return Promise.reject(error)
})

export default axios