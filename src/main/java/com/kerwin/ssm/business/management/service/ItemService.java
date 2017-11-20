package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Item;
import com.kerwin.ssm.business.management.model.Qo.ItemQo;
import com.kerwin.ssm.common.Pages;

/**
 * Created by kerwin.liu on 2017/11/19.
 */
public interface ItemService {
    boolean save(Item item, AuthUser authUser);

    Pages<Item> getPages(ItemQo itemQo);
}
