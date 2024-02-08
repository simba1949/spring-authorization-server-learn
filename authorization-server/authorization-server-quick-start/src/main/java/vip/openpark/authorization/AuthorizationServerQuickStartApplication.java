package vip.openpark.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;

/**
 * <div>
 *     spring-boot-starter-oauth2-authorization-server
 *     默认配置类 {@link OAuth2AuthorizationServerConfiguration} 为 OAuth2 授权服务器提供最小化配置
 * </div>
 * @author anthony
 * @since 2024/2/8 0:05
 */
@SpringBootApplication
public class AuthorizationServerQuickStartApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerQuickStartApplication.class, args);
	}
}