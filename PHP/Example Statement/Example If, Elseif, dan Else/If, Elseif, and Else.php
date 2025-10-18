<!DOCTYPE HTML>
<html>

<head>
	<title>Example If, Elseif and Else</title>
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
		<td>Enter Number : 1 for Example If</td>
		<td><br></td>
		<td>Enter Number : 2 for Example ElseIf</td>
		<td><br></td>
		<td>Enter Number other 1 and 2 for Example Else</td>
		<td><br><br></td>
	</tr>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
		Please Enter Number : <input type="text" name="varchc">
		<br>
		<br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	if ($varchc == "1") {
		echo "<br> Example If";
	} elseif ($varchc == "2") {
		echo "<br> Example Elseif";
	} else {
		echo "<br> Example Else";
	}
	?>

</body>

</html>