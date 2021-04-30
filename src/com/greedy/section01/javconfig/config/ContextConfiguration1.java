package com.greedy.section01.javconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* 스프링 스캐닝으로 bean으로 등록할  컴포넌트 @Conponent를 달아주며 ,
 * @Configuration도 @Conponent룰 상속받음
 * basePackage에 등록되지 않으 패키지는 스캔에서 제외하고 등록된 패키지 내의 @Conponent 및 @Conponent
 * 를 상속 받은 어노테이션들을 탐색한다.
 * 이때 basePakage를  등록하지 않으면  현 설정 클래스가 존재하는 패키지지를 자동으로 basePackage로 설정 한다.
 * 문자열 배열 형태로 여러 basePackge를 등록 할 수  있다.
 * ex)basePackages={"full-name1" , "full-name2"}*/

//@Configuration
//@ComponentScan(basePackages="com.greedy.section01.javconfig")
//@ComponentScan 을 하면 지정한 페키지의 모든 클래스를 풀스케닝 해서 빈으로 인식을 한다!!!!!
public class ContextConfiguration1 {
	
	/* @ComponentScan은 범위를 커스터마이징 할 수 있다. 다음 예제에서 살펴보자 */

}
