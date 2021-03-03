app.factory('FunctionSpinner', ['$http', function($http){
	
	var _showSpinnerFunction = function () {
        angular.element('#spinner').show();
        angular.element( "button" ).addClass('disabled');
    };
    
    var _hideSpinnerFunction = function () {
    	angular.element('#spinner').hide();  
    	angular.element( "button" ).removeClass( "disabled" ); 
    };
	
	return {
		
		showSpinner: _showSpinnerFunction,
		
		hideSpinner: _hideSpinnerFunction
		
	}
}])