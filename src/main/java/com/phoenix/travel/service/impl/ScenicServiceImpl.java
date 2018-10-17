package com.phoenix.travel.service.impl;

import com.phoenix.travel.common.enums.DeleteFlagEnum;
import com.phoenix.travel.common.enums.RspCodeEnum;
import com.phoenix.travel.common.enums.StatusEnum;
import com.phoenix.travel.common.exception.TravelBizRuntimeException;
import com.phoenix.travel.common.model.TravelResult;
import com.phoenix.travel.common.model.dto.ScenicDTO;
import com.phoenix.travel.common.util.DateUtils;
import com.phoenix.travel.dao.ScenicMapper;
import com.phoenix.travel.po.Scenic;
import com.phoenix.travel.service.ScenicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Weishuo Zhang
 * @create 2018/10/12
 */
@Service
public class ScenicServiceImpl implements ScenicService {

    private static Logger logger = LoggerFactory.getLogger(ScenicServiceImpl.class);

    @Autowired
    private ScenicMapper scenicMapper;

    @Override
    public TravelResult add(ScenicDTO scenic) {
        Scenic addScenic = new Scenic();
        addScenic.setBannerImgs(scenic.getBannerImgs());
        addScenic.setScenicName(scenic.getScenicName());
        addScenic.setScenicAddress(scenic.getScenicAddress());
        addScenic.setCityId(scenic.getCityId());
        addScenic.setOpenTime(scenic.getOpenTime());
        addScenic.setTicketInfo(scenic.getTicketInfo());
        addScenic.setScenicDesc(scenic.getScenicDesc());
        addScenic.setScenicSts(new Integer(StatusEnum.NORMAL.getCode()).byteValue());

        Date currentDate = DateUtils.getCurrentDate();
        addScenic.setCreateTime(currentDate);
        addScenic.setUpdateTime(currentDate);
        addScenic.setDelFlag(new Integer(DeleteFlagEnum.NORMAL.getCode()).byteValue());

        scenicMapper.insert(addScenic);
        logger.info("新增景点[{}]", addScenic.getScenicId());

        return TravelResult.ok(addScenic.getScenicId());
    }

    @Override
    public TravelResult info(Integer scenicId) {
        Scenic scenic = scenicMapper.selectByPrimaryKey(scenicId);
        if (scenic == null) {
            logger.error("景点[{}]不存在", scenicId);
            throw new TravelBizRuntimeException(RspCodeEnum.SCENIC_NOT_EXIST.getCode());
        }

        return TravelResult.ok(scenic);
    }

    @Override
    public TravelResult update(ScenicDTO scenic) {
        Scenic updateScenic = new Scenic();
        BeanUtils.copyProperties(scenic, updateScenic);
        int i = scenicMapper.updateByPrimaryKey(updateScenic);
        if (i == 0) {
            throw new TravelBizRuntimeException(RspCodeEnum.SCENIC_UPDATE_FAIL.getCode());
        }

        return TravelResult.ok();
    }

    @Override
    public TravelResult updateSts(Integer sts, List<Integer> ids) {
        scenicMapper.batchUpdateStatus(ids, sts);
        return TravelResult.ok();
    }
}
