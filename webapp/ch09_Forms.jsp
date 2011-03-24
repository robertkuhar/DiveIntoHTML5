<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE html>
<html lang="en">
<head>
<title>DiveIntoHTML5 CH09</title>
</head>
<body>
  <h1>Dive Into HTML5: No. 9. A Form of Madness</h1>
  <form action="RequestDumper">
    <table>
      <tr>
        <td>Placeholder</td>
        <td><input name="placeholder" placeholder="Placeholder Text Here" />
        </td>
      </tr>
      <tr>
        <td>Autofocus</td>
        <td><input name="autofocus" placeholder="Autofocus Here" autofocus/>
        </td>
      </tr>
      <tr>
        <td>Email</td>
        <td><input type="email" name="email" placeholder="Email Addresss Here"/>
        </td>
      </tr>
      <tr>
        <td>URL</td>
        <td><input type="url" name="url" placeholder="URL Here"/>
        </td>
      </tr>
      <tr>
        <td>Number</td>
        <td><input type="number" name="number" min="0" max="10" step="2" value="6" placeholder="Number from 0 through 10 Here" />
        </td>
      </tr>
      <tr>
        <td>Range</td>
        <td><input type="range" name="range" min="0" max="10" step="2" value="6" />
        </td>
      </tr>
      <tr>
        <td>Date</td>
        <td><input type="date" name="date" placeholder="Date here"/>
        </td>
      </tr>
      <tr>
        <td>Month</td>
        <td><input type="month" name="month" placeholder="Month here"/>
        </td>
      </tr>
      <tr>
        <td>Week</td>
        <td><input type="week" name="week" placeholder="Week here"/>
        </td>
      </tr>
      <tr>
        <td>Time</td>
        <td><input type="time" name="time" placeholder="Time here"/>
        </td>
      </tr>
      <tr>
        <td>DateTime</td>
        <td><input type="datetime" name="datefime" placeholder="DateTime here"/>
        </td>
      </tr>
      <tr>
        <td>DateTime-Local</td>
        <td><input type="datetime-local" name="datetime-local" placeholder="DateTime Local here"/>
        </td>
      </tr>
      <tr>
        <td>Search</td>
        <td><input type="search" name="search" placeholder="Search here"/>
        </td>
      </tr>
      <tr>
        <td>Color</td>
        <td><input type="color" name="color" placeholder="Color here"/>
        </td>
      </tr>
      <tr>
        <td><input type="submit" value="Submit" />
        </td>
        <td>
      </tr>
    </table>
  </form>
</body>
</html>
