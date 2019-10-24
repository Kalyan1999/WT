<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <head>
                <title>Books Catalog</title>
                <style>
                    table, th, td {
                        border: 1px solid black;
                        border-collapse: collapse;
                    }

                    th, td {
                        padding: 5px 15px;
                    }
                </style>
            </head>
            <body>
                <h1>Books Catalog</h1><br />
                <table>
                    <tr>
                        <th>Title</th>
                        <th>Author</th>
                        <th>ISBN</th>
                        <th>Publisher</th>
                        <th>Edition</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="bookstore/book">
                    <tr>
                        <td><xsl:value-of select="title"/></td>
                        <td><xsl:value-of select="author"/></td>
                        <td><xsl:value-of select="isbn"/></td>
                        <td><xsl:value-of select="publisher"/></td>
                        <td align="right"><xsl:value-of select="edition"/></td>
                        <td align="right">₹ <xsl:value-of select="price"/></td>
                    </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
