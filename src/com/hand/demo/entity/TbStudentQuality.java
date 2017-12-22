package com.hand.demo.entity;

import java.util.Date;

public class TbStudentQuality {
    private Long id;

    private Long studentId;

    private String studentName;

    private Integer qualityId;

    private String qualityName;

    private Integer qualityScore;

    private Date qualityDate;

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

    public Integer getQualityId() {
        return qualityId;
    }

    public void setQualityId(Integer qualityId) {
        this.qualityId = qualityId;
    }

    public String getQualityName() {
        return qualityName;
    }

    public void setQualityName(String qualityName) {
        this.qualityName = qualityName == null ? null : qualityName.trim();
    }

    public Integer getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Integer qualityScore) {
        this.qualityScore = qualityScore;
    }

    public Date getQualityDate() {
        return qualityDate;
    }

    public void setQualityDate(Date qualityDate) {
        this.qualityDate = qualityDate;
    }
}