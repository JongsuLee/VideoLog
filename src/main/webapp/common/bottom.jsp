<%@page import="dev.web.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${empty login}">
</c:if>

<c:if test="${! empty login}">
	<h3>Video List</h3>
</c:if>
