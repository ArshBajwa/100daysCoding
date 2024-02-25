const mongoose=require("mongoose");
mongoose.connect("uri")
.then(()=>console.log("database connected"));

 const userschema = mongoose.Schema({
  username:String,
  name:String,
  age:Number
})

module.exports = mongoose.model("user",userschema);



