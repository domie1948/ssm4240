package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.XiaoshuoDao;
import com.entity.XiaoshuoEntity;
import com.service.XiaoshuoService;
import com.entity.view.XiaoshuoView;

/**
 * 小说 服务实现类
 */
@Service("xiaoshuoService")
@Transactional
public class XiaoshuoServiceImpl extends ServiceImpl<XiaoshuoDao, XiaoshuoEntity> implements XiaoshuoService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<XiaoshuoView> page =new Query<XiaoshuoView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
