package alom.alom.notice.domain;

import alom.alom.user.domain.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Notice {

    @Id
    @GeneratedValue
    private Long noticeId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    private String title;
    private String contents;
    private LocalDateTime createdAt;

}
