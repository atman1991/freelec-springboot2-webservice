package com.jojoldu.book.springboot.domain.user;

public enum Role {
    GUEST("ROLE_GEUST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private String key;
    private String title;

    Role() {}

    Role(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }
}
