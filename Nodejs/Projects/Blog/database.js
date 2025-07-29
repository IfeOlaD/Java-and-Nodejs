const mongoose = require('mongoose');
const chalk = require('chalk');
const database = (async () => {
    try {
	await mongoose.connect('mongodb://0.0.0.0:27017/Dark-Halo', {
	useNewUrlParser: true,
	useUnifiedTopology: true
    });
	console.log(chalk.blue('Database connected'));
    }
    catch (error) {
	console.log(chalk.red(error));
    }
})();
module.exports = database;
