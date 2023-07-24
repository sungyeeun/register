<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    <h1>조회</h1>
    <table class="table table-bordered">
      <thead>
        <tr>
          <th>색상</th>
          <th>사이즈</th>
          <th>길이</th>
          <th>기계번호</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>${plan.color}</td>
          <td>${plan.size}</td>
          <td>${plan.len}</td>
          <td>${plan.num}</td>
        </tr>
      </tbody>
    </table>
    <div class="btn-group">
      <a href="index.html" class="btn btn-primary">뒤로 가기</a>
    </div>
  </div>
</body>
</html>
