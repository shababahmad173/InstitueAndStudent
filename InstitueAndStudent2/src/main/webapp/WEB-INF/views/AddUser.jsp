<html>
<body>

	<h2>Add User</h2>

	<form action="addUser" method="post">
		<table>

			<tr>
				<!-- column one  -->
				<td>first Name :</td>
				<!-- column two -->
				<td><input type="text" name="firstName"></td>
			</tr>

			<tr>
				<!-- column one  -->
				<td>last Name :</td>
				<!-- column two -->
				<td><input type="text" name="lastName"></td>
			</tr>

			<tr>
				<!-- column one  -->
				<td>email :</td>
				<!-- column two -->
				<td><input type="text" name="email"></td>
			</tr>
			
			<tr>
				<!-- column one  -->
				<td>age :</td>
				<!-- column two -->
				<td><input type="text" name="age"></td>
			</tr>

			<tr>
				<!-- column one  -->
				<td>User Name :</td>
				<!-- column two -->
				<td><input type="text" name="userName"></td>
			</tr>

			<tr>
				<!-- column one  -->
				<td>password :</td>
				<!-- column two -->
				<td><input type="text" name="password"></td>
			</tr>

			<tr>
				<!-- column one  -->
				<td>mobile No :</td>
				<!-- column two -->
				<td><input type="text" name="mobileNo"></td>
			</tr>

			<tr>
				<!-- column one  -->
				<td>role :</td>
				<!-- column two -->
				<td><input type="text" name="role"></td>
			</tr>

			<tr>
				<td>deptartment :</td>
				<td><input type="radio" name="department" value="development">
					dev <input type="radio" name="department" value="testing">
					testing</td>
			</tr>


			<tr>
				<td>street :</td>
				<td><input type="text" name="address.street"></td>
			</tr>

			<tr>
				<td>city :</td>
				<td><input type="text" name="address.city"></td>
			</tr>

			<tr>
				<td>state :</td>
				<td><input type="text" name="address.state"></td>
			</tr>

			<tr>
				<td>pin code :</td>
				<td><input type="text" name="address.pinCode"></td>
			</tr>

			<tr>
				<td><input type="submit" value="click me"></td>
			</tr>

		</table>

	</form>


</body>
</html>
