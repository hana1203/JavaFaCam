package interface_dao.userinfo.domain.userinfo.dao.oracle;

import interface_dao.userinfo.UserInfo;
import interface_dao.userinfo.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userinfo) {
        System.out.println("Insert into ORACLE DB userID =" +userinfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userinfo) {
        System.out.println("Update into ORACLE DB userID =" +userinfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userinfo) {
        System.out.println("Delete from ORACLE DB userID =" +userinfo.getUserId());
    }
}
