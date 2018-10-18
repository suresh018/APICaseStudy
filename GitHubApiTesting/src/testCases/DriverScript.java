package testCases;

import gitHub.ApiDefinition;


import org.testng.annotations.Test;

public class DriverScript {
	ApiDefinition apiDefinition=new ApiDefinition();
  @Test
  public void GetUserDetails() {
	  apiDefinition.GetUserDetails();
  }
}
