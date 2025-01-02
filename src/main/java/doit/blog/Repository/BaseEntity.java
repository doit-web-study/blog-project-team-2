package doit.blog.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@EntityListeners(AuditingEntityListener.class) //생성/수정 시간을 자동으로 관리
@MappedSuperclass //공통 속성을 여러 엔티티에서 재사용
public abstract class BaseEntity {
    //직접 객체 만드는건 아니고 다른 엔티티에서 상속받아 쓰니까 인스턴스 안 만들라고 abstract

    @CreatedDate //처음 저장될때 필드에 시간 자동 기록
    @Column(updatable = false) //업데이트되지 않도록 제약. 생성 시간 안 수정되게
    protected LocalDateTime createdAt; //@CreatedDate가 현재 시간을 createdAt에 설정

    @LastModifiedDate
    protected LocalDateTime modifiedAt; //@LastModifiedDate가 현재 시간을 modifiedAt에 설정

}
