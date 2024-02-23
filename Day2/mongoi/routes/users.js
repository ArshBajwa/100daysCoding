const mongoose=require("mongoose");
mongoose.connect("mongodb+srv://admin:71biE7JBLvzWdmLg@cluster0.fkkoc4h.mongodb.net/?retryWrites=true&w=majority")
.then(()=>console.log("database connected"));
const userSchema=mongoose.Schema({
  userName:String,
  name:String,
  age:Number,
});
module.exports=mongoose.model("users",userSchema);
