<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sample Address Monitor Client </title> 
</head>
<body>
	
	<h2>Sample Address Monitor Client</h2>
	<!-- 
	<a href="./AddressController">Click</a>
 -->
		<form action="./AddressController" >
			<table border="0" width="30%">
               
                <tr>
                    <td>http://www.regis24.de/impressum/<td>
                    <td><input type="submit" value="Monitor">	</td>
                </tr>
                <tr>
                    <td>http://www.savage-wear.com/impressum/index.html</td>
                    <td><button type="button" disabled>Monitor</button></td>
                </tr>
                <tr>
                    <td>http://www.idealo.de/preisvergleich/AGB.html</td>
                    <td><button type="button" disabled>Monitor</button></td>
                </tr>
                <tr>
                    <td>http://www.autohaus-meier.de/impressum.php</td>
                    <td><button type="button" disabled>Monitor</button></td>
                </tr>
            </table>
			<!--  	
			<input type="submit" value="submit">	-->						
		</form>	
</body>
</html>