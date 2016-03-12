/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



$("#login #cancel").click(function () {
    $(this).parent().parent().hide();
      $("#nav-right").css("display", "block");
    
    $(".footer").css("display", "none");
     $("#wrapper").css("display", "block");
     $(".slider-home").css("display", "block");
});



$("#onclick").click(function () {
    $("#logindiv").css("display", "block");
    $("#nav-right").css("display", "none");
    $("#wrapper").css("display", "none");
     $(".slider-home").css("display", "none");
     $(".footer").css("display", "none");

});

$("#onclick-order").click(function () {
    $("#order").css("display", "block");
    $("#wrapper").css("display", "none");
    $("#nav-right").css("display", "none");
    $(".slider-home").css("display", "none");
$(".footer").css("display", "none");

});


$("#close-btn-order").click(function () {
    $("#order").css("display", "none");
    $("#nav-right").css("display", "block");
    $(".slider-home").css("display", "block");
    $("#wrapper").css("display", "block");
    $(".footer").css("display", "block");

});

$("#close-btn-login").click(function () {
    $("#logindiv").css("display", "none");
    $("#nav-right").css("display", "block");
        $(".footer").css("display", "block");

    
     $("#wrapper").css("display", "block");
     $(".slider-home").css("display", "block");

});

$("#close-btn-signup").click(function () {
    $("#signup").css("display", "none");
    $("#nav-right").css("display", "block");
        $(".footer").css("display", "block");

});


$("#onclick-signup").click(function () {
    $("#signup").css("display", "block");
    $("#nav-right").css("display", "none");
});




function validateEmail(email) {
    var filter = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
    if (filter.test(email)) {
        return true;
    } else {
        return false;
    }
}


// validation Login form 
$("#loginbtn").click(function () {
    var name = $("#username").val();
    var password = $("#password").val();
    if (username == "" || password == "") {
        alert("Username or Password was Wrong");
    } else {
        $("#logindiv").css("display", "none");
    }
});
 