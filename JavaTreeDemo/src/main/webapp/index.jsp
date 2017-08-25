<html>
<head>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">


</head>
<body>
<table class="table">
    <tr>
        <th class="header">
            Color Tree Demo
        </th>
    </tr>
    <tr>
        <td class="outputColumn">
            The image on the right shows the default tree layout and color mapping.<br />
            Clarification for terms used:
            <ul>
                <li>Nodes are each subsequent layer, down from the top.</li>
                <li>Branches are each cluster of objects on the same level, but each tied to a different parent on the level above.</li>
                <li>Positions are the location of each object within a branch.</li>
            </ul>

            Below we have three outputs based on different color mappings: <br />
            <ul>
                <li>The first is the default color scheme on the right.</li>
                <li>The second is a color scheme where every color is orange.</li>
                <li>The third is a color scheme with only red and blue colors.</li>
            </ul>
        </td>
        <td class="outputColumn">
            <img src="img/javatree.png" alt="Tree Layout" />
        </td>
    </tr>
    <tr>
        <td class="outputColumn">
            Output for default color configuration:
        </td>
        <td class="outputColumn">
            ${defaultResults}
        </td>
    </tr>
    <tr>
        <td class="outputColumn">
            Output for all-orange color configuration:
        </td>
        <td class="outputColumn">
            ${allOrangeResults}
        </td>
    </tr>
    <tr>
        <td class="outputColumn">
            Output for no-orange color configuration:
        </td>
        <td class="outputColumn">
            ${noOrangeResults}
        </td>
    </tr>

</table>
</body>
</html>
