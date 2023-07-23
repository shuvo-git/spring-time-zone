package com.jobayed.tz.endpoint.models.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RewardRequest {
    String message;
    String winnerMessage;
    String nonWinnerMessage;
    BigDecimal amount;
}
