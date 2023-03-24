<template>
  <div>
    <div>
      name = {{ name }}
    </div>
    <div>
      age = {{ age }}
    </div>
  </div>
  <router-view/>
</template>

<script>
import $ from "jquery";
import { ref } from "vue";

export default ({
  name: "App",
  //整个函数的入口
  setup() {
    let name = ref(" ");
    let age = ref(" ");

    $.ajax({
      url: "http://127.0.0.1:8848/student",
      type: "get",
      success : resp => {
        //记得加value赋值
        name.value = resp.name,
        age.value = resp.age
        console.log(resp);
      }
    })

    return {
      name,
      age
    }
  },
})
</script>


<style>
</style>
