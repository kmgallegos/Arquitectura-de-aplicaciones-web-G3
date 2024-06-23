package pe.edu.upc.helpyou.entities;

import jakarta.persistence.*;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "Counseling")
public class Counseling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCounseling;

    @Column(name = "meetingDateCounseling", nullable = false)
    private LocalDate meetingDateCounseling;

    @Column(name = "meetingTimeCounseling", nullable = false)
    private Time meetingTimeCounseling;

    @Column(name = "commentCounseling", nullable = true, length = 500)
    private String commentCounseling;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    public Counseling() {}

    // Getters y Setters
    // ...

    public int getIdCounseling() {
        return idCounseling;
    }

    public LocalDate getMeetingDateCounseling() {
        return meetingDateCounseling;
    }

    public Time getMeetingTimeCounseling() {
        return meetingTimeCounseling;
    }

    public String getCommentCounseling() {
        return commentCounseling;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setIdCounseling(int idCounseling) {
        this.idCounseling = idCounseling;
    }

    public void setMeetingDateCounseling(LocalDate meetingDateCounseling) {
        this.meetingDateCounseling = meetingDateCounseling;
    }

    public void setMeetingTimeCounseling(Time meetingTimeCounseling) {
        this.meetingTimeCounseling = meetingTimeCounseling;
    }

    public void setCommentCounseling(String commentCounseling) {
        this.commentCounseling = commentCounseling;
    }
}
