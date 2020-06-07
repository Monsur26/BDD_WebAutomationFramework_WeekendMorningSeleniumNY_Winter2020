$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/SearchOnAmazon.feature");
formatter.feature({
  "name": "Search product on amazon searchBox",
  "description": "  As a customer i want to search product on Amazon.com to purchase",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Search product using Parameter",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "I Enter \"Hand Sanitizer\" in search input field",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.SearchOnAmazon_StepDefinition.i_Enter_in_search_input_field(java.lang.String)"
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
  "name": "I should see \"\\\"Hand Sanitizer\\\"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.SearchOnAmazon_StepDefinition.i_should_see(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});