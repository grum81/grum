package com.scottishpower.grum.mapper;

import java.util.List;

import com.scottishpower.grum.domain.Contact;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;;

@Mapper
public interface ContactMapper {

	@Results({
        @Result(property = "firstName", column = "first_name"),
        @Result(property = "lastName", column = "last_name"),
        @Result(property = "businessUnit", column = "business_unit"),
        @Result(property = "emailAddress", column = "email_address"),
        @Result(property = "externalTelephoneNo", column = "external_telephone_no"),
        @Result(property = "internalTelephoneNo", column = "internal_telephone_no"),
        @Result(property = "mobileNo", column = "mobile_no")
    })    
    @Select("SELECT id, first_name, last_name, company, business_unit, department, team, email_address, external_telephone_no, internal_telephone_no, mobile_no FROM contacts")
    List<Contact> getAll();

    @Results({
        @Result(property = "firstName", column = "first_name"),
        @Result(property = "lastName", column = "last_name"),
        @Result(property = "businessUnit", column = "business_unit"),
        @Result(property = "emailAddress", column = "email_address"),
        @Result(property = "externalTelephoneNo", column = "external_telephone_no"),
        @Result(property = "internalTelephoneNo", column = "internal_telephone_no"),
        @Result(property = "mobileNo", column = "mobile_no")
    })
    @Select("SELECT id, first_name, last_name, company, business_unit, department, team, email_address, external_telephone_no, internal_telephone_no, mobile_no FROM contacts WHERE id = #{id}")
    Contact findById(Long id);

    @Insert("INSERT INTO contacts (first_name, last_name, company, business_unit, department, team, email_address, external_telephone_no, internal_telephone_no, mobile_no) VALUES (#{firstName}, #{lastName}, #{company}, #{businessUnit}, #{department}, #{team}, #{emailAddress}, #{externalTelephoneNo}, #{internalTelephoneNo}, #{mobileNo})")
    void create(Contact contact);

    @Update("UPDATE contacts SET first_name = #{firstName}, last_name = #{lastName}, company = #{company}, business_unit = #{businessUnit}, department = #{department}, team = #{team}, email_address = #{emailAddress}, external_telephone_no = #{externalTelephoneNo}, internal_telephone_no = #{internalTelephoneNo}, mobile_no = #{mobileNo} WHERE id = #{id}")
    void update(Contact contact);
    
    @Delete("DELETE FROM contacts WHERE id = #{id}")
    void delete(Long id);
}