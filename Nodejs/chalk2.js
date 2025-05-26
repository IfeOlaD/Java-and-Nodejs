const express = require("express");
const chalk = require("chalk");

const app = express();

app.get("/",(req,res) => {
    console.log(chalk.green.bold("Incoming Request: ") + req.methid + " " + res.url);
    res.send("Hello, World!");
});

app.listen(3000, () => {
    console.log(chalk.blue.bold("Server running on port 3000..."));
});
