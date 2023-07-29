package com.jobayed.tz.service;


import com.jobayed.tz.endpoint.models.request.PageRequest;
import com.jobayed.tz.endpoint.models.request.RewardPolicyRequest;
import com.jobayed.tz.endpoint.models.response.RewardPolicyCreateResponse;
import com.jobayed.tz.entities.RewardConfigEntity;
import com.jobayed.tz.entities.RewardPolicyEntity;
import com.jobayed.tz.enums.YNEnum;
import com.jobayed.tz.repository.RewardConfigRepository;
import com.jobayed.tz.repository.RewardPolicyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class RewardPolicyServiceImpl implements RewardPolicyService {

    private final RewardPolicyRepository repository;
    private final RewardConfigRepository rewardConfigRepository;

    @Override
    public RewardPolicyCreateResponse create(RewardPolicyRequest request) {
        RewardConfigEntity rewardConfigEntity = Optional.ofNullable(rewardConfigRepository.getByRef(request.getRef()))
                .get().orElseThrow();

        List<RewardPolicyEntity> rewardPolicyEntityList = request.getPolicies().stream()
                .map(policy -> RewardPolicyEntity.builder()
                        .rewardId(rewardConfigEntity.getId())
                        .startDate(policy.getStartDate())
                        .endDate(policy.getEndDate())
                        .status(YNEnum.Y)
                        .build())
                .collect(Collectors.toList());

        repository.saveAll(rewardPolicyEntityList);

        return RewardPolicyCreateResponse.builder()
                .msg("SUCCESS")
                .ids(rewardPolicyEntityList.stream()
                        .map(i -> String.valueOf(i.getId()))
                        .collect(Collectors.toSet()))
                .build();

    }

    @Override
    public Page<RewardPolicyEntity> getAll(PageRequest pageRequest) {
        Pageable pageReq = org.springframework.data.domain.PageRequest.of(
                pageRequest.getPageNumber(),
                pageRequest.getPageSize()
        );
        return repository.findAll(pageReq);
    }
}
