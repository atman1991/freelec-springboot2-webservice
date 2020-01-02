package com.jojoldu.book.springboot.web.dto;

public class HelloResponseDto {
    private String name;
    private int amount;

    public HelloResponseDto() {}

    public HelloResponseDto(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
