<template>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand active" href="TestOne">首页</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="http://127.0.0.1:8080/testone">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Disabled</a>
        </li>
      </ul>
      <ul class="navbar-nav">
        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            yourself
          </a>
        <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">introduce myself</a></li>
            <li><a class="dropdown-item" href="#">habit</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">likely</a></li>
        </ul>
      </ul>
    </div>
  </div>
</nav>
</template>

<script>
// import TestOne from "./TestOne.vue"

// export default {
//     components: {
//         TestOne
//     }
// }

</script>

<style scoped>

</style>