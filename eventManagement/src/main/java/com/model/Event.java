package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @Column(name = "eventId")
    private int eventid;
    @Column(name = "eventName")
    private String eventname;
    @Column(name = "startDate")
    private String startdate;
    @Column(name = "endDate")
    private  String enddate;
    @Column(name = "location")
    private  String location;

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventid=" + eventid +
                ", eventname='" + eventname + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", location='" + location + '\'' +
                '}';
    }
}
