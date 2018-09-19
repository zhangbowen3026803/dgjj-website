$(function(){
	$("#tbo").find("tr").each(function(){
		var a = $(this).find("td>span").text();
		if(a!=null&&a!=''&&typeof(a)!='undefined'){
			if(a=='0'){
				$(this)[0].style.color= "white";
			}else{
				if($(this)[0].rowIndex % 2 == 0) {                 //进行偶数判断，从而完成各行变色
					$(this)[0].style.color= "#30de30";
                }else{
                	$(this)[0].style.color= "red";
                }
			}
		}else{
            if($(this)[0].rowIndex % 2 == 0) {                 //进行偶数判断，从而完成各行变色
            	$(this)[0].style.color= "red";
            }else{
            	$(this)[0].style.color= "#30de30";
            }
		}
	});
	
});