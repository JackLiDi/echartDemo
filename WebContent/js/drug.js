	/** 
	    * 格式化data，data格式如:[{name:nameValue,value:valueVal},...] 
	    * 
	    * @param data 
	    * @returns {object} 
	    */  
	jQquery(document).ready(function($){
		$.ajax({
			
			url:"toline",
			date:"",
			type:"get",
			datatype:"json",
			success:function(data){
				/*var $div=$(#div_Show);*/
				for(var i=0;i<data.length;i++){
					var str="名称："+data[i].drugName+
					"金额：" +data[i].money
					
					
				}
				
				
				
			}
			
		});
		
		
		
	});