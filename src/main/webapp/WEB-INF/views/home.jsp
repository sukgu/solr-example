<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>  The uRStatus on the solr is ${uRStatus}. </P>
<P>  The solrToString on the solr is ${solrToString}. </P>

<a href = "search">Search</a>

</body>
</html>
