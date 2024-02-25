const mongoose=require("mongoose");
const plm=require("passport-local-mongoose");
mongoose.connect("mongodb+srv://admin:71biE7JBLvzWdmLg@cluster0.fkkoc4h.mongodb.net/?retryWrites=true&w=majority")
.then(()=>console.log("database connected"));
const userSchema=mongoose.Schema({
  username:String,
  password:String,
  secret:String
});
userSchema.plugin(plm);

module.exports=mongoose.model("user",userSchema);

