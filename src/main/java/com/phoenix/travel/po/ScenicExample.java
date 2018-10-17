package com.phoenix.travel.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicExample() {
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

        public Criteria andScenicIdIsNull() {
            addCriterion("scenic_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("scenic_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Integer value) {
            addCriterion("scenic_id =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Integer value) {
            addCriterion("scenic_id <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Integer value) {
            addCriterion("scenic_id >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_id >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Integer value) {
            addCriterion("scenic_id <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_id <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Integer> values) {
            addCriterion("scenic_id in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Integer> values) {
            addCriterion("scenic_id not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id not between", value1, value2, "scenicId");
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

        public Criteria andScenicNameIsNull() {
            addCriterion("scenic_name is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("scenic_name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("scenic_name =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("scenic_name <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("scenic_name >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_name >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("scenic_name <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("scenic_name <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("scenic_name like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("scenic_name not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("scenic_name in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("scenic_name not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("scenic_name between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("scenic_name not between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicAddressIsNull() {
            addCriterion("scenic_address is null");
            return (Criteria) this;
        }

        public Criteria andScenicAddressIsNotNull() {
            addCriterion("scenic_address is not null");
            return (Criteria) this;
        }

        public Criteria andScenicAddressEqualTo(String value) {
            addCriterion("scenic_address =", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressNotEqualTo(String value) {
            addCriterion("scenic_address <>", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressGreaterThan(String value) {
            addCriterion("scenic_address >", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_address >=", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressLessThan(String value) {
            addCriterion("scenic_address <", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressLessThanOrEqualTo(String value) {
            addCriterion("scenic_address <=", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressLike(String value) {
            addCriterion("scenic_address like", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressNotLike(String value) {
            addCriterion("scenic_address not like", value, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressIn(List<String> values) {
            addCriterion("scenic_address in", values, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressNotIn(List<String> values) {
            addCriterion("scenic_address not in", values, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressBetween(String value1, String value2) {
            addCriterion("scenic_address between", value1, value2, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andScenicAddressNotBetween(String value1, String value2) {
            addCriterion("scenic_address not between", value1, value2, "scenicAddress");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
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