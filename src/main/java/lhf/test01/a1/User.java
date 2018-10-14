package lhf.test01.a1;

import java.io.Serializable;

/**
 * User类的基本属性
 */
public class User implements Serializable {
    private static final long serialVersionUID = -4045720528393911499L;
    private Integer userId;
    private String userName;
    private Gender gender;
    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
