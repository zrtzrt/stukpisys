package com.sinosoft.stukpisys.servsce.impl;

import com.sinosoft.stukpisys.dao.InfoDao;
import com.sinosoft.stukpisys.dao.ScoreDao;
import com.sinosoft.stukpisys.dao.UserDao;
import com.sinosoft.stukpisys.entity.Education;
import com.sinosoft.stukpisys.entity.ScoreValue;
import com.sinosoft.stukpisys.entity.User;
import com.sinosoft.stukpisys.entity.UserInfo;
import com.sinosoft.stukpisys.servsce.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service
public class HRServiceImpl implements HRService{

    @Autowired
    private InfoDao infoDao;
    @Autowired
    private ScoreDao scoreDao;
    @Autowired
    private UserDao userDao;

    @Override
    public UserInfo getPersonInfoByName(String name) {
        return infoDao.getPersonInfoByName(name);
    }

    @Override
    public List<UserInfo> getUserInfoByState(String state) {
        return infoDao.getInfoByState(state);
    }

    @Override
    public List<UserInfo> getUserIdByhrName(String hrName) {
        return infoDao.getUserIdByhrName(hrName);
    }


    @Override
    public List<UserInfo> getUserByJob(String job) {
        return infoDao.getUserByJob(job);
    }

    @Override
    public List<UserInfo> getUserBySex(String sex) {

        return infoDao.getUserBySex(sex);
    }

    @Override
    public List<UserInfo> getUserByEnterTime(String enterTime) {
        return infoDao.getUserByEnterTime(enterTime);
    }

    @Override
    public List<UserInfo> getUserBySchool(String name) {
        return infoDao.getUserBySchoolName(name);
    }

    @Override
    public List<List<Object>> getUserScoreByStageAndTime(int stage, Date enter_time) {
//        return scoreDao.getUserScoreByStageAndTime(stage,enter_time);
        return null;
    }

    @Override
    public List<UserInfo> getUserByHighestEducate(String educate) {
        return infoDao.getUserByHighestEducate(educate);
    }

    @Override
    public Map<String,Integer> getPopulationBySexDiffer() {
        return  infoDao.getPopulationBySexDiffer();
    }

    @Override
    public List<Map<String,Integer>> getPopulationByEducationDiffer() {
        return infoDao.getPopulationByEducationDiffer();
    }

    @Override
    public List<String> getDifferEducateName() {
        return infoDao.getDifferEducateName();
    }

    @Override
    public List<Map<String,Integer>> getPopulationByMajorDiffer() {
        return infoDao.getPopulationByMajorDiffer();
    }

    @Override
    public List<String> getDifferMajorName() {
        return infoDao.getDifferMajorName();
    }

    @Override
    public Map<String,Integer>  getPopulationByIs211() {
        return infoDao.getPopulationByIs211( );
    }

    @Override
    public List<Map<String,Integer>> getPopulationByLocationDiffer() {
        return infoDao.getPopulationByLocationDiffer();
    }

    @Override
    public List<String> getDifferLocationName() {
        return infoDao.getDifferLocationName();
    }


    @Override
    public List<ScoreValue> getJudgeByParam(String HRName,String job,String school,String Education,String major,boolean sex,boolean isFired,boolean isNew,boolean hasErr,boolean is211)
    {
        String state=null;
        if (isFired==true){
             state="淘汰";
        }else if(isNew==true){
            state="特殊";
        }else{
            state="正常";
        }
        String belong=null;
        if(hasErr==true){
            belong="err";
        }
        return infoDao.getJudgeByParam( HRName,job,school,Education,major, sex,state,belong,is211);
    }

    @Override
    public Education getEduInfoByUserName(String userName) {
        return  infoDao.getEduInfoByUserName(userName);
    }

    @Override
    public List<List<Object>> getScoreFromStageByUser_id(int userId, int stage) {
        return null;
    }

   /* @Override
    public List<List<Object>> getScoreFromStageByUser_id(long userId, int stage) {
        return scoreDao.getScoreFromStageByUser_id(userId,stage);
    }*/

    @Override
    public User getByName(String name) {
        return userDao.getByName(name);
    }

    @Override
    public List<Integer> getScoreList(Integer id) {
        return null;
    }


}
