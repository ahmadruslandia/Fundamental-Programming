const huruf = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j"];

let text = "";
for (let i = 0; i < huruf.length; i++) {
  text += "Huruf : " + huruf[i] + "<br>";
}

document.getElementById("hrf").innerHTML = text;