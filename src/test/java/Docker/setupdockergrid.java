package Docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class setupdockergrid {
	
	
	@BeforeTest
	public void startdockergrid() throws Exception {
		Runtime.getRuntime().exec("cmd /c start start_docker.bat");
		Thread.sleep(25000);
	}
	
	@AfterTest
	public void stopdockergrid() throws Exception {
		Runtime.getRuntime().exec("cmd /c start stop_docker.bat");
		Thread.sleep(15000);
		
		//close the cmd prompt opened
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}

}
