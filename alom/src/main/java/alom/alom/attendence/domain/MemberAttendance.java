package alom.alom.attendence.domain;

import alom.alom.user.domain.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MemberAttendance {

    @Id
    @GeneratedValue
    private Long userAttendanceId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    private Attendance attendance;
}

