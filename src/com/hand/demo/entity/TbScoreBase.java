package com.hand.demo.entity;

public class TbScoreBase {
    private Integer id;

    private String baseName;

    private String model;

    private String baseSource;

    private Byte dipartiteClass;

    private Integer middleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName == null ? null : baseName.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getBaseSource() {
        return baseSource;
    }

    public void setBaseSource(String baseSource) {
        this.baseSource = baseSource == null ? null : baseSource.trim();
    }

    public Byte getDipartiteClass() {
        return dipartiteClass;
    }

    public void setDipartiteClass(Byte dipartiteClass) {
        this.dipartiteClass = dipartiteClass;
    }

    public Integer getMiddleId() {
        return middleId;
    }

    public void setMiddleId(Integer middleId) {
        this.middleId = middleId;
    }
}