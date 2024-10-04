<!DOCTYPE HTML>
<html>

<head>
	<title>Contoh Fungsi Tukar</title>
</head>

<body>

	<?php
	function tukar($a, $b)
	{
		$temp = $a;
		$a = $b;
		$b = $temp;

		echo "a = " . $a . "<br>";
		echo "b = " . $b . "<br>";
	}
	?>

	<?php
	$a = 1;
	$b = 2;

	tukar($a, $b)
	?>

</body>

</html>