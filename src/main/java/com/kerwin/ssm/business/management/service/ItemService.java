package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Item;
import com.kerwin.ssm.business.management.model.Qo.ItemQo;
import com.kerwin.ssm.business.management.model.Vo.ItemVo;
import com.kerwin.ssm.common.Pages;

import java.util.List;

/**
 * Created by kerwin.liu on 2017/11/19.
 */
public interface ItemService {
    boolean save(Item item, AuthUser authUser);

    Pages<Item> getPages(ItemQo itemQo);

    boolean deleteById(String id);

    boolean update(Item item);

    ItemVo getOne(String id);

    List<Item> getByItemQo(ItemQo itemQo);
}
