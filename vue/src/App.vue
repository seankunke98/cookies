<template>
  <div id="app">
    <nav-menu id="menu" />
    <router-view />
  </div>
</template>

<script>
import NavMenu from "../src/components/NavMenu.vue";
export default {
  components: {
    NavMenu,
  },
};
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Allura&family=Homemade+Apple&family=Ultra&display=swap");
* {
  margin: 0;
  padding: 0;
}

html {
  width: 100vw;
  height: 100vh;
}

body {
  display: flex;
  background: #b86b77;
  background: -webkit-linear-gradient(top left, #b86b77 0%, #eabfb9 100%);
  background: -moz-linear-gradient(top left, #b86b77 0%, #eabfb9 100%);
  background: -o-linear-gradient(top left, #b86b77 0%, #eabfb9 100%);
  background: linear-gradient(to bottom right, #b86b77 0%, #eabfb9 100%);
  height: 100%;
  font-family: Arial, Helvetica;
  letter-spacing: 0.02em;
  font-weight: 400;
  -webkit-font-smoothing: antialiased;
}

#app {
  width: 100vw;
  height: 100vh;
}

</style>