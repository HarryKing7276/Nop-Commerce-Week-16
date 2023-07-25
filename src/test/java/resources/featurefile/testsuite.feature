Feature: LoginPageTest
#Inside LoginPageTest class create following testmethods
  Scenario: userShouldNavigateToLoginPageSuccessFully
    Given I am on homepage
    And I Click on login link
    Then I verify  message display that "Welcome, Please Sign In!"

  Scenario:  verifyTheErrorMessageWithInValidCredentials
    Given  I am on homepage
    And I Click on login link
    And I  Enter EmailId
    And I  Enter Password
    And I Click on Login Button
    Then I Verify that the Error message

  Scenario:  I verify That User Should LogIn SuccessFully With Valid Credentials.
    Given I am on homepage
    And I Click on login link
    And I  Enter validEmailId
    And I  Enter validPassword
    And I Click on Login Button
    Then I Verify that link is display 'Log out'



#  4. VerifyThatUserShouldLogOutSuccessFully()
#  Click on login link
#  Enter EmailId
#  Enter Password
#  Click on Login Button
#  Click on LogOut Link
#  Verify that LogIn Link Display
#
