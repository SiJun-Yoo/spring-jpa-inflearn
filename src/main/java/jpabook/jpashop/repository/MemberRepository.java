package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        /*
        굳이 member를 리턴하지 않는이유는 memeber를 리턴하여 발생할수 있는 사이드 이펙트를 예방하기 위해서 이다.
        return을 아무것도 하지 않거나 id정도만 return하여 추후 조회시 활용함
         */
        return member.getId();
    }

    public Member find(Long id){
        return em.find(Member.class,id);
    }
}
