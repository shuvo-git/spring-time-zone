package com.jobayed.tz.repository;

import com.jobayed.tz.entities.RewardPolicyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardPolicyRepository extends JpaRepository<RewardPolicyEntity, Long> {
}
