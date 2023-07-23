package com.jobayed.tz.endpoint.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RewardCreateResponse {
    String msg;
    String ref;
}
