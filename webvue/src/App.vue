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
  setup() {
    $.ajax({
      url: "http://127.0.0.1:8848/user/account/token",
      type: "post",
      //前端虽然没有注明数据返回给后端的格式，但是后端可以用参数Map<String,String>来接受
      data: {
        username: "zzj",
        password: "pzzj",
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
        console.log("出错啦！！！！！！")
      }
    });
  }
  
})


</script>


<style>
</style>
