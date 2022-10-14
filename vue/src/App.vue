<template>
    <div id="app">
    <div id="sidebar">
      <navMenu id="menu" />
      <h1 id="site-title"> Cookies by Kels </h1>
    </div>
    <router-view />
  </div>
</template>

<script>
import navMenu from "../src/components/NavMenu.vue";
export default {
 components: {
    navMenu,
  },
};
</script>
<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Homemade+Apple&display=swap");

#sidebar {
  background: #1b1b1b;
  background-image: linear-gradient(to bottom right, #fcc200 10%, #da9100 80%);
}

#menu {
  display: flex;
  justify-content: flex-start;
  background-color: #1b1b1b;
  width: 100%;
}
#site-title {
  font-family: "Homemade Apple", cursive;
  display: flex;
  justify-content: center;
}

#app {
  height: 100vh;
  width: 100vw;
  background: linear-gradient(to bottom right, #b86b77 0%, #eabfb9 100%);
}
</style>