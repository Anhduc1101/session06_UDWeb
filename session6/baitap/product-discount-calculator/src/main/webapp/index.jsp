<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<br/>
<form action="/discount" method="post">
  <label>Product Description:</label>
  <input type="text" placeholder="Nhập mô tả ..." name="proDes"><br/>
  <label>List Price:</label>
  <input type="number" placeholder="Nhập giá ..." name="listPrice"><br/>
  <label>Discount Percent:</label>
  <input type="number" placeholder="Nhập tỷ lệ ..." name="disPer"><br/>
  <button>Calculate Discount</button>
</form>
</body>
</html>