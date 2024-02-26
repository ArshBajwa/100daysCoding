var express = require('express');
var router = express.Router();
const userModel=require("./users");
const postModel=require("./post");
router.get('/',function(req,res,next){
  res.render('index',{title:'Express'});
});
router.get('/createUser',async function(req,res,next){
    let createdUser= await userModel.create({
      username: "Arshi",
      password: "harsh",
      posts: [],
      email:"harsh@gmail.com",
      fullName:"Harsh Vandana Sharma",
     });
     res.send(createdUser);
});

router.get('/createpost',async function(req,res,next){
  let createdpost= await postModel.create({
    postText: "Hello Everywhere", 
  })
  res.send(createdpost);
});


module.exports=router;





























// //create
// router.get("/create",async function(req,res){
//     const createdUser= await userModel.create({
//       userName:"harsh",
//       name:25,
//       age:"harsh"
//      });  
//      res.send(createdUser);
// });
// //read
// router.get("/allusers",async function(req,res){
//   let allusers=await userModel.findOne({username:"harsh"});
//   res.send(allusers);
// })

// //delete

// router.get("/delete",async function(req,res){
//        const deleted=await userModel.findOneAndDelete({
//              username:"harsh"
//        });
//        res.send(deleted);
// })






module.exports = router;


