import { createRouter, createWebHistory } from 'vue-router'
import TestOne from "../components/TestOne"

const routes = [
  {
    path: "/testone",
    component: TestOne,
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
