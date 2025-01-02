package doit.blog.Repository.post;

import doit.blog.Repository.category.category
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {


}
