package alom.alom.notice.domain;

import alom.alom.user.domain.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;

public class Notice {

    @Id
    @GeneratedValue
    private Long noticeId;

    @OneToMany
    private User user;

    private String title;
    private String contents;
    private LocalDateTime createdAt;

}
