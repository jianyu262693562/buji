package cn.itcast.domain;

import java.io.Serializable;

/**
 * 帐户
 */
public class Account {

    private Integer sno;
    private String sname;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Account{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
