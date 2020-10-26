<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>게시판 목록</title>

		<!-- common CSS -->
		<link rel="stylesheet" type="text/css" href="/css/common/common.css"/>
		<script type="text/javascript" src="/js/common/jquery.js"></script>
		<script type="text/javascript" src="/js/common/board.js"></script>

	</head>
	
	<body>
		<div id="wrap">
		    <div id="container">
		        <div class="inner">        
		            <h2>게시글 목록</h2>            
		            <form id="boardForm" name="boardForm">
		                <table width="100%" class="table01">
		                    <colgroup>
		                        <col width="10%" />
		                        <col width="25%" />
		                        <col width="10%" />
		                        <col width="15%" />
		                        <col width="20%" />
		                    </colgroup>
		                    <thead>        
		                        <tr>
		                            <th>글번호</th>
		                            <th>제목</th>
		                            <th>조회수</th>
		                            <th>작성자</th>
		                            <th>작성일</th>
		                        </tr>
		                    </thead>
		                    <tbody id="tbody"></tbody>    
		                </table>
		            </form>            
		            <div class="btn_right mt15">
		                <button type="button" class="btn black mr5" onclick="javascript:goBoardWrite();">작성하기</button>
		            </div>
		        </div>
		    </div>
		</div>
	</body>

</html>