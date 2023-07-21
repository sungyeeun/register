<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <title>제품등록 확인 페이지</title>
    <style type="text/css">

        .grid1 { 
            grid-column-start: 1; grid-column-end: 2; 
            background: rgb(21, 49, 14); 
        }
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f7f7f7;
        }
        h1 {
            text-align: center;
            font-size: 30px;
            color: #333;
            margin-bottom: 20px;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 4px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
        }
        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
            color: #333;
        }
        input[type="text"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            margin-bottom: 10px;
        }
        button {
            padding: 10px 20px;
            background-color: #4CAF50;
            border: none;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="grid1">제품등록 확인 페이지</h1>

		<table>
			<tr>
				<td>제품코드</td>
				<td>${product.productCode}</td>
			</tr>
			<tr>
				<td>제품명</td>
				<td>${product.productName}</td>
			</tr>
			<tr>
				<td>관리자</td>
				<td>${product.productManager}</td>
			</tr>
		</table>
        
        <a href="update?code=${product.productCode}">제품 수정</a>
    </div>
</body>
</html>
