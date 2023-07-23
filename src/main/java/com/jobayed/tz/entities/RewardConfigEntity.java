package com.jobayed.tz.entities;

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
    @Id // 2020-10-08T10:30:00.000Z
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE //,
            //generator = "reward_config_id_seq"
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



