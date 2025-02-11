package my.app.first_Project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignupInfo {
    private String userId;
    private String password;
    private String confirmPassword;
    private String userName;
    private LocalDate birth;
    private Gender gender;
    private String emailInput; // 이메일 아이디 입력
    private Email email; // 이메일 셀렉트
    private String phone;

}
