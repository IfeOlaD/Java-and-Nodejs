import mongoose from 'mongoose';
const postSchema = new mongoose.Schema({
    title: {
	type: String,
	required: true,
    },
    description: {
	type: String,
	required: true,
    },
    content: {
	type: String,
	required: true,
    },
    image: {
	type: String,
    },
    username: {
	type: String,
	required: true,
    },
    createdAt: {
	type: Date,
	default: Date.now,
    },
});
const Post = mongoose.model('Post', postSchema);
export default Post;
