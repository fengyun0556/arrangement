package com.pojo;

import java.io.Serializable;

public class PersonPrivilegeFunctionKey implements Serializable {
    private Byte privilegeId;

    private Byte functionId;

    private static final long serialVersionUID = 1L;

    public Byte getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Byte privilegeId) {
        this.privilegeId = privilegeId;
    }

    public Byte getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Byte functionId) {
        this.functionId = functionId;
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
        PersonPrivilegeFunctionKey other = (PersonPrivilegeFunctionKey) that;
        return (this.getPrivilegeId() == null ? other.getPrivilegeId() == null : this.getPrivilegeId().equals(other.getPrivilegeId()))
            && (this.getFunctionId() == null ? other.getFunctionId() == null : this.getFunctionId().equals(other.getFunctionId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrivilegeId() == null) ? 0 : getPrivilegeId().hashCode());
        result = prime * result + ((getFunctionId() == null) ? 0 : getFunctionId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", privilegeId=").append(privilegeId);
        sb.append(", functionId=").append(functionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}