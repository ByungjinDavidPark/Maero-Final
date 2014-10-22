package ppp.model;

/**
 * Created by davidpark on 15/10/14.
 */
public class Book
{

    private String title;
    private String author;
    private String isbn;
    private String publication;
    private int subjectId;
    private int genreID;
    private String purchaseDate;
    private String shopName;
    private Double price;
    private String detail;
    private String status;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getPublication()
    {
        return publication;
    }

    public void setPublication(String publication)
    {
        this.publication = publication;
    }

    public int getSubjectId()
    {
        return subjectId;
    }

    public void setSubjectId(int subjectId)
    {
        this.subjectId = subjectId;
    }

    public int getGenreID()
    {
        return genreID;
    }

    public void setGenreID(int genreID)
    {
        this.genreID = genreID;
    }

    public String getPurchaseDate()
    {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }

    public String getShopName()
    {
        return shopName;
    }

    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public String getDetail()
    {
        return detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public Book(String title, String author, String isbn, String publication, int subjectId, int genreID, String purchaseDate, String shopName, Double price, String detail, String status)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publication = publication;
        this.subjectId = subjectId;
        this.genreID = genreID;
        this.purchaseDate = purchaseDate;
        this.shopName = shopName;
        this.price = price;
        this.detail = detail;
        this.status = status;



    }
}