<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="alert alert-info">Input Data Here</div>
<div class="hero-unit">
    <form class="form-horizontal">
        <div class="control-group">
            <label class="control-label">NIM</label>
            <div class="controls">
                <input type="text">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Name</label>
            <div class="controls">
                <input type="text">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputEmail">Email</label>
            <div class="controls">
                <input type="text" id="inputEmail">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Interest</label>
            <div class="controls">
                <select type="text">
                    <option value="JSC">JSC</option>
                    <option value="KSWeb">KSWeb</option>
                    <option value="KSL">KSL</option>
                    <option value="IDC">IDC</option>
                    <option value="KSMulmed">KSMulmed</option>
                </select>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label"></label>
            <div class="controls">
                <button class="btn btn-warning" type="reset"><i class="icon-chevron-left"></i>Reset</button>
                <button class="btn btn-primary" type="submit"><i class="icon-chevron-right"></i>Save</button>
            </div>
        </div>
    </form>
</div>