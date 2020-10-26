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
					url : "/board/getBoardList",
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
						var boardSeq = list[a].board_seq;
						var boardReRef = list[a].board_re_ref;
						var boardReLev = list[a].board_re_lev;
						var boardReSeq = list[a].board_re_seq;
						var boardWriter = list[a].board_writer;
						var boardSubject = list[a].board_subject;
						var boardContent = list[a].board_content;
						var boardHits = list[a].board_hits;
						var delYn = list[a].del_yn;
						var insUserId = list[a].ins_user_id;
						var insDate = list[a].ins_date;
						var updUserId = list[a].upd_user_id;
						var updDate = list[a].upd_date;
						
						console.log(updUserId);
						console.log(updDate);
		
						str += "<tr>";
						str += "<td>" + boardSeq + "</td>";
						str += "<td onclick='javascript:goBoardDetail("+ boardSeq +");' style='cursor:Pointer'>"+ boardSubject +"</td>";
						str += "<td>" + boardHits + "</td>";
						str += "<td>" + boardWriter + "</td>";
						str += "<td>" + insDate + "</td>";
						str += "</tr>";
					}
				}else {
		
					str += "<tr colspan='4'>";
					str += "<td>등록된 글이 존재하지 않습니다.</td>";
					str += "<tr>";
				}
				$("#tbody").html(str);
			}