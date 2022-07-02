package hello.login;

import hello.login.web.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean<Filter> filterFilterRegistration = new FilterRegistrationBean<>();
        filterFilterRegistration.setFilter(new LogFilter());
        filterFilterRegistration.setOrder(1);
        filterFilterRegistration.addUrlPatterns("/*");

        return filterFilterRegistration;
    }
}