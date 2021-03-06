/**
 * @ProjectName：《职品汇》
 * @ClassName：BaseMapper
 * @Copyright：北京诚智汇达信息科技有限公司 京ICP备1798895号
 * @Website：www.honestcareer.com
 * @Author：罗顺锋
 * @Create：2017/2/22 15:33
 */
package com.maxcar.core.base.dao;

import java.io.Serializable;

/**
 * 数据访问层，通用接口
 *
 * @auther 罗顺锋
 * @create 2018/4/20
 */
public interface BaseDao<T,ID extends Serializable> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     * 通用根据主键删除数据
     * @mbggenerated
     */
    int deleteByPrimaryKey(ID id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用插入数据
     * @mbggenerated
     */
    int insert(T record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用有选择性插入部分数据
     * @mbggenerated
     */
    int insertSelective(T record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用根据主键查询数据
     * @mbggenerated
     */
    T selectByPrimaryKey(ID id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用有选择性更新对象，注意必须有主键id
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T
     *通用更新对象，注意必须有主键id
     * @mbggenerated
     */
    int updateByPrimaryKey(T record);
}
