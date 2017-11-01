app.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/home');

        $stateProvider
            .state("index.html", {
                url: "/home",
                templateUrl: "home-template.html",
                controller: "HomeController",
            });
    });