<template>
<el-container>

  <el-main><el-card class="box-card">
  <div slot="header" class="clearfix">
    <span>讨论</span>
    <el-button style="float: right; padding: 3px 0" type="text">更多</el-button>
  </div>
  <div v-for="o in 4" :key="o" class="text item">
    {{'列表内容 ' + o }}
  </div>
</el-card></el-main>
    <el-aside >
		<el-row>
  <el-col :span="24"><el-card class="box-card">
  <div slot="header" class="clearfix">
    <span>讨论</span>
    <el-button style="float: right; padding: 3px 0" type="text">更多</el-button>
  </div>
  <div v-for="o in 4" :key="o" class="text item">
    {{'列表内容 ' + o }}
  </div>
</el-card></el-col>
  <el-col :span="24"><el-card class="box-card">
  <div slot="header" class="clearfix">
    <span>求助</span>
    <el-button style="float: right; padding: 3px 0" type="text">更多</el-button>
  </div>
  <div v-for="o in 4" :key="o" class="text item">
    {{'列表内容 ' + o }}
  </div>
</el-card></el-col>
  <el-col :span="24"><el-card class="box-card">
  <div slot="header" class="clearfix">
    <span>博客</span>
    <el-button style="float: right; padding: 3px 0" type="text">更多</el-button>
  </div>
  <div v-for="o in 4" :key="o" class="text item">
    {{'列表内容 ' + o }}
  </div>
</el-card>
  </el-col>
  <el-col :span="24"><el-card class="box-card">
  <div slot="header" class="clearfix">
    <span>WIKI</span>
    <el-button style="float: right; padding: 3px 0" type="text">更多</el-button>
  </div>
  <div v-for="o in 4" :key="o" class="text item">
    {{'列表内容 ' + o }}
  </div>
</el-card>
  </el-col>
</el-row>
</el-aside>
</el-container>
</template>
<script type="text/javascript">
  
    import data from './data'
    import methods from './method'

	export default{
		data(){
			return {};
		},
		methods:methods,
		mounted(){
			
		}
	}
</script>
<style type="text/css"> 
</style>