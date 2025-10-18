<!DOCTYPE HTML>
<html>

<head>
	<title>Example Multiplication</title>
</head>

<body>

	<?php
	$a = $b = "";
	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$a = multiplication($_POST["a"]);
		$b = multiplication($_POST["b"]);
	}

	function multiplication($data)
	{
		$data = trim($data);
		$data = stripslashes($data);
		$data = htmlspecialchars($data);
		return $data;
	}
	?>

	<h3>Multiplication</h3>
	<br>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
		Number : <input type="text" name="a">
		<br><br>
		Number : <input type="text" name="b">
		<br><br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	echo "<br><br>";
	echo "--------- *";
	echo "<br>";
	echo "Result : ", $a * $b, "<br>";
	?>

</body>

</html>