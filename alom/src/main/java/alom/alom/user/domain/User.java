package alom.alom.user.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class User {

    @Id
    @GeneratedValue
    private Long noticeId;

    private String name;
    private String studentId;
    private String department;
    private Role role;
}
