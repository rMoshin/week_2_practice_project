package exercise1;

public class Driver {

	public static void main(String[] args) {
		Singers s = new Singers();
		
		System.out.println("Singer's ID: " + s.getSingerID());
		System.out.println("Singer's Name: " + s.getSingerName());
		System.out.println("Singer's Address: " + s.getSingerAddress());
		System.out.println("Singer's Birthdate: " + s.getSingerBirthDate());
		System.out.println("No of Albums published by Singer: " + s.getNoOfAlbumsPublished());
		
		
		
		s.setSingerID(2);
		s.setSingerName("Taylor Swift");
		s.setSingerAddress("America");
		s.setSingerBirthDate("13th December 1989");
		s.setNoOfAlbumsPublished(15);
		
		System.out.println();
		
		System.out.println("Singer's ID: " + s.getSingerID());
		System.out.println("Singer's Name: " + s.getSingerName());
		System.out.println("Singer's Address: " + s.getSingerAddress());
		System.out.println("Singer's Birthdate: " + s.getSingerBirthDate());
		System.out.println("No of Albums published by Singer: " + s.getNoOfAlbumsPublished());
	}

}
