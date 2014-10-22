package ppp.ui;

/**
 * Created by davidpark on 3/10/14.
 */
public abstract class UI
{

    protected String userType;



    public UI() {
        // TODO Auto-generated constructor stub
    }

    public UI(String userType)
    {
        super();
        this.userType = userType;

    }

    public abstract void start();
    public abstract void userTypeConverter(String userType);
    public abstract void adminWindow();
    public abstract void recepWindow();
    public abstract void cusWindow();
}
