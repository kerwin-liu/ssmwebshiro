package com.kerwin.ssm.business.management.service.impl;

import com.kerwin.ssm.business.management.dao.TransportMapper;
import com.kerwin.ssm.business.management.model.Transport;
import com.kerwin.ssm.business.management.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kerwin.liu on 2018/6/22.
 */
@Service
public class TransportServiceImpl implements TransportService {
    @Autowired
    private TransportMapper transportMapper;
    @Override
    public List<Transport> getList() {
        return transportMapper.getList();
    }
}
