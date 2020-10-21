package com.wolfsea.designmodeapplication.designmode.adaptermode2;
import com.wolfsea.designmodeapplication.designmode.adaptermode.Constants;
import com.wolfsea.designmodeapplication.designmode.adaptermode.IUserInfo;
import com.wolfsea.designmodeapplication.designmode.adaptermode.OuterUser;

import java.util.Map;

public class OuterUserInfo implements IUserInfo {

    private Map<String, String> baseInfoMap;
    private Map<String, String> homeInfoMap;
    private Map<String, String> officeInfoMap;

    private IUserBaseInfo userBaseInfo;
    private IUserHomeInfo userHomeInfo;
    private IUserOfficeInfo userOfficeInfo;

    public OuterUserInfo(IUserBaseInfo userBaseInfo, IUserHomeInfo userHomeInfo, IUserOfficeInfo userOfficeInfo) {

        this.userBaseInfo = userBaseInfo;
        this.userHomeInfo = userHomeInfo;
        this.userOfficeInfo = userOfficeInfo;

        baseInfoMap = this.userBaseInfo.getUserBaseInfo();
        homeInfoMap = this.userHomeInfo.getUserHomeInfo();
        officeInfoMap = this.userOfficeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {

        String userName = baseInfoMap.get(Constants.USER_NAME);
        System.out.println("userName:" + userName);
        return userName;
    }

    @Override
    public String getMobileNumber() {

        String mobileNumber = baseInfoMap.get(Constants.MOBILE_NUMBER);
        System.out.println("mobileNumber:" + mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getHomeAddress() {

        String homeAddress = homeInfoMap.get(Constants.HOME_ADDRESS);
        System.out.println("homeAddress:" + homeAddress);
        return homeAddress;
    }

    @Override
    public String getHomeTelNumber() {

        String homeTelNumber = homeInfoMap.get(Constants.HOME_TEL_NUMBER);
        System.out.println("homeTelNumber:" + homeTelNumber);
        return homeTelNumber;
    }

    @Override
    public String getJobPosition() {

        String jobPosition = officeInfoMap.get(Constants.JOB_POSITION);
        System.out.println("jobPosition:" + jobPosition);
        return jobPosition;
    }

    @Override
    public String getOfficeTelNumber() {

        String officeTelNumber = homeInfoMap.get(Constants.OFFICE_TEL_NUMBER);
        System.out.println("officeTelNumber:" + officeTelNumber);
        return officeTelNumber;
    }
}
