<%--
  Created by IntelliJ IDEA.
  User: can.mandraci
  Date: 7/29/2022
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Bayilik Formu</title>
    <style type="text/css">

        label{
            display : inline-block;
            width: 200px;
            margin: 5px;
            text-align: left;
        }

        button{
            padding :10px;
            margin : 10px;
        }

        input[type=text],input[type=password],select{
            width: 200px;
        }

        input[type=radio]{
            display :inline-block;
            margin-left:45px;
        }
    </style>
</head>
<body>
    <div align="center">
        <h2>BAYİLİK ÖN BAŞVURU FORMU</h2>
        <%--@elvariable id="userInformation" type=""--%>
        <form:form action="bayilik" method="post" modelAttribute="userInformation">
            <form:label path="fullName">Ad/Soyad :</form:label>
            <form:input path="fullName"/><br>

            <form:label path="citizenId">TC Kimlik No :</form:label>
            <form:input path="citizenId"/><br>

            <form:label path="address">Adres :</form:label>
            <form:input path="address"/><br>

            <form:label path="phoneNumber">Telefon :</form:label>
            <form:input path="phoneNumber"/><br>

            <form:label path="mail">E-Mail :</form:label>
            <form:input path="mail"/><br>

            <form:label path="birthDate">Doğum Tarihi :</form:label>
            <form:input path="birthDate"/><br>

            <form:label path="soru1">Perakende ticareti ile uğraştınız mı?</form:label>
            <form:radiobutton path="soru1" value="Evet"/>Evet
            <form:radiobutton path="soru1" value="Hayır"/>Hayır<br/>

            <form:label path="soru2">Lokumcu Baba'yı tercih etmenizin sebebi nedir?</form:label>
            <form:input path="soru2"/><br>

            <form:label path="soru3">Hangi İl/İlçe/Semt için Lokumcu Baba İşletmeciliği düşünüyoruz?</form:label>
            <form:select path="soru3" items="${bölgeList}"/><br>

            <form:label path="soru4">Yatırım miktarınız nedir?</form:label>
            <form:input path="soru4"/><br>

            <form:label path="eklemekIstedikleriniz">Eklemek istedikleriniz :</form:label>
            <form:textarea path="eklemekIstedikleriniz" rows="5" cols="25"/><br>

            <form:button>Gönder</form:button>
        </form:form>
    </div>
</body>
</html>
