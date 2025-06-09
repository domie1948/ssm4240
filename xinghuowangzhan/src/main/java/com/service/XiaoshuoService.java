package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshuoEntity;
import java.util.Map;

/**
 * 小说 服务类
 */
public interface XiaoshuoService extends IService<XiaoshuoEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}