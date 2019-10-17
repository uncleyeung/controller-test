package com.uncle.controller.mongo.service;

import com.uncle.controller.mongo.bo.Man;

import java.util.List;

/**
 * @author 杨戬
 * @className ManMongoService
 * @email yangb@chaosource.com
 * @date 19-10-17 14:18
 */
public interface ManMongoService {

    /**
     * 新增
     *
     * @param man man
     */
    void insert(Man man);

    /**
     * 查询
     *
     * @param name 名字
     * @return man
     */
    Man selectByName(String name);

    /**
     * 查询全部
     * @return
     */
    List<Man> listAll();
}