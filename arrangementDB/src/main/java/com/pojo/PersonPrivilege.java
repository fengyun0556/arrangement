package com.pojo;

import java.io.Serializable;

public class PersonPrivilege implements Serializable {
    private Byte privilegeId;

    private String privilegeName;

    private static final long serialVersionUID = 1L;

    public Byte getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Byte privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
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
        PersonPrivilege other = (PersonPrivilege) that;
        return (this.getPrivilegeId() == null ? other.getPrivilegeId() == null : this.getPrivilegeId().equals(other.getPrivilegeId()))
            && (this.getPrivilegeName() == null ? other.getPrivilegeName() == null : this.getPrivilegeName().equals(other.getPrivilegeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrivilegeId() == null) ? 0 : getPrivilegeId().hashCode());
        result = prime * result + ((getPrivilegeName() == null) ? 0 : getPrivilegeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", privilegeId=").append(privilegeId);
        sb.append(", privilegeName=").append(privilegeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}