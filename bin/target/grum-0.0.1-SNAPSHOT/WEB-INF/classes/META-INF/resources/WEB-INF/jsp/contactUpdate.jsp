<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

            <h1 class="title">Update Contact</h1>

            <form:form method="post" modelAttribute="contact">
                <table class="table is-bordered is-striped is-fullwidth" style="margin:15px 0">        
                    <form:hidden path="id" />
                    <tbody>
                        <tr>
                            <th>First Name</th>
                            <td><form:input path="firstName" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <th>Last Name</th>
                            <td><form:input path="lastName" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <th>Company</th>
                            <td><form:input path="company" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <th>Business Unit</th>
                            <td><form:input path="businessUnit" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <th>Department</th>
                            <td><form:input path="department" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <th>Team</th>
                            <td><form:input path="team" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <th>Email Address</th>
                            <td><form:input path="emailAddress" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <th>External Telephone No.</th>
                            <td><form:input path="externalTelephoneNo" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <th>Internal Telephone No.</th>
                            <td><form:input path="internalTelephoneNo" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <th>Mobile No.</th>
                            <td><form:input path="MobileNo" cssClass="input" /></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input class="button is-primary" type="submit" value="Update" />
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form:form>

            <a href="/${fn:escapeXml(contact.id)}" class="button">Back</a>

        </div>
    </section>

</body>
</html>