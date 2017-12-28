<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/echarts.js"></script>
</head>

<body>
<div id="chartmain" style="width:600px; height: 400px;"></div>
</body>


<script type="text/javascript">

//指定图标的配置和数据
var option = {
    title:{
        text:'ECharts 数据统计'
    },
    tooltip:{},
    legend:{
        data:['用户来源']
    },
    xAxis:{
        data:[]
    },
    yAxis:{

    },
    series:[{
        name:'访问量',
        type:'bar',
        data:[]
    }]
};
//初始化echarts实例
var myChart = echarts.init(document.getElementById('chartmain'));

//使用制定的配置项和数据显示图表
myChart.setOption(option);


var durg=[];
var money=[];

	$.ajax({
		
		url:"ucexist.html",
		date:"",
		type:"get",
		datatype:"json",
		success:function(data){
			alert(data);
		var datas=eval("(" + data + ")");//json字符串轉換為對象
			alert(datas[0].drugName+"---------"+datas[2].money);
			alert(datas.length);
			
			 if(datas!=null && datas.length>0){
				 alert("11");
				for(var i=0;i<datas.length;i++){
					
					durg.push(datas[i].drugName);
                    money.push(datas[i].money);
                    
                  
				}
				
				
				myChart.setOption({
					
					 xAxis:{
					        data:durg
					    },
					    series:[{
					       
					        data:money
					    }]
					
					
				})
				
				  
			}else{
				
				alert("網絡加載失敗！");
				
			}
			 
		}
		
	});
	

	 
      
    </script>

</html>