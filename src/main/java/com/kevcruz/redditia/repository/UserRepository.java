package com.kevcruzv.redditia.repository;

import com.kevcruzv.redditia.model.VerifToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<VerifToken, Long> {
}
