package com.wolfsea.designmodeapplication.designmode.flyweightmode2;

/**
 * @author liuliheng
 * @desc  实体类
 * @time 2020/11/1  10:51
 **/
public class SignInfo {

    private String id;

    private String subject;

    private String location;

    private String postAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
