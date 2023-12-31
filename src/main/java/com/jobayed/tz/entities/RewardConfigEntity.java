package com.jobayed.tz.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobayed.tz.enums.YNEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "reward_config")
@EqualsAndHashCode
public class RewardConfigEntity extends BaseEntity {
    @JsonIgnore
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reward_config_generator"
    )
    @SequenceGenerator(
            name = "reward_config_generator",
            sequenceName = "reward_config_id_seq",
            allocationSize = 1
    )
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "ref")
    String ref;

    @Column(name = "msg")
    String message;

    @Column(name = "winner_msg")
    String winnerMessage;

    @Column(name = "non_winner_msg")
    String nonWinnerMessage;

    @Column(name = "amount")
    BigDecimal amount;

    @Enumerated
    @Column(name = "status")
    YNEnum status;
}



