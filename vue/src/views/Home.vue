<template>
  <div class="home">
    <div id="flex">
    <h1 class="header">Welcome, {{ $store.state.user.username }}!</h1>
  </div>
  </div>
</template>



<script>


export default {
  components: {
  },

  name: "home",
};
</script>

<style scoped>
* {
  font-family: "Allerta Stencil";
  margin: 0;
  padding: 0;
}

#flex {
  display: flex;
  flex-direction: column;
  align-content: stretch;
  height: 96vh;
}

h1.header {
  display: flex;
  color: white;
  justify-content: center;
 
  background: transparent;
}
</style>