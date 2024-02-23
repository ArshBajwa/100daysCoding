var express = require('express');
var router = express.Router();
// const userModel=require("./users");

/* GET home page. */

//create cookie
router.get("/",function(req,res){
  res.cookie("age",1);
  res.render("index");
})

//read cookie
router.get("/read",function(req,res){
    console.log(req.cookies.age);
    res.send("check");
});

//delete cookie
 router.get("/delete",function(req,res){
  res.clearCookie("age");
  res.send("clear hogui");
 });

//create session
router.get('/', function(req, res, next) {
  req.session.banned=true;
  res.render('index', { title: 'Express' });
});
//check session and it will banned
router.get("/checkban",function(req,res){
  if(req.session.banned===true){
  res.send("you are banned");
  }
  else{
    res.send("not banned");
  }
});
//delete session
router.get("/removeban",function(req,res){
    req.session.destroy(function(err){
      if(err)throw err;
      res.send("session removed");
    })
})

























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


