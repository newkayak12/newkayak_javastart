package chap08.verify.pro4;

public class MySqlDao implements DataAccessObject {

		@Override
	public void select() {
		System.out.println("Search on MySql");
	}

		@Override
	public void insert() {
			System.out.println("Insert on MySql");
	}

		@Override
	public void update() {
			System.out.println("Update from MySql");
	}

		@Override
	public void delete() {
			System.out.println("Delete from MySql");
	}

}
