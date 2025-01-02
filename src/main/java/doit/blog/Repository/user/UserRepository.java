package doit.blog.Repository.user;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long> {
    //JpaRepository<User, Long>:Spring Data JPA에서 제공하는 인터페이스. 기본 CRUD 메서드를 사용
    Optional<User> findByLoginId(String logidId);
    Optional<User> findByLoginIdAndPassword(String loginId, String password);

    default User getById(Long userId) {
        return this.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("해당 id의 유저가 없습니다."));
    }

    default boolean existsByLoginId(String loginId) {
        return this.findByLoginId(loginId).isPresent();
    }

    default User getByLoginIdAndPassword(String loginId, String password) {
        return this.findByLoginIdAndPassword(loginId, password)
                .orElseThrow(() -> new IllegalArgumentException("아이디 혹은 비밀번호가 일치하지 않습니다."));
    }

}
