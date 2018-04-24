
$(document).ready(function(){
    $("#flip").click(function(){
        $("#panel").slideToggle("fast");
    });
});

$(document).ready(function(){

	// Der Button wird mit JavaScript erzeugt und vor dem Ende des body eingebunden.
/*<img src="up.png" alt="Pfeil" title="arrow">*/	var back_to_top_button = ['<a href="#top" class="back-to-top" title="arrow"><span><i class="fa fa-chevron-circle-up fa-3x blackiconcolor" aria-hidden="true"></i></span></a>'].join("");
	$("body").append(back_to_top_button)

	// Der Button wird ausgeblendet
	$(".back-to-top").hide();

	// Funktion für das Scroll-Verhalten
	$(function () {
		$(window).scroll(function () {
			if ($(this).scrollTop() > 1700) { // Wenn 1700 Pixel gescrolled wurde
				$('.back-to-top').fadeIn();
			} else {
				$('.back-to-top').fadeOut();
			}
		});

		$('.back-to-top').click(function () { // Klick auf den Button
			$('body,html').animate({
				scrollTop: 0
			}, 1000);    //Geschwindigkeit
			return false;
		});
	});

});
 
 (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-98384426-1', 'auto');
  ga('send', 'pageview');

  var x = true;
  function remove() {
 if (x){
 
	
	document.getElementById("rotate").classList.add('timer');
	document.getElementById("rotate").innerHTML="";
	
	$(".removechild").fadeOut();
	
	setTimeout(function(){ x = false;document.getElementById("rotate").classList.remove('timer');document.getElementById("rotate").innerHTML="Einblenden"; }, 1000);

  

	
	

 }
 else{
	
	document.getElementById("rotate").classList.add('timer');
	var l = document.getElementById("aufklappen");
	document.getElementById("rotate").innerHTML="";
	$(".removechild").fadeIn();
	
	setTimeout(function(){ x = true; document.getElementById("rotate").classList.remove('timer');document.getElementById("rotate").innerHTML="Ausblenden"; }, 1000);


 }
 
  };
 
 
  var y = 0;
  var arr = new Array("bueffel.jpg","trauben.jpg","wecker.jpg");	
 function prev(){
	 
  
	var l = document.getElementById("switch"); 
	
	y++;
 	if(y >= arr.length){
		y = 0;
	}
	l.src = arr[y];
 }

 function next(){
	 
  
   
	var l = document.getElementById("switch"); 
	
	y--;
 	if(y < 0){
		y = arr.length-1;
	}
l.src = arr[y];
 }
  
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
    document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
	 
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft= "0";
    document.body.style.backgroundColor = "#cecdca";//<-Background-color change
}

function myFunction(x) {
    x.classList.toggle("change");
}
  
 // Hover
 
 $(document).ready(function(){
$('.a').hover(function(){
$('.a span').toggleClass('active')
})
})

 
 $(document).ready(function(){
$('.b').hover(function(){
$('.b span').toggleClass('active')
})
})


 
 $(document).ready(function(){
$('.c').hover(function(){
$('.c span').toggleClass('active')
})
})


  
  
  
  
  
  
  
  
  