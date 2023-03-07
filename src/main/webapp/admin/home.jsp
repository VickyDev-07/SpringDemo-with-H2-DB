<!DOCTYPE html>
<html>
<head>
  <title>Welcome!!</title>
</head>
<body>
  <h2>Demo Project with DB</h2>
  <form action="addUser">
<p>
      <label>Enter ID : <input type="text" name="ID"/></label>
    </p>
<p>
      <label>Enter Name : <input type="text" name="name" /></label>
    </p>
<p>
       <input type="submit"><br>
    </p>
    </form>
    <h2>Enter ID to Check Details,</h2>
 <form action="showUser">
    <p>
          <label>Enter ID : <input type="text" name="ID"/></label>
        </p>
     <p>
           <input type="submit"><br>
        </p>

 </form>
 <h2>Enter ID to Delete,</h2>
  <form action="deleteUser">
     <p>
           <label>Enter ID : <input type="text" name="ID"/></label>
         </p>
      <p>
            <input type="submit"><br>
         </p>

  </form>
  <h2>Enter ID to Update,</h2>
    <form action="updateUser">
       <p>
             <label>Enter ID : <input type="text" name="ID"/></label>
           </p>
        <p>
              <input type="submit"><br>
           </p>

    </form>

</body>
</html>