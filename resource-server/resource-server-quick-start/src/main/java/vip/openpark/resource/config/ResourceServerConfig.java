package vip.openpark.resource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author anthony
 * @since 2024/2/6 21:48
 */
@EnableWebSecurity
@Configuration
public class ResourceServerConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests(
				authorizeHttpRequestsCustomizer ->
					authorizeHttpRequestsCustomizer
						.anyRequest().authenticated()
			)
			.oauth2ResourceServer(
				oauth2ResourceServerCustomizer ->
					oauth2ResourceServerCustomizer
						.jwt(
							jwtCustomizer ->
								jwtCustomizer
									// 设置jwt的issuer
									.decoder(JwtDecoders.fromIssuerLocation("http://localhost:9000"))
						)
			);
		return http.build();
	}
}