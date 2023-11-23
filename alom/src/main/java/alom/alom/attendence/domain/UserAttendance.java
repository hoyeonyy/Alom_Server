package alom.alom.attendence.domain;

import alom.alom.user.domain.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class UserAttendance {

    private Long userAttendanceId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    private Attendance attendance;
}

