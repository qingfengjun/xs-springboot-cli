import Vue from 'vue'

/**权限指令**/
Vue.directive('has', {
  bind: function (el, binding) {
    if ((binding.value||"")!=""&&!Vue.prototype.$_has(binding.value)) {
      el.parentNode.removeChild(el);
    }
  }
});
//权限检查方法
Vue.prototype.$_has = function (value) {
  let isExist = false;
  var user = sessionStorage.getItem('user');
  user = JSON.parse(user);
  let buttonperms = user.roleActions;
  for (let i = 0; i < buttonperms.length; i++) {
    if (buttonperms[i].actionName == value) {
      isExist = true;
      break;
    }
  }
  return isExist;
};
