<!DOCTYPE HTML>
<html>

<head>
	<title>Contoh If, Elseif dan Else</title>
</head>

<body>

	<?php
	$pil = "";

	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$pil = test_input($_POST["pil"]);
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
		<td>Masukan Angka : 1 Contoh If</td>
		<td><br></td>
		<td>Masukan Angka : 2 Contoh Elseif</td>
		<td><br></td>
		<td>Masukan Angka Selain 1 dan 2 Untuk Contoh Else</td>
		<td><br><br></td>
	</tr>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
		Masukkan Data berupa angka : <input type="text" name="pil">
		<br>
		<br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	if ($pil == "1") {
		echo "<br> ini Adalah Contoh If";
	} elseif ($pil == "2") {
		echo "<br> ini Adalah Contoh Elseif";
	} else {
		echo "<br> ini Adalah Contoh Else";
	}
	?>

</body>

</html>