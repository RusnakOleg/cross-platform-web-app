package edu.rusnak.demo.teammember;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface TeamMemberRepository extends CrudRepository<TeamMember, TeamMemberId>, TeamMemberRepositoryCustom {
}
