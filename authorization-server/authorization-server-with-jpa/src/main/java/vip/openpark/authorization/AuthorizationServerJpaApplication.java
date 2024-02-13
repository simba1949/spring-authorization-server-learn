package vip.openpark.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring security oauth2 server + spring data jpa
 * <a href="https://docs.spring.io/spring-authorization-server/reference/guides/how-to-jpa.html">官方文档</a>
 *
 * @author anthony
 * @since 2024/2/13 10:13
 */
@SpringBootApplication
public class AuthorizationServerJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerJpaApplication.class, args);
	}
}