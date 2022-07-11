<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Report</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=DM+Sans:ital,wght@0,400;0,500;0,700;1,400;1,500;1,700&family=Fira+Code:wght@300;400;500;700&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
    <style>
        * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
            font-family: 'DM Sans', sans-serif;
        }

        .report-container {
            display: flex;
            flex-direction: column;
            margin-top: 50px;

        }

        .report-container h2 {
            text-align: center;
            margin-top: 10px;
        }

        .report-container-sub {
            width: 100%;
            height: auto;
        }

        .report-container-sub table {
            width: 95%;
            height: auto;
            margin-left: 30px;
            margin-top: 10px;

        }

        .table-header {
            height: 2.8rem;
            background: dodgerblue;
        }

        .table-header th{
            color: white;
        }

        .table-body tr td {
            text-align: left;

        }

        .text-primary {
            color: dodgerblue !important;
        }
    </style>
</head>
<body>
<jsp:include page="components/Navbar.jsp"></jsp:include>
<div class="report-container">
    <h2 class="text-primary fw-bold">Report</h2>
    <div class="report-container-sub">
        <table>
            <thead class="table-header">
            <th>Website Name</th>
            <th>Download start date time</th>
            <th>Download end date time</th>
            <th>Link Name</th>
            <th>Kilobytes Downloaded</th>

            </thead>
            <tbody class="table-body">
            <c:forEach items="${urls}" var="url">
                <tr >
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>

            </c:forEach>

            </tbody>
        </table>
    </div>

</div>

</body>
</html>