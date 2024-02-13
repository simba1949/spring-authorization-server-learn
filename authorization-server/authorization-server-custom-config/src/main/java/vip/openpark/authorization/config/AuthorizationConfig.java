package vip.openpark.authorization.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.server.authorization.OAuth2TokenType;
import org.springframework.security.oauth2.server.authorization.token.JwtEncodingContext;
import org.springframework.security.oauth2.server.authorization.token.OAuth2TokenCustomizer;

import java.util.List;

/**
 * @author anthony
 * @since 2024/2/13 10:14
 */
@Configuration
public class AuthorizationConfig {
	/**
	 * 将自定义声明添加到JWT访问令牌
	 *
	 * @return OAuth2TokenCustomizer
	 */
	@Bean
	public OAuth2TokenCustomizer<JwtEncodingContext> jwtTokenCustomizer() {
		return (context) -> {
			if (OAuth2TokenType.ACCESS_TOKEN.equals(context.getTokenType())) {
				context.getClaims().claim("token_type", "access token");
				
				Authentication principal = context.getPrincipal();
				if (null != principal) {
					List<String> roles = principal.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList();
					context.getClaims()
						.claim("roles", roles)
						.claim("username", principal.getName());
				}
			}
		};
	}
}