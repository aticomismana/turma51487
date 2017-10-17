myApp.config(function($stateProvider, $urlRouterProvider) {
  // For any unmatched url, redirect to /state1
  $urlRouterProvider.otherwise("/");
  // Now set up the states
  $stateProvider
    .state('index', {
      url: "/",
      templateUrl: "partials/container.html"
    })
    .state('list', {
      url: "/list",
      templateUrl: "partials/list.html",
      controller: "ListController"
    })
    .state('form', {
      url: "/form",
      templateUrl: "partials/todoForm.html",
      controller: "TodoFormController"
    })
});
