<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Title</title>
  <style>
    .menu {
      width: 100%;
      height: 60px;
      display: flex;
    }

    .left, .right {
      width: 50%;
      display: flex;
      justify-content: center;
      align-items: center;
      margin-right: 30px;
      color: black;
    }

    .left a, .right a {
      margin-right: 30px;
    }

    .left a:hover, .right a:hover {
      color: black;
      font-weight: 700;
    }
  </style>
</head>
<body>
<div class="menu">

  <div class="left">
    <a href="../../../src/main/resources/index.jsp">Головна</a>
    <a href="books.jsp">Книжки </a>
    <a href="authors.jsp">Автори </a>

  </div>

  <div class="right">
    <a href="/login">Увійти</a>
    <a href="/auth">Зареєструватись</a>

  </div>
</div>
</body>
</html>
