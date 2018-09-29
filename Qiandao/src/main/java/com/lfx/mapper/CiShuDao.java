package com.lfx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lfx.domain.CiShu;
import com.lfx.domain.User;

public interface CiShuDao {

	// 第一次签到
	@Insert("insert into cishu(tid,uid,one,ontime,two,twotime) values(#{uid},true,now(),false,null)")
	int insert(CiShu cishu);

	// 第二次签到
	@Update("update cishu set two=true twotime=now() where uid=#{uid}")
	int update(CiShu cishu);

	// 查询
	@Select("select * from cishu")
	@ResultType(User.class)
	List<User> queryAll();

	/*
	 * @Insert("insert into cishu(tid,uid,one,oneime) values(#{uid},true,now())")
	 * int insert1(User user);
	 * 
	 * @Insert("insert into cishu(tid,uid,two,twoime) values(#{uid},true,now())")
	 * int insert1(User user);
	 */

}
