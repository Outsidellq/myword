import Vue from 'vue'
import VueRouter from 'vue-router'
import login from "../components/login/login.vue"
Vue.use(VueRouter)
var router=new VueRouter({
	mode: 'history',
	routes: [{
			path: "/",
			 component: ()=>import("../components/main.vue")
		},
		{
				path: "/login",
				component: login
			},
			{
					path: "/updatepwd",
					name:"updatepwd",
					component: ()=>import("../components/login/updatepwd.vue")
				},
			{
					path: "/add",
					 component: ()=>import("../components/add.vue") 
				},
			{
					path: "/update",
					name:"Update",
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


 router.beforeEach(function(to,from,next){
	console.log(to.path)
	if(to.path.indexOf("login")!=-1){
		if(sessionStorage.getItem("loginuser")){
			next("/main")
		}else{
			next()
		}
	}else{
		if(sessionStorage.getItem("loginuser")){
			next()
		}else if(to.path.indexOf("register")!=-1){
			next()
		}else{
			next("/login")
		}
	} 
	
})

export default router