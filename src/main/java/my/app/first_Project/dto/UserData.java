package my.app.first_Project.dto;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class UserData {
    private String userName;
    private int userAge;
    private String userAddress;

    public static UserData fromParams(
            String userName,
            int userAge,
            String userAddress
    ) {
        return new UserData(userName, userAge, userAddress);
    }

//    public UserData(String userName, int userAge) {
//        this.userName = userName;
//        this.userAge = userAge;
//    }
}
