<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register">
            Name: <input type="text" name="employeename"> <br>
            city: <input type="text" name="city"> <br>
            salary: <input type="text" name="salary"> <br>
            mobile: <input type="text" name="mobile"> <br>

            <select name="course">
                <option value="java">java</option>
                <option value="spring">spring</option>
                <option value="html">html</option>
            </select>
			<br>
			
			
			
            <select name="hobbies">
                sports:<input type="checkbox" name="hobbies" value="sport">
                music:<input type="checkbox" name="hobbies" value="music">
                dance:<input type="checkbox" name="hobbies" value="dance">
                travel:<input type="checkbox" name="hobbies" value="travel">
            </select>
            
            <input type="submit" value="submit">
         </form>
</body>
</html>