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
  background: #50a3a2;
  background: -webkit-linear-gradient(top left, #50a3a2 0%, #53e3a6 100%);
  background: -moz-linear-gradient(top left, #50a3a2 0%, #53e3a6 100%);
  background: -o-linear-gradient(top left, #50a3a2 0%, #53e3a6 100%);
  background: linear-gradient(to bottom right, #50a3a2 0%, #53e3a6 100%);
  height: 100%;
  font-family: Arial, Helvetica;
  letter-spacing: 0.02em;
  font-weight: 400;
  -webkit-font-smoothing: antialiased;
}
.bg-bubbles {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;

  z-index: 1;
}

li {
  position: absolute;
  list-style: none;
  display: block;
  width: 40px;
  height: 40px;
  background-color: fade(white, 15%);
  bottom: -160px;

  -webkit-animation: square 25s infinite;
  animation: square 25s infinite;

  -webkit-transition-timing-function: linear;
  transition-timing-function: linear;
}

@-webkit-keyframes square {
  0% {
    transform: translateY(0);
  }
  100% {
    transform: translateY(-700px) rotate(600deg);
  }
}
@keyframes square {
  0% {
    transform: translateY(0);
  }
  100% {
    transform: translateY(-700px) rotate(600deg);
  }
}

#sidebar {
  font-family: "Bungee Spice";
  background: #1b1b1b;
}

#menu {
  display: flex;
  justify-content: flex-start;
  background-color: #1b1b1b;
  width: 100%;
}
.site-title {
  /* display: flex;
  justify-content: center;
  margin-top: -50px;
  padding-bottom: 15px;
  padding-top: 10px;
  margin-inline: auto; */
  position: relative;
  width: 250px;
  height: 350px;
  top: calc(50% - 175px);
  left: calc(50% - 125px);
  background: inherit;
  border-radius: 2px;
  overflow: hidden;
}

@mixin dots($count) {
  $text-shadow: ();
  @for $i from 0 through $count {
    $text-shadow: $text-shadow,
      (-0.5+ (random()) * 3) +
        em
        (-0.5+ (random()) * 3) +
        em
        7px
        hsla(random() * 360, 100%, 50%, 0.9);
  }
  text-shadow: $text-shadow;
}

.site-title:after {
  content: "";
  width: 300px;
  height: 300px;
  background: inherit;
  position: absolute;
  left: -25px;
  left: position;
  right: 0;
  top: -25px;
  top: position;
  bottom: 0;
  box-shadow: inset 0 0 0 200px rgba(255, 255, 255, 0.05);
  filter: blur(10px);
}

#app {
  height: 100vh;
  width: 200vh;
}
</style>