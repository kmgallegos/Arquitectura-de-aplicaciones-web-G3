package pe.edu.upc.helpyou.dtos;

import pe.edu.upc.helpyou.entities.Users;

import java.sql.Time;
import java.time.LocalDate;

public class CounselingDTO {

    private int idCounseling;
    private LocalDate meetingDateCounseling;
    private Time meetingTimeCounseling;
    private String commentCounseling;
    private Users user;

    // Getters y Setters

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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
