package com.app.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreFilter extends ZuulFilter{

	/**To enable or disable current filter*/
	public boolean shouldFilter() {
		return true;
	}

	/**Write Filter Logic here*/
	public Object run() throws ZuulException {
		System.out.println("From Pre Filter");
		return null;
	}

	/**What type of filter it is? Pre/post...*/
	public String filterType() {
		//return "pre";
		return FilterConstants.PRE_TYPE;
	}

	/**Provide order if same type of filters are used*/
	public int filterOrder() {
		return 0;
	}

}
