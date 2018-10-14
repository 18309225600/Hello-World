package lhf.test01.a1.Interface;

import lhf.test01.a1.Gender;

/**
 * 封装了类最基本的属性操作接口
 */
public interface IUserBO {

    Integer getUserId();

    void setUserId(Integer userId);

    String getUserName() ;

    void setUserName(String userName);

    Gender getGender() ;

    void setGender(Gender gender);

    String getPhone() ;

    void setPhone(String phone) ;
}
