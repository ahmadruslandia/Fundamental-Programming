<!DOCTYPE HTML>
<html>

<head>
	<title>Example Exchange</title>
</head>

<body>

	<?php
	function exchange($a, $b)
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

	exchange($a, $b)
	?>

</body>

</html>