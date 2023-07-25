package com.jobayed.tz.service;

import com.jobayed.tz.endpoint.models.request.PageRequest;
import com.jobayed.tz.endpoint.models.request.RewardRequest;
import com.jobayed.tz.endpoint.models.response.RewardCreateResponse;
import com.jobayed.tz.entities.RewardConfigEntity;
import com.jobayed.tz.enums.YNEnum;
import com.jobayed.tz.repository.RewardConfigRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class RewardServiceImpl implements RewardService {

    private final RewardConfigRepository repository;

    @Override
    @Transactional
    public RewardCreateResponse create(RewardRequest request) {
        RewardConfigEntity entity = RewardConfigEntity.builder()
                .ref(UUID.randomUUID().toString())
                .message(request.getMessage())
                .winnerMessage(request.getWinnerMessage())
                .nonWinnerMessage(request.getNonWinnerMessage())
                .amount(request.getAmount())
                .status(YNEnum.Y)
                .build();
        log.info("RewardConfigEntity: {}",entity);

        repository.save(entity);

        return RewardCreateResponse.builder()
                .msg("SUCCESS")
                .ref(entity.getRef())
                .build();
    }

    @Override
    public Page<RewardConfigEntity> getAll(PageRequest pageRequest) {
        Pageable pageable = org.springframework.data.domain.PageRequest.of(
                pageRequest.getPageNumber(),
                pageRequest.getPageSize()
        );
        return repository.findAll(pageable);
    }
}
