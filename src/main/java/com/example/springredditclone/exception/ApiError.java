package com.example.springredditclone.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {
    private String path;
    private String message;
    private int statusCode;
    private LocalDateTime time;
}
