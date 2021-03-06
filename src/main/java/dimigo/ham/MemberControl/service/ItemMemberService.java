package dimigo.ham.MemberControl.service;

import dimigo.ham.MemberControl.domain.ItemMember;
import dimigo.ham.MemberControl.repository.ItemMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;

//@Service
@Transactional
public class ItemMemberService {

    private ItemMemberRepository itemmemberRepository;

    @Autowired
    public ItemMemberService(ItemMemberRepository itemmemberRepository) {
        this.itemmemberRepository = itemmemberRepository;
    }
    public int register(ItemMember m)
    {
        itemmemberRepository.save(m);
        return 0;
    }
}
