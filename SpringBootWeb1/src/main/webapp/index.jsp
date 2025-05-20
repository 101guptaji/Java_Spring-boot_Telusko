<%@page language="java" %>

    <html>

    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
    <h2>HG Calculator</h2>

    <form action="add">
        <label for="num1">Enter 1st Number :</label>
        <input type="text" id="num1" name="num1"><br>
        <label for="num2">Enter 2nd Number :</label>
        <input type="text" id="num2" name="num2"><br>
        <input type="submit" value="Submit">
    </form>

    <form action="addStudent">
                <label for="id">Enter Id :</label>
                <input type="text" id="id" name="id"><br>
                <label for="name">Enter Name :</label>
                <input type="text" id="name" name="name"><br>
                <label for="standard">Enter Standard :</label>
                <input type="text" id="standard" name="standard"><br>
                <input type="submit" value="Submit">
            </form>

    </body>

    </html>