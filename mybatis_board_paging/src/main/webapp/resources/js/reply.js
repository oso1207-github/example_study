console.log("reply module.....")

var replyService= (function(){

	function add(reply, callback, error){
	console.log("add reply......");
	
	$.ajax({
		type:'post',
		url: '/replies/new',
		data: JSON.stringify(reply),
		contentType: "application/json; charset=utf-8",
		success: function(result, status, xhr){
			if(callback){
				callback(result);
				}
			},
			error: function(xhr, status, er){
				if(error) {
					error(er);
					}
			}
		})
	}
	
	/* xhr은 브라우저가 가지고있는 XMLHttpRequest 객체를 이용해서 전체 페이지를 새로 고치지 않고도 페이지의 일부만을 위한 데이터를 로드하는 기법
	        또는 자바스크립트를 이용해 서버와 브라우저가 비동기 방식으로 데이터를 교환할 수 있는 통신 기능 */
	
	/*
	function getList(param, callback, error){
		
		var bno = param.bno;
		var page = param.page || 1;
		
		$.getJSON("/replies/pages/" + bno + "/" + page + ".json", 
			function(data){
				if(callback) {
					callback(data);
				}
			})
			.fail(function(xhr, status, err) {
				if (error) {
					error(err);
				}
			});
		}
	*/
	
		function getList(param, callback, error){
		
		var bno = param.bno;
		var page = param.page || 1;
		
		$.getJSON("/replies/pages/" + bno + "/" + page + ".json", 
			function(data){
				if(callback) {
					callback(data.replyCnt, data.list);
				}
			})
			.fail(function(xhr, status, err) {
				if (error) {
					error(err);
				}
			});
		}
		
	function remove(rno, callback, error){
		$.ajax({
			type: 'delete',
			url: '/replies/' + rno,
			success: function(deleteResult, status, xhr){
				if(callback) {
					callback(deleteResult);
				}
			},
			error: function(xhr, status, er){
				if(error){
					error(er);
				}
			}
		});
	}
	
	
	function update(reply, callback, error){
		console.log("---update Rno : " + reply.rno);
		$.ajax({
			type: 'put',
			url: '/replies/' + reply.rno,
			data: JSON.stringify(reply),
			contentType: "application/json; charset=utf-8",
			success: function(updateResult, status, xhr){
				if(callback) {
					callback(updateResult);
				}
			},
			error: function(xhr,status, er){
				if(error){
					error(er);
				}
			}
		});
	}
	
	function get(rno, callback, error) {
		$.get("/replies/" + rno + ".json", function(result) {
			if(callback){
				callback(result);
			}
		})
		.fail(function(xhr, status, err){
			if(error){
				error(er);
			}
		});
	}
	
	function displayTime(timeValue){
		var today = new Date();
		var gap = today.getTime() - timeValue;
		var dateObj = new Date(timeValue);
		var str="";
		
		if (gap<(1000*60*60*24)){
			var hh = dateObj.getHours();
			var mi = dateObj.getMinutes();
			var ss = dateObj.getSeconds();
			
			return [(hh>9 ? '':'0') + hh, ':', (mi>9 ? '':'0') + mi, ':', (ss>9 ? '':'0') + ss].join('');
		} else {
			var yy = dateObj.getFullYear();
			var mm = dateObj.getMonth() + 1;
			var dd = dateObj.getDate();
			
			return [yy,"/",(mm>9?"":"0") + mm, "/", (dd>9?"":"0") + dd].join("");
		}
	}
	
	
	return {
		add:add,
		getList:getList,
		remove:remove,
		update:update,
		get:get,
		displayTime:displayTime
		};
})();
	
	

