package com.lyq.edu.entity;

import java.util.ArrayList;
import java.util.List;

public class DefaultEduInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DefaultEduInfoExample() {
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

        public Criteria andDefaultschoolIsNull() {
            addCriterion("defaultSchool is null");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolIsNotNull() {
            addCriterion("defaultSchool is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolEqualTo(String value) {
            addCriterion("defaultSchool =", value, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolNotEqualTo(String value) {
            addCriterion("defaultSchool <>", value, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolGreaterThan(String value) {
            addCriterion("defaultSchool >", value, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolGreaterThanOrEqualTo(String value) {
            addCriterion("defaultSchool >=", value, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolLessThan(String value) {
            addCriterion("defaultSchool <", value, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolLessThanOrEqualTo(String value) {
            addCriterion("defaultSchool <=", value, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolLike(String value) {
            addCriterion("defaultSchool like", value, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolNotLike(String value) {
            addCriterion("defaultSchool not like", value, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolIn(List<String> values) {
            addCriterion("defaultSchool in", values, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolNotIn(List<String> values) {
            addCriterion("defaultSchool not in", values, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolBetween(String value1, String value2) {
            addCriterion("defaultSchool between", value1, value2, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultschoolNotBetween(String value1, String value2) {
            addCriterion("defaultSchool not between", value1, value2, "defaultschool");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeIsNull() {
            addCriterion("defaultCollege is null");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeIsNotNull() {
            addCriterion("defaultCollege is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeEqualTo(String value) {
            addCriterion("defaultCollege =", value, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeNotEqualTo(String value) {
            addCriterion("defaultCollege <>", value, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeGreaterThan(String value) {
            addCriterion("defaultCollege >", value, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeGreaterThanOrEqualTo(String value) {
            addCriterion("defaultCollege >=", value, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeLessThan(String value) {
            addCriterion("defaultCollege <", value, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeLessThanOrEqualTo(String value) {
            addCriterion("defaultCollege <=", value, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeLike(String value) {
            addCriterion("defaultCollege like", value, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeNotLike(String value) {
            addCriterion("defaultCollege not like", value, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeIn(List<String> values) {
            addCriterion("defaultCollege in", values, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeNotIn(List<String> values) {
            addCriterion("defaultCollege not in", values, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeBetween(String value1, String value2) {
            addCriterion("defaultCollege between", value1, value2, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultcollegeNotBetween(String value1, String value2) {
            addCriterion("defaultCollege not between", value1, value2, "defaultcollege");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorIsNull() {
            addCriterion("defaultMajor is null");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorIsNotNull() {
            addCriterion("defaultMajor is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorEqualTo(String value) {
            addCriterion("defaultMajor =", value, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorNotEqualTo(String value) {
            addCriterion("defaultMajor <>", value, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorGreaterThan(String value) {
            addCriterion("defaultMajor >", value, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorGreaterThanOrEqualTo(String value) {
            addCriterion("defaultMajor >=", value, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorLessThan(String value) {
            addCriterion("defaultMajor <", value, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorLessThanOrEqualTo(String value) {
            addCriterion("defaultMajor <=", value, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorLike(String value) {
            addCriterion("defaultMajor like", value, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorNotLike(String value) {
            addCriterion("defaultMajor not like", value, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorIn(List<String> values) {
            addCriterion("defaultMajor in", values, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorNotIn(List<String> values) {
            addCriterion("defaultMajor not in", values, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorBetween(String value1, String value2) {
            addCriterion("defaultMajor between", value1, value2, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultmajorNotBetween(String value1, String value2) {
            addCriterion("defaultMajor not between", value1, value2, "defaultmajor");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseIsNull() {
            addCriterion("defaultCourse is null");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseIsNotNull() {
            addCriterion("defaultCourse is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseEqualTo(String value) {
            addCriterion("defaultCourse =", value, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseNotEqualTo(String value) {
            addCriterion("defaultCourse <>", value, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseGreaterThan(String value) {
            addCriterion("defaultCourse >", value, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseGreaterThanOrEqualTo(String value) {
            addCriterion("defaultCourse >=", value, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseLessThan(String value) {
            addCriterion("defaultCourse <", value, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseLessThanOrEqualTo(String value) {
            addCriterion("defaultCourse <=", value, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseLike(String value) {
            addCriterion("defaultCourse like", value, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseNotLike(String value) {
            addCriterion("defaultCourse not like", value, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseIn(List<String> values) {
            addCriterion("defaultCourse in", values, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseNotIn(List<String> values) {
            addCriterion("defaultCourse not in", values, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseBetween(String value1, String value2) {
            addCriterion("defaultCourse between", value1, value2, "defaultcourse");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseNotBetween(String value1, String value2) {
            addCriterion("defaultCourse not between", value1, value2, "defaultcourse");
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