const mongoose=require("mongoose");
mongoose.connect("uri")
.then(()=>console.log("database connected"));
const userSchema=mongoose.Schema({
  userName:String,
  name:String,
  age:Number,
});
module.exports=mongoose.model("users",userSchema);
