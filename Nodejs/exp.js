const express = require('express');

const app = express();

app.get('/',(req,res) => {
    res.send('Yeah, at last');
});

app.listen(3000);
