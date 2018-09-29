package com.lfx.service;

import com.lfx.domain.CiShu;

public interface CiShuService {

	// 一次
	boolean insert(CiShu cishu);

	// 二次
	public boolean update(CiShu cishu);
}
