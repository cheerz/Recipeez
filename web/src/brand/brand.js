import Vue from 'vue'
import Brand from './Brand.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(Brand)
}).$mount('#app')
