package my.app.first_Project.controller.dto;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserData {
    private String userName;
    private int userAge;
    private String userAddress;

    public UserData(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }
}
