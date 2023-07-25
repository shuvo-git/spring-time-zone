package com.jobayed.tz.endpoint.api;

import com.jobayed.tz.endpoint.models.request.PageRequest;
import com.jobayed.tz.endpoint.models.request.RewardPolicyRequest;
import com.jobayed.tz.endpoint.models.request.RewardRequest;
import com.jobayed.tz.endpoint.models.response.RewardCreateResponse;
import com.jobayed.tz.endpoint.models.response.RewardPolicyCreateResponse;
import com.jobayed.tz.entities.RewardConfigEntity;
import com.jobayed.tz.service.RewardPolicyService;
import com.jobayed.tz.service.RewardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reward-policies")
@Slf4j
public class RewardPolicyController {
    private final RewardPolicyService rewardPolicyService;

    @PostMapping(value = "/create")
    public ResponseEntity<RewardPolicyCreateResponse> createReward(@RequestBody RewardPolicyRequest request) {
        log.info("{}", request);
        return ResponseEntity.ok(rewardPolicyService.create(request));
    }

    @GetMapping
    public ResponseEntity<Page<RewardConfigEntity>> createReward(PageRequest pageRequest) {
        log.info("{}", pageRequest);
        return null;//ResponseEntity.ok();
    }

}
