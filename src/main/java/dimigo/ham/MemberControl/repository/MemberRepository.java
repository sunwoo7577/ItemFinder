package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.Member;

import java.util.ArrayList;

public interface MemberRepository {

    Member save(Member member);
    Member findById(int id);
    Member findByName(String name);
    ArrayList<Member> findAll();
}
