package com.zdx.config;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFormAuthenticationFilter extends FormAuthenticationFilter{
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        WebUtils.getAndClearSavedRequest(request);  //清理原先的地址
        WebUtils.redirectToSavedRequest(request,response,"/home");
        return false;
    }
}
