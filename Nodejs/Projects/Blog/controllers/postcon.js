const Post = require('./models/Post');
const homePage = (req, res) => {
    res.render('index', { title: 'Dark Halo' });
}
const createPost = (req, res) = => {
    res.render('creatpost');
}
const storePost = async (req, res) => {
    const post = new Post({
	title: req.body.title,
    });
}

module.exports = {
    homePage, createPost, storePost
}
