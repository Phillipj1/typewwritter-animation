$w.onReady(function () {
const TEXT = "Hello, I'm your virtual assistant How may I help you today?";
 // Define the text you want to display as a virtual assistant's message

let typewrittenText = " ";
//array
//timeout

const textArray = Array.from(TEXT);
textArray.forEach((char,index)=>{
	setTimeout(() => {
		typewrittenText += char;
		$w("#typewritter").text = typewrittenText;
	}, 100*index);
})
console.log(textArray);

