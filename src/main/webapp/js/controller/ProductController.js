/**
 * Created by hackintosh on 11/10/2014.
 */
app.controller("productController", function ($scope, $location, productFactory) {
    $scope.products;
    $scope.retrievedProduct = {};

    getProducts();

    $scope.searchProduct = function () {
        getProduct();
        $scope.products.push($scope.retrievedProduct);
    }


    function getProducts() {
        productFactory.getAllProducts()
            .success(function (data) {
                $scope.products = data;
            })
            .error(function (error) {
                $scope.status = 'Unable to load customer data: ' + error.message;
            });
    }

    function getProduct() {
        productFactory.getProduct($scope.id)
            .success(function (data) {
                $scope.retrievedProduct = data;
            })
            .error(function (error) {
                $scope.status = 'Unable to load customer data: ' + error.message;
            });
    }


});

