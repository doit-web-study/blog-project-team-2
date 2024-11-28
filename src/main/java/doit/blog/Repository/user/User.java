package doit.blog.Repository.user;


import doit.blog.Repository.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import jakarta.persistence.OneToMany; //1:n관계
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본생성자 Lombok
@Getter
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //nullable = false는 이 열이 NULL값 허용 안한다는거
    //unique=true는 데이터 베이스 내에서 이 값이 유일해야함

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false,unique = true) //고유값
    private String loginId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true) //마찬가지
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
