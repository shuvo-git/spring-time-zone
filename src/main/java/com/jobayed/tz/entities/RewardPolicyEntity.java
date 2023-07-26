package com.jobayed.tz.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobayed.tz.enums.YNEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "reward_policy")
@EqualsAndHashCode
public class RewardPolicyEntity extends BaseEntity {
    @JsonIgnore
    @Id // 2020-10-08T10:30:00.000Z
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reward_policy_generator"
    )
    @SequenceGenerator(
            name = "reward_policy_generator",
            sequenceName = "reward_policy_id_seq",
            allocationSize = 1
    )
    @Column(name = "id", nullable = false)
    Long id;


    @Column(name = "reward_id", nullable = false)
    Long rewardId;

    @Column(name = "start_date", nullable = false)
    OffsetDateTime startDate;

    @Column(name = "end_date", nullable = false)
    OffsetDateTime endDate;

    @Enumerated
    @Column(name = "status")
    YNEnum status;
}



