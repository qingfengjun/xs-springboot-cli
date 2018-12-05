package com.springboot.cli;

import com.springboot.cli.page.RewriteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class CliApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new RewriteFilter());//注册rewrite过滤器
		registration.addUrlPatterns("/*");
		registration.addInitParameter(RewriteFilter.REWRITE_TO,"/index.html");
		registration.addInitParameter(RewriteFilter.REWRITE_PATTERNS, "/ui/*");
		registration.setName("rewriteFilter");
		registration.setOrder(1);
		return registration;
	}
}
