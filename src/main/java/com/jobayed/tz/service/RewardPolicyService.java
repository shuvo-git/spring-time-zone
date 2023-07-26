package com.jobayed.tz.service;

import com.jobayed.tz.endpoint.models.request.RewardPolicyRequest;
import com.jobayed.tz.endpoint.models.response.RewardPolicyCreateResponse;

public interface RewardPolicyService {
    RewardPolicyCreateResponse create(RewardPolicyRequest request);
}
