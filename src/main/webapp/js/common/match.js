/** map.jsp에 들어가는 게시판 목록  */

$( document ).ready(function() {
		 getBoardList();
	});
			/** 게시판 - 상세 페이지 이동 */
		    function goBoardDetail(boardSeq){                
		        location.href = "/board/boardDetail?boardSeq="+ boardSeq;
		    }
		    
		    /** 게시판 - 작성 페이지 이동 */
		    function goBoardWrite(){        
		        location.href = "/board/boardWrite";
		    }
		
			function getBoardList() {
				$.ajax({
					type : "GET",
					url : "/getMatchList",
					dataType : "JSON",
					success : function(obj) {
						getBoardListCallback(obj);
					},
					error : function(xhr, status, error) {
					}
				});
			}
		
			function getBoardListCallback(obj) {
		
				var list = obj;
				var listLen = obj.length;
		
				var str = "";
		
				if (listLen > 0) {
		
					for (var a = 0; a < listLen; a++) {
						var id = list[a].id;
						var team = list[a].team;
						var time = list[a].time;
						var location = list[a].location;
						var qty = list[a].qty;
						
						
						console.log(team);
					
		
						str += "<tr>";
						str += "<td>" + id + "</td>";
						str += "<td>" + team + "</td>";
						str += "<td>" + time + "</td>";
						str += "<td>" + location + "</td>";
						str += "<td>" + qty + "</td>";
						str += "</tr>";
					}
				}else {
		
					str += "<tr colspan='4'>";
					str += "<td>등록된 글이 존재하지 않습니다.</td>";
					str += "<tr>";
				}
				$("#tbody").html(str);
			}