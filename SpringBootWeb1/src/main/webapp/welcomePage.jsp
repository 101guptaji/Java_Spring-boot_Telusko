<%@page language="java" %>

    <html>

    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>

    <h2>Hello ${student!=null ? student.name : ""}</h2>

    <p>Welcome to the ${course} World</p>

    </body>

    </html>