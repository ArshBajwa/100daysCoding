const mongoose=require("mongoose");
mongoose.connect("mongodb+srv://admin:71biE7JBLvzWdmLg@cluster0.fkkoc4h.mongodb.net/?retryWrites=true&w=majority")
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

