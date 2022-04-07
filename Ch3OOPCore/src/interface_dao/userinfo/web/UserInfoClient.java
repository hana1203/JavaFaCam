package interface_dao.userinfo.web;

import interface_dao.userinfo.UserInfo;
import interface_dao.userinfo.domain.userinfo.dao.UserInfoDao;
import interface_dao.userinfo.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import interface_dao.userinfo.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//파일에서 읽어서 DB type 이 오라클이면 오라클로 mySQL 버전으로 돌아가게
public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        //파일을 읽는다
        FileInputStream fis = new FileInputStream("../db.properties");

        //쌍으로 되어있는 key value 를 읽을 수 있는 객체
        Properties prop = new Properties();
        prop.load(fis);
        //exception 처리하라고 빨간 전구뜨면 method 에 throw exception.
        //두개 쌍으로 되어있는 값을 따로따로 읽어서 이 값을 주면 실질적인 값을 리턴해준다.

        String dbType = prop.getProperty("DBTYPE");
        UserInfo userInfo = new UserInfo();

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        }
        else {
            System.out.println("db error");
            return;
        }


        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
