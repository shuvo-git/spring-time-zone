package com.jobayed.tz.repository;

import com.jobayed.tz.entities.RewardConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RewardConfigRepository extends JpaRepository<RewardConfigEntity, Long> {
    Optional<RewardConfigEntity> getByRef(String ref);
}
