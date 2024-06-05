package idusw.springboot.kdhmall.repository;

import idusw.springboot.kdhmall.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogEntity, Long> {
}
