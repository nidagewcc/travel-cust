package com.phoenix.travel.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicItemExample() {
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

        public Criteria andBannerImgsIsNull() {
            addCriterion("banner_imgs is null");
            return (Criteria) this;
        }

        public Criteria andBannerImgsIsNotNull() {
            addCriterion("banner_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andBannerImgsEqualTo(String value) {
            addCriterion("banner_imgs =", value, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsNotEqualTo(String value) {
            addCriterion("banner_imgs <>", value, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsGreaterThan(String value) {
            addCriterion("banner_imgs >", value, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsGreaterThanOrEqualTo(String value) {
            addCriterion("banner_imgs >=", value, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsLessThan(String value) {
            addCriterion("banner_imgs <", value, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsLessThanOrEqualTo(String value) {
            addCriterion("banner_imgs <=", value, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsLike(String value) {
            addCriterion("banner_imgs like", value, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsNotLike(String value) {
            addCriterion("banner_imgs not like", value, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsIn(List<String> values) {
            addCriterion("banner_imgs in", values, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsNotIn(List<String> values) {
            addCriterion("banner_imgs not in", values, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsBetween(String value1, String value2) {
            addCriterion("banner_imgs between", value1, value2, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andBannerImgsNotBetween(String value1, String value2) {
            addCriterion("banner_imgs not between", value1, value2, "bannerImgs");
            return (Criteria) this;
        }

        public Criteria andScenicTitleIsNull() {
            addCriterion("scenic_title is null");
            return (Criteria) this;
        }

        public Criteria andScenicTitleIsNotNull() {
            addCriterion("scenic_title is not null");
            return (Criteria) this;
        }

        public Criteria andScenicTitleEqualTo(String value) {
            addCriterion("scenic_title =", value, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleNotEqualTo(String value) {
            addCriterion("scenic_title <>", value, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleGreaterThan(String value) {
            addCriterion("scenic_title >", value, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_title >=", value, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleLessThan(String value) {
            addCriterion("scenic_title <", value, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleLessThanOrEqualTo(String value) {
            addCriterion("scenic_title <=", value, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleLike(String value) {
            addCriterion("scenic_title like", value, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleNotLike(String value) {
            addCriterion("scenic_title not like", value, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleIn(List<String> values) {
            addCriterion("scenic_title in", values, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleNotIn(List<String> values) {
            addCriterion("scenic_title not in", values, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleBetween(String value1, String value2) {
            addCriterion("scenic_title between", value1, value2, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicTitleNotBetween(String value1, String value2) {
            addCriterion("scenic_title not between", value1, value2, "scenicTitle");
            return (Criteria) this;
        }

        public Criteria andScenicAddrIsNull() {
            addCriterion("scenic_addr is null");
            return (Criteria) this;
        }

        public Criteria andScenicAddrIsNotNull() {
            addCriterion("scenic_addr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicAddrEqualTo(String value) {
            addCriterion("scenic_addr =", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrNotEqualTo(String value) {
            addCriterion("scenic_addr <>", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrGreaterThan(String value) {
            addCriterion("scenic_addr >", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_addr >=", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrLessThan(String value) {
            addCriterion("scenic_addr <", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrLessThanOrEqualTo(String value) {
            addCriterion("scenic_addr <=", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrLike(String value) {
            addCriterion("scenic_addr like", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrNotLike(String value) {
            addCriterion("scenic_addr not like", value, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrIn(List<String> values) {
            addCriterion("scenic_addr in", values, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrNotIn(List<String> values) {
            addCriterion("scenic_addr not in", values, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrBetween(String value1, String value2) {
            addCriterion("scenic_addr between", value1, value2, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicAddrNotBetween(String value1, String value2) {
            addCriterion("scenic_addr not between", value1, value2, "scenicAddr");
            return (Criteria) this;
        }

        public Criteria andScenicLocationIsNull() {
            addCriterion("scenic_location is null");
            return (Criteria) this;
        }

        public Criteria andScenicLocationIsNotNull() {
            addCriterion("scenic_location is not null");
            return (Criteria) this;
        }

        public Criteria andScenicLocationEqualTo(String value) {
            addCriterion("scenic_location =", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationNotEqualTo(String value) {
            addCriterion("scenic_location <>", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationGreaterThan(String value) {
            addCriterion("scenic_location >", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_location >=", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationLessThan(String value) {
            addCriterion("scenic_location <", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationLessThanOrEqualTo(String value) {
            addCriterion("scenic_location <=", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationLike(String value) {
            addCriterion("scenic_location like", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationNotLike(String value) {
            addCriterion("scenic_location not like", value, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationIn(List<String> values) {
            addCriterion("scenic_location in", values, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationNotIn(List<String> values) {
            addCriterion("scenic_location not in", values, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationBetween(String value1, String value2) {
            addCriterion("scenic_location between", value1, value2, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andScenicLocationNotBetween(String value1, String value2) {
            addCriterion("scenic_location not between", value1, value2, "scenicLocation");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andTicketInfoIsNull() {
            addCriterion("ticket_info is null");
            return (Criteria) this;
        }

        public Criteria andTicketInfoIsNotNull() {
            addCriterion("ticket_info is not null");
            return (Criteria) this;
        }

        public Criteria andTicketInfoEqualTo(String value) {
            addCriterion("ticket_info =", value, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoNotEqualTo(String value) {
            addCriterion("ticket_info <>", value, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoGreaterThan(String value) {
            addCriterion("ticket_info >", value, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_info >=", value, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoLessThan(String value) {
            addCriterion("ticket_info <", value, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoLessThanOrEqualTo(String value) {
            addCriterion("ticket_info <=", value, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoLike(String value) {
            addCriterion("ticket_info like", value, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoNotLike(String value) {
            addCriterion("ticket_info not like", value, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoIn(List<String> values) {
            addCriterion("ticket_info in", values, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoNotIn(List<String> values) {
            addCriterion("ticket_info not in", values, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoBetween(String value1, String value2) {
            addCriterion("ticket_info between", value1, value2, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andTicketInfoNotBetween(String value1, String value2) {
            addCriterion("ticket_info not between", value1, value2, "ticketInfo");
            return (Criteria) this;
        }

        public Criteria andScenicStsIsNull() {
            addCriterion("scenic_sts is null");
            return (Criteria) this;
        }

        public Criteria andScenicStsIsNotNull() {
            addCriterion("scenic_sts is not null");
            return (Criteria) this;
        }

        public Criteria andScenicStsEqualTo(Byte value) {
            addCriterion("scenic_sts =", value, "scenicSts");
            return (Criteria) this;
        }

        public Criteria andScenicStsNotEqualTo(Byte value) {
            addCriterion("scenic_sts <>", value, "scenicSts");
            return (Criteria) this;
        }

        public Criteria andScenicStsGreaterThan(Byte value) {
            addCriterion("scenic_sts >", value, "scenicSts");
            return (Criteria) this;
        }

        public Criteria andScenicStsGreaterThanOrEqualTo(Byte value) {
            addCriterion("scenic_sts >=", value, "scenicSts");
            return (Criteria) this;
        }

        public Criteria andScenicStsLessThan(Byte value) {
            addCriterion("scenic_sts <", value, "scenicSts");
            return (Criteria) this;
        }

        public Criteria andScenicStsLessThanOrEqualTo(Byte value) {
            addCriterion("scenic_sts <=", value, "scenicSts");
            return (Criteria) this;
        }

        public Criteria andScenicStsIn(List<Byte> values) {
            addCriterion("scenic_sts in", values, "scenicSts");
            return (Criteria) this;
        }

        public Criteria andScenicStsNotIn(List<Byte> values) {
            addCriterion("scenic_sts not in", values, "scenicSts");
            return (Criteria) this;
        }

        public Criteria andScenicStsBetween(Byte value1, Byte value2) {
            addCriterion("scenic_sts between", value1, value2, "scenicSts");
            return (Criteria) this;
        }

        public Criteria andScenicStsNotBetween(Byte value1, Byte value2) {
            addCriterion("scenic_sts not between", value1, value2, "scenicSts");
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