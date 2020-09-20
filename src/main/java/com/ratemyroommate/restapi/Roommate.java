package com.ratemyroommate.restapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum SchoolYear {
    Freshman,
    Sophomore,
    Junior,
    Senior
}

@Entity
public class Roommate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roommateId;

    private String firstName;

    private String lastName;

    private String schoolName;

    private SchoolYear schoolYear;

    private Integer rating;

    private Boolean roomAgain;

    private String description;

    public Integer getRoommateId() {
        return roommateId;
    }

    public void setRoommateId(Integer roommateId) {
        this.roommateId = roommateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public SchoolYear getSchoolYear() { return schoolYear; }

    public void setSchoolYear(SchoolYear schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Integer getRating() { return rating; }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Boolean getRoomAgain() { return roomAgain; }

    public void setRoomAgain(Boolean roomAgain) {
        this.roomAgain = roomAgain;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }
}