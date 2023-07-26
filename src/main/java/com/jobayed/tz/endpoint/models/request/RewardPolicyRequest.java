package com.jobayed.tz.endpoint.models.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RewardPolicyRequest {
    String ref;
    List<Policy> policies = new ArrayList<>();

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Policy {
        OffsetDateTime startDate;
        OffsetDateTime endDate;
    }
}

