package vip.openpark.authorization.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vip.openpark.authorization.entity.Client;

/**
 * @author anthony
 * @since 2024/2/13 21:57
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
	Optional<Client> findByClientId(String clientId);
}