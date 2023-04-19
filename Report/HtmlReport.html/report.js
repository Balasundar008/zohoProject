$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Zoho.feature");
formatter.feature({
  "name": "User Can Create The Zoho Id",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "SignUpPage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user Launch The Url Of Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionZoho.user_Launch_The_Url_Of_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Email Id Into Email Field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionZoho.user_Enter_The_Email_Id_Into_Email_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Password Into Password Field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionZoho.user_Enter_The_Password_Into_Password_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click The Checkbox For Agree The Terms and Condition",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionZoho.user_Click_The_Checkbox_For_Agree_The_Terms_and_Condition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click The button Of SignUp For Free",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionZoho.user_Click_The_button_Of_SignUp_For_Free()"
});
formatter.result({
  "status": "passed"
});
});