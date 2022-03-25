
public class Student {

	public static Student find(String id) throws Exception {
		if(id.equals("123")) {
			return new Student();
		}else {
			throw new StudentException("Öðrenci Bulunamadý ");
		}
		
	}
	
}
