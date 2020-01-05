<p class="lead">Categorías</p>
<div class="list-group">
	<c:forEach items="${categorias}" var="categoria">
		<a href="${contextRoot}/show/category/${categoria.id}/products" class="list-group-item" id="a_${categoria.nombre}">${categoria.nombre}</a>
	</c:forEach>
</div>