package my.app.first_Project.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class UserInfo {
    private String nickname;
    private String email;
    private boolean trueOrFalse;
    private List<String> hobbies; // 멀티체크박스(취미데이터 얻기)
    private String language; // redio 버튼 (옵션단추) -- 오로지 결과가 1개
    private String country; // Select 리스트
}
