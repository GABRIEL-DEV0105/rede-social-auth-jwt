package tech.buildrun.springsecurity.model.enums.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
