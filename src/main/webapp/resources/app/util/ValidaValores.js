app.factory('ValidaValores', ['$http', function($http){
	
	var _isNotEmpty = function(val){
		return (val != undefined && val != null && val != "" && val != 'null' && !angular.equals(val, {}));
	}
	
	var _validNumber = function(numero){
		return /^([0-9])*$/.test(numero);
	}
	
	return {
		
		isNotEmpty: _isNotEmpty,
		
		validNumber: _validNumber
		
	}
}])