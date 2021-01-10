package chap08.verify.pro4;

public class OracleDao implements DataAccessObject {

		@Override
	public void select() {
		System.out.println("Search on Oracle");
	}

		@Override
	public void insert() {
			System.out.println("Insert on Oralce");
	}

		@Override
	public void update() {
			System.out.println("Update from Oracle");
	}

		@Override
	public void delete() {
			System.out.println("Delete from Oralce");
	}

}
