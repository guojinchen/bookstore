package com.bookstore.util;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor  extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Map session = arg0.getInvocationContext().getApplication();
		if(session.get("ok")==null){
			return "fail";
			
		}else  
			return	arg0.invoke();	
	
	
	}

}
