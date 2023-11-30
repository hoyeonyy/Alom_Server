package alom.alom.attendence.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Attendance {

    @Id
    @GeneratedValue
    private Long attendanceId;

    @OneToMany(mappedBy = "attendance")
    private List<MemberAttendance> userAttendances = new ArrayList<>();

    private Week week;
    private LocalDateTime createdAt;

}
