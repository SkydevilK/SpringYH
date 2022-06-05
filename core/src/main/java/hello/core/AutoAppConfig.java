package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "hello.core", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
// ComponentScan : @Bean 사용하지 않아도 @Component 가 붙은 클래스를 자동으로 등록해줌
// @Component 뿐 만이 아니라 @Controller, @Service, @Repository, @Configuration 도 등록된다.
// basePackages의 디폴트는 해당 ComponentScan의 package가 시작 위치가 됨
// 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것을 권장
public class AutoAppConfig {
}
