package sec07.exam01_generic_extends_implements;

public class ChildProduct <T,M,K>extends Product<T,M> { //M cannot be resolved to a type
// 타입 파라미터 자식에서 추가 가능
	private K company;

	public K getCompany() {
		return company;
	}

	public void setCompany(K company) {
		this.company = company;
	}
	
	
}
