package com.fsoft.classobjectexample;

public class Account {
		private int id;
		private String name;
		public static final int MAX_SECONDS = 25;
		
		/**
		 * @return the maxSeconds
		 */
		public static int getMaxSeconds() {
			return MAX_SECONDS;
		}

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

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
