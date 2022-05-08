import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalcTest {
    Calc calc = new Calc();

    @BeforeMethod(groups = {"AddSub", "Calc"})
    public void start() {
        System.out.println("Running test");
    }

    @AfterMethod(groups = {"AddSub", "Calc"})
    public void end() {
        System.out.println("Test done");
    }

    @Test(groups = {"AddSub", "Calc"})
    void addTest() {
        Assert.assertEquals(6, Calc.sum(2, 4));
    }

    @Test(priority = 1, groups = {"AddSub", "Calc"})
    void subTest() {
        Assert.assertEquals(2, Calc.subtraction(4, 2));
    }

    @Test(groups = {"Calc"})
    void multiTest() {
        Assert.assertEquals(8, Calc.multiplication(4, 2));
    }

    @Test(dataProvider="getData")
    public void counting(String nummer){
        System.out.println("This is number" + nummer);
        Assert.assertEquals(1, nummer, "Output did match!");
    }


    @DataProvider
    public Object[][] getData(){

        Object[][] data = new Object[2][2];
        data[0][0] = "1";
        data[0][1] = "2";
        data[1][0] = "3";
        data[1][1] = "4";

        return data;
    }


}