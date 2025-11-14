package tech.buildrun.springsecurity.model.enums;

public enum UserRoles {
    BASIC(2L),
    ADMIN(1L);

    long roleId;

    UserRoles(long roleId) {
        this.roleId = roleId;
    }

    public long getRoleId() {
        return roleId;
    }
}
