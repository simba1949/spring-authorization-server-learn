package vip.openpark.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <div>
 *     默认情况下，OAuth2AuthorizationServerConfiguration 为OAuth2授权服务器提供最小的默认配置
 * </div>
 * @author anthony
 * @since 2024/2/6 21:25
 */
@SpringBootApplication
public class AuthorizationServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerApplication.class, args);
	}
}