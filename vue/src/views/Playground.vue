<template>
  <div class="movearea"></div>
</template>

<script>
export default {
  name: "playground",
  data() {
    return {
      x: 0,
      y: 0,
    };
  },
  methods: {
    onMousemove(e) {
      this.x = e.clientX;
      this.y = e.clientY;
    },
  },
};
</script>

<style scoped>
</style>