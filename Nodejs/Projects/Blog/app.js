const express = require('express');
const chalk = require('chalk');
const fileupload = require('express-fileupload');
const expressLayouts = require('express-ejs-layouts');
const app = express();
const {homePage, createPost, storePost} = require('./controllers/postcon');
const database = require('./database');

app.set('view engine', 'ejs');
app.set('views', `${__dirname}/views`);
app.use(express.static('public'));
app.use(express.urlencoded((extended: true)));
app.use(express.json());
app.use(expressLayouts);

app.set('layout', 'layouts/app');

app.get('/', homePage);
app.get('/posts/new', createPost);
app.post('/posts/store', storePost);

/* app.get('/', (req, res) => {
    res.render('index', { title: 'Dark Halo' });
}); */

app.listen(3000, () => {
    console.log(chalk.blue('Server started on port 3000\n') +
chalk.yellow('Press CTRL + C to end server'));
});
