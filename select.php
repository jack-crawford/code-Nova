<?php
$connect = mysqli_connect("localhost", "root", "p0k3m0n1", "juice");
function select($connect) {


   $sql = "SELECT * FROM text_content ORDER BY id";
   $result = mysqli_query($connect, $sql);
   $output .= '
        <div class="table-responsive">
             <table class="table table-bordered">
                  <tr>
                       <th width="40%">Content</th>
                       <th width="10%">Button</th>
                  </tr>';
   if(mysqli_num_rows($result) > 0)
   {
        while($row = mysqli_fetch_array($result))
        {
             $output .= '
                  <tr>
                       <td class="text" data-id1="'.$row["id"].'" contenteditable>'.$row["text"].'</td>
                       <td><button type="button" name="delete_btn" data-id3="'.$row["id"].'" class="btn btn-xs btn-danger btn_delete">x</button></td>
                  </tr>
             ';
        }
        $output .= '

        ';
   }
   else {
        $output .= '<tr>
                            <td colspan="4">Data not Found</td>
                       </tr>';
   }
   $output .= '</table>
        </div>';
   echo $output;
}
function delete($connect) {
  $sql = "DELETE FROM text_content WHERE id = '".$_POST["id"]."'";
  if(mysqli_query($connect, $sql)){
      echo 'Data Deleted';
  }
}
function edit($connect) {
  $id = $_POST["id"];
   $text = mysqli_real_escape_string($connect, $_POST["text"]);
   $sql = "UPDATE text_content SET 'text' = '$text' WHERE id='".$id."'";
   if(mysqli_query($connect, $sql))
   {
        echo 'Data Updated';
   }
}
function insert($connect){
   $val = mysqli_real_escape_string($connect, $_POST['text']);
   $sql = "INSERT INTO text_content(text) VALUES('$val');";
   if(mysqli_query($connect, $sql))
   {
        echo 'Data Inserted';
   }
 }


$method = $_GET['method'];
if (!empty($method)){
  $method($connect);
} else {
  echo "hi there";
}
?>
