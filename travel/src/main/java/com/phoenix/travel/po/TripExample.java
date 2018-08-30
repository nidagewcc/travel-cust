package com.phoenix.travel.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TripExample() {
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

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andTripTitleIsNull() {
            addCriterion("trip_title is null");
            return (Criteria) this;
        }

        public Criteria andTripTitleIsNotNull() {
            addCriterion("trip_title is not null");
            return (Criteria) this;
        }

        public Criteria andTripTitleEqualTo(String value) {
            addCriterion("trip_title =", value, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleNotEqualTo(String value) {
            addCriterion("trip_title <>", value, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleGreaterThan(String value) {
            addCriterion("trip_title >", value, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleGreaterThanOrEqualTo(String value) {
            addCriterion("trip_title >=", value, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleLessThan(String value) {
            addCriterion("trip_title <", value, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleLessThanOrEqualTo(String value) {
            addCriterion("trip_title <=", value, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleLike(String value) {
            addCriterion("trip_title like", value, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleNotLike(String value) {
            addCriterion("trip_title not like", value, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleIn(List<String> values) {
            addCriterion("trip_title in", values, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleNotIn(List<String> values) {
            addCriterion("trip_title not in", values, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleBetween(String value1, String value2) {
            addCriterion("trip_title between", value1, value2, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripTitleNotBetween(String value1, String value2) {
            addCriterion("trip_title not between", value1, value2, "tripTitle");
            return (Criteria) this;
        }

        public Criteria andTripCityIsNull() {
            addCriterion("trip_city is null");
            return (Criteria) this;
        }

        public Criteria andTripCityIsNotNull() {
            addCriterion("trip_city is not null");
            return (Criteria) this;
        }

        public Criteria andTripCityEqualTo(String value) {
            addCriterion("trip_city =", value, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityNotEqualTo(String value) {
            addCriterion("trip_city <>", value, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityGreaterThan(String value) {
            addCriterion("trip_city >", value, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityGreaterThanOrEqualTo(String value) {
            addCriterion("trip_city >=", value, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityLessThan(String value) {
            addCriterion("trip_city <", value, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityLessThanOrEqualTo(String value) {
            addCriterion("trip_city <=", value, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityLike(String value) {
            addCriterion("trip_city like", value, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityNotLike(String value) {
            addCriterion("trip_city not like", value, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityIn(List<String> values) {
            addCriterion("trip_city in", values, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityNotIn(List<String> values) {
            addCriterion("trip_city not in", values, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityBetween(String value1, String value2) {
            addCriterion("trip_city between", value1, value2, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripCityNotBetween(String value1, String value2) {
            addCriterion("trip_city not between", value1, value2, "tripCity");
            return (Criteria) this;
        }

        public Criteria andTripDescIsNull() {
            addCriterion("trip_desc is null");
            return (Criteria) this;
        }

        public Criteria andTripDescIsNotNull() {
            addCriterion("trip_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTripDescEqualTo(String value) {
            addCriterion("trip_desc =", value, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescNotEqualTo(String value) {
            addCriterion("trip_desc <>", value, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescGreaterThan(String value) {
            addCriterion("trip_desc >", value, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescGreaterThanOrEqualTo(String value) {
            addCriterion("trip_desc >=", value, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescLessThan(String value) {
            addCriterion("trip_desc <", value, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescLessThanOrEqualTo(String value) {
            addCriterion("trip_desc <=", value, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescLike(String value) {
            addCriterion("trip_desc like", value, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescNotLike(String value) {
            addCriterion("trip_desc not like", value, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescIn(List<String> values) {
            addCriterion("trip_desc in", values, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescNotIn(List<String> values) {
            addCriterion("trip_desc not in", values, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescBetween(String value1, String value2) {
            addCriterion("trip_desc between", value1, value2, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andTripDescNotBetween(String value1, String value2) {
            addCriterion("trip_desc not between", value1, value2, "tripDesc");
            return (Criteria) this;
        }

        public Criteria andBasePriceIsNull() {
            addCriterion("base_price is null");
            return (Criteria) this;
        }

        public Criteria andBasePriceIsNotNull() {
            addCriterion("base_price is not null");
            return (Criteria) this;
        }

        public Criteria andBasePriceEqualTo(BigDecimal value) {
            addCriterion("base_price =", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceNotEqualTo(BigDecimal value) {
            addCriterion("base_price <>", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceGreaterThan(BigDecimal value) {
            addCriterion("base_price >", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_price >=", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceLessThan(BigDecimal value) {
            addCriterion("base_price <", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_price <=", value, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceIn(List<BigDecimal> values) {
            addCriterion("base_price in", values, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceNotIn(List<BigDecimal> values) {
            addCriterion("base_price not in", values, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_price between", value1, value2, "basePrice");
            return (Criteria) this;
        }

        public Criteria andBasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_price not between", value1, value2, "basePrice");
            return (Criteria) this;
        }

        public Criteria andTripStsIsNull() {
            addCriterion("trip_sts is null");
            return (Criteria) this;
        }

        public Criteria andTripStsIsNotNull() {
            addCriterion("trip_sts is not null");
            return (Criteria) this;
        }

        public Criteria andTripStsEqualTo(Byte value) {
            addCriterion("trip_sts =", value, "tripSts");
            return (Criteria) this;
        }

        public Criteria andTripStsNotEqualTo(Byte value) {
            addCriterion("trip_sts <>", value, "tripSts");
            return (Criteria) this;
        }

        public Criteria andTripStsGreaterThan(Byte value) {
            addCriterion("trip_sts >", value, "tripSts");
            return (Criteria) this;
        }

        public Criteria andTripStsGreaterThanOrEqualTo(Byte value) {
            addCriterion("trip_sts >=", value, "tripSts");
            return (Criteria) this;
        }

        public Criteria andTripStsLessThan(Byte value) {
            addCriterion("trip_sts <", value, "tripSts");
            return (Criteria) this;
        }

        public Criteria andTripStsLessThanOrEqualTo(Byte value) {
            addCriterion("trip_sts <=", value, "tripSts");
            return (Criteria) this;
        }

        public Criteria andTripStsIn(List<Byte> values) {
            addCriterion("trip_sts in", values, "tripSts");
            return (Criteria) this;
        }

        public Criteria andTripStsNotIn(List<Byte> values) {
            addCriterion("trip_sts not in", values, "tripSts");
            return (Criteria) this;
        }

        public Criteria andTripStsBetween(Byte value1, Byte value2) {
            addCriterion("trip_sts between", value1, value2, "tripSts");
            return (Criteria) this;
        }

        public Criteria andTripStsNotBetween(Byte value1, Byte value2) {
            addCriterion("trip_sts not between", value1, value2, "tripSts");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Byte value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Byte value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Byte value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Byte value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Byte value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Byte> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Byte> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Byte value1, Byte value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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