/**
 * Created by apokhrel on 6/20/2014.
 */

var app = angular.module('Subhaay', ['ngRoute', 'ngResource']);

// configure our routes
app.config(function ($routeProvider) {
    $routeProvider

        // route for the view1 page
        .when('/home', {
            templateUrl: 'partials/homePage.html',
            controller: 'productController'
        })

        // route for the view1 page
        .when('/product', {
            templateUrl: 'partials/details.html',
            controller: 'productController'
        })

        // route for the contact page
        .otherwise({redirectTo: '/home'});
});
