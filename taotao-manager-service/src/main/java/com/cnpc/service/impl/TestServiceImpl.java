package com.cnpc.service.impl;

import com.cnpc.dao.TestDao;
import com.cnpc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public String getTime() {
        return testDao.getTime();
    }
}
