package com.greedy.section01.javconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.greedy.section01.javconfig.MemberDAO;

//@Configuration
///*basePackage의 기본 설정 경로를 지정하 useDeaultFilter를 false로 하면 모든 어노테이션을 스캔하지 않는다
// * 이 때 스캔 랑 대상 클래스만 따로 지정 할 수 있다.*/
//@ComponentScan(basePackages="com.greedy.section01.javcinfig",
//				useDefaultFilters=false,	//모두 무시함!!
//			    includeFilters= {@ComponentScan.Filter(
//			    										/*exclude 필터 설정 방식과 동일 */
//			    										type=FilterType.ASSIGNABLE_TYPE,
//			    										classes= {MemberDAO.class}
//			    		)
//			    		
//			    }
//		)
public class ContextConfiguration3 {

}
