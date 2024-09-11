module my_application_3 {
	
	/**
	 * module 파일이지만 jar로 배포했기 때문에
	 * build path - configure build path - Libraries 탭에서 jar 파일 선택 후 적용
	 * requires 키워드를 사용해 의존 설정
	 */
	requires my_module_a;
	requires my_module_b;
}