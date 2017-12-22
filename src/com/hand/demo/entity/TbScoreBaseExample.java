package com.hand.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class TbScoreBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbScoreBaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBaseNameIsNull() {
            addCriterion("base_name is null");
            return (Criteria) this;
        }

        public Criteria andBaseNameIsNotNull() {
            addCriterion("base_name is not null");
            return (Criteria) this;
        }

        public Criteria andBaseNameEqualTo(String value) {
            addCriterion("base_name =", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotEqualTo(String value) {
            addCriterion("base_name <>", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameGreaterThan(String value) {
            addCriterion("base_name >", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("base_name >=", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameLessThan(String value) {
            addCriterion("base_name <", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameLessThanOrEqualTo(String value) {
            addCriterion("base_name <=", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameLike(String value) {
            addCriterion("base_name like", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotLike(String value) {
            addCriterion("base_name not like", value, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameIn(List<String> values) {
            addCriterion("base_name in", values, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotIn(List<String> values) {
            addCriterion("base_name not in", values, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameBetween(String value1, String value2) {
            addCriterion("base_name between", value1, value2, "baseName");
            return (Criteria) this;
        }

        public Criteria andBaseNameNotBetween(String value1, String value2) {
            addCriterion("base_name not between", value1, value2, "baseName");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andBaseSourceIsNull() {
            addCriterion("base_source is null");
            return (Criteria) this;
        }

        public Criteria andBaseSourceIsNotNull() {
            addCriterion("base_source is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSourceEqualTo(String value) {
            addCriterion("base_source =", value, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceNotEqualTo(String value) {
            addCriterion("base_source <>", value, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceGreaterThan(String value) {
            addCriterion("base_source >", value, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceGreaterThanOrEqualTo(String value) {
            addCriterion("base_source >=", value, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceLessThan(String value) {
            addCriterion("base_source <", value, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceLessThanOrEqualTo(String value) {
            addCriterion("base_source <=", value, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceLike(String value) {
            addCriterion("base_source like", value, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceNotLike(String value) {
            addCriterion("base_source not like", value, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceIn(List<String> values) {
            addCriterion("base_source in", values, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceNotIn(List<String> values) {
            addCriterion("base_source not in", values, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceBetween(String value1, String value2) {
            addCriterion("base_source between", value1, value2, "baseSource");
            return (Criteria) this;
        }

        public Criteria andBaseSourceNotBetween(String value1, String value2) {
            addCriterion("base_source not between", value1, value2, "baseSource");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassIsNull() {
            addCriterion("dipartite_class is null");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassIsNotNull() {
            addCriterion("dipartite_class is not null");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassEqualTo(Byte value) {
            addCriterion("dipartite_class =", value, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassNotEqualTo(Byte value) {
            addCriterion("dipartite_class <>", value, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassGreaterThan(Byte value) {
            addCriterion("dipartite_class >", value, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassGreaterThanOrEqualTo(Byte value) {
            addCriterion("dipartite_class >=", value, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassLessThan(Byte value) {
            addCriterion("dipartite_class <", value, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassLessThanOrEqualTo(Byte value) {
            addCriterion("dipartite_class <=", value, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassIn(List<Byte> values) {
            addCriterion("dipartite_class in", values, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassNotIn(List<Byte> values) {
            addCriterion("dipartite_class not in", values, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassBetween(Byte value1, Byte value2) {
            addCriterion("dipartite_class between", value1, value2, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andDipartiteClassNotBetween(Byte value1, Byte value2) {
            addCriterion("dipartite_class not between", value1, value2, "dipartiteClass");
            return (Criteria) this;
        }

        public Criteria andMiddleIdIsNull() {
            addCriterion("middle_id is null");
            return (Criteria) this;
        }

        public Criteria andMiddleIdIsNotNull() {
            addCriterion("middle_id is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleIdEqualTo(Integer value) {
            addCriterion("middle_id =", value, "middleId");
            return (Criteria) this;
        }

        public Criteria andMiddleIdNotEqualTo(Integer value) {
            addCriterion("middle_id <>", value, "middleId");
            return (Criteria) this;
        }

        public Criteria andMiddleIdGreaterThan(Integer value) {
            addCriterion("middle_id >", value, "middleId");
            return (Criteria) this;
        }

        public Criteria andMiddleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("middle_id >=", value, "middleId");
            return (Criteria) this;
        }

        public Criteria andMiddleIdLessThan(Integer value) {
            addCriterion("middle_id <", value, "middleId");
            return (Criteria) this;
        }

        public Criteria andMiddleIdLessThanOrEqualTo(Integer value) {
            addCriterion("middle_id <=", value, "middleId");
            return (Criteria) this;
        }

        public Criteria andMiddleIdIn(List<Integer> values) {
            addCriterion("middle_id in", values, "middleId");
            return (Criteria) this;
        }

        public Criteria andMiddleIdNotIn(List<Integer> values) {
            addCriterion("middle_id not in", values, "middleId");
            return (Criteria) this;
        }

        public Criteria andMiddleIdBetween(Integer value1, Integer value2) {
            addCriterion("middle_id between", value1, value2, "middleId");
            return (Criteria) this;
        }

        public Criteria andMiddleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("middle_id not between", value1, value2, "middleId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}