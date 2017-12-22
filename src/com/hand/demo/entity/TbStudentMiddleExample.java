package com.hand.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbStudentMiddleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStudentMiddleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Long value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Long value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Long value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Long value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Long value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Long> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Long> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Long value1, Long value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Long value1, Long value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
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

        public Criteria andMiddleNameIsNull() {
            addCriterion("middle_name is null");
            return (Criteria) this;
        }

        public Criteria andMiddleNameIsNotNull() {
            addCriterion("middle_name is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleNameEqualTo(String value) {
            addCriterion("middle_name =", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameNotEqualTo(String value) {
            addCriterion("middle_name <>", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameGreaterThan(String value) {
            addCriterion("middle_name >", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameGreaterThanOrEqualTo(String value) {
            addCriterion("middle_name >=", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameLessThan(String value) {
            addCriterion("middle_name <", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameLessThanOrEqualTo(String value) {
            addCriterion("middle_name <=", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameLike(String value) {
            addCriterion("middle_name like", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameNotLike(String value) {
            addCriterion("middle_name not like", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameIn(List<String> values) {
            addCriterion("middle_name in", values, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameNotIn(List<String> values) {
            addCriterion("middle_name not in", values, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameBetween(String value1, String value2) {
            addCriterion("middle_name between", value1, value2, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameNotBetween(String value1, String value2) {
            addCriterion("middle_name not between", value1, value2, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreIsNull() {
            addCriterion("middle_score is null");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreIsNotNull() {
            addCriterion("middle_score is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreEqualTo(Integer value) {
            addCriterion("middle_score =", value, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreNotEqualTo(Integer value) {
            addCriterion("middle_score <>", value, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreGreaterThan(Integer value) {
            addCriterion("middle_score >", value, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("middle_score >=", value, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreLessThan(Integer value) {
            addCriterion("middle_score <", value, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreLessThanOrEqualTo(Integer value) {
            addCriterion("middle_score <=", value, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreIn(List<Integer> values) {
            addCriterion("middle_score in", values, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreNotIn(List<Integer> values) {
            addCriterion("middle_score not in", values, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreBetween(Integer value1, Integer value2) {
            addCriterion("middle_score between", value1, value2, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("middle_score not between", value1, value2, "middleScore");
            return (Criteria) this;
        }

        public Criteria andMiddleDateIsNull() {
            addCriterion("middle_date is null");
            return (Criteria) this;
        }

        public Criteria andMiddleDateIsNotNull() {
            addCriterion("middle_date is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleDateEqualTo(Date value) {
            addCriterionForJDBCDate("middle_date =", value, "middleDate");
            return (Criteria) this;
        }

        public Criteria andMiddleDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("middle_date <>", value, "middleDate");
            return (Criteria) this;
        }

        public Criteria andMiddleDateGreaterThan(Date value) {
            addCriterionForJDBCDate("middle_date >", value, "middleDate");
            return (Criteria) this;
        }

        public Criteria andMiddleDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("middle_date >=", value, "middleDate");
            return (Criteria) this;
        }

        public Criteria andMiddleDateLessThan(Date value) {
            addCriterionForJDBCDate("middle_date <", value, "middleDate");
            return (Criteria) this;
        }

        public Criteria andMiddleDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("middle_date <=", value, "middleDate");
            return (Criteria) this;
        }

        public Criteria andMiddleDateIn(List<Date> values) {
            addCriterionForJDBCDate("middle_date in", values, "middleDate");
            return (Criteria) this;
        }

        public Criteria andMiddleDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("middle_date not in", values, "middleDate");
            return (Criteria) this;
        }

        public Criteria andMiddleDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("middle_date between", value1, value2, "middleDate");
            return (Criteria) this;
        }

        public Criteria andMiddleDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("middle_date not between", value1, value2, "middleDate");
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