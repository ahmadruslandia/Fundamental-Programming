<!DOCTYPE HTML>
<html>

<head>
	<title>Contoh Perubahan Data Array</title>
</head>

<body>

	<?php
	$huruf = array("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
	$huruf[1] = "x";
	$huruf[9] = "z";
	echo "Huruf : " . $huruf[1] . "<br>";
	echo "Huruf : " . $huruf[9] . "<br>";
	?>

</body>

</html>