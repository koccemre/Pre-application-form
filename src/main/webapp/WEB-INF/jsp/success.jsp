<%--
  Created by IntelliJ IDEA.
  User: can.mandraci
  Date: 7/29/2022
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Title</title>
    <style type="text/css">
        span{
            display: inline-block;
            width: 200px;
            text-align: left;
        }
    </style>
</head>
<body>
<div align="center">
    <h2>Form başarıyla gönderildi.</h2>
    <span>Ad/Soyad :</span><span>${userInformation.fullName}</span><br/>
    <span>TC Kimlik No :</span><span>${userInformation.citizenId}</span><br/>
    <span>Adres :</span><span>${userInformation.address}</span><br/>
    <span>Telefon :</span><span>${userInformation.phoneNumber}</span><br/>
    <span>E-mail :</span><span>${userInformation.mail}</span><br/>
    <span>Doğum Tarihi :</span><span>${userInformation.birthDate}</span><br/>
    <span>Perakende ticareti ile uğraştınız mı :</span><span>${userInformation.soru1}</span><br/>
    <span>Lokumcu Baba'yı tercih etmenizin sebebi nedir :</span><span>${userInformation.soru2}</span><br/>
    <span>Hangi İl/İlçe/Semt için Lokumcu Baba İşletmeciliği düşünüyoruz :</span><span>${userInformation.soru3}</span><br/>
    <span>Yatırım miktarınız nedir :</span><span>${userInformation.soru4}</span><br/>
    <span>Eklemek istedikleriniz :</span><span>${userInformation.eklemekIstedikleriniz}</span>
</div>
</body>
</html>
