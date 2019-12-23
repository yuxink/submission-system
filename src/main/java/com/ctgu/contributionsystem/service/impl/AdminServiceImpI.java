package com.ctgu.contributionsystem.service.impl;

import com.ctgu.contributionsystem.dao.AdminDao;
import com.ctgu.contributionsystem.dao.DtoDao;
import com.ctgu.contributionsystem.dao.SpecialistDao;
import com.ctgu.contributionsystem.dto.SpecialCount;
import com.ctgu.contributionsystem.model.Admin;
import com.ctgu.contributionsystem.model.Specialist;
import com.ctgu.contributionsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : kun
 * @date ： 2019/12/21
 * @description ：this is a code
 **/

@Service
public class AdminServiceImpI implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private SpecialistDao specialistDao;


    @Override
    public List<Specialist> findAll(){
        return specialistDao.findAll();
    }

    @Override
    public Integer updateSpecialitProhibit1(Integer specialistId){
        return specialistDao.UpdateSpecialit1(specialistId);
    }

    @Override
    public void delete(Integer specialistId){
        specialistDao.deleteById(specialistId);
    }

    @Override
    public Integer Updatestatus(Integer specialistId,Integer status){
        return specialistDao.UpdateStatus(specialistId,status);
    }

    @Override
    public Integer UpdateCategory(Integer specialistId,Integer category){
        return specialistDao.UpdateCategory(specialistId,category);
    }

    @Override
    public Integer updateSpecialitProhibit(Integer specialistId){
        return specialistDao.UpdateSpecialit(specialistId);
    }

    @Override
    public Admin findByPhoneNumber(String phoneNumber) {
        return adminDao.findByPhoneNumber(phoneNumber);
    }
}
