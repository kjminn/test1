package kr.ac.kopo.test1.repository;

import kr.ac.kopo.test1.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
