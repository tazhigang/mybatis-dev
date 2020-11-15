package com.ittzg.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Base64;

/**
 * @author: tazhigang
 * @date: 2020/11/10 13:34
 * @Email: tazhigang095@163.com
 * @desc:
 */
public class LoggerHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        System.out.println("before");
        Object invoke = method.invoke(proxy, args);
        System.out.println("before");
        return invoke;
    }


    public static LoggerHandler getInstance() {
        return null;
    }


    public static void main(String[] args) {

        byte[] decode = Base64.getDecoder().decode("eyJkZXZpY2VfaWQiOiIxMTExMTExMTExIiwiZGV2aWNlX3R5cGUiOiIxIiwic291cmNlX2lwIjoiMC4wLjAuMCIsImFjY291bnRfaWRfaGFzaCI6IjAwMDAwMCIsIm1vYmlsZSI6IjEzMTExMTExMTExIn0=");
        System.out.println(new String(decode));
    }
}
