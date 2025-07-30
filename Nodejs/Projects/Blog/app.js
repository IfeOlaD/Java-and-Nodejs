import express, {  urlencoded, json } from 'express';
import chalk from 'chalk';
import fileupload from 'express-fileupload';
import expressLayouts from 'express-ejs-layouts';
const app = express();
import postcon from './controllers/postcon.js';
import database from './database.js';
import { dirname } from 'path';
import { fileURLToPath } from 'url';
const __filename = fileURLToPath(import.meta.url);
const __dirname = dirname(__filename);

app.set('view engine', 'ejs');
app.set('views', `${__dirname}/views`);
app.use(express.static('public'));
app.use(urlencoded({extended: true}));
app.use(json());
app.use(expressLayouts);

app.set('layout', 'layouts/app.ejs');

app.get('/', postcon.homePage);
app.get('/posts/new', postcon.createPost);
app.post('/posts/store', postcon.storePost);

/* app.get('/', (req, res) => {
    res.render('index', { title: 'Dark Halo' });
}); */

app.listen(3000, () => {
    console.log(chalk.blue('Server started on port 3000\n') +
       (chalk.yellow('Press CTRL + C to end server')));
});
