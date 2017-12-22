package com.hand.demo.entity;

import java.util.Date;

public class TbStudentMiddle {
    private Long id;

    private Long studentId;

    private String studentName;

    private Integer middleId;

    private String middleName;

    private Integer middleScore;

    private Date middleDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getMiddleId() {
        return middleId;
    }

    public void setMiddleId(Integer middleId) {
        this.middleId = middleId;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName == null ? null : middleName.trim();
    }

    public Integer getMiddleScore() {
        return middleScore;
    }

    public void setMiddleScore(Integer middleScore) {
        this.middleScore = middleScore;
    }

    public Date getMiddleDate() {
        return middleDate;
    }

    public void setMiddleDate(Date middleDate) {
        this.middleDate = middleDate;
    }
}