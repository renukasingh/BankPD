<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
.must label {
    font-weight: bold;
}
.must label:after {
    color: #e32;
    content: ' *';
    display:inline;
   }

</style>
<script type="text/javascript">
function fieldcheck()
{
	
var field=document.getElementById("STATE");

  if(field.value=='Andhra Pradesh')
	{
	 
	document.getElementById("city").innerHTML="<OPTION VALUE= 'Visakhapatnam'> Visakhapatnam</OPTION><OPTION VALUE= 'Tirupati'> Tirupati</OPTION><OPTION VALUE= ' Warangal'>  Warangal</OPTION>";
	
	return;
	} 
  else if(field.value=='Arunachal Pradesh')
	{
	document.getElementById("city").innerHTML="<OPTION VALUE='Itanagar'> Itanagar</OPTION><OPTION VALUE= ' Huri '>  Huri </OPTION><OPTION VALUE= 'Khonsa '> Khonsa </OPTION>";
	return;
	}

else if(field.value=='Assam')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Guwahati '>  Guwahati </OPTION><OPTION VALUE= 'Dispur'> Dispur</OPTION><OPTION VALUE= 'Tezpur'> Tezpur</OPTION>";
return;
}

else if(field.value=='Bihar')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Patna'> Patna</OPTION><OPTION VALUE= 'Gaya'> Gaya</OPTION><OPTION VALUE= 'Nalanda'> Nalanda</OPTION>";
return;
}

else if(field.value=='Chhattisgarh')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Raipur '>  Raipur </OPTION><OPTION VALUE= ' Raigarh'>  Raigarh</OPTION><OPTION VALUE= 'Bhilai '> Bhilai </OPTION>";
return;
}

else if(field.value=='Goa ')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Panji '>  Panji </OPTION><OPTION VALUE= 'Ponda'> Ponda</OPTION><OPTION VALUE= ' Candolim '>  Candolim </OPTION>";
return;
}

else if(field.value=='Gujarat')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Ahmedabad '>  Ahmedabad </OPTION><OPTION VALUE= 'Gandhi Nagar'> Gandhi Nagar</OPTION><OPTION VALUE= 'Vadodara '> Vadodara </OPTION>";
return;
}
  
else if(field.value=='Haryana')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Chandigarh'> Chandigarh</OPTION><OPTION VALUE= 'Gurgaon'> Gurgaon</OPTION><OPTION VALUE= 'Faridabad'> Faridabad</OPTION>";
return;
}
  
else if(field.value=='Himachal Pradesh')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Shimla '> Shimla </OPTION><OPTION VALUE= 'Dharamsala'> Dharamsala</OPTION><OPTION VALUE= 'Manali'> Manali</OPTION>";
return;
}
  
else if(field.value=='Jammu & Kashmir')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Srinagar'> Srinagar</OPTION><OPTION VALUE= 'Jammu'> Jammu</OPTION><OPTION VALUE= 'Ladakh'> Ladakh</OPTION>";
return;
}
  
else if(field.value=='Jharkhand')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Ranchi'> Ranchi</OPTION><OPTION VALUE= ' Dhanbad '>  Dhanbad </OPTION><OPTION VALUE= 'Jamshedpur'> Jamshedpur</OPTION>";
return;
}
  
else if(field.value=='Karnataka')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Bangalore'>  Bangalore</OPTION><OPTION VALUE= ' Mysore'>  Mysore</OPTION><OPTION VALUE= 'Udupi'> Udupi</OPTION>";
return;
}
  
else if(field.value=='Kerala')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Trivandrum '> Trivandrum </OPTION><OPTION VALUE= ' Kovalam '>  Kovalam </OPTION><OPTION VALUE= ' Kochi '>  Kochi </OPTION>";
return;
}
  
else if(field.value=='Madhya Pradesh')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Bhopal '>  Bhopal </OPTION><OPTION VALUE= ' Indore '>  Indore </OPTION><OPTION VALUE= ' Gwalior '>  Gwalior </OPTION>";
return;
}
  
