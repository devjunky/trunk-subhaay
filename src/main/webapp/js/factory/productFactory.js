/**
 * Created by hackintosh on 11/10/2014.
 */
app.factory('productFactory', ['$http', function($http) {

    var urlBase = '/subhaay/services/rest/products';
    var productFactory = {};

    productFactory.getAllProducts = function () {
        return $http.get(urlBase + '/all')
    };

    productFactory.getProduct = function (id) {
        return $http.get(urlBase + '/get/' + id)
    };
    /*
    questionFactory.insertQuestion = function (question) {
        return $http.post(urlBase + '/create', question);
    };

    questionFactory.updateCount = function (questionId, optionId) {
        return $http.get(urlBase + '/updateCount/' + questionId +'/'+ optionId);
    };*/


    return productFactory;

}]);