package vip.openpark.authorization.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vip.openpark.authorization.entity.AuthorizationConsent;

/**
 * @author anthony
 * @since 2024/2/13 21:58
 */
@Repository
public interface AuthorizationConsentRepository extends JpaRepository<AuthorizationConsent, AuthorizationConsent.AuthorizationConsentId> {
	Optional<AuthorizationConsent> findByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);
	
	void deleteByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);
}