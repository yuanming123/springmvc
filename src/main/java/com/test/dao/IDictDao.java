package com.test.dao;

import java.util.List;

import com.test.entity.Dict;

public interface IDictDao {
	 /**
     * 根据字段获取字典
     * @param field
     * @return
     */
    public List<Dict> getDictByField(String field);
}
