<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css" rel="stylesheet" type="text/css" />
    <script defer src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>
    <title>Telephone Directory</title>
</head>
<body>

    <nav class="navbar" style="background-color: whitesmoke;">
        <div class="container">
            <div class="navbar-brand">
                <a class="navbar-item" href="/">
                    <span class="icon is-large">
                        <i class="fas fa-phone-square fa-2x"></i>
                    </span>
                    <span class="is-size-5">Telephone Directory</span>
                </a>
            </div>
        </div>
    </nav>

    <section class="section">
      <div class="container">

        <h1 class="title">Contact List</h1>

        <p class="has-text-right-tablet">
            <a href="/create" class="button is-primary">
                <span class="icon is-small">
                    <i class="fas fa-plus"></i>
                </span>
                <span>Create New</span>
            </a>
        </p>

        <table class="table is-bordered is-striped is-hoverable is-fullwidth" style="margin:15px 0">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Company</th>
                    <th>Email Address</th>
                    <th>&nbsp;</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="contact" items="${contacts}">
                    <tr>
                        <td>${fn:escapeXml(contact.lastName)}, ${fn:escapeXml(contact.firstName)}</td>
                        <td>${fn:escapeXml(contact.company)}</td>
                        <td><a href="mailto:${fn:escapeXml(contact.emailAddress)}">${fn:escapeXml(contact.emailAddress)}</a></td>
                        <td><a href="/${fn:escapeXml(contact.id)}" class="button is-link is-small is-outlined">More</a>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

      </div>
    </section>

</body>
</html>