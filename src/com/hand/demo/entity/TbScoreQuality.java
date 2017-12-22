package com.hand.demo.entity;

public class TbScoreQuality {
    private Integer id;

    private String qualityName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQualityName() {
        return qualityName;
    }

    public void setQualityName(String qualityName) {
        this.qualityName = qualityName == null ? null : qualityName.trim();
    }
}