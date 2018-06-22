package com.tenissou.tenissou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tenissou.tenissou.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

}
