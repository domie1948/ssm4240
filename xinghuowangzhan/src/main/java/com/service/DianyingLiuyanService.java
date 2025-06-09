package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianyingLiuyanEntity;
import java.util.Map;

/**
 * 电影评论 服务类
 */
public interface DianyingLiuyanService extends IService<DianyingLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}