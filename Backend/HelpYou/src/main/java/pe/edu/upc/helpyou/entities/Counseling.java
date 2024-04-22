package pe.edu.upc.helpyou.entities;


import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;

import jakarta.persistence.*;
import org.apache.catalina.User;


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
    @JoinColumn(name = "idUser")
    private Userr userr;

    public Counseling() {}

    public Counseling(int idCounseling, LocalDate meetingDateCounseling, Time meetingTimeCounseling, String commentCounseling, Userr userr) {
        this.idCounseling = idCounseling;
        this.meetingDateCounseling = meetingDateCounseling;
        this.meetingTimeCounseling = meetingTimeCounseling;
        this.commentCounseling = commentCounseling;
        this.userr = userr;

    @Column (name = "meetingDat", nullable = false)
    private int meetingDat;
    @Column (name = "meetingTim", nullable = false)
    private int meetingTim;
    @Column (name = "comment", nullable = true,length=500)
    private String comment;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private Userr user;

    public Counseling() {}
    public Counseling(int idCounseling, Userr user, String comment, int meetingTim, int meetingDat) {
        this.idCounseling = idCounseling;
        this.user = user;
        this.comment = comment;
        this.meetingTim = meetingTim;
        this.meetingDat = meetingDat;

    }

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

    public Userr getUserr() {
        return userr;
    }

    public Userr getUser() {
        return userr;

    public int getMeetingDat() {
        return meetingDat;
    }

    public int getMeetingTim() {
        return meetingTim;
    }

    public String getComment() {
        return comment;
    }

    public Userr getUser() {
        return user;

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

    public void setUserr(Userr userr) {
        this.userr = userr;
    }

    public void setUser(Userr userr) {
        this.userr = userr;

    public void setMeetingDat(int meetingDat) {
        this.meetingDat = meetingDat;
    }

    public void setMeetingTim(int meetingTim) {
        this.meetingTim = meetingTim;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setUser(Userr user) {
        this.user = user;

    }
}
