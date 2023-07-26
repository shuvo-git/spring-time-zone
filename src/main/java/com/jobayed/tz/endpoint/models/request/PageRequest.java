package com.jobayed.tz.endpoint.models.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageRequest {
    int pageNumber;
    int pageSize;
}
