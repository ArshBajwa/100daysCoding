const mongoose=require("mongoose");
mongoose.connect("mongodb+srv://admin:71biE7JBLvzWdmLg@cluster0.fkkoc4h.mongodb.net/?retryWrites=true&w=majority")
.then(()=>console.log("database connected"));
const userSchema = new mongoose.Schema({
  username: {
    type: String,
    required: true,
    unique: true
  },
  password: {
    type: String,
    required: true
  },
  posts: [{
    type: mongoose.Schema.Types.ObjectId,
    ref: 'Post' // Assuming you have a Post model
  }],
  dp: {
    type: String,
    // default: 'default_dp.jpg' // Default profile picture
  },
  email: {
    type: String,
    required: true,
    unique: true
  },
  fullName: {
    type: String,
    required: true
  }
});

module.exports = mongoose.model('User', userSchema);

