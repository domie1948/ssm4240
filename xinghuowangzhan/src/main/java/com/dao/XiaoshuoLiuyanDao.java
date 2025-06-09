package com.dao;

import com.entity.XiaoshuoLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshuoLiuyanView;

/**
 * 小说评论 Dao 接口
 *
 * @author 
 */
public interface XiaoshuoLiuyanDao extends BaseMapper<XiaoshuoLiuyanEntity> {

   List<XiaoshuoLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
