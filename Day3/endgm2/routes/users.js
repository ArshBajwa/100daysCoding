const mongoose=require("mongoose");
mongoose.connect("uri")
.then(()=>console.log("database connected"));

const userSchema=mongoose.Schema({
  username:String,
  nickname:String,
  description:String,
  categories:{
    type:Array,
    default:[]
  },
  datecreated:{
    type:Date,
    default:Date.now(),
  }
});

module.exports=mongoose.model("user",userSchema);

