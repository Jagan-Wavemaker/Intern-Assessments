package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Attendee")
public class Attendee {
    @Id
    @Column(name = "attendeeId")
    private int attendeeId;

    @Column(name = "name")
    private  String attendeeName;

    @Column(name = "email")
    private  String attendeeEmail;

    @Column(name = "phNo")
    private String attendeephNo;

    public int getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(int attendeeId) {
        this.attendeeId = attendeeId;
    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    public void setAttendeeEmail(String attendeeEmail) {
        this.attendeeEmail = attendeeEmail;
    }

    public String getAttendeephNo() {
        return attendeephNo;
    }

    public void setAttendeephNo(String attendeephNo) {
        this.attendeephNo = attendeephNo;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "attendeeId=" + attendeeId +
                ", attendeeName='" + attendeeName + '\'' +
                ", attendeeEmail='" + attendeeEmail + '\'' +
                ", attendeephNo='" + attendeephNo + '\'' +
                '}';
    }
}
