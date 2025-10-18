<!DOCTYPE HTML>
<html>

<head>
	<title>Example Subtraction</title>
</head>

<body>

	<?php
	$a = $b = "";
	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$a = subtraction($_POST["a"]);
		$b = subtraction($_POST["b"]);
	}

	function subtraction($data)
	{
		$data = trim($data);
		$data = stripslashes($data);
		$data = htmlspecialchars($data);
		return $data;
	}
	?>

	<h3>Subtraction</h3>
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
	echo "--------- -";
	echo "<br>";
	echo "Result : ", $a - $b, "<br>";
	?>

</body>

</html>