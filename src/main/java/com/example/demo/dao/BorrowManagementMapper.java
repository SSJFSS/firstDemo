package com.example.demo.dao;

import com.example.demo.pojo.BorrowManagement;

public interface BorrowManagementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowmanagement
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowmanagement
     *
     * @mbggenerated
     */
    int insert(BorrowManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowmanagement
     *
     * @mbggenerated
     */
    int insertSelective(BorrowManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowmanagement
     *
     * @mbggenerated
     */
    BorrowManagement selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowmanagement
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BorrowManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowmanagement
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BorrowManagement record);
}