package com.kerwin.ssm.business.management.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.kerwin.ssm.business.management.dao.MenusMapper;
import com.kerwin.ssm.business.management.model.Menus;
import com.kerwin.ssm.business.management.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;
import java.util.List;

/**
 * Created by Administrator on 2017/11/15.
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenusMapper menusMapper;
    public List<Menus> getAll() {

        return menusMapper.selectAll();
    }
}
