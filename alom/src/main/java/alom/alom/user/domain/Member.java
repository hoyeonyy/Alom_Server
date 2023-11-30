package alom.alom.user.domain;

import alom.alom.attendence.domain.MemberAttendance;
import alom.alom.notice.domain.Notice;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue
    private Long memberId;

    @OneToMany(mappedBy = "member")
    private List<MemberAttendance> memberAttendances = new ArrayList<>();

    private String name;
    private String studentId;
    private String department;

    @Enumerated(EnumType.STRING)
    private Role role;

    private int generation;

    @OneToMany(mappedBy = "member")
    private List<Notice> notices = new ArrayList<>();
}
