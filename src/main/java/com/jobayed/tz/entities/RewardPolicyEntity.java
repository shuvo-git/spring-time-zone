package com.jobayed.tz.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobayed.tz.enums.YNEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

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
    Instant rewardId;

    @Column(name = "start_date", nullable = false)
    Instant startDate;

    @Column(name = "end_date", nullable = false)
    Instant endDate;

    @Enumerated
    @Column(name = "status")
    YNEnum status;
}



