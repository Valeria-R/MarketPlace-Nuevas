/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var app = angular.module("MarketPlace");
//Configuración de enrutamiento de la app angular
app.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider,$urlRouterProvider){
        
        //Direccionamiento cuando no encuentra ruta 
        $urlRouterProvider.otherwise('/');
        
        $stateProvider.state("productos",{
           url: '/',
           //donde lo va a publicar
           views:{
               mainView:{
                   templateUrl: './js/producto/lista/productos.html',
                   controller: 'productoCtrl'
               }
           }
        });
        
}]);