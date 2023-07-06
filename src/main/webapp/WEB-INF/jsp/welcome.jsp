<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf" %>

<div class="container">

 <div class="panel panel-primary">     
        <div>
        <td><a type="button" class="btn btn-vector"
        href="/list-vector?id=1">VECTOR</a></td>
        
        <form method="post" action="list-vector">
		Enter Id to get Vector Data : <input type="text" name="id"><br>
		<input type="submit"><br>
	    </form>
	    <td></td>
	    <td></td>
	    
	    <form method="post" action="vectorByVectorId">
		Enter Vector Id to get Mean & Standard Deviation : <input type="text" name="vector_id"><br>
		<input type="submit"><br>
	    </form>
        
        </div>
     </div>
 </div>
