package com.cy.store.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 定义一个拦截器 底层利用AOP
 * preHandle:在调用所有处理方法之前被自动调用执行的方法
 * postHandle:ModelAndView对象返回之后被调用的方法
 * afterHandle：整个请求所有关联的资源被执行完毕最后所执行的方法
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 检测全局session对象中是否有uid数据，如果有放行，没有重定向到登录页面
     *
     * @param request  请求对象
     * @param response 响应对象
     * @param handler  处理器(url+Controller)
     * @return 如果返回值为true表示放行当前请求，false拦截当前请求
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //HttpServletRequest对象来获取session对象
        Object obj = request.getSession().getAttribute("uid");
        if (obj == null) {
            //说明用户没有登录过系统，重定向到login.html
            response.sendRedirect("/web/login.html");
            //结束后续的调用
            return false;
        }
        return true;
    }
}
