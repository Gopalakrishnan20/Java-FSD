package pkg5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.JRE;

public class ConditionalTestCases {
	@Test
	@DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
	void notFromJava8to11() {
	   System.out.println("Not Excecute for range java 8 to java 11");
	}

	@Test
	@EnabledForJreRange(min = JRE.JAVA_12, max = JRE.JAVA_17)
	void fromJava12to18() {
		 System.out.println(" Excecute for range java 12 to java 17");
	}
	/*************************************************************************************/
	/*@Test
	@EnabledIf("customConditionalFunction")
	void enabled() {
	    assertTrue(true);
	}
	@Test
	@DisabledIf("customConditionalFunction")
	void disabled() {
	    assertTrue(true);
	}
	boolean customConditionalFunction() {
	    return true;
	}*/
	
/***************************************************************************/
	@Test
	  @EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*")
	  void runOnlyOnOracleJDK() {
	    System.out.println("Run this only on Oracle JDK");
	  }
	@Test
	  @DisabledIfSystemProperty(named = "os.version", matches = ".*10.*")
	  void notRunOnlyOnWindows10() {
	    System.out.println("not run this only on windows 10 version");
	  }
	
	@Test
	  @EnabledIfEnvironmentVariable(named = "COMPUTERNAME", matches = "DESKTOP-08U1UGF")
	  void runOnlyOnPerticularMachine() {
	    System.out.println("Run this only on perticular server");
	  }

}
