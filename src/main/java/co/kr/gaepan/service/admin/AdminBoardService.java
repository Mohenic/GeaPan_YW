package co.kr.gaepan.service.admin;

import co.kr.gaepan.dto.admin.GP_AdminBoardDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public interface AdminBoardService {

    // 게시글 등록
    void saveAdminBoard(GP_AdminBoardDTO dto) throws Exception;
    // 게시글 리스트 보기
    List<GP_AdminBoardDTO> findAll() throws Exception;

    // 게시글 수정
    void modifyAdminBoard(GP_AdminBoardDTO dto) throws Exception;

    // 게시글 삭제
    void deleteAdminBoard(int bno) throws Exception;

    // 게시글 상세보기
    GP_AdminBoardDTO findById(int bno) throws Exception;

    // 게시글 조회수 증가 - cookie를 이용
    void updateViewCnt(
            HttpServletRequest request,
            HttpServletResponse response,
            int bno
            ) throws Exception;

    // 페이징 블럭 정보

    // 통합


}
