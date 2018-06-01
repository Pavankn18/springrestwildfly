package test.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import test.jquick2.MyResource;

public class RestConfig extends ResourceConfig{
	
	public RestConfig() {
		register(RequestContextFilter.class);
		register(MyResource.class);
	}

}
