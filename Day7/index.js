var express = require('express');
var router = express.Router();
const userModel=require("./users");
const postModel=require("./post");
const passport = require('passport');
const localStrategy=require("passport-local");
passport.use(new localStrategy(userModel.authenticate()));
router.get('/',function(req,res,next){
  res.render('index',{title:'Express'});
});

router.get('/login',function(req,res,next){
  res.render('login');
});

router.get('/profile',isLoggedIn,function(req,res,next){
  res.send("profile");
});
router.post("/register", (req, res) => {
  const {username,email,fullname}=req.body;
  const userData=new userModel({username,email,fullname});
  userModel.register(userData,req.body.password)
  .then(function(){
    passport.authenticate("local")(req,res,function(){
      res.redirect("/profile");
    })
  })
});
router.post("/login", passport.authenticate("local",{
  successRedirect:"/profile",
  failureRedirect:"/"
}),(req, res) =>{
});

router.get("/logout",function(req,res){
  req.logout(function(err){
    if(err){
      return next(err);
    }
    res.redirect('/');
  });
})
function isLoggedIn(req,res,next){
  if(req.isAuthenticated())return next();
  res.redirect("/");


}

router.get('/alluserposts',async function(req,res,next){
    let user=await userModel.findOne({_id:"65ddf2c1d5de1d6ac6bcd98d"});
    res.send(user);
})
router.get('/createUser',async function(req,res,next){
    let createdUser= await userModel.create({
      username: "Arshia",
      password: "harshe",
      posts: [],
      email:"harshe@gmail.com",
      fullName:"Harsh eVandana Sharma",
     });
     res.send(createdUser);
});

router.get('/createpost',async function(req,res,next){
  let createdpost= await postModel.create({
   postText:"Hello Kaise saare tum", 
    user:"65dde639e5c9a3edd6924328"  
  });
 let user=await userModel.findOne({_id: "65dde639e5c9a3edd6924328"});
 user.posts.push(createdpost._id);
 await user.save();
  res.send("done");
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


