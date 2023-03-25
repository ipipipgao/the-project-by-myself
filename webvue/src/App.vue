<template>
  <NavBar />
  <router-view/>
</template>

<script>
import NavBar from "./components/NavBar.vue"
// 导入 Bootstrap 的 CSS 文件
import 'bootstrap/dist/css/bootstrap.css'
// 导入 Bootstrap 的 JavaScript 文件
import 'bootstrap/dist/js/bootstrap.js'
import $ from "jquery"


export default ({
  components: {
    NavBar
  },
  created() {
    $.ajax({
      url: "http://127.0.0.1:8848/add/user",
      type: "post",
      data: {
        name: "wzs",
        password: "pwzs",
      },
      success(resp) {
        console.log(resp.error_message);
      }
    });
  }
  
})


</script>


<style>
</style>
