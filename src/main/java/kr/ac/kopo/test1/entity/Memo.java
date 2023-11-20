package kr.ac.kopo.test1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_memo")
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "memo_seq_generator")
    @SequenceGenerator(name = "memo_seq_generator", sequenceName = "memo_seq", allocationSize = 1)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
