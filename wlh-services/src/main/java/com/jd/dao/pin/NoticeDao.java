package com.jd.dao.pin;

import org.apache.ibatis.annotations.Insert;

import com.jd.model.pin.NoticeModel;

public interface NoticeDao {

   @Insert(value = "insert into t_notice(title,notice,remark,operator,operate_time,creator,create_time) values(#{title},#{notice},#{remark},#{operator},now(),#{creator},now())")
   void insert(NoticeModel model);

}
