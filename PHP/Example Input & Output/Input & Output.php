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
		<div>
			<div>
				<label>Masukkan Data Berupa Angka : </label>
				<input type="text" name="i">
			</div>
			<br>
			<div>
				<input type="submit" name="submit" value="Submit">
			</div>
		</div>
	</form>

	<?php
	echo "<br>";
	echo "Output dari Data yang Di Inputkan : ", $i;
	?>

</body>

</html>