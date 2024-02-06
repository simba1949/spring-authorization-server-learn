package vip.openpark.resource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author anthony
 * @since 2024/2/6 21:48
 */
@EnableWebSecurity
@Configuration(proxyBeanMethods = false)
public class ResourceServerConfig {
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.securityMatcher("/messages/**")
			.authorizeHttpRequests(
				authorizeHttpRequestsCustomizer ->
					authorizeHttpRequestsCustomizer
						.requestMatchers("/messages/**").hasAuthority("SCOPE_message")
			)
			.oauth2ResourceServer(
				oauth2ResourceServerCustomizer ->
					oauth2ResourceServerCustomizer.jwt(Customizer.withDefaults())
			);
		return http.build();
	}
}