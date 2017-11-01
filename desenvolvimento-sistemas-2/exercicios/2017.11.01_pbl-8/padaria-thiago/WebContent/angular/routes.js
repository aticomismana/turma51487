myApp.config(function($stateProvider, $urlRouterProvider) {
  // For any unmatched url, redirect to /state1
  $urlRouterProvider.otherwise("/");
  // Now set up the states
  $stateProvider
    .state('index', {
      url: "/",
      templateUrl: "partials/home.html"
    })
    .state('form', {
      url: "/form",
      templateUrl: "partials/form.html",
      controller: 'formController'
    })
});
