package alom.alom.attendence.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

public class Attendence {

    @Id
    @GeneratedValue
    private Long attendenceId;
    private Week week;
    private LocalDateTime createAt;

}
