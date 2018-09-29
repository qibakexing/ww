package com.lfx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.lfx.domain.CiShu;
import com.lfx.mapper.CiShuDao;
import com.lfx.service.CiShuService;

public class CiShuServiceImpl implements CiShuService {

	@Autowired
	private CiShuDao dao;

	@Override
	public boolean insert(CiShu cishu) {
		// TODO Auto-generated method stub
		return dao.insert(cishu) > 0;
	}

	@Override
	public boolean update(CiShu cishu) {
		// TODO Auto-generated method stub
		return dao.update(cishu) > 0;
	}

}
