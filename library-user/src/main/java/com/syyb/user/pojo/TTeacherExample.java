package com.syyb.user.pojo;

import java.util.ArrayList;
import java.util.List;

public class TTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTeacherExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCollegenameIsNull() {
            addCriterion("collegename is null");
            return (Criteria) this;
        }

        public Criteria andCollegenameIsNotNull() {
            addCriterion("collegename is not null");
            return (Criteria) this;
        }

        public Criteria andCollegenameEqualTo(String value) {
            addCriterion("collegename =", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotEqualTo(String value) {
            addCriterion("collegename <>", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameGreaterThan(String value) {
            addCriterion("collegename >", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameGreaterThanOrEqualTo(String value) {
            addCriterion("collegename >=", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLessThan(String value) {
            addCriterion("collegename <", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLessThanOrEqualTo(String value) {
            addCriterion("collegename <=", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLike(String value) {
            addCriterion("collegename like", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotLike(String value) {
            addCriterion("collegename not like", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameIn(List<String> values) {
            addCriterion("collegename in", values, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotIn(List<String> values) {
            addCriterion("collegename not in", values, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameBetween(String value1, String value2) {
            addCriterion("collegename between", value1, value2, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotBetween(String value1, String value2) {
            addCriterion("collegename not between", value1, value2, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdIsNull() {
            addCriterion("collegename_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdIsNotNull() {
            addCriterion("collegename_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdEqualTo(Integer value) {
            addCriterion("collegename_id =", value, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdNotEqualTo(Integer value) {
            addCriterion("collegename_id <>", value, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdGreaterThan(Integer value) {
            addCriterion("collegename_id >", value, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collegename_id >=", value, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdLessThan(Integer value) {
            addCriterion("collegename_id <", value, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdLessThanOrEqualTo(Integer value) {
            addCriterion("collegename_id <=", value, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdIn(List<Integer> values) {
            addCriterion("collegename_id in", values, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdNotIn(List<Integer> values) {
            addCriterion("collegename_id not in", values, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdBetween(Integer value1, Integer value2) {
            addCriterion("collegename_id between", value1, value2, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andCollegenameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collegename_id not between", value1, value2, "collegenameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIdIsNull() {
            addCriterion("classname_id is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIdIsNotNull() {
            addCriterion("classname_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameIdEqualTo(Integer value) {
            addCriterion("classname_id =", value, "classnameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIdNotEqualTo(Integer value) {
            addCriterion("classname_id <>", value, "classnameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIdGreaterThan(Integer value) {
            addCriterion("classname_id >", value, "classnameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classname_id >=", value, "classnameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIdLessThan(Integer value) {
            addCriterion("classname_id <", value, "classnameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIdLessThanOrEqualTo(Integer value) {
            addCriterion("classname_id <=", value, "classnameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIdIn(List<Integer> values) {
            addCriterion("classname_id in", values, "classnameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIdNotIn(List<Integer> values) {
            addCriterion("classname_id not in", values, "classnameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIdBetween(Integer value1, Integer value2) {
            addCriterion("classname_id between", value1, value2, "classnameId");
            return (Criteria) this;
        }

        public Criteria andClassnameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classname_id not between", value1, value2, "classnameId");
            return (Criteria) this;
        }

        public Criteria andYbIdIsNull() {
            addCriterion("yb_id is null");
            return (Criteria) this;
        }

        public Criteria andYbIdIsNotNull() {
            addCriterion("yb_id is not null");
            return (Criteria) this;
        }

        public Criteria andYbIdEqualTo(Integer value) {
            addCriterion("yb_id =", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdNotEqualTo(Integer value) {
            addCriterion("yb_id <>", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdGreaterThan(Integer value) {
            addCriterion("yb_id >", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yb_id >=", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdLessThan(Integer value) {
            addCriterion("yb_id <", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdLessThanOrEqualTo(Integer value) {
            addCriterion("yb_id <=", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdIn(List<Integer> values) {
            addCriterion("yb_id in", values, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdNotIn(List<Integer> values) {
            addCriterion("yb_id not in", values, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdBetween(Integer value1, Integer value2) {
            addCriterion("yb_id between", value1, value2, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yb_id not between", value1, value2, "ybId");
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