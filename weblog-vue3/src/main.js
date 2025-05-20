import '@/assets/main.css'
import 'animate.css';
import { createApp } from 'vue'
import App from '@/App.vue'
// 导入路由
import router from '@/router'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

const app = createApp(App)

// 应用路由
app.use(router)
app.mount('#app')
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}