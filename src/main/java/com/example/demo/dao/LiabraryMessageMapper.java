package com.example.demo.dao;

import com.example.demo.pojo.LiabraryMessage;

public interface LiabraryMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table liabrarymessage
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String bookname);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table liabrarymessage
     *
     * @mbggenerated
     */
    int insert(LiabraryMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table liabrarymessage
     *
     * @mbggenerated
     */
    int insertSelective(LiabraryMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table liabrarymessage
     *
     * @mbggenerated
     */
    LiabraryMessage selectByPrimaryKey(String bookname);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table liabrarymessage
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LiabraryMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table liabrarymessage
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LiabraryMessage record);
}