const letter = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j"];

let text = "";
for (let i = 0; i < letter.length; i++) {
  text += "Letter : " + letter[i] + "<br>";
}

document.getElementById("lttr").innerHTML = text;