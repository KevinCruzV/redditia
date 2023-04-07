package com.kevcruz.redditia.repository;

import com.kevcruz.redditia.model.User;
import com.kevcruz.redditia.model.VerifToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VerifTokenRepository extends JpaRepository<VerifToken, Long> {
    Optional<VerifToken> findByToken(String token);
}
