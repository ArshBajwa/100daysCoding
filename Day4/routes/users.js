const mongoose=require("mongoose");
const plm=require("passport-local-mongoose");
mongoose.connect("uri")
.then(()=>console.log("database connected"));
const userSchema=mongoose.Schema({
  username:String,
  password:String,
  secret:String
});
userSchema.plugin(plm);

module.exports=mongoose.model("user",userSchema);

