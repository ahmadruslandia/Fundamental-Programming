<!DOCTYPE HTML>
<html>

<head>
	<title>Example Looping Data Array</title>
</head>

<body>

	<?php
	$varlttr = array("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
	for ($i = 0; $i < 10; $i++) {
		echo "Letter : " . $varlttr[$i] . "<br>";
	}
	?>

</body>

</html>