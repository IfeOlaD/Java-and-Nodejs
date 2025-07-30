import mongoose from 'mongoose';
import chalk from 'chalk';
const database = (async () => {
    try {
	await connect('mongodb://0.0.0.0:27017/Dark-Halo', {
	useNewUrlParser: true,
	useUnifiedTopology: true,
    });
	console.log(blue('Database connected'));
    }
    catch (error) {
	console.log(chalk.red(error));
    }
})();
export default database;
