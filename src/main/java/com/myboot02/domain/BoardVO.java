package com.myboot02.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//@Data : @Getter, @Setter, @RequiredArgsConstructor(��� ��� ������ �ʱ�ȭ�ϴ� �����ڸ� ������ش�.), 
//@ToString, @EqualsAndHashCode(equals(), hashCode() �޼��带 ������ش�.) ��θ� �����Ѵ�.

@Getter //getter �޼ҵ带 ����� �ش�.
@Setter //setter �޼ҵ带 ����� �ش�.
@ToString //��� ��������� ���� ���ڿ��� �����Ͽ� �����ϴ� toString �޼ҵ带 ����� �ش�.
public class BoardVO {

	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date createDate;
	private int cnt=0;
	
}