else if(field.value=='Maharashtra')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Mumbai '> Mumbai r</OPTION><OPTION VALUE= ' Nagpur '>  Nagpur </OPTION><OPTION VALUE= 'Pune'> Pune</OPTION>";
return;
}
  
else if(field.value=='Manipur')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Imphal'>  Imphal </OPTION>";
return;
}
  
else if(field.value=='Meghalaya')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Shillong'> Shillong</OPTION>";
return;
}
  
else if(field.value=='Mizoram')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Aizawl'>  Aizawl</OPTION>";
return;
}
  
else if(field.value=='Nagaland')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Kohima '> Kohima </OPTION>";
return;
}
  
else if(field.value=='Orissa')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Bhubaneswar '> Bhubaneswar </OPTION><OPTION VALUE= 'Puri '> Puri </OPTION><OPTION VALUE= ' Cuttack'>  Cuttack</OPTION>";
return;
}
  
else if(field.value=='Punjab')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Chandigarh '>  Chandigarh</OPTION><OPTION VALUE= 'Amritsar '> Amritsar </OPTION><OPTION VALUE= 'Ludhiana '> Ludhiana </OPTION>";
return;
}
  
else if(field.value=='Rajasthan')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Jaipur '> Jaipur </OPTION><OPTION VALUE= 'Jodhpur '> Jodhpur </OPTION><OPTION VALUE= 'Udaipur '> Udaipur </OPTION>";
return;
}
  
else if(field.value=='Sikkim')
{
document.getElementById("city").innerHTML="<OPTION VALUE='Gangtok '> Gangtok </OPTION>";
return;
}
  
else if(field.value=='Tamil Nadu')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Chennai '>  Chennai </OPTION><OPTION VALUE= ' Madurai '>  Madurai </OPTION><OPTION VALUE= 'Rameshwaram '> Rameshwaram </OPTION>";
return;
}
  
else if(field.value=='Tripura')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Agartala '>  Agartala </OPTION>";
return;
}
  
else if(field.value=='Uttar Pradesh')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Lucknow '>  Lucknow </OPTION><OPTION VALUE= 'Agra'> Agra</OPTION><OPTION VALUE= 'Varanasi'> Varanasi </OPTION>";
return;
}
  
else if(field.value=='Uttaranchal')
{
document.getElementById("city").innerHTML="<OPTION VALUE=' Dehradun '> Dehradun</OPTION><OPTION VALUE= 'Haridwar '> Haridwar </OPTION><OPTION VALUE= 'Rishikesh'> Rishikesh</OPTION>";
return;
}
  
else
{
document.getElementById("city").innerHTML="<OPTION VALUE='Kolkata'> Kolkata</OPTION><OPTION VALUE= ' Durgapur '>  Durgapur </OPTION><OPTION VALUE= ' Raiganj '>  Raiganj </OPTION>";
return;
}
}
  
  

</script>

</head>
<body>

<form action="CreateCustomerController" method="post">
<div class="must">
    
  <label>Customer SSNId</label> <input type="text" name="CustomerSSNId" required/><br>
 <br>
 <label>Customer Name</label> <input type="text" name="CustomerName" required><br><br>
<label>Age</label><input type="text" name="Age" required><br><br>
 <label>Address</label><input type="text" name="Address" required><br><br>
<label>State</label>

<SELECT id="STATE" onchange="return fieldcheck()">
<option>select</option>
<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu & Kashmir">Jammu & Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value="Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Odisha">Odisha</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Telangana">Telangana</option>
<option value="Tripura">Tripura</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="Uttarakhand">Uttarakhand</option>
<option value="West Bengal">West Bengal</option>


</SELECT><br><br>

<label>City</label>
<select id="city">
<option>select</option>
</select>

  <input type="submit" value="Submit">
   <input type="reset" value="Reset">
   
 </div>
 
</form>



</body>
</html> --%>