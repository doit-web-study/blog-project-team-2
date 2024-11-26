package doit.blog.Repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLoginId(String  loginId);

    User findByLoginIdAndPassword(String loginId, String password);
}
