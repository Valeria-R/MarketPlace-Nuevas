var productoModule = angular.module('productoModule');

//controlador (nombre, [dependencias,function])
productoModule.controller('productoCtrl', ['$scope','$http','$state',function($scope,$http,$state){
        
        //Arreglo para almacenar respuesta del servidor
        $scope.productos = new Array();
        
        $http.get('api/productos').then(function(response){
            console.log(response);
            $scope.productos = response.data;
        }, function(error){
            console.log(error);
        });
        
        $scope.eliminar = function(id){
            $http.delete('api/productos/'+id).then(function(response){
                //erecarga la pagina
                $state.reload();
            },function(error){
                console.log(error);
            }); 
        }; 
}]);


