package hello.login;

import hello.login.web.filter.LogFilter;
import hello.login.web.filter.LoginCheckFilter;
import hello.login.web.interceptor.LogInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    //    @Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean<Filter> filterFilterRegistration = new FilterRegistrationBean<>();
        filterFilterRegistration.setFilter(new LogFilter());
        filterFilterRegistration.setOrder(1);
        filterFilterRegistration.addUrlPatterns("/*");

        return filterFilterRegistration;
    }

    @Bean
    public FilterRegistrationBean loginCheckFilter() {
        FilterRegistrationBean<Filter> filterFilterRegistration = new FilterRegistrationBean<>();
        filterFilterRegistration.setFilter(new LoginCheckFilter());
        filterFilterRegistration.setOrder(2);
        filterFilterRegistration.addUrlPatterns("/*");

        return filterFilterRegistration;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor()).order(1).addPathPatterns("/**").excludePathPatterns("/css/**", "/*.ico", "/error");
    }
}