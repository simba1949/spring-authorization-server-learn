package vip.openpark.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <div>
 *     项目启动后，访问：
 *     <a href="http://localhost:9000/.well-known/oauth-authorization-server"></a>
 *     <a href="https://oauthdebugger.com/"></a>
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