package kr.ac.kopo.test1.repository;

import kr.ac.kopo.test1.entity.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTest {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testInsertDummies(){
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Memo memo = Memo.builder().memoText("Dummie Data " + i).build();
            memoRepository.save(memo);
        });
    }
}
