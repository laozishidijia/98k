<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="course/showcourse" method="post" accept-charset="utf-8" onsubmit="document.charset='utf-8';">
S_id <input type="text" name="S_id"/><br><br>
S_name		<input type="text" name="S_name"/><br><br>
S_dept		<input type="text" name="S_dept"/><br><br>
S_class<input type="text" name="S_class"/>
<br><br>
<input type="submit" value="Submit"/>
</form>
</body>
</html>