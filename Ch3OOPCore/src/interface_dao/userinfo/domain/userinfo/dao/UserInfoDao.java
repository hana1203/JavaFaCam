package interface_dao.userinfo.domain.userinfo.dao;

import interface_dao.userinfo.domain.userinfo.UserInfo;

//User 에대한 DB operation 할때 구현해야 되는 기능은 이거이거다 라고 선언하는 인터페이스.
//선언해놓고 oracle mysql 각 버전에 맞게 구현하면 된다.

//DB 에 회원정보넣는 dao (data access object) 를 여러 DB 에서 지원될 수 있게 구현

public interface UserInfoDao {

    void insertUserInfo(UserInfo userinfo);
    void updateUserInfo(UserInfo userinfo);
    void deleteUserInfo(UserInfo userinfo);
    //매개변수로 따로 따로 받을 수 도있으나 객체로 받음

}
