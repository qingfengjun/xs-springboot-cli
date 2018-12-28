<template>

<div class="maincenter">
  <el-row :span="24" v-for="o in 20" :key="o">

     <el-col :span="16">看中哈弗h6和宝骏560两种车型 请高手们指点下选哪款 详细解释下其优缺点</el-col>
  <el-col :span="4">0
回答</el-col>
  <el-col :span="4">1
分钟前</el-col>

</el-row>

  <el-pagination
  background
  layout="prev, pager, next"
  :total="1000">
</el-pagination>
</div>

</template>
<script type="text/javascript">
import data from "./data";
import methods from "./method";

export default {
  data() {
    return {};
  },
  methods: methods,
  mounted() {}
};
</script>
<style type="text/css">
</style>