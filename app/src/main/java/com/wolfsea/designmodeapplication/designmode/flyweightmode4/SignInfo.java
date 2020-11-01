package com.wolfsea.designmodeapplication.designmode.flyweightmode4;

/**
 * @author liuliheng
 * @desc  实体类
 * @time 2020/11/1  10:51
 **/
public class SignInfo {

    private String id;

    private ExtrinsicState extrinsicState;

    private String postAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExtrinsicState getExtrinsicState() {
        return extrinsicState;
    }

    public void setExtrinsicState(ExtrinsicState extrinsicState) {
        this.extrinsicState = extrinsicState;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
