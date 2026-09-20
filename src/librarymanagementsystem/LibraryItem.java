package librarymanagementsystem;

public class LibraryItem {
    public String ItemId;
    public String Title;
    public boolean IsAvailable;

    void BorrowItem()
    {

    }
    void ReturnItem()
    {

    }
    void ShowDetails()
    {

    }
}

class Book extends LibraryItem{
    String Author;

    @Override
    void ShowDetails()
    {
        super.ShowDetails();
        System.out.println("Author: "+Author);
    }


}
class Magazine extends LibraryItem{
    String IssueNO;

    @Override
    void ShowDetails()
    {
        super.ShowDetails();
        System.out.println("Issue Number: "+IssueNO);
    }


}
