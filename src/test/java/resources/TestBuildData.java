package resources;

import pojo.LoginAuthPayload;

public class TestBuildData {
    public LoginAuthPayload logPayload(String userName, String userPwd) {
        LoginAuthPayload logPayload = new LoginAuthPayload();
        logPayload.setUserEmail(userName);
        logPayload.setUserPassword(userPwd);
        return logPayload;
    }

}
