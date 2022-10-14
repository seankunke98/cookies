<template>
  <div id="login-page">
    <div class="name" id="name">
      <h1>Cookies by Kels</h1>
    </div>
    <div id="login" class="text-center">
      <form class="form-signin" @submit.prevent="login" id="flex">
        <h2 class="h3 mb-3 font-weight-normal">Please Sign In</h2>
        <div class="alert alert-danger" role="alert" v-if="invalidCredentials">
          Invalid username and password!
        </div>
        <div
          class="alert alert-success"
          role="alert"
          v-if="this.$route.query.registration"
        >
          Thank you for registering, please sign in.
        </div>
        <label for="username" class="sr-only"></label>
        <input
          type="text"
          id="username"
          class="form-control"
          placeholder="Username"
          v-model="user.username"
          required
          autofocus
        />
        <br />
        <label for="password" class="sr-only"></label>
        <input
          type="password"
          id="password"
          class="form-control"
          placeholder="Password"
          v-model="user.password"
          required
        />
        <br />
        <button class="sign-in-button" type="submit">Sign in</button>
        <br />
        <router-link :to="{ name: 'register' }" class="need-account"
          >Need an account?</router-link
        >
      </form>
    </div>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
      invalidCredentials: false,
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then((response) => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch((error) => {
          const response = error.response;
          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    },
    created: function () {
      this.button.click(function(event){
		 event.preventDefault();
	 
	 $('form').fadeOut(500);
	 $('.wrapper').addClass('form-success');
})  
    }
    
  }
}
  
</script>

<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Bungee+Spice&display=swap");
@import url("https://fonts.googleapis.com/css2?family=Ultra&display=swap");
* {
  font-weight: 540;
  margin: 0;
  padding: 0;
}

#login-page {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100vh;
}

div#name.name {
  font-family: "Homemade Apple", cursive;
  font-size: 30px;
  background: #1b1b1b;
  border-radius: 40px;
  margin-top: 30px;
  margin-bottom: 10px;
  padding: 20px;
  color: white;
  border: 2px solid white;
  width: 550px;
  height: 150px;
  font-family: "Homemade Apple", cursive;
  background: pink;
  background: #b86b77;
  background: -webkit-linear-gradient(top left, #b86b77 0%, #eabfb9 100%);
  background: -moz-linear-gradient(top left, #b86b77 0%, #eabfb9 100%);
  background: -o-linear-gradient(top left, #b86b77 0%, #eabfb9 100%);
  background: linear-gradient(to bottom right, #b86b77 0%, #eabfb9 100%);
  background-image: linear-gradient(to bottom right, #fcc200 10%, #da9100 80%);
  background-clip: text;
  -webkit-text-fill-color: transparent;
}

/* .name:after {
  content: "";
  width: 300px;
  height: 300px;
  background: inherit;
  position: inherit;
  left: -25px;
  left: position;
  right: 0;
  top: -25px;
  top: position;
  bottom: 0;
  box-shadow: inset 0 0 0 200px rgba(8, 12, 255, 0.05);
  filter: blur(10px);
} */

.information {
  font-size: 30px;
  background: #1b1b1b;
  border-radius: 40px;
  width: 450px;
  margin-top: 30px;
  margin-bottom: 10px;
  padding: 20px;
  color: white;
  border: 2px solid white;
}

#login {
  color: black;
  justify-content: center;
}

.form-signin {
  display: flex;
  flex-direction: column;
  width: 450px;
  border-radius: 15px;
  background: #fff;
  padding: 20px;
  margin: 0 auto;
}

.h3 {
  text-align: center;
  font-size: 35px;
  padding: 20px 20px 0;
  margin: 0;
}

.form-control {
  padding: 15px 15px 2px;
  margin: 15px 15px 0;
  border-radius: 3px;
  font-size: 20px;
  background-color: #e0e0e0;
  border: black;
  text-align: center;
  padding-bottom: 20px;
}

input {
  border: 0;
  color: black;
  font: inherit;
  margin: 0;
  outline: 0;
  padding: 0;
}

.form-control[type="text"]:focus {
  outline: none;
  box-shadow: 0 0 0 2px #484848;
}

.form-control[type="password"]:focus {
  outline: none;
  box-shadow: 0 0 0 2px #484848;
}

.sign-in-button {
  display: flex;
  justify-content: center;
  align-content: center;
  padding: 15px 15px 2px;
  margin: 15px 15px 0;
  border-radius: 3px;
  font-size: 20px;
  background-color: #484848;
  color: white;
  padding-bottom: 20px;
}

.need-account {
  font-size: 20px;
  text-align: center;
  color: black;
}
@media (max-width: 550px) {
  .name {
    display: flex;
    flex-shrink: 1;
    font-size: 25px;
  }

  .information {
    display: flex;
    font-size: smaller;
    width: 300px;
  }

  #login {
    display: flex;
    justify-content: center;
  }

  .form-signin {
    border-radius: 15px;
    padding: 20px;
    margin: 0 auto;
    width: 300px;
  }

  .h3 {
    text-align: center;
    font-size: 20px;
    padding: 20px 20px 0;
    margin: 0;
  }

  .form-control {
    padding: 15px 15px 2px;
    margin: 15px 15px 0;
    font-size: 10px;
    padding-bottom: 20px;
  }

  input {
    border: 0;
    color: black;
    font: inherit;
    margin: 0;
    outline: 0;
    padding: 0;
  }

  .form-control[type="text"]:focus {
    outline: none;
  }

  .form-control[type="password"]:focus {
    outline: none;
  }

  .sign-in-button {
    display: flex;
    justify-content: center;
    align-content: center;
    padding: 10px 10px 10px;
    margin: 15px 15px 0;
    border-radius: 3px;
    font-size: 15px;
  }

  .need-account {
    font-size: 10px;
  }
}
</style>
