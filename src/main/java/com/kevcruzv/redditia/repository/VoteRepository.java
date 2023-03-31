package com.kevcruzv.redditia.repository;

import com.kevcruzv.redditia.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
