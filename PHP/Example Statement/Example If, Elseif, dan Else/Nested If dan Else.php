<!DOCTYPE HTML>
<html>

<head>
	<title>Example If, Elseif and Else</title>
</head>

<body>

	<?php

	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$data1 = test_input($_POST["data1"]);
		$data2 = test_input($_POST["data2"]);
	}

	function test_input($data)
	{
		$data = trim($data);
		$data = stripslashes($data);
		$data = htmlspecialchars($data);
		return $data;
	}
	?>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
		username : <input type="text" name="data1">
		<br>
		password : <input type="text" name="data2">
		<br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	if ($data1 == "user1") {
		if ($data2 == "psw123") {
			echo "<br>you succeeded";
		} else {
			echo "<br>wrong password";
		}
	} else {
		echo "<br>wrong username";
	}
	?>

</body>

</html>