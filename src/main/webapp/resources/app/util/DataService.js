app.factory('DataService', ['$http', function($http){
	
	var _formatDateUE = function(d){
		var dia = d.substring(8,10);
		dia = ("00" + dia).slice(-2);
		var mes = d.substring(5,7);
		mes = ("00" + mes).slice(-2);
		var ano = d.substring(0,4);	
		return ano + "-" + mes + "-" + dia;  
	}

	var  _formatDateBR = function(d){		
		var dia = d.substring(8,10);
		var mes = d.substring(5,7);
		var ano = d.substring(0,4);	
		return (dia) + "/" + (mes) + "/" + ano;	  
	}
	
	var  _formatDateBRConsulta = function(d){	
		var dia = d.substring(8,10);
		var mes = d.substring(5,7);
		var ano = d.substring(0,4);
		return (dia) + "-" + (mes) + "-" + ano;	  
	}

	var _dataHoje = function() {	 
	    var data = new Date();
	    var dia = data.getDate();
	    dia = ("00" + dia).slice(-2);
	    var mes = data.getMonth() + 1;
	    mes = ("00" + mes).slice(-2);
	    var ano = data.getFullYear();	
	    ano = ("0000" + ano).slice(-4);
	    return [ano, mes, dia].join('-');
	}
	
	var _horaAtual = function(){
		 var dataAtual = new Date();
		 var hora = dataAtual.getHours();
		 var minuto = dataAtual.getMinutes();	  
		 hora =  ("00" + hora).slice(-2,-1)+("0"+hora).slice(-1);
		 minuto =  ("00" + minuto).slice(-2,-1)+("0"+minuto).slice(-1);
		 var horaFinal = hora + ":" + minuto;		 
		 return horaFinal;	
	}

	return {
		formatDateUE: _formatDateUE,
		formatDateBR: _formatDateBR,
		formatDateBRConsulta: _formatDateBRConsulta,
		dataHoje: _dataHoje,
		horaAtual: _horaAtual				
	}
}])