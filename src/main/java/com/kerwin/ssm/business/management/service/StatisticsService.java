package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.Qo.StatisticsQo;
import com.kerwin.ssm.business.management.model.Vo.StatisticsByClientVo;
import com.kerwin.ssm.business.management.model.Vo.StatisticsVo;

import java.util.List;

/**
 * Created by kerwin.liu on 2018/8/13.
 */
public interface StatisticsService {
    List<StatisticsVo> getStatisticsDatil(StatisticsQo statisticsQo) ;

    List<StatisticsByClientVo> getStatisticsByClient(StatisticsQo statisticsQo);
}
