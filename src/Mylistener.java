import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Test start");
    }

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test passed");
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test failed" + result);
    }

    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("Test skipped");
    }
}
