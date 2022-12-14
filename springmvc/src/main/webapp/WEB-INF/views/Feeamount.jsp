<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
    <html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Fee form!</title>
  </head>
  <body>
  	
  	<div class="Container mt-5">
  			
  			<h3 class="text-center">Fee Form</h1>
  			
  		
  			
  		<form action="feeamount" method="post">
			  
				<div class="form-group">
				    <label for="f_id">Select Country</label>
				    <select class="form-control" name="f_id">
				      	<c:forEach items="${CountryList}" var="d">
                       <option value="${d.id}">${d.countryName}</option>
                       </c:forEach>	
				    </select>
				 </div>
				 
				<div class="form-group">
			    <label for="fName">Fee Name</label>
			    <input type="text" 
			    class="form-control" 
			    id="exampleFeeName"
			     placeholder="Enter Fee name" name="fName">
			  </div>
			  
			  <div class="form-group">
			    <label for="fCode">Fee Code</label>
			    <input type="text" 
			    class="form-control" 
			    id="exampleFeeCode"
			     placeholder="Enter Fee Code" name="fCode">
			  </div>
			  
			  <div class=" container text-center">
			  	<button type="submit" class="btn btn-success">Submit</button>
			  </div>
			 
		</form>
		 
  	</div>
  	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>