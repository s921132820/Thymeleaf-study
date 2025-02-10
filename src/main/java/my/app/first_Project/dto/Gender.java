package my.app.first_Project.dto;

import lombok.Getter;

@Getter
public enum Gender {
    MALE("남자"), FEMALE("여자");
    private final String description;

    Gender(String description) {
        this.description = description;
    }
}
