package com.greedy.section01.javconfig;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/* 인터페이스로 메소드를 강제화한후 구현 하여 사용하면 강제성이 부여된다 (규약)
 * 또한 결합관ㄱㅖ(의존관계)를 느슨하게 만든다.*/

/* 스프링 컨테이너가 스캐닝 기능을 이용하여 해당 클래스를 bean으로 등록 할수 있도록 어노테이션을 설정한다
 * value 속성을 이용하여 bean 의 id를 설정할 수 있으며 , value는 생략 가능 하다
 * 이름 (id) 를 설정하지 않으면 class의 앞글자를 소문자로 하여 bean을 생성한다.
 * @Conrtoller ,@Service ,@ Repository 와 동일한 기능을 가지지만 각 계층을 표현하는 어노테이션은 
 * 특정 용도에 맞는 부가 적인 혜택이 있으니 계층별로 구분아여 사용하는 것이 좋다
 * @Conponent :  스프링에서 관리되는 객체임을 표시하기 위해 사용하나 가장 기본적인 어노테이션이다
 * @Controller : Web MVC 코드내에서 사용되는 어노테이션으로 @RequestMapping 에노테이션ㅇ은 해당 어노테이션이 
 * 				작성된 클래스 내에서만 사용가능하다
 * @Service :  비지니스 로직이 작성된 클래스에 사용한다 추가 적인 기능은 없지나만 추가 적인 기능을 제공할 가능성이 있으니
 * 				계층을 명시할 때 사용한다.
 * @Repository : 플랫폼별 예외를 포착하여 PersistenceExceptionTranslationPostProcessor 가 
 * 				DateAccessException으로 변환아여 다시 발생
 * 
 * 계층이 명확하지 않은 경우에는 @Component를 사용한다.*/
@Component(value="memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	
	/* DB 연동은 뒤에서 할 예정이고 현제는 테이터가 없으니 필드로 테스트 데이터를 추가 할 것 이다.*/
	private Map<Integer, MemberDTO> memberMap;
	
	public MemberDAOImpl() {
		memberMap = new HashMap<>();
		memberMap.put(1, new MemberDTO(1,"user01","pass01","홍길동"));
		memberMap.put(2, new MemberDTO(2,"user02","pass02","이순신"));
	}
	
	// 회원 번호로 회우너정보를 조회 (map에서 조회 )하는 메소두
	@Override
	public MemberDTO selectMember(int sequence) {
		
		return memberMap.get(sequence);
	}
	
	//회원정보를 정장 (map에 추가)하고 결과(boolean)를 리턴 받는 매소트
	@Override
	public boolean insertMember(MemberDTO newMember) {
		int befor = memberMap.size();
		
		memberMap.put(newMember.getSeqence(), newMember);
		
		int after = memberMap.size();
		
		return (after > befor) ? true : false;
	}

}
