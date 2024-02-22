var express = require('express');
var router = express.Router();
var userModel=require("./users");

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

router.get("/create",async function(req,res){
  const createdUser=await userModel.create({
    username:"Rahul",
    name:"Rahul",
    age:24
  })
  res.send(createdUser);
});

router.get("/users",async function(req,res){
   const allUsers=await userModel.findOne();
   res.send(allUsers);

});

router.get("/deleteUsers",async function(req,res){
  const deleteUser=await userModel.findOneAndDelete({
    username:"Rahul"
  });
  res.send(deleteUser);
});
module.exports = router;
