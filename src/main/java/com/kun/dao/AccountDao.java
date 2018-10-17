package com.kun.dao;

import com.kun.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();
}
