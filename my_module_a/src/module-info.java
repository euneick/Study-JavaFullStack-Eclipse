module my_module_a {
	
	// 특정 패지키를 외부 프로젝트에서 사용 할 수 있도록 exports 키워드를 작성
	exports pack1;
//	exports pack2;
	
	// requires transitive 키워드를 사용해 전의 의존 설정
	requires transitive  my_module_b;
}