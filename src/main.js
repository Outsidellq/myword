import Vue from 'vue'
import App from './App.vue'
import 'bootstrap/dist/css/bootstrap.min.css'
import router from "./myrouter"
import axios from 'axios'
Vue.config.productionTip = false
Vue.prototype.$https=axios

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
