
/**
 * 여러 전의 모듈을 포함하는 집합 모듈 my_module 정의
 */
module my_module {
	
	requires transitive my_module_a;
	requires transitive my_module_b;
}