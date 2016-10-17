jQuery(document).ready(function($) {
  
  /* Initialize Round Corner Elements */
  $('#slideshow,#slideshow,.slide-more,#slideshow-alt,.more-button,.map,.more-button, .left-head, .blog-box,.page-navigation a,.author,.pf-box-view').corner("8px");
  
   $('.ads-list').cycle({
      timeout: 5000,  // milliseconds between slide transitions (0 to disable auto advance)
      fx:      'fade', // choose your transition type, ex: fade, scrollUp, shuffle, etc...                        
      pause:   0,	  // true to enable "pause on hover"
      pauseOnPagerHover: 0 // true to pause when hovering over pager link       
  });     
  
  /* Initialize IFrame for google map */
    $(".google-map").colorbox({iframe:true, innerWidth:600, innerHeight:400});
    
    /* Initialize Portfolio Lightbox */  
    $("a[rel='portfolio']").colorbox({transition:"fade",rel:'nofollow'});		
    $(".video-embed").colorbox({iframe:true, innerWidth:600, innerHeight:400});
    
    /* Portfolio Display Switcher */
  	$("a.switch_thumb").toggle(function(){
  	  $(this).addClass("swap"); 
  	  $("ul.display").fadeOut("fast", function() {
  	  	$(this).fadeIn("fast").addClass("thumb_view"); 
  		 });
  	  }, function () {
        $(this).removeClass("swap");
  	  $("ul.display").fadeOut("fast", function() {
  	  	$(this).fadeIn("fast").removeClass("thumb_view");
  		});
  	}); 
  	
  /* Ajax Contact Form Processing */
  $('#buttonsend').click( function() {
	
		var name    = $('#name').val();
		var subject = $('#subject').val();
		var email   = $('#email').val();
		var message = $('#message').val();
		var siteurl = $('#siteurl').val();
		
		$('.loading').fadeIn('fast');
		
		if (name != "" && subject != "" && email != "" && message != "")
			{

				$.ajax(
					{
						url: siteurl+'/sendemail.php',
						type: 'POST',
						data: "name=" + name + "&subject=" + subject + "&email=" + email + "&message=" + message,
						success: function(result) 
						{
							$('.loading').fadeOut('fast');
							if(result == "email_error") {
								$('#email').css({"border":"2px solid #ff0000"}).next('.require').html('<small>invalid e-mail address</small> !');
							} else {
								$('#name, #subject, #email, #message').val("");
								$('#emailSuccess').show().fadeOut(6000, function(){ $(this).remove(); });
							}
						}
					}
				);
				return false;
				
			} 
		else 
			{
				$('.loading').fadeOut('fast');
				if( name == "") $('#name').css({"border":"2px solid #ff0000"}).next('.require').text(' !');
				if(subject == "") $('#subject').css({"border":"2px solid #ff0000"}).next('.require').text(' !');
				if(email == "" ) $('#email').css({"border":"2px solid #ff0000"}).next('.require').text(' !');
				if(message == "") $('#message').css({"border":"2px solid #ff0000"}).next('.require').text(' !');
				return false;
			}
	});
	
		$('#name, #subject, #email,#message').focus(function(){
			$(this).css({"border":"2px solid #dcdcdc"}).next('.require').text(' *');
		});
      	
});