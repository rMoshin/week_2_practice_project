package exercise1;

public class Singers {
	private int singerID;
	private String singerName;
	private String singerAddress;
	private String singerBirthDate;
	private int noOfAlbumsPublished;
	
	public Singers()
	{
		singerID = 1;
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
	
	public void setSingerID(int singerID)
	{
		this.singerID = singerID;
	}
	
	public int getSingerID()
	{
		return singerID;
	}
	
	public void setSingerName(String singerName)
	{
		this.singerName = singerName;
	}
	
	public String getSingerName()
	{
		return singerName;
	}
	
	public void setSingerAddress(String singerAddress)
	{
		this.singerAddress = singerAddress;
	}
	
	public String getSingerAddress()
	{
		return singerAddress;
	}
	
	public void setSingerBirthDate(String singerBirthDate)
	{
		this.singerBirthDate = singerBirthDate;
	}
	
	public String getSingerBirthDate()
	{
		return singerBirthDate;
	}
	
	public void setNoOfAlbumsPublished(int noOfAlbumsPublished)
	{
		this.noOfAlbumsPublished = noOfAlbumsPublished;
	}
	
	public int getNoOfAlbumsPublished()
	{
		return noOfAlbumsPublished;
	}
	
	public void setAll(int singerID, String singerName, String singerAddress, String singerBirthDate, int noOfAlbumsPublished)
	{
		this.singerID = singerID;
		this.singerName = singerName;
		this.singerAddress = singerAddress;
		this.singerBirthDate = singerBirthDate;
		this.noOfAlbumsPublished = noOfAlbumsPublished;
	}
}
