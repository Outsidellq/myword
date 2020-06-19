import Vue from 'vue'
import VueRouter from 'vue-router'
import login from "../components/login/login.vue"
Vue.use(VueRouter)
var router=new VueRouter({
	mode: 'history',
	routes: [{
			path: "/",
			/* component: ()=>import("../components/main.vue") */
			 component: ()=>import("../components/add.vue") 
		},
		{
				path: "/login",
				component: login
			},
			{
					path: "/update",
					component:  ()=>import("../components/update.vue") 
				},
			{
					path: "/main",
					component: ()=>import("../components/main.vue")
				},
		{
			path:"/register",
			 component:()=>import("../components/login/register.vue")
		}
	]
})

export default router