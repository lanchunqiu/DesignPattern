package com.lancq.others_pattern.delegate.mvc;

import com.lancq.others_pattern.delegate.mvc.controllers.LoginAction;
import com.lancq.others_pattern.delegate.mvc.controllers.LogoutAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/27
 **/
public class DispatcherServlet {

    private Map<String,Handler> handlerMapping = new HashMap<String,Handler>();

    public DispatcherServlet(){

        try{
            Class clazzLoginAction = LoginAction.class;
            Handler handler = new Handler(clazzLoginAction.newInstance(), clazzLoginAction.getMethod("login",new Class[]{String.class,String.class}), "/login.do");
            handlerMapping.put("/login.do", handler);

            Class classLogoutAction = LogoutAction.class;
            handler = new Handler(clazzLoginAction.newInstance(), classLogoutAction.getMethod("login",new Class[]{}), "/logout.do");
            handlerMapping.put("/logout.do", handler);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void doService(HttpServletRequest request, HttpServletResponse response){
        doDispatch(request,response);
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response) {
        //1、获取用户请求的url
        //   如果按照J2EE的标准、每个url对对应一个Serlvet，url由浏览器输入
        String uri = request.getRequestURI();


        //2、Servlet拿到url以后，要做权衡（要做判断，要做选择）
        //   根据用户请求的URL，去找到这个url对应的某一个java类的方法

        //3、通过拿到的URL去handlerMapping（我们把它认为是策略常量）
        Handler handle = null;
        for (Map.Entry entry : handlerMapping.entrySet()) {
            String key = (String) entry.getKey();
            if(uri.equals(key)){
                handle = handlerMapping.get(key);
                break;
            }
        }

        //4、将具体的任务分发给Method（通过反射去调用其对应的方法）
        Object object = null;
        try {
            object = handle.getMethod().invoke(handle.getController(),new String[]{request.getParameter("username"),request.getParameter("password")});
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //5、获取到Method执行的结果，通过Response返回出去

        try {
            response.getWriter().write("ABCD");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    class Handler{
        private Object controller;
        private Method method;
        private String url;
        public Handler(Object controller, Method method, String url){
            this.controller = controller;
            this.method = method;
            this.url = url;
        }
        public Object getController() {
            return controller;
        }

        public void setController(Object controller) {
            this.controller = controller;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
