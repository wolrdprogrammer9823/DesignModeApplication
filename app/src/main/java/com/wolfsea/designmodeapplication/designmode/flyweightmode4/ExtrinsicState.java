package com.wolfsea.designmodeapplication.designmode.flyweightmode4;
import java.util.Objects;

/**
 * @author liuliheng
 * @desc  外部实体类
 * @time 2020/11/1  11:52
 **/
public class ExtrinsicState {

    private String subject;

    private String location;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtrinsicState that = (ExtrinsicState) o;
        return Objects.equals(subject, that.subject) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, location);
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
}
