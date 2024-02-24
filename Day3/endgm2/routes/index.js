var express = require('express');
var router = express.Router();
const  userModel=require("./users");
const { default: mongoose } = require('mongoose');

/* GET home page. */
router.get('/', function(req, res) {
  res.render('index');
});

router.get("/create",async function(req,res){
  //   const userdata=await userModel.create({
  //     username:"arshi",
  // nickname:"aru",
  // description:"i am a girl who loves mongo",
  // categories:['badminton','mongo','nando'],
  //   });
  //   res.send(userdata);
});

//1.how can we perform case insensitive search in mongoose
// router.get("/find",async function(req,res){
//   var regex=new RegExp("^HARshita$",'i');
//      let user= await userModel.find({username:regex});
//      res.send(user);
// })

//2.how can we find documents where an array field contains all of a set of values?
// router.get("/find",async function(req,res){
//        let user= await userModel.find({categories:{$all:['fashion']}});
//        res.send(user);
//   })

 //3. serach for documents with specific date range in mongoose

//  router.get("/find",async function(req,res){
//          var date1= new Date('2024-02-24');
//          var date2=new Date('2024-03-24');
//        let user= await userModel.find({datecreated:{$gte:date1,$lte:date2}});
//        res.send(user);
//   })
 
  //4.how can i filter documents based on the existence of  field in mongoose

  // router.get("/find",async function(req,res){
          
  //        let user= await userModel.find({categories:{$exists:true}});
  //        res.send(user);
  //   })


 //5.how can i filter documents based on a specific fileds length in Mongoose?

 router.get("/find",async function(req,res){
          
  let user= await userModel.find({
    $expr:{
    $and:[
      {$gte:[{$strLenCP:'$nickname'},0]},
        {$lte:[{$strLenCP:'$nickname'},12]}
    ]
  }});
  res.send(user);
});
 
 
   



module.exports = router;
