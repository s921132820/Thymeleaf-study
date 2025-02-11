package my.app.first_Project.dto;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum Email {
    NAVER("@naver.com"),
    GOOGLE("@gmail.com"),
    KAKAO("@kakao.com");
    private final String description;

    Email(String description) {
        this.description = description;
    }
}

