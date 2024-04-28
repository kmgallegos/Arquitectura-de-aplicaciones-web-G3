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
    @Column (name = "meetingDateCounseling", nullable = false)
    private LocalDate meetingDateCounseling;
    @Column (name = "meetingTimeCounseling", nullable = false)
    private Time meetingTimeCounseling;
    @Column (name = "commentCounseling", nullable = true,length=500)
    private String commentCounseling;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userr;

    public Counseling() {}


    public Counseling(int idCounseling, LocalDate meetingDateCounseling, Time meetingTimeCounseling, String commentCounseling, Users userr) {
        this.idCounseling = idCounseling;
        this.meetingDateCounseling = meetingDateCounseling;
        this.meetingTimeCounseling = meetingTimeCounseling;
        this.commentCounseling = commentCounseling;
        this.userr = userr;
    }

    public int getIdCounseling() {
        return idCounseling;
    }

    public void setIdCounseling(int idCounseling) {
        this.idCounseling = idCounseling;
    }

    public LocalDate getMeetingDateCounseling() {
        return meetingDateCounseling;
    }

    public void setMeetingDateCounseling(LocalDate meetingDateCounseling) {
        this.meetingDateCounseling = meetingDateCounseling;
    }

    public Time getMeetingTimeCounseling() {
        return meetingTimeCounseling;
    }

    public void setMeetingTimeCounseling(Time meetingTimeCounseling) {
        this.meetingTimeCounseling = meetingTimeCounseling;
    }

    public String getCommentCounseling() {
        return commentCounseling;
    }

    public void setCommentCounseling(String commentCounseling) {
        this.commentCounseling = commentCounseling;
    }

    public Users getUserr() {
        return userr;
    }

    public void setUserr(Users userr) {
        this.userr = userr;
    }
}
