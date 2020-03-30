package com.lyq.edu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserUseLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserUseLogExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("beginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("beginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("beginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("beginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("beginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("beginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("beginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("beginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("beginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("beginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("beginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andLabnameIsNull() {
            addCriterion("labName is null");
            return (Criteria) this;
        }

        public Criteria andLabnameIsNotNull() {
            addCriterion("labName is not null");
            return (Criteria) this;
        }

        public Criteria andLabnameEqualTo(String value) {
            addCriterion("labName =", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameNotEqualTo(String value) {
            addCriterion("labName <>", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameGreaterThan(String value) {
            addCriterion("labName >", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameGreaterThanOrEqualTo(String value) {
            addCriterion("labName >=", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameLessThan(String value) {
            addCriterion("labName <", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameLessThanOrEqualTo(String value) {
            addCriterion("labName <=", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameLike(String value) {
            addCriterion("labName like", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameNotLike(String value) {
            addCriterion("labName not like", value, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameIn(List<String> values) {
            addCriterion("labName in", values, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameNotIn(List<String> values) {
            addCriterion("labName not in", values, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameBetween(String value1, String value2) {
            addCriterion("labName between", value1, value2, "labname");
            return (Criteria) this;
        }

        public Criteria andLabnameNotBetween(String value1, String value2) {
            addCriterion("labName not between", value1, value2, "labname");
            return (Criteria) this;
        }

        public Criteria andLabtypeIsNull() {
            addCriterion("labType is null");
            return (Criteria) this;
        }

        public Criteria andLabtypeIsNotNull() {
            addCriterion("labType is not null");
            return (Criteria) this;
        }

        public Criteria andLabtypeEqualTo(String value) {
            addCriterion("labType =", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeNotEqualTo(String value) {
            addCriterion("labType <>", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeGreaterThan(String value) {
            addCriterion("labType >", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeGreaterThanOrEqualTo(String value) {
            addCriterion("labType >=", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeLessThan(String value) {
            addCriterion("labType <", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeLessThanOrEqualTo(String value) {
            addCriterion("labType <=", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeLike(String value) {
            addCriterion("labType like", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeNotLike(String value) {
            addCriterion("labType not like", value, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeIn(List<String> values) {
            addCriterion("labType in", values, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeNotIn(List<String> values) {
            addCriterion("labType not in", values, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeBetween(String value1, String value2) {
            addCriterion("labType between", value1, value2, "labtype");
            return (Criteria) this;
        }

        public Criteria andLabtypeNotBetween(String value1, String value2) {
            addCriterion("labType not between", value1, value2, "labtype");
            return (Criteria) this;
        }

        public Criteria andServerboardipIsNull() {
            addCriterion("serverBoardIP is null");
            return (Criteria) this;
        }

        public Criteria andServerboardipIsNotNull() {
            addCriterion("serverBoardIP is not null");
            return (Criteria) this;
        }

        public Criteria andServerboardipEqualTo(String value) {
            addCriterion("serverBoardIP =", value, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipNotEqualTo(String value) {
            addCriterion("serverBoardIP <>", value, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipGreaterThan(String value) {
            addCriterion("serverBoardIP >", value, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipGreaterThanOrEqualTo(String value) {
            addCriterion("serverBoardIP >=", value, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipLessThan(String value) {
            addCriterion("serverBoardIP <", value, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipLessThanOrEqualTo(String value) {
            addCriterion("serverBoardIP <=", value, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipLike(String value) {
            addCriterion("serverBoardIP like", value, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipNotLike(String value) {
            addCriterion("serverBoardIP not like", value, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipIn(List<String> values) {
            addCriterion("serverBoardIP in", values, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipNotIn(List<String> values) {
            addCriterion("serverBoardIP not in", values, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipBetween(String value1, String value2) {
            addCriterion("serverBoardIP between", value1, value2, "serverboardip");
            return (Criteria) this;
        }

        public Criteria andServerboardipNotBetween(String value1, String value2) {
            addCriterion("serverBoardIP not between", value1, value2, "serverboardip");
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