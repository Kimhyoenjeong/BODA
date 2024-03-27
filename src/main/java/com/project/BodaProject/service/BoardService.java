package com.project.BodaProject.service;

import com.project.BodaProject.domain.board.BoardEntity;
import com.project.BodaProject.dto.BoardDto;
import com.project.BodaProject.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardDto register(BoardDto boardDto) {
        return entityToDto(boardRepository.save(dtoToEntity(boardDto)));
    }

    private BoardEntity dtoToEntity(BoardDto boardDto) {
        var entity = BoardEntity.builder()
                .name(boardDto.getName())
                .no(boardDto.getNo())
                .title(boardDto.getTitle())
                .CreateT(boardDto.getCreateT())
                .ModifyT(boardDto.getModifyT())
                .content(boardDto.getContent())
                .build();
        return entity;
    }

    private BoardDto entityToDto(BoardEntity boardEntity){
        var dto = BoardDto.builder()
                .no(boardEntity.getNo())
                .name(boardEntity.getName())
                .title(boardEntity.getTitle())
                .content(boardEntity.getContent())
                .ModifyT(boardEntity.getModifyT())
                .CreateT(boardEntity.getCreateT())
                .build();
        return dto;
    }

}
