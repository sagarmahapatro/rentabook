package com.rentabook.webapi;

import javax.servlet.Filter;
import javax.servlet.ServletContext;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.rentabook.webapi.config.AppConfig;
import com.rentabook.webapi.config.CORSFilter;

public class CustomWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	 @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[] { AppConfig.class };
	    }
	   
	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return null;
	    }
	   
	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }
	     
	    @Override
	    protected Filter[] getServletFilters() {
	        Filter [] singleton = { new CORSFilter() };
	        return singleton;
	    }
}
