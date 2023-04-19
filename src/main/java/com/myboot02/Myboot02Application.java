package com.myboot02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootConfiguration ,@EnableAutoConfiguration, @ComponentScan �̰� 3���� �߿�

//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Inherited

//@SpringBootConfiguration //������ ȯ�漳�� �� Ŭ������ ǥ���ϱ� ���� ����� @Configuration�� �����ϴ�.

//@Configuration �ֳ����̼��� �ڹ� ������ �����ϰ� �ִ� �ڹ� ���� Ŭ������ �����ϴµ� ����Ѵ�.
//������ �����ӿ�ũ�� ���� �ڹ� ���� Ŭ������ ��ĵ�ϴ� @ComponentScan�� �ڹ� ���� Ŭ������ ����Ʈ�ϴ� @Import �ֳ����̼�(��õ� �������� �ڹ� ���� Ŭ������ �ϳ��� �׷����� ���� ����, ����� ���� ���� ����)�� �����Ѵ�.

//�� ���� Ŭ������ �����ϸ� ���� ��Ĺ�� �����ǰ� ������ ����� �� ���ø����̼��� �� ������, ������ ������ ���̶� �������� ������ �ʿ���, �׷����� ���� �����ϵ��� �ϴ� ����  @SpringBootApplication
//@EnableAutoConfiguration //������ ��Ʈ�� ���̺귯�� ������ ��ư�, ������ �����ϹǷ� �ʺ� �����ڵ��� ����� �Ѵ�. �׷��� ������ ��Ʈ�� �̷� ������ ������ �ڵ����� ó���� �ش�.

//@ComponentScan �� ������̼��� �⺻������ main()�޼ҵ尡 ���Ե� Myboot01Application Ŭ������ �����ִ� ��Ű��(com.myboot01)�� ���̽� ��Ű���� �Ͽ� �� ����� ó��
// 		|������ ��Ű�� ��ο� ���Ե� �ڹ� ���� Ŭ������� ���׷��� Ÿ�� �ֳ����̼ǵ��� ����� Ŭ������(@Controller, @Service, @Repository, @Component)�� ��ĵ
//�� ��Ʈ ��Ű��(com.myboot01)�� �ƴ� �ٸ� ��Ű���� Ŭ������ �ۼ��ϸ� ������ �����̳ʴ� �ش� Ŭ������ ������ ������� �ʰ� �ȴ�.
//@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })

@EnableAutoConfiguration // �ڵ� ������ ���õ� ������̼�, ������ ��Ʈ�� �� �ܰ�� ������ ��ü���� �ʱ�ȭ ��, �ֳ��ϸ� �� ������ ���� �ʿ��ϹǷ�,
							// BoardController���� MultipartFile ��ü�� �̿��ؼ� ���ε� ������ ��Ʈ�ѷ��� �����ؾ� �Ѵ�. �׷��� ������ ����
							// ���ε� ����� �����ϱ� ���ؼ��� �ݵ�� ����ڰ� ���ε��� ���� ������ MultipartFile ��ü�� ���� �Ǿ�� �ϸ�, �̸� ���ؼ�
							// ��Ƽ��Ʈ������ ��ü�� �ݵ�� �ʿ�, �ΰ��� ��ü ���������� �ʿ�, �ᱹ @ComponentScan�� ���� ���� ��Ʈ�ѷ� ��ü�� �޸𸮿�
							// �ø��� �۾��� ó���ϰ�, @EnableAutoConfiguration�� CommonMultipartResolver�� ���� ��ü���� �޸𸮿�
							// �ø��� �۾��� ó���Ѵ�.
@SpringBootApplication // �� Ŭ������ ������ ��Ʈ�� ���� ���ø����̼��� ���� Ŭ�������� �ǹ�, ���� ������̼ǵ��� �� ������̼ǿ� ���ԵǾ� ����
@ComponentScan(basePackages = { "com.myboot02", "com.ruby" }) // �ٸ� ��Ű���� �ִ� Ŭ�������� ����ϱ� ���� ������̼�, �׻� @Configuration�� �Բ� �Ѵ�.
public class Myboot02Application {

	public static void main(String[] args) { // ������ ��Ʈ�� ���� ���ø����̼��� �����ϱ� ���ؼ� ���� Ŭ������ �ۼ�, Ŭ�������� ������Ʈ �̸�+Application.java
												// ���·� ���� Ŭ������ �ۼ���, ���� ���� Ŭ������ �ۼ����� �ʰ� �� ���α׷��� �����ϸ� �ȴ�.
												// ������ ��Ʈ�� ���� ���ø����̼��� �Ϲ� �ڹ� ���ø����̼����� ������ ���� �ְ� �� ���ø����̼����� ������ ���� �ִ�.
		SpringApplication.run(Myboot02Application.class, args);
	}

}
