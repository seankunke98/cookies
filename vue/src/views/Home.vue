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
div#flex {
  display: flex;
  justify-content: center;
}

h1.header {
  font-family: 'Homemade Apple', cursive;
}
</style>