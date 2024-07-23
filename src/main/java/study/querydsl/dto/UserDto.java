package study.querydsl.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    private String ame;
    private int age;

    public UserDto(String ame, int age) {
        this.ame = ame;
        this.age = age;
    }
}
