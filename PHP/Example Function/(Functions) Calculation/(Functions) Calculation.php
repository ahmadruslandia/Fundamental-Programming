<!DOCTYPE HTML>
<html>

<head>
	<title>Example Function Calculation</title>
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

	<?php
	echo "Menu<br>";
	echo "1. Addition" . "<br>";
	echo "2. Subraction" . "<br>";
	echo "3. Multiplication	" . "<br>";
	echo "4. Division	" . "<br>" . "<br>";
	?>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
		Enter : <input type="text" name="varchc">
		<br>
		<br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	if ($varchc == "1") {
		header("location: addition.php", true, 301);
	} elseif ($varchc == "2") {
		header("location: subtraction.php", true, 301);
	} elseif ($varchc == "3") {
		header("location: multiplication.php", true, 301);
	} elseif ($varchc == "4") {
		header("location: division.php", true, 301);
	} else {
		echo " ";
	}
	?>


</body>

</html>