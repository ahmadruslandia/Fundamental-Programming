<!DOCTYPE HTML>
<html>

<head>
	<title>Contoh Switch Case</title>
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

	<tr>
		<td>Menu :</td>
		<td><br><br></td>
		<td>1. Contoh Ke Satu</td>
		<td><br></td>
		<td>2. Contoh Ke Dua</td>
		<td><br></td>
		<td>3. Contoh Ke Tiga</td>
		<td><br></td>
		<td>4. Contoh Ke Empat</td>
		<td><br></td>
		<td>Masukan Pilihan : </td>
		<td><br><br></td>
	</tr>

	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
		Masukan Pilihan : <input type="text" name="pilihan">
		<br>
		<br>
		<input type="submit" name="submit" value="Submit">
	</form>

	<?php
	switch ($pilihan) {
		case "1":
			echo "<br>Contoh Ke-1 Berhasil Dicoba";
			break;
		case "2":
			echo "<br>Contoh Ke-2 Berhasil Dicoba";
			break;
		case "3":
			echo "<br>Contoh Ke-3 Berhasil Dicoba";
			break;
		case "4":
			echo "<br>Contoh Ke-4 Berhasil Dicoba";
			break;
		default:
			echo "Masukkan Pilihan Dengan Benar";
	}
	?>

</body>

</html>