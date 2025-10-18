<!DOCTYPE HTML>
<html>

<head>
	<title>Example Exchange Data Array</title>
</head>

<body>

	<?php
	$varlttr = array("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
	$varlttr[1] = "x";
	$varlttr[9] = "z";
	echo "Letter : " . $varlttr[1] . "<br>";
	echo "Letter : " . $varlttr[9] . "<br>";
	?>

</body>

</html>