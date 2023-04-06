package com.kevcruzv.redditia.repository;

import com.kevcruzv.redditia.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredittRepository extends JpaRepository<Subreddit, Long> {
}
