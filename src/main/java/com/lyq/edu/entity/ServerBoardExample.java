package com.lyq.edu.entity;

import java.util.ArrayList;
import java.util.List;

public class ServerBoardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerBoardExample() {
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

        public Criteria andIpaddressIsNull() {
            addCriterion("ipAddress is null");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNotNull() {
            addCriterion("ipAddress is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddressEqualTo(String value) {
            addCriterion("ipAddress =", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotEqualTo(String value) {
            addCriterion("ipAddress <>", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThan(String value) {
            addCriterion("ipAddress >", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ipAddress >=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThan(String value) {
            addCriterion("ipAddress <", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThanOrEqualTo(String value) {
            addCriterion("ipAddress <=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLike(String value) {
            addCriterion("ipAddress like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotLike(String value) {
            addCriterion("ipAddress not like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressIn(List<String> values) {
            addCriterion("ipAddress in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotIn(List<String> values) {
            addCriterion("ipAddress not in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressBetween(String value1, String value2) {
            addCriterion("ipAddress between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotBetween(String value1, String value2) {
            addCriterion("ipAddress not between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andPcrecvportIsNull() {
            addCriterion("pcRecvPort is null");
            return (Criteria) this;
        }

        public Criteria andPcrecvportIsNotNull() {
            addCriterion("pcRecvPort is not null");
            return (Criteria) this;
        }

        public Criteria andPcrecvportEqualTo(Integer value) {
            addCriterion("pcRecvPort =", value, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andPcrecvportNotEqualTo(Integer value) {
            addCriterion("pcRecvPort <>", value, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andPcrecvportGreaterThan(Integer value) {
            addCriterion("pcRecvPort >", value, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andPcrecvportGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcRecvPort >=", value, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andPcrecvportLessThan(Integer value) {
            addCriterion("pcRecvPort <", value, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andPcrecvportLessThanOrEqualTo(Integer value) {
            addCriterion("pcRecvPort <=", value, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andPcrecvportIn(List<Integer> values) {
            addCriterion("pcRecvPort in", values, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andPcrecvportNotIn(List<Integer> values) {
            addCriterion("pcRecvPort not in", values, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andPcrecvportBetween(Integer value1, Integer value2) {
            addCriterion("pcRecvPort between", value1, value2, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andPcrecvportNotBetween(Integer value1, Integer value2) {
            addCriterion("pcRecvPort not between", value1, value2, "pcrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportIsNull() {
            addCriterion("boardRecvPort is null");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportIsNotNull() {
            addCriterion("boardRecvPort is not null");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportEqualTo(Integer value) {
            addCriterion("boardRecvPort =", value, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportNotEqualTo(Integer value) {
            addCriterion("boardRecvPort <>", value, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportGreaterThan(Integer value) {
            addCriterion("boardRecvPort >", value, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportGreaterThanOrEqualTo(Integer value) {
            addCriterion("boardRecvPort >=", value, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportLessThan(Integer value) {
            addCriterion("boardRecvPort <", value, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportLessThanOrEqualTo(Integer value) {
            addCriterion("boardRecvPort <=", value, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportIn(List<Integer> values) {
            addCriterion("boardRecvPort in", values, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportNotIn(List<Integer> values) {
            addCriterion("boardRecvPort not in", values, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportBetween(Integer value1, Integer value2) {
            addCriterion("boardRecvPort between", value1, value2, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andBoardrecvportNotBetween(Integer value1, Integer value2) {
            addCriterion("boardRecvPort not between", value1, value2, "boardrecvport");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andVerifycodeIsNull() {
            addCriterion("verifyCode is null");
            return (Criteria) this;
        }

        public Criteria andVerifycodeIsNotNull() {
            addCriterion("verifyCode is not null");
            return (Criteria) this;
        }

        public Criteria andVerifycodeEqualTo(String value) {
            addCriterion("verifyCode =", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeNotEqualTo(String value) {
            addCriterion("verifyCode <>", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeGreaterThan(String value) {
            addCriterion("verifyCode >", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeGreaterThanOrEqualTo(String value) {
            addCriterion("verifyCode >=", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeLessThan(String value) {
            addCriterion("verifyCode <", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeLessThanOrEqualTo(String value) {
            addCriterion("verifyCode <=", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeLike(String value) {
            addCriterion("verifyCode like", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeNotLike(String value) {
            addCriterion("verifyCode not like", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeIn(List<String> values) {
            addCriterion("verifyCode in", values, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeNotIn(List<String> values) {
            addCriterion("verifyCode not in", values, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeBetween(String value1, String value2) {
            addCriterion("verifyCode between", value1, value2, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeNotBetween(String value1, String value2) {
            addCriterion("verifyCode not between", value1, value2, "verifycode");
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