package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable,Cloneable {
    private Long id;

    private String loginName;

    private String operatemessage;

    private Date operatedate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getOperatemessage() {
        return operatemessage;
    }

    public void setOperatemessage(String operatemessage) {
        this.operatemessage = operatemessage == null ? null : operatemessage.trim();
    }

    public Date getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(Date operatedate) {
        this.operatedate = operatedate;
    }

    
    @Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Log other = (Log) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getOperatemessage() == null ? other.getOperatemessage() == null : this.getOperatemessage().equals(other.getOperatemessage()))
            && (this.getOperatedate() == null ? other.getOperatedate() == null : this.getOperatedate().equals(other.getOperatedate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getOperatemessage() == null) ? 0 : getOperatemessage().hashCode());
        result = prime * result + ((getOperatedate() == null) ? 0 : getOperatedate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginName=").append(loginName);
        sb.append(", operatemessage=").append(operatemessage);
        sb.append(", operatedate=").append(operatedate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}