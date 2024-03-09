<!DOCTYPE HTML>
<html>

<head>
	<title>Input & Output</title>
</head>

<body>

	<?php
	$i = "";
	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$i = test_input($_POST["i"]);
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
		Masukkan Data berupa angka : <input type="text" name="i">
		<br>
		<br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	echo "<br>";
	echo "<br>";
	echo "Output dari Data yang diinputkan : ", $i;
	?>

</body>

</html>