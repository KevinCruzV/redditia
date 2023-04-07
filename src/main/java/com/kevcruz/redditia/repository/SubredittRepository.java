package com.kevcruz.redditia.repository;

import com.kevcruz.redditia.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredittRepository extends JpaRepository<Subreddit, Long> {
}
