<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시글 등록</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>	
</head>
<body>
	<div class="container">
		<br>
		<h2 class="text-center font-weight-bold">게시글 등록</h2>
		<hr/>
		<form action="insert.do" method="post">
		  <div class="form-group">
	      <label for="p_name">p_name :</label>
	      <input type="text" class="form-control" id="p_name" name="p_name">
	    </div>
	    <div class="form-group">
	      <label for="quantity">quantity :</label><br>
			<input type="text" class="form-control" id="quantity" name="quantity">	    </div>
	    <div class="form-group">
	      <label for="price">price :</label>
	      <input type="text" class="form-control" id="price" name="price">
	    </div>

	    <div class="text-center">
				<button  type="submit" class="btn btn-secondary">등록</button>
			</div>
		</form>
	</div>
</body>