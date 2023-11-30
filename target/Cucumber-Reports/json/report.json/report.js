$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/FeatureFile/BDD%20Scenarios.feature");
formatter.feature({
  "name": "Admin Area Demo Login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login into account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is navigating to \"https://admin-demo.nopcommerce.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDScenariosSteps.user_is_navigating_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is adding \"Email\" and \"Password\"",
  "keyword": "When "
});
formatter.match({
  "location": "BDDScenariosSteps.user_is_adding_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is clicking on \"Login\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BDDScenariosSteps.user_is_clicking_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is logged into Admin Application",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDScenariosSteps.user_is_logged_into_admin_application()"
});
formatter.result({
  "status": "passed"
});
});