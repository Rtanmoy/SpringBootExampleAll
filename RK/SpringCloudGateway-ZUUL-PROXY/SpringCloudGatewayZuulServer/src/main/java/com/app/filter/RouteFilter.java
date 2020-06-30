package com.app.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class RouteFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("from route filter");
		return null;
	}

	@Override
	public String filterType() {
		//return "route";
		return FilterConstants.ROUTE_TYPE;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
