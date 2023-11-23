package alom.alom.attendence.domain;

import alom.alom.user.domain.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Attendance {

    @Id
    @GeneratedValue
    private Long attendanceId;

    @OneToMany(mappedBy = "attendance")
    private List<User> users = new ArrayList<>();

    private Week week;
    private LocalDateTime createdAt;

}
