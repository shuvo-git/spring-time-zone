package com.jobayed.tz.service;

import com.jobayed.tz.endpoint.models.request.PageRequest;
import com.jobayed.tz.endpoint.models.request.RewardPolicyRequest;
import com.jobayed.tz.endpoint.models.response.RewardPolicyCreateResponse;
import com.jobayed.tz.entities.RewardPolicyEntity;
import org.springframework.data.domain.Page;

public interface RewardPolicyService {
    RewardPolicyCreateResponse create(RewardPolicyRequest request);

    Page<RewardPolicyEntity> getAll(PageRequest pageRequest);
}
