$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/SearchOnAmazon.feature");
formatter.feature({
  "name": "Search product on amazon searchBox",
  "description": "  As a customer i want to search product on Amazon.com to purchase",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search product",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am at amazon Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.SearchOnAmazon_StepDefinition.i_am_at_amazon_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter Hand Sanitizer in search input field",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.SearchOnAmazon_StepDefinition.i_Enter_Hand_Sanitizer_in_search_input_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click search button",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.SearchOnAmazon_StepDefinition.i_Click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Hand Sanitizer",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.SearchOnAmazon_StepDefinition.i_should_see_Hand_Sanitizer()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});