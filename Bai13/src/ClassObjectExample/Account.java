package ClassObjectExample;

public class Account {
		int id;
		String name;
		
		@Override
		public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		Account other = (Account) obj; // ép kiểu obj về account
		
		// account1: id, name
		// account2: other
		if(id == other.id && name.equals(other.name)) {
			return true;
		}
		return false;
		}
}
