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

.header {
  color: white;
  justify-content: center;
  margin: 1%;
  background: #1b1b1b;
  margin-top: -56px;
  margin-left: 250px;
  width: 400px;
}

</style>