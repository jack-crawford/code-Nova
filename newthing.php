<?php
echo "<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<style>
html,body { margin: 0 }
nav, footer { height: 20px; background: blue }
footer { position: absolute; bottom: 0; width: 100% }
#wrap { background: gray; position: absolute; bottom: 20px; top: 20px; right: 3%; left: 3% }
#wrap .content { height: 100% }
}
</style>
<nav>hey there</nav>
<div id='wrap'>
    <div class='content'>
      <div id='live_data'></div>


    </div>




</div>
<footer><input type='file' accept='image/*' capture='camera' title='upload image'/></footer>";

function fetch_data(){
      $.ajax({
           url:"select.php",
           method:"POST",
           success:function(data){
                $('#live_data').html(data);
           }
      });
 }
fetch_data();









?>
