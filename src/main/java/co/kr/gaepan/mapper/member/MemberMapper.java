package co.kr.gaepan.mapper.member;

import co.kr.gaepan.dto.member.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    public MemberDTO loginUser(String uid);

}
