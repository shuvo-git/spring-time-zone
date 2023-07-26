package com.jobayed.tz.endpoint.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RewardPolicyCreateResponse {
    String msg;
    Set<String> ids;
}
