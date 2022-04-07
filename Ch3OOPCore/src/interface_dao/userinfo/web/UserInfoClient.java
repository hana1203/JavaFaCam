package interface_dao.userinfo.web;

import interface_dao.userinfo.domain.userinfo.UserInfo;
import interface_dao.userinfo.domain.userinfo.dao.UserInfoDao;
import interface_dao.userinfo.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import interface_dao.userinfo.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//UserInfoDao 인터페이스 활용하는 클라이언트 프로그램
//파일에서 읽어서 DB type 이 오라클이면 오라클로 mySQL 버전으로 돌아가게 하기
public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        //파일을 읽는다
        FileInputStream fis = new FileInputStream("/Users/hana/IdeaProjects/JavaFaCam/Ch3OOPCore/db.properties");
        //그냥 db.properties 로 불러오면 java.io.FileNotFoundException: No such file or directory 에러나서 full path 를 넣어줌.

        //쌍으로 되어있는 key value 를 읽을 수 있는 객체
        Properties prop = new Properties();
        prop.load(fis);
        //exception 처리하라고 빨간 전구뜨면 method 에 throw exception.
        //두개 쌍으로 되어있는 값을 따로따로 읽어서 이 값을 주면 실질적인 값을 리턴해준다.

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("jazz12");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("name");

        //인터페이스 UserInfoDao 를 갖다쓰기
        //어떤 userInfo 를 쓸지 안정해져있으니 처음에는 null 으로 인터페이스 타입 선언.
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
