var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res) {
  res.render('index');
});

router.get('/failed', function(req, res) {
    req.flash("age",12);
    req.flash("naam","harsh");
    res.send("bangya");
});
router.get('/checkkaro', function(req, res) {
    console.log(req.flash("age"),req.flash("naam"));
    res.send("check krlo");
});
module.exports = router;
