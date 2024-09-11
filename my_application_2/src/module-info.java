module my_application_2 {
	
	/**
	 * build path - configure build path - project - Modulepath 에서
	 * 사용 할 모듈이 있는 프로젝트를 add 하고 적용
	 * requires 키워드를 통해 의존 설정
	 */
//	requires my_module_a;		// 집합 모듈을 사용하기 위해 주석 처리
//	requires my_module_b;		// my_module_a 에서 my_module_b를 전의 의존을 하는지 확인을 위해 주석 처리
	
	requires my_module;			// my_module_a 와 my_module_b 를 모두 전의 의존하고 있는 my_module 의존 설정
}