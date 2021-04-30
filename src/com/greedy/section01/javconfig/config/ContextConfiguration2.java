package com.greedy.section01.javconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.greedy.section01.javconfig.MemberDAO;

//@Configuration
//@ComponentScan(basePackages="com.greedy.section01.javconfig",
//			   excludeFilters= {
//					   @ComponentScan.Filter(
//							   /* 1 타입으로 설정  타입으로 제외*/
////							   	type=FilterType.ASSIGNABLE_TYPE,
////							   	classes= {MemberDAO.class}
//							   	
//							   	/*2. 어노테이션 종류로 설정 컴포넌트이면 제외해라 */
////							   	type=FilterType.ANNOTATION,
////							   	classes= {org.springframework.stereotype.Component.class}
//							   /*3. 표현식으로 설정  com.greedy.section01.* 이런 패키지명으로 된 경우 제외  */
////							   type=FilterType.REGEX,
////							   pattern= {"com.greedy.section01.*"}
//							   /*4.ASPECTJ : 포인트컷 표션식으로 클래스를 매치하는 용도 */
//							   
//							   )
//			   })
public class ContextConfiguration2 {

}
