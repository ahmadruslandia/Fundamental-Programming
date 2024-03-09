<!DOCTYPE HTML>
<html>

<head>
	<title>Contoh Fungsi Hitung</title>
</head>

<body>

	<?php
	$pilihan = "";
	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$pilihan = test_input($_POST["pilihan"]);
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
	echo "1. Pertambahan" . "<br>";
	echo "2. Pengurangan" . "<br>";
	echo "3. Perkalian	" . "<br>";
	echo "4. Pembagian	" . "<br>" . "<br>";
	?>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
		Masukkan Pilihan : <input type="text" name="pilihan">
		<br>
		<br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	if ($pilihan == "1") {
		header("location: pertambahan.php", true, 301);
	} elseif ($pilihan == "2") {
		header("location: pengurangan.php", true, 301);
	} elseif ($pilihan == "3") {
		header("location: perkalian.php", true, 301);
	} elseif ($pilihan == "4") {
		header("location: pembagian.php", true, 301);
	} else {
		echo " ";
	}
	?>


</body>

</html>