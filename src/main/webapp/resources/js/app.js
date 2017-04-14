/**
 * Created by kenny on 14/04/2017.
 */

var app = app || {};

$(function () {
    $("#sendMessage").click(function(evt) {
        var msg = $("#message").val();

        $.ajax({
            type: "POST",
            url: "sendMessage",
            contentType: "application/json",
            data: msg
        }).done(function(data){
            alert(data);

        }).fail(function(data){
            alert("Error");
        });
    });
});