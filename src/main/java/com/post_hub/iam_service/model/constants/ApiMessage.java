package com.post_hub.iam_service.model.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public enum ApiMessage {
    TOKEN_CREATED_OR_UPDATED("User's token has been created or updated"),
    ;

    private final String message;
}
