package com.myboot02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myboot02.domain.BoardVO;

//@RestController�� JSP ���� ��(View)�� ������ ������ �ʴ� ��� ��Ʈ�ѷ� �޼��尡 ������ ������ ��ü�� Ŭ���̾�Ʈ�� �����Ѵ�.
//Ŭ���̾�Ʈ�� ���޵Ǵ� �����ʹ� ��κ� ���ڿ��̰ų� VO(Value Object)�� �÷��� ������ �ڹ� ��ü��,
//�ڹ� ��ü�� ���޵Ǵ� ��쿡�� �ڵ������� JSON���� ��ȯ�Ͽ� ó���ϰ� �ȴ�.
@RestController //REST ��Ʈ�ѷ��� ����ϸ� ���ϵǴ� ���ڿ��� �������� �״�� ��µǱ� ������ ������ View ȭ���� ���� �ʿ䰡 ����.
public class BoardController {

	public BoardController() {
		System.out.println("===> BoardController ����");
	}
	
	@GetMapping("/hi") //������ @RequestMapping(value="/hi", method = RequestMethod.GET) �̰Ŷ� ������ ����
	public String hello(String id) {
		return "Hi : "+id;
	}
	
	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		BoardVO board=new BoardVO();
		board.setSeq(1);
		board.setTitle("�׽�Ʈ ����");
		board.setWriter("�׽���");
		board.setContent("�׽�Ʈ ����");
		board.setCreateDate(new Date());
		board.setCnt(0);
		
		
		
		return board;
	}
	
	@GetMapping("/getBoardList")
	public List getBoardList() {
		
		List<BoardVO> boardList=new ArrayList<BoardVO>();
		
		for(int i=1;i<=10;i++) {
		
			BoardVO board=new BoardVO();
			board.setSeq(i);
			board.setTitle("�׽�Ʈ ����"+i);
			board.setWriter("�׽���"+i);
			board.setContent("�׽�Ʈ ����"+i*i+"zzzzzzzzzzasdasdzzzzz");
			board.setCreateDate(new Date());
			board.setCnt(0);
			boardList.add(board);
		}
		System.out.println("����");

		return boardList;
	}
}
