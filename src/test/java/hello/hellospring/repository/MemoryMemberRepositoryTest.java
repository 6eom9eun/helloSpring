package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("beomgeun");

        repository.save(member);
        Member rs = repository.findById(member.getId()).get();

        assertEquals(rs, member);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("beomgeun1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("beomgeun2");
        repository.save(member2);

        Member rs = repository.findByName("beomgeun1").get();
        assertEquals(rs, member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("beomgeun1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("beomgeun2");
        repository.save(member2);

        List<Member> rs = repository.findAll();
        assertEquals(2, rs.size());
    }
}