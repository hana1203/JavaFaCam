package interface_dao.userinfo.domain.userinfo.dao.mysql;

import interface_dao.userinfo.domain.userinfo.UserInfo;
import interface_dao.userinfo.domain.userinfo.dao.UserInfoDao;

//UserInfoDao 인터페이스를 구현한 Mysql 버전의 dao
public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userinfo) {
        System.out.println("Insert into MySQL DB userID = " +userinfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userinfo) {
        System.out.println("Update into MySQL DB userID = " +userinfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userinfo) {
        System.out.println("Delete from MySQL DB userID = " +userinfo.getUserId());
    }
}
