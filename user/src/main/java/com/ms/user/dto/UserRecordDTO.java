package com.ms.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

public record UserRecordDTO(@NotBlank String name,
                            @NotBlank @Email String email) {
}
