package com.jobayed.tz.endpoint.api;

import com.jobayed.tz.endpoint.models.request.PageRequest;
import com.jobayed.tz.endpoint.models.request.RewardRequest;
import com.jobayed.tz.endpoint.models.response.RewardCreateResponse;
import com.jobayed.tz.entities.RewardConfigEntity;
import com.jobayed.tz.service.RewardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rewards")
@Slf4j
public class RewardController {
    private final RewardService rewardService;

    @PostMapping(value = "/create")
    public ResponseEntity<RewardCreateResponse> createReward(@RequestBody RewardRequest request) {
        log.info("{}", request);
        return ResponseEntity.ok(rewardService.create(request));
    }

    @GetMapping
    public ResponseEntity<Page<RewardConfigEntity>> createReward(PageRequest pageRequest) {
        log.info("{}", pageRequest);
        return ResponseEntity.ok(rewardService.getAll(pageRequest));
    }

}
