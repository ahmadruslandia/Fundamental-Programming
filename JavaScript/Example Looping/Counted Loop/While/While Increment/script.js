let text = "";
let i = 0;

while (i < 10) {
  text += "Looping While - " + i + "<br>";
  i++;
}

document.getElementById("i").innerHTML = text;