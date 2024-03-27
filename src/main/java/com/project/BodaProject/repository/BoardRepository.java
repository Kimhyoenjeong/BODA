package com.project.BodaProject.repository;

import com.project.BodaProject.domain.board.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BoardRepository extends JpaRepository <BoardEntity, Long>{

    // 모든 Board 게시글 조회
    @Query(value = "select b from BoardEntity b")
    List<BoardEntity> findAllBoardEntity();

    // board_name로 조회
    BoardEntity findByName(String name);

    // 해당 글의 이전글(해당 글보다 board_No가 낮은 글들을 내림차순으로 나열해 가장 첫번째 것)  join Member m on b.writer_no = m.mem_no
    @Query(value = "select b.* from board_entity b where b.no = " +
            "(select b.no from board_entity b where b.no < ?1 order by no desc limit 1)"
            , nativeQuery = true)
    BoardEntity findPrevBoardEntityByNo(Long No); // 인자로 받는 boardNo는 기준이 되는 글의 번호

    // 최신 게시글 top 5 조회
//    List<BoardEntity> findTop5ByOrderByCreateTDesc();


    /* 페이지네이션 */
    // 전체 게시글 조회
//    @Query("select count(b) from BoardEntity b")
//    int findCount();

//    @Query(value = "select b.* from board_entity b join Member m on b.writer_no = m.mem_no order by b.id desc limit ?1, ?2"
//            , nativeQuery = true)
//    List<BoardEntity> findBoardEntityListView(int startRow, int boardCntPerPage);

    // 제목 또는 내용으로 검색 결과 조회
//    @Query("select count(b) from BoardEntity b where b.title like %?1% or b.content like %?1%")
//    int findBoardEntitySearchResultTotalCountTC(String titleOrContent);

//    @Query(value = "select b.* from board_entity b where b.title like %?1% or b.content like %?1% order by b.id desc limit ?2, ?3"
//            , nativeQuery = true)
//    List<BoardEntity> findBoardEntityListViewByTitleOrContent(String titleOrContent, int startRow, int boardCntPerPage);

    // '제목 또는 내용'으로 검색(검색창만 두고 조건 선택 X)
//    @Query("select b from BoardNotice b where b.title like %?1% or b.content like %?1%")
//    List<BoardEntity> findByTitleOrContentContaining(String titleOrContent);

}
