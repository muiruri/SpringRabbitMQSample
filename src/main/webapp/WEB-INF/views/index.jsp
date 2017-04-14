<%--
  Created by IntelliJ IDEA.
  User: kenny
  Date: 14/04/2017
  Time: 09:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Rabbit MQ Sample Application</title>
    <link href='resources/vendor/bootstrap/dist/css/bootstrap.min.css' rel='stylesheet' type='text/css' />
</head>
<body>
    <div class="col-md-offset-1 col-md-10">
        <div class="page-header">
            <h1>Spring MVC RabbitMQ Sample <br/><small> a sample application demonstrating how Spring MVC can be used to produce and consume messages using RabbitMQ</small></h1>
        </div>
        <div class="form-group">
            <label>Enter message</label>
            <textarea class="form-control input-sm" cols="3" rows="5" id="message" placeholder="Enter your message"></textarea>
        </div>
        <div class="form-group">
            <button class="btn btn-sm btn-primary" id="sendMessage">Send message</button>
        </div>
    </div>
</body>

<script src="resources/vendor/jquery/dist/jquery.min.js"></script>
<script src="resources/vendor/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="resources/vendor/notifyjs/dist/notify.js"></script>
<script src="resources/js/app.js"></script>
</html>
