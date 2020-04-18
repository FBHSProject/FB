package chejian;

import java.util.ArrayList;

public class WorkShop {
	public enum type {
		/**
		 * enum
		 */
		INTESTINE, STOMACH;
	}
	int id;
	int line;
	ArrayList list = new ArrayList();
	public WorkShop(int id, int line, ArrayList list) {
		this.id = id;
		this.line = line;
		this.list = list;
	}
	
	public int getId() {
		return id;
	}
	
	public int getLinst() {
		return this.line;
	}
	
	public ArrayList getlist() {
		return list;
	}
}
