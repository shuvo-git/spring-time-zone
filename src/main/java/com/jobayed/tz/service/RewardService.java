package com.jobayed.tz.service;

import com.jobayed.tz.endpoint.models.request.PageRequest;
import com.jobayed.tz.endpoint.models.request.RewardRequest;
import com.jobayed.tz.endpoint.models.response.RewardCreateResponse;
import com.jobayed.tz.entities.RewardConfigEntity;
import org.springframework.data.domain.Page;

public interface RewardService {
    RewardCreateResponse create(RewardRequest request);
    Page<RewardConfigEntity> getAll(PageRequest pageable);
}
