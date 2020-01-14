package com.swaggerjrs;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/rest")
public class AppConfig extends Application{

	public AppConfig(
			//@Context ServletConfig servletConfig
			) {
		System.out.println("Application created");
		
		resources.add(R1.class);
		
//		BeanConfig beanConfig = new BeanConfig();
//		beanConfig.setVersion("1.0.0");
//		beanConfig.setTitle("Swagger JaxRS");
//		beanConfig.setBasePath("/SwaggerJaxRS/rest");
//		beanConfig.setResourcePackage("com.swaggerjrs");
//		beanConfig.setScan(true);
		
		
	}
	
	private Set<Class<?>> resources = new HashSet<>();
	
	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return resources;
	}
	
	

	
	
}
