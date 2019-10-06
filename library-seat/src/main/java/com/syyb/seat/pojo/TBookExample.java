package com.syyb.seat.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBookExample() {
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

        public Criteria andSeatIdIsNull() {
            addCriterion("seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(Integer value) {
            addCriterion("seat_id =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(Integer value) {
            addCriterion("seat_id <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(Integer value) {
            addCriterion("seat_id >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_id >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(Integer value) {
            addCriterion("seat_id <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(Integer value) {
            addCriterion("seat_id <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<Integer> values) {
            addCriterion("seat_id in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<Integer> values) {
            addCriterion("seat_id not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(Integer value1, Integer value2) {
            addCriterion("seat_id between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_id not between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusIsNull() {
            addCriterion("occupy_status is null");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusIsNotNull() {
            addCriterion("occupy_status is not null");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusEqualTo(Integer value) {
            addCriterion("occupy_status =", value, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusNotEqualTo(Integer value) {
            addCriterion("occupy_status <>", value, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusGreaterThan(Integer value) {
            addCriterion("occupy_status >", value, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("occupy_status >=", value, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusLessThan(Integer value) {
            addCriterion("occupy_status <", value, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("occupy_status <=", value, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusIn(List<Integer> values) {
            addCriterion("occupy_status in", values, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusNotIn(List<Integer> values) {
            addCriterion("occupy_status not in", values, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusBetween(Integer value1, Integer value2) {
            addCriterion("occupy_status between", value1, value2, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andOccupyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("occupy_status not between", value1, value2, "occupyStatus");
            return (Criteria) this;
        }

        public Criteria andStratTimeIsNull() {
            addCriterion("strat_time is null");
            return (Criteria) this;
        }

        public Criteria andStratTimeIsNotNull() {
            addCriterion("strat_time is not null");
            return (Criteria) this;
        }

        public Criteria andStratTimeEqualTo(Date value) {
            addCriterion("strat_time =", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeNotEqualTo(Date value) {
            addCriterion("strat_time <>", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeGreaterThan(Date value) {
            addCriterion("strat_time >", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("strat_time >=", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeLessThan(Date value) {
            addCriterion("strat_time <", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeLessThanOrEqualTo(Date value) {
            addCriterion("strat_time <=", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeIn(List<Date> values) {
            addCriterion("strat_time in", values, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeNotIn(List<Date> values) {
            addCriterion("strat_time not in", values, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeBetween(Date value1, Date value2) {
            addCriterion("strat_time between", value1, value2, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeNotBetween(Date value1, Date value2) {
            addCriterion("strat_time not between", value1, value2, "stratTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andExpireIsNull() {
            addCriterion("expire is null");
            return (Criteria) this;
        }

        public Criteria andExpireIsNotNull() {
            addCriterion("expire is not null");
            return (Criteria) this;
        }

        public Criteria andExpireEqualTo(Integer value) {
            addCriterion("expire =", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotEqualTo(Integer value) {
            addCriterion("expire <>", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThan(Integer value) {
            addCriterion("expire >", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThanOrEqualTo(Integer value) {
            addCriterion("expire >=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThan(Integer value) {
            addCriterion("expire <", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThanOrEqualTo(Integer value) {
            addCriterion("expire <=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireIn(List<Integer> values) {
            addCriterion("expire in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotIn(List<Integer> values) {
            addCriterion("expire not in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireBetween(Integer value1, Integer value2) {
            addCriterion("expire between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotBetween(Integer value1, Integer value2) {
            addCriterion("expire not between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andViolationIsNull() {
            addCriterion("violation is null");
            return (Criteria) this;
        }

        public Criteria andViolationIsNotNull() {
            addCriterion("violation is not null");
            return (Criteria) this;
        }

        public Criteria andViolationEqualTo(Integer value) {
            addCriterion("violation =", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationNotEqualTo(Integer value) {
            addCriterion("violation <>", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationGreaterThan(Integer value) {
            addCriterion("violation >", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationGreaterThanOrEqualTo(Integer value) {
            addCriterion("violation >=", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationLessThan(Integer value) {
            addCriterion("violation <", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationLessThanOrEqualTo(Integer value) {
            addCriterion("violation <=", value, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationIn(List<Integer> values) {
            addCriterion("violation in", values, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationNotIn(List<Integer> values) {
            addCriterion("violation not in", values, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationBetween(Integer value1, Integer value2) {
            addCriterion("violation between", value1, value2, "violation");
            return (Criteria) this;
        }

        public Criteria andViolationNotBetween(Integer value1, Integer value2) {
            addCriterion("violation not between", value1, value2, "violation");
            return (Criteria) this;
        }

        public Criteria andLongTremIsNull() {
            addCriterion("long_trem is null");
            return (Criteria) this;
        }

        public Criteria andLongTremIsNotNull() {
            addCriterion("long_trem is not null");
            return (Criteria) this;
        }

        public Criteria andLongTremEqualTo(Integer value) {
            addCriterion("long_trem =", value, "longTrem");
            return (Criteria) this;
        }

        public Criteria andLongTremNotEqualTo(Integer value) {
            addCriterion("long_trem <>", value, "longTrem");
            return (Criteria) this;
        }

        public Criteria andLongTremGreaterThan(Integer value) {
            addCriterion("long_trem >", value, "longTrem");
            return (Criteria) this;
        }

        public Criteria andLongTremGreaterThanOrEqualTo(Integer value) {
            addCriterion("long_trem >=", value, "longTrem");
            return (Criteria) this;
        }

        public Criteria andLongTremLessThan(Integer value) {
            addCriterion("long_trem <", value, "longTrem");
            return (Criteria) this;
        }

        public Criteria andLongTremLessThanOrEqualTo(Integer value) {
            addCriterion("long_trem <=", value, "longTrem");
            return (Criteria) this;
        }

        public Criteria andLongTremIn(List<Integer> values) {
            addCriterion("long_trem in", values, "longTrem");
            return (Criteria) this;
        }

        public Criteria andLongTremNotIn(List<Integer> values) {
            addCriterion("long_trem not in", values, "longTrem");
            return (Criteria) this;
        }

        public Criteria andLongTremBetween(Integer value1, Integer value2) {
            addCriterion("long_trem between", value1, value2, "longTrem");
            return (Criteria) this;
        }

        public Criteria andLongTremNotBetween(Integer value1, Integer value2) {
            addCriterion("long_trem not between", value1, value2, "longTrem");
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