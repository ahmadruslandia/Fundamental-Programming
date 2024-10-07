<!DOCTYPE HTML>
<html>

<head>
	<title>Contoh Pembagian</title>
</head>

<body>

	<?php
	$a = $b = "";
	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$a = pembagian($_POST["a"]);
		$b = pembagian($_POST["b"]);
	}

	function pembagian($data)
	{
		$data = trim($data);
		$data = stripslashes($data);
		$data = htmlspecialchars($data);
		return $data;
	}
	?>

	<h3>Pembagian</h3>
	<br>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
		Angka : <input type="text" name="a">
		<br><br>
		Angka : <input type="text" name="b">
		<br><br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	echo "<br><br>";
	echo "--------- *";
	echo "<br>";
	echo "Hasil : ", $a / $b, "<br>";
	?>

</body>

</html>