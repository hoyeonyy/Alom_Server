package alom.alom.user.domain;

import alom.alom.attendence.domain.Attendance;
import alom.alom.attendence.domain.UserAttendance;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class User {

    @Id
    @GeneratedValue
    private Long userId;

    @OneToMany(mappedBy = "user")
    private List<UserAttendance> userAttendances = new ArrayList<>();

    private String name;
    private String studentId;
    private String department;
    private Role role;
    private int generation;
}
