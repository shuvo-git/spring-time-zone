package com.jobayed.tz.service;

import com.jobayed.tz.endpoint.models.request.RewardRequest;
import com.jobayed.tz.endpoint.models.response.RewardCreateResponse;

public interface RewardService {
    RewardCreateResponse create(RewardRequest request);
}
