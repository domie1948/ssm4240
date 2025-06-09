package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshuoCollectionEntity;
import java.util.Map;

/**
 * 小说收藏 服务类
 */
public interface XiaoshuoCollectionService extends IService<XiaoshuoCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}