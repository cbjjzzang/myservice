package com.sparta.myservice.domain;

import lombok.Getter;

@Getter
public class MemoRequestDto {
    private String username;
    private String title;
    private String contents;
}
