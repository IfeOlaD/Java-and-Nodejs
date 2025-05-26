const http = require('http');

const server = http.createServer((req, res) => {
    if(req.url === './'){
	res.write('My first server');
	res.end();
    }
    else{
	res.write('Not the root');
	res.end();
    }
});

server.listen('3000');
