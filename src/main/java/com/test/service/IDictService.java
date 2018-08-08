package com.test.service;

import java.util.List;

import com.test.entity.Dict;

/**
 * 字典业务接口
 * @author lixiaoxi
 *
 */
public interface IDictService {
    
    /**
     * 根据字段获取字典
     * @param field
     * @return
     */
    public List<Dict> getDictByField(String field);
}