<template>
	<el-row class="container">
		<el-col :span="24" class="header">
		    <el-col :span="4" class="logo">
				<span> KM<i class="txt">&nbsp;xs</i></span>
			</el-col>
		    <el-col :span="12" >
				<el-menu :default-active="$route.path"  mode="horizontal"  background-color="rgb(32, 160, 255)"
  text-color="#fff"
  active-text-color="#ffd04b"
    router>
  <el-menu-item index="/index" >首页</el-menu-item>
  <el-menu-item index="/discuss">讨论</el-menu-item>
  <el-menu-item index="/ask" >求助</el-menu-item>
  <el-menu-item index="/blog" >博客</el-menu-item>
    <el-menu-item index="/wiki" >WIKI</el-menu-item>
</el-menu>
			</el-col>
			<el-col :span="4" >
 <el-input placeholder="请输入内容"  class="input-with-select">
    <el-button slot="append" icon="el-icon-search"></el-button>
  </el-input>
			</el-col>
			<el-col :span="4" class="userinfo">
				<el-dropdown trigger="click">
					<span class="el-dropdown-link userinfo-inner"><img :src="sysUserAvatar" /> {{sysUserName}}</span>
					<el-dropdown-menu slot="dropdown">
						<el-dropdown-item>我的消息</el-dropdown-item>
						<el-dropdown-item>设置</el-dropdown-item>
						<el-dropdown-item divided @click.native="logout">退出登录</el-dropdown-item>
					</el-dropdown-menu>
				</el-dropdown>
				<a href="#/perm"><i class="el-icon-setting"></i></a>
			</el-col>
		</el-col>
		<el-col :span="24" class="main">
<transition>
							<router-view></router-view>
						</transition>
		</el-col>
	</el-row>
</template>

<script>
export default {
  data() {
    return {
      sysUserName: "",
      sysUserAvatar: "",
      activeIndex: "1"
    };
  },
  methods: {
    onSubmit() {
      console.log("submit!");
    },
    handleopen() {
      //console.log('handleopen');
    },
    handleclose() {
      //console.log('handleclose');
    },
    handleselect: function(a, b) {},
    //退出登录
    logout: function() {
      var _this = this;
      this.$confirm("确认退出吗?", "提示", {
        //type: 'warning'
      })
        .then(() => {
          sessionStorage.removeItem("user");
          _this.$router.push("/login");
        })
        .catch(() => {});
    }
  },
  mounted() {
    var user = sessionStorage.getItem("user");
    if (user) {
      user = JSON.parse(user);
      console.log(user);
      console.log(user);
      this.sysUserName = user.name || "";
      this.sysUserAvatar = user.face || "";
    }
  }
};
</script> 
<style scoped lang="scss">
@import "~scss_vars";

.container {
  position: absolute;
  top: 0px;
  bottom: 0px;
  width: 100%;
  .header {
    height: 60px;
    line-height: 60px;
    background: $color-primary;
    color: #fff;
    .userinfo {
      text-align: right;
      padding-right: 35px;
      float: right;
      .userinfo-inner {
        cursor: pointer;
        color: #fff;
        img {
          width: 40px;
          height: 40px;
          border-radius: 20px;
          margin: 10px 0px 10px 10px;
          float: right;
        }
      }
    }
    .logo {
      //width:230px;
      height: 60px;
      font-size: 22px;
      padding-left: 120px;
      padding-right: 20px;
      border-color: rgba(238, 241, 146, 0.3);
      background-image: url(".././assets/logo.png");
      background-repeat: no-repeat;
      border-right-width: 0px;
      border-right-style: solid;
      background-position-x: 20px;
      background-position-y: 10px;

      .txt {
        color: #e6a23c;
      }
    }
    .logo-width {
      width: 230px;
    }
    .logo-collapse-width {
      width: 60px;
    }
    .tools {
      padding: 0px 23px;
      width: 14px;
      height: 60px;
      line-height: 60px;
      cursor: pointer;
    }
  }
  .main {
    display: flex;
    // background: #324057;
    position: absolute;
    top: 60px;
    bottom: 0px;
    overflow: scroll;
    aside {
      flex: 0 0 230px;
      width: 230px;
      // position: absolute;
      // top: 0px;
      // bottom: 0px;
      .el-menu {
        height: 100%;
      }
      .collapsed {
        width: 60px;
        .item {
          position: relative;
        }
        .submenu {
          position: absolute;
          top: 0px;
          left: 60px;
          z-index: 99999;
          height: auto;
          display: none;
        }
      }
    }
    .menu-collapsed {
      flex: 0 0 60px;
      width: 60px;
    }
    .menu-expanded {
      flex: 0 0 230px;
      width: 230px;
    }
    .content-container {
      // background: #f1f2f7;
      flex: 1;
      // position: absolute;
      // right: 0px;
      // top: 0px;
      // bottom: 0px;
      // left: 230px;
      overflow-y: scroll;
      padding: 20px;
      .breadcrumb-container {
        //margin-bottom: 15px;
        .title {
          width: 200px;
          float: left;
          color: #475669;
        }
        .breadcrumb-inner {
          float: right;
        }
      }
      .content-wrapper {
        background-color: #fff;
        box-sizing: border-box;
      }
    }
  }
}

.maincenter{
	width: 80%;
	margin-left:auto;
	margin-right:auto;
}
</style>