import jakarta.persistence.EntityManager;
import me.gayoungkim.springbootdeveloper.member.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;

public class EntityManagerTest {
    @Autowired
    EntityManager em;

    public void example(){
        Member member = new Member(1L, "홍길동"); // 비영속 상태

        em.persist(member); // 관리상태
        em.detach(member);// 분리상태
        em.remove(member); // 삭제상태
    }
}
