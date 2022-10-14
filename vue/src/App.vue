<template>
  <div id="app">

    <div id="sidebar">
    <nav-menu id="menu" />
    <h1 id="site-title">Cookies by Kels</h1>
  </div>
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
@import url("https://fonts.googleapis.com/css2?family=Ultra&display=swap");
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

background: -webkit-linear-gradient(bottom left, #f0a37a 0%, #f3c9e3 98%);
background: -moz-linear-gradient(bottom left, #f0a37a 0%, #f3c9e3 98%);
background: -o-linear-gradient(bottom left, #f0a37a 0%, #f3c9e3 98%);
background: -ms-linear-gradient(bottom left, #f0a37a 0%, #f3c9e3 98%);
background: linear-gradient(to top right, #f0a37a 0%, #f3c9e3 98%);

  height: 100%;
  font-family: Arial, Helvetica;
  letter-spacing: 0.02em;
  font-weight: 400;
  -webkit-font-smoothing: antialiased;
}

#sidebar {
  width: 100vw;
  font-family: "Homemade Apple", cursive;
  background: #1b1b1b;
display: flex;

  background: -webkit-linear-gradient(bottom left, #f0a37a 0%, #f3c9e3 98%);
background: -moz-linear-gradient(bottom left, #f0a37a 0%, #f3c9e3 98%);
background: -o-linear-gradient(bottom left, #f0a37a 0%, #f3c9e3 98%);
background: -ms-linear-gradient(bottom left, #f0a37a 0%, #f3c9e3 98%);
background: linear-gradient(to top right, #f0a37a 0%, #f3c9e3 98%);
}
</style>

