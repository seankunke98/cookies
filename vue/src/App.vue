<template>
  <div id="app">
    <div id="sidebar">
      <burger-menu id="menu" />
      <h1 id="site-title">Cookies by Kels</h1>
    </div>
    <router-view />
  </div>
</template>

<script>
import BurgerMenu from "../src/components/burgermenu.vue";
export default {
  components: {
    BurgerMenu,
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

#sidebar {
  font-family: "Homemade Apple", cursive;
  background: pink;
  background: #b86b77;
  background: -webkit-linear-gradient(top left, #b86b77 0%, #eabfb9 100%);
  background: -moz-linear-gradient(top left, #b86b77 0%, #eabfb9 100%);
  background: -o-linear-gradient(top left, #b86b77 0%, #eabfb9 100%);
  background: linear-gradient(to bottom right, #b86b77 0%, #eabfb9 100%);
}

#menu {
  display: flex;
  justify-content: flex-start;
  background-color: #1b1b1b;
  width: 100%;
}
h1#site-title {
  background-image: linear-gradient(to bottom right, #da9100 10%, #B86B77 80%);
  background-clip: text;
  -webkit-text-fill-color: transparent;
}

</style>