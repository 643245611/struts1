package cn.itheima.web;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class Logininterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = ActionContext.getContext().getSession();
		
		Object object = session.get("user");
		
		if(object==null){
			return "toLogin";
		}else{
			return invocation.invoke();
		}
		
	}

}
