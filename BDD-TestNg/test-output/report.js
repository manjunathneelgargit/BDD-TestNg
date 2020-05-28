$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify user is able to login to application successfully with valid credentials",
  "description": "",
  "id": "login;verify-user-is-able-to-login-to-application-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_in_login_page()"
});
formatter.result({
  "duration": 7084980901,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2002991000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 69801,
  "status": "passed"
});
});