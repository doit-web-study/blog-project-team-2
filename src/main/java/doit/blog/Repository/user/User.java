package doit.blog.Repository.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String nickname;

    private String loginId;

    private String password;

    private String phoneNumber;

    @Builder
    public User(Long id, String name, String nickname, String loginId, String password, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.loginId = loginId;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
