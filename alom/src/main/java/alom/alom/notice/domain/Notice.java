package alom.alom.notice.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

public class Notice {

    @Id
    @GeneratedValue
    private Long noticeId;
    private String title;
    private String contents;
    private LocalDateTime createdAt;

}
