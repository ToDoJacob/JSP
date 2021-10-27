package co.micol.board.notice.service;

import java.util.List;

public interface NoticeService {
	//	기본 crud집어넣어야함
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
}
