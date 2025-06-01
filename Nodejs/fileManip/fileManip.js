const fs = require('fs');

fs.writeFile('example.txt', "This is a file created with Nodejs", (err) =>{
	if(err)
		throw err;
		console.log('File created successfully');
});

fs.readFile('example.txt', 'utf8',(err, data) =>{
	if(err)
		throw err;
		console.log(data);
});

fs.appendFile('example.txt', ". Appended texts", (err) =>{
	if(err)
		throw err;
		console.log("Data Successfully appended");
});

fs.copyFile('newExample.txt', 'example.txt', (err)=>{
	if(err)
		throw err;
		console.log('Data written successfully');
});
