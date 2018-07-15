package lib.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNGListener implements IAnnotationTransformer, IRetryAnalyzer {
	int maxcount=1;
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(this.getClass());
		if(testMethod.getName().equals("createLead"))
		{
			annotation.setInvocationCount(1);
			annotation.setTimeOut(10000);
		}
		if(testMethod.getName().equals("editLead")) {
			annotation.setEnabled(false);//disables the classes edit than create lead
		}
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess()& maxcount<1)
		{
			maxcount++;	
			return true;
				}
		return false;
	}

}
