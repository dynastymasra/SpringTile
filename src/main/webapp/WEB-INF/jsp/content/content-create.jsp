<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="alert alert-info">Input Data Here</div>
<div class="hero-unit">
    <c:url var="mahasiswaUrl" value="/mahasiswa"/>
    <form:form modelAttribute="mahasiswa" method="post" action="${mahasiswaUrl}" class="form-horizontal">
        <div class="control-group">
            <form:label path="nim" class="control-label">NIM</form:label>
            <div class="controls">
                <form:input path="nim" type="text"/>
            </div>
        </div>
        <div class="control-group">
            <form:label path="name" class="control-label">Name</form:label>
            <div class="controls">
                <form:input path="name" type="text"/>
            </div>
        </div>
        <div class="control-group">
            <form:label path="email" class="control-label" for="inputEmail">Email</form:label>
            <div class="controls">
                <form:input path="email" type="text"/>
            </div>
        </div>
        <div class="control-group">
            <form:label path="jurusan" class="control-label">Jurusan</form:label>
            <div class="controls">
                <form:input path="jurusan" type="text"/>
            </div>
        </div>

        <div class="control-group">
            <label class="control-label"></label>
            <div class="controls">
                <button class="btn btn-warning" type="reset"><i class="icon-chevron-left"></i>Reset</button>
                <button class="btn btn-primary" type="submit"><i class="icon-chevron-right"></i>Save</button>
            </div>
        </div>
    </form:form>
</div>