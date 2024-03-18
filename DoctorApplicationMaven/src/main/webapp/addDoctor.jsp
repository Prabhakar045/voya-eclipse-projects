<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addServlet">

        DoctorName: <input type="text" name="doctorname"> <br>  <br>
        Speciality: <select name="speciality" id="">
                    <option value="ORTHOPEDIC">ORTHOPEDIC</option>
                    <option value="PEDIATRICIAN">PEDIATRICIAN</option>
                    <option value="GYNAECOLOGIST">GYNAECOLOGIST</option>
                    <option value="NEUROLOGIST">NEUROLOGIST</option>
        </select>
                   
         <br> <br>
        fees: <input type="number" name="fees"> <br> <br>
        Rating: <input type="number" name="ratings"> <br> <br>
        Experience: <input type="number" name="experience"> <br> <br>

        <input type="submit" value="add Doctor">
       
    </form>
</body>
</html>