<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="employeeServlet">
        	Id: <input type="text" name="employeeId"> <br>
            Name: <input type="text" name="employeename"> <br>
            city: <input type="text" name="city"> <br>
            salary: <input type="text" name="salary"> <br>
            mobile: <input type="text" name="mobile"> <br>

           Enter Course:
            <select name="language">
                <option value="java">java</option>
                <option value="spring">spring</option>
                <option value="html">html</option>
                <option value="html">Node</option>
                <option value="html">html</option>
                
            </select>
			<br>
			
            <input type="submit" value="submit">
         </form>
</body>
</html>