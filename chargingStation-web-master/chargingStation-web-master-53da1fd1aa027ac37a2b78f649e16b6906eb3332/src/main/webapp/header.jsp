<%@ page language="java" pageEncoding="UTF-8" %>
<%@include file="common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <title>无标题文档</title>
    <c:choose>
        <c:when test="${ISDEV}">
            <link rel="stylesheet" type="text/css" href="${path}/css/style.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/css/jquery.circliful.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/css/font/iconfont.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/js/3rd/validate/validationEngine.jquery.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/js/3rd/jstree/themes/default/style.min.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/js/3rd/webuploader/webuploader.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/js/3rd/fancybox/jquery.fancybox-1.3.4.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/js/3rd/select/select.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/js/3rd/Jcrop/css/jquery.Jcrop.min.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/js/3rd/select2/css/select2.css"/>
        </c:when>
        <c:when test="${!ISDEV}">
            <link rel="stylesheet" type="text/css" href="${path}/wro/basic.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/js/3rd/jstree/themes/default/style.min.css"/>
            <link rel="stylesheet" type="text/css" href="${path}/js/3rd/fancybox/jquery.fancybox-1.3.4.css"/>
        </c:when>
    </c:choose>
</head>
<body>
<script>
    var frameUrl = document.baseURI;
    document.onkeydown = function (event) {
        var e = event || window.event;
        if (e.keyCode == 116) {
            //阻止默认刷新
            e.preventDefault();
            window.location.href = frameUrl;
        }
    }
</script>