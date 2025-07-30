import Post from '../models/post.js';
const homePage = (req, res) => {
    res.render('index', { title: 'Dark Halo' });
}
const createPost = (req, res) => {
    res.render('createPost', { title: 'Create New Post'});
}
const storePost = async (req, res) => {
    try {
    console.log(req.body);
    }catch (error){
    console.log(error);
    }
}

export default {
    homePage, createPost, storePost
}
