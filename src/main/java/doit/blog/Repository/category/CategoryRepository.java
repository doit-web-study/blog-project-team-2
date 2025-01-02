package doit.blog.Repository.category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    default Category getById(Long categoryId){
        return this.findById(categoryId)
                .orElseThrow(()->new IllegalArgumentException("id에 맞는 카테고리가 없습니다."));
    }
}
