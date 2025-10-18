<!DOCTYPE HTML>
<html>

<head>
	<title>Example Switch Case</title>
</head>

<body>

	<?php
	$varchc = "";

	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$varchc = test_input($_POST["varchc"]);
	}

	function test_input($data)
	{
		$data = trim($data);
		$data = stripslashes($data);
		$data = htmlspecialchars($data);
		return $data;
	}
	?>

	<tr>
		<td>Menu :</td>
		<td><br><br></td>
		<td>1. First Example</td>
		<td><br></td>
		<td>2. Second Example</td>
		<td><br></td>
		<td>3. Third Example</td>
		<td><br></td>
		<td>4. Fourth Example</td>
		<td><br></td>
		<td>Enter your Choice : </td>
		<td><br><br></td>
	</tr>

	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
		Enter your Choice : <input type="text" name="varchc">
		<br>
		<br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	switch ($varchc) {
		case "1":
			echo "<br>Example 1st Succeed";
			break;
		case "2":
			echo "<br>Example 2nd Succeed";
			break;
		case "3":
			echo "<br>Example 3rd Succeed";
			break;
		case "4":
			echo "<br>Example 4th Succeed";
			break;
		default:
			echo "Enter your Choice Correctly";
	}
	?>

</body>

</html>