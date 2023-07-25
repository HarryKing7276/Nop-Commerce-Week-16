Feature: RegisterPageTest
Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
  Given I am on homepage
And I Click on Register Link
And I Verify text "Register"


Scenario: verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory()
  Given I am on homepage
And I Click on Register Link
And I Click on REGISTER button
And I Verify the error messageFirstName "First name is required."
And I Verify the error messageLastName "Last name is required."
And I Verify the error messageEmail "Email is required."
And I Verify the error messagePassword "Password is required."
And I Verify the error messageConfirmPassword "Password is required."


Scenario: VerifyThatUserShouldCreateAccountSuccessfully()
  Given I am on homepage
When I Click on Register Link
And I Select gender "Female"
And I Enter firstname
And I Enter lastname
And I Select day
And I Select month
And I Select year
And I Enter email
And I Enter password
And I Enter Confirm Password
And I Click on REGISTER button
Then I Verify message "Your registration completed"
