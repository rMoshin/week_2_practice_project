package exercise1;

public class Singers {
	private int singerID;
	private String singerName;
	private String singerAddress;
	private String singerBirthDate;
	private int noOfAlbumsPublished;
	
	public Singers()
	{
		singerID = 0;
		singerName = "Hiroko Moriguhi";
		singerAddress = "Japan";
		singerBirthDate = "13th June 1968";
		noOfAlbumsPublished = 10;
	}
	
	public Singers(int singerID)
	{
		this.singerID = singerID;
		singerName = "Hiroko Moriguhi";
		singerAddress = "Japan";
		singerBirthDate = "13th June 1968";
		noOfAlbumsPublished = 10;
	}
	
	public Singers(int singerID, String singerName)
	{	
		this.singerID = singerID;
		this.singerName = singerName;
		singerAddress = "Japan";
		singerBirthDate = "13th June 1968";
		noOfAlbumsPublished = 10;
	}
	
	public Singers(int singerID, String singerName, String singerAddress)
	{
		this.singerID = singerID;
		this.singerName = singerName;
		this.singerAddress = singerAddress;
		singerBirthDate = "13th June 1968";
		noOfAlbumsPublished = 10;
	}
	
	public Singers(int singerID, String singerName, String singerAddress, String singerBirthDate)
	{
		this.singerID = singerID;
		this.singerName = singerName;
		this.singerAddress = singerAddress;
		this.singerBirthDate = singerBirthDate;
		noOfAlbumsPublished = 10;
	}
	
	public Singers(int singerID, String singerName, String singerAddress, String singerBirthDate, int noOfAlbumsPublished)
	{
		this.singerID = singerID;
		this.singerName = singerName;
		this.singerAddress = singerAddress;
		this.singerBirthDate = singerBirthDate;
		this.noOfAlbumsPublished = noOfAlbumsPublished;
	}
}
