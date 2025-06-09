package com.dao;

import com.entity.XiaoshuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshuoView;

/**
 * 小说 Dao 接口
 *
 * @author 
 */
public interface XiaoshuoDao extends BaseMapper<XiaoshuoEntity> {

   List<XiaoshuoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
