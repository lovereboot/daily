package com.wukui.daily.dal.dao;

import com.wukui.daily.dal.model.WkUserDO;

/**
 * Created by fucai.zhangfc on 2015/12/7.
 */
public interface WkUserDao {

    public void insert(WkUserDO user);

    public WkUserDO queryById(long id);
}
