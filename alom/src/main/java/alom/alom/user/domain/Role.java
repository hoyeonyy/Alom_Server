package alom.alom.user.domain;

public enum Role {
    ROLE_ADMIN("임원진"), ROLE_MEMBER("일반회원");

    private String description;

    Role(String description) {
        this.description = description;
    }

}
