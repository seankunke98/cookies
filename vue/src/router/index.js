import Vue from 'vue'
import Router from 'vue-router'
import store from '../store/index'
import Login from '../views/Login.vue'
import Logout from '../views/Logout.vue'
import Register from '../views/Register.vue'
import Home from '../views/Home.vue'
import Playground from '../views/Playground.vue'

Vue.use(Router)

const router = new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        {
            path: "/",
            name: "home",
            component: Home,
            meta: {
                requiresAuth: true
            }
        },
        {
            path: "/login",
            name: "login",
            component: Login,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/logout",
            name: "logout",
            component: Logout,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/register",
            name: "register",
            component: Register,
            meta: {
                requiresAuth: false
            }
        },
        {
            path: "/playground",
            name: "playground",
            component: Playground,
            meta: {
                requiresAuth: true
            }
        }
    ]
})

router.beforeEach((to, from, next) => {
    const requiresAuth = to.matched.some(x => x.meta.requiresAuth);
    if (requiresAuth && store.state.token === '') {
        next("/login");
    } else {
        next();
    }
});

export default router;
