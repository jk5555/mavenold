package com.kun.service.impl;

import com.kun.dao.AccountDao;
import com.kun.domain.Account;
import com.kun.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;

    @Override
    public List<Account> findAll() {

        return dao.findAll();
    }
}
