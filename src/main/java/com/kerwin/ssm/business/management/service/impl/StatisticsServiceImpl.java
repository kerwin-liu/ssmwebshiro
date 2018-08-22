package com.kerwin.ssm.business.management.service.impl;

import com.kerwin.ssm.business.management.dao.StatisticsMapper;
import com.kerwin.ssm.business.management.model.Qo.StatisticsQo;
import com.kerwin.ssm.business.management.model.Vo.StatisticsByClientVo;
import com.kerwin.ssm.business.management.model.Vo.StatisticsVo;
import com.kerwin.ssm.business.management.service.StatisticsService;
import com.kerwin.ssm.common.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by kerwin.liu on 2018/8/13.
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired
    StatisticsMapper statisticsMapper;

    @Override
    public List<StatisticsVo> getStatisticsDatil(StatisticsQo statisticsQo) {
        Date start = DateUtils.strToDate(statisticsQo.getStartTime());
        Date end = null;
        if ("date".equals(statisticsQo.getDateType())) {
            //精确到天，结束时间加一天
            end = DateUtils.addDays(DateUtils.strToDate(statisticsQo.getEndTime()),1);
        } else if ("month".equals(statisticsQo.getDateType())) {
            //按月统计，结束时间加一个月
            end = DateUtils.addMonths(DateUtils.strToDate(statisticsQo.getEndTime()),1);
        } else if ("year".equals(statisticsQo.getDateType())) {
            //按年统计，结束时间加12个月
            end = DateUtils.addYears(DateUtils.strToDate(statisticsQo.getEndTime()),1);
        }
        statisticsQo.setStartTimeD(start);
        statisticsQo.setEndTimeD(end);
        return statisticsMapper.getStatisticsDatil(statisticsQo);
    }

    @Override
    public List<StatisticsByClientVo> getStatisticsByClient(StatisticsQo statisticsQo) {
        Date start = DateUtils.strToDate(statisticsQo.getStartTime());
        Date end = null;
        if ("date".equals(statisticsQo.getDateType())) {
            //精确到天，结束时间加一天
            end = DateUtils.addDays(DateUtils.strToDate(statisticsQo.getEndTime()),1);
        } else if ("month".equals(statisticsQo.getDateType())) {
            //按月统计，结束时间加一个月
            end = DateUtils.addMonths(DateUtils.strToDate(statisticsQo.getEndTime()),1);
        } else if ("year".equals(statisticsQo.getDateType())) {
            //按年统计，结束时间加12个月
            end = DateUtils.addYears(DateUtils.strToDate(statisticsQo.getEndTime()),1);
        }
        statisticsQo.setStartTimeD(start);
        statisticsQo.setEndTimeD(end);
        return statisticsMapper.getStatisticsByClient(statisticsQo);
    }
}
