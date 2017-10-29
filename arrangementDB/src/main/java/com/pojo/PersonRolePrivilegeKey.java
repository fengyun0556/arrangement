package com.pojo;

import java.io.Serializable;

public class PersonRolePrivilegeKey implements Serializable {
    private Byte roleId;

    private Byte privilegeId;

    private static final long serialVersionUID = 1L;

    public Byte getRoleId() {
        return roleId;
    }

    public void setRoleId(Byte roleId) {
        this.roleId = roleId;
    }

    public Byte getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Byte privilegeId) {
        this.privilegeId = privilegeId;
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
        PersonRolePrivilegeKey other = (PersonRolePrivilegeKey) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getPrivilegeId() == null ? other.getPrivilegeId() == null : this.getPrivilegeId().equals(other.getPrivilegeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getPrivilegeId() == null) ? 0 : getPrivilegeId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", privilegeId=").append(privilegeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}