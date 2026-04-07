package io.github.rainbuilt.springboot_learn.dto;

import jakarta.validation.constraints.NotBlank;

public record TodoCreateRequest(
    @NotBlank(message = "제목은 비어있을 수 없습니다.")
    String title
) {}
