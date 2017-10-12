<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Education Portal</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Outing Travel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!-- css files -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"
	media="all" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/ep.css" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- /css files -->
<!-- font files -->
<link
	href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'
	rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<!-- /font files -->
<!-- js files -->
<script src="js/modernizr.custom.js"></script>
<!-- /js files -->
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="60">
	<div class="navbar-wrapper">
		<div class="container">
			<nav class="navbar navbar-inverse navbar-static-top cl-effect-20">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Student Portal</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse navbar-right">
					<ul class="nav navbar-nav">
						<li><a href="#"><span data-hover="Home">Home</span></a></li>
						<li><a href="#about"><span data-hover="About">About</span></a></li>
						<li><a href="#service"><span data-hover="Services">Services</span></a></li>
						<li><a href="#events"><span data-hover="Events">Events</span></a></li>
						<li><a href="#gallery"><span data-hover="Gallery">Gallery</span></a></li>
						<li><a href="#testimonials"><span
								data-hover="Testimonials">Testimonials</span></a></li>
						<li><a href="#contact"><span data-hover="Register">Register</span></a></li>
						<li><a href="#login"><span data-hover="Login">Login</span></a></li>
					</ul>
				</div>
			</div>
			</nav>
		</div>
	</div>
	<!-- Banner Section -->
	<!-- Carousel
    ================================================== -->
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img class="first-slide" src="images/banner1.jpg" alt="First slide"
					style="height: 637px">
			</div>
			<div class="item">
				<img class="second-slide" src="images/banner2.jpg"
					alt="Second slide">
			</div>
			<div class="item">
				<img class="third-slide" src="images/banner3.jpg" alt="Third slide">
			</div>
		</div>
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	<!-- /.carousel -->
	<!-- /Banner Section -->
	<!-- About Section -->
	<section class="about-us" id="about">
	<h3 class="text-center slideanim">About Us</h3>
	<p class="text-center slideanim">We provide the services that
		facilitates your studies and makes it easy to organize.</p>
	<div class="container">
		<div class="row">
			<div class="col-lg-6 col-md-6 col-sm-6">
				<img src="images/about-img.jpg" alt="about"
					class="img-responsive slideanim">
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6">
				<div class="about-info">
					<h4 class="slideanim">We're The Best</h4>
					<p class="abt slideanim">We make your task easy for both
						teacher and student to access the data.</p>

				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- /About Section -->
	<!-- Services Section -->
	<section class="our-services slideanim" id="service"
		style="height: 637px;">
	<h3 class="text-center slideanim">Our Services</h3>
	<p class="text-center slideanim">We provide High class services in
		differnt area that helps Students and Teacher.</p>
	<div id="features">
		<div class="container">
			<div class="row">
				<div class="col-md-6 centered">
					<!-- ACCORDION -->
					<div class="accordion ac" id="accordion2">
						<div class="accordion-group">
							<div class="accordion-heading">
								<a class="accordion-toggle slideanim" data-toggle="collapse"
									data-parent="#accordion2" href="#collapseOne">Connect
									Teacher and Students</a>
							</div>
							<!-- /accordion-heading -->
							<div id="collapseOne" class="accordion-body collapse in">
								<div class="accordion-inner slideanim">
									<p>It's plateform where Teacher and Student can connect to
										each other.</p>
								</div>
								<!-- /accordion-inner -->
							</div>
							<!-- /collapse -->
						</div>
						<!-- /accordion-group -->
						<div class="accordion-group">
							<div class="accordion-heading">
								<a class="accordion-toggle slideanim" data-toggle="collapse"
									data-parent="#accordion2" href="#collapseTwo">Online
									Discussion Forum</a>
							</div>
							<div id="collapseTwo" class="accordion-body collapse">
								<div class="accordion-inner slideanim">
									<p>We provide the plateform to discuss the problem with
										expertes.</p>
								</div>
								<!-- /accordion-inner -->
							</div>
							<!-- /collapse -->
						</div>
						<!-- /accordion-group -->
						<div class="accordion-group">
							<div class="accordion-heading">
								<a class="accordion-toggle slideanim" data-toggle="collapse"
									data-parent="#accordion2" href="#collapseThree">Awesome
									Support</a>
							</div>
							<div id="collapseThree" class="accordion-body collapse">
								<div class="accordion-inner slideanim">
									<p>Our Technical Team is 24 x 7 available to resolove any
										connctvity issues.</p>
								</div>
								<!-- /accordion-inner -->
							</div>
							<!-- /collapse -->
						</div>
						<!-- /accordion-group -->
						<div class="accordion-group">
							<div class="accordion-heading">
								<a class="accordion-toggle slideanim" data-toggle="collapse"
									data-parent="#accordion2" href="#collapseFour">Free
									Services</a>
							</div>
							<div id="collapseFour" class="accordion-body collapse">
								<div class="accordion-inner slideanim">
									<p>Our all services are freely available to all.</p>
								</div>
								<!-- /accordion-inner -->
							</div>
							<!-- /collapse -->
						</div>
						<!-- /accordion-group -->
					</div>
					<!-- Accordion -->
				</div>
				<div class="col-md-6">
					<img src="images/service-img.jpg" class="img-responsive slideanim"
						alt="service">
				</div>
			</div>
		</div>
		<!--/ .container -->
	</div>
	<!--/ #features --> </section>
	<!-- /Services Section -->
	<!-- Events -->
	<section class="our-events slideanim" id="events">
	<h3 class="text-center slideanim">Our Events</h3>
	<p class="text-center slideanim">We organize many events to spread
		awareness to our User.</p>
	<div class="container">
		<div class="row">
			<div class="col-lg-4 col-md-4">
				<div class="event-info">
					<h4 class="text-center slideanim">March 24th</h4>
					<p class="eve slideanim">Our Experties are providing free
						session on AI technology</p>
				</div>
			</div>
			<div class="col-lg-4 col-md-4">
				<div class="event-info">
					<h4 class="text-center slideanim">March 26th</h4>
					<p class="eve slideanim">Our Experties are providing free
						session on Political Science.</p>
				</div>
			</div>
			<div class="col-lg-4 col-md-4">
				<div class="event-info">
					<h4 class="text-center slideanim">March 28th</h4>
					<p class="eve slideanim">Our Experties are providing free
						session on Music</p>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- /Events -->
	<!-- Gallery Section -->
	<section class="our-gallery" id="gallery">
	<h3 class="text-center slideanim">Our Photography course</h3>
	<p class="text-center slideanim">Live images has taken and uploaded by our Students.</p>
	<div class="container">
		<img src="images/gallery-img1.jpg"
			data-darkbox="images/gallery-img1-1.jpg"
			data-darkbox-description="<b>Lorem Ipsum</b><br>Lorem ipsum dolor sit amet"
			class="img-responsive slideanim"> <img
			src="images/gallery-img2.jpg"
			data-darkbox="images/gallery-img2-2.jpg"
			data-darkbox-description="<b>Lorem Ipsum</b><br>Lorem ipsum dolor sit amet"
			class="img-responsive slideanim"> <img
			src="images/gallery-img3.jpg"
			data-darkbox="images/gallery-img3-3.jpg"
			data-darkbox-description="<b>Lorem Ipsum</b><br>Lorem ipsum dolor sit amet"
			class="img-responsive slideanim"> <img
			src="images/gallery-img4.jpg"
			data-darkbox="images/gallery-img4-4.jpg"
			data-darkbox-description="<b>Lorem Ipsum</b><br>Lorem ipsum dolor sit amet"
			class="img-responsive slideanim"> <img
			src="images/gallery-img5.jpg"
			data-darkbox="images/gallery-img5-5.jpg"
			data-darkbox-description="<b>Lorem Ipsum</b><br>Lorem ipsum dolor sit amet"
			class="img-responsive slideanim"> <img
			src="images/gallery-img6.jpg"
			data-darkbox="images/gallery-img6-6.jpg"
			data-darkbox-description="<b>Lorem Ipsum</b><br>Lorem ipsum dolor sit amet"
			class="img-responsive slideanim"> <img
			src="images/gallery-img7.jpg"
			data-darkbox="images/gallery-img7-7.jpg"
			data-darkbox-description="<b>Lorem Ipsum</b><br>Lorem ipsum dolor sit amet"
			class="img-responsive slideanim"> <img
			src="images/gallery-img8.jpg"
			data-darkbox="images/gallery-img8-8.jpg"
			data-darkbox-description="<b>Lorem Ipsum</b><br>Lorem ipsum dolor sit amet"
			class="img-responsive slideanim">
	</div>
	</section>
	<!-- /Gallery Section -->
	<!-- Testimonials -->
	<section class="our-testimonials slideanim" id="testimonials">
	<h3 class="text-center slideanim">What Our User Say</h3>
	<p class="text-center slideanim">Imparting Online Eduction
		experience of our professional Experts</p>
	<div class="container">
		<div class="row">
			<div class="col-lg-4 col-md-4">
				<div class="test">
					<img src="images/test-img1.png" class="img-responsive slideanim"
						alt="">
					<h4 class="text-center slideanim">Monika Konda</h4>
					<p class="t1 slideanim">Its really helpful plateform that
						enables us to reach our remote students</p>
				</div>
			</div>
			<div class="col-lg-4 col-md-4">
				<div class="test">
					<img src="images/test-img2.png" class="img-responsive slideanim"
						alt="">
					<h4 class="text-center slideanim">Nikita Panda</h4>
					<p class="t1 slideanim">Its really helpful plateform that
						enables us to reach our remote students</p>
				</div>
			</div>
			<div class="col-lg-4 col-md-4">
				<div class="test">
					<img src="images/test-img3.png" class="img-responsive slideanim"
						alt="">
					<h4 class="text-center slideanim">Priyanka</h4>
					<p class="t1 slideanim">Its really helpful plateform that
						enables us to reach our remote students</p>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- Testimonials -->
	<!-- Google Map -->
	<section class="map">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12 slideanim">
				<iframe class="googlemaps"
					src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d380510.6741687111!2d-88.01234121699822!3d41.83390417061058!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1455598377120"
					frameborder="0" style="border: 0" allowfullscreen></iframe>
			</div>
		</div>
	</div>
	</section>
	<!-- /Google Map -->
	<!-- SURAJ -->
	<section class="our-contacts slideanim" id="contact">
	<div id="registerAlert"></div>
	<h3 class="text-center slideanim">Register User</h3>
	<p class="text-center slideanim">We are always standing by and
		eager to help you</p>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<form role="form">
					<div class="row">
						<div class="form-group col-lg-4 slideanim">
							<input type="text" class="form-control user-name"
								placeholder="Name" id="name" required />
						</div>

						<div class="form-group col-lg-4 slideanim">
							<input type="password" class="form-control pno"
								placeholder="Password" id="password" required />
						</div>
						<div class="form-group col-lg-4 slideanim">
							<input type="number" class="form-control pno"
								placeholder="Phone Number" id='mobile'
								onkeyup="checkReg(); return false;" required />
						</div>

						<div class="form-group col-lg-4 slideanim">

							<select class="form-control" name="role">
								<option value="teacher">Register as Teacher</option>
								<option value="student">Register as Student</option>
							</select>
						</div>
						<div class="form-group col-lg-12 slideanim">
							<button class="btn-outline1" id="registeruserBtn">Sign
								up</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	</section>
	<!-- SURAJ -->
	<section class="our-contacts slideanim" id="login"
		style="background: #ff7d40">
	<div id="loginAlert"></div>
	<h3 class="text-center slideanim">Login User</h3>
	<p class="text-center slideanim">Login to enjoy the Portal Services</p>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<form role="form">
					<div class="row">
						<div class="form-group col-lg-4 slideanim">
							<input type="number" class="form-control user-name"
								placeholder="Registered Mobile" onkeyup="check(); return false;"
								name='uId' id='uId' required />
						</div>
						<div class="form-group col-lg-4 slideanim">
							<input type="password" class="form-control pno" placeholder="Password"
								name='uPwd' id='uPwd' required />
						</div>

						<div class="form-group col-lg-12 slideanim">
							<button class="btn-outline1" style="width: 24%;" id='loginBtn'>Sign
								in</button>
							<br> <br>
							<a href="#" id="chngpwd" style="font-size: 20px; color: white;" onclick="window.open('ForgotPassword.jsp')">Forgot
								password ??</a>
						</div>

					</div>
				</form>
			</div>
		</div>
	</div>
	</section>



	<!-- /Contact Section -->
	<!-- Footer Section -->
	<section class="footer">
	<h2 class="text-center">THANKS FOR VISITING US</h2>
	<hr>
	<div class="container">
		<div class="row">
			<div class="col-md-4 footer-left">
				<h4>Contact Information</h4>
				<div class="contact-info">
					<div class="address">
						<i class="glyphicon glyphicon-globe"></i>
						<p class="p3">Kondapur</p>
						<p class="p4">Hyderabad, India</p>
					</div>
					<div class="phone">
						<i class="glyphicon glyphicon-phone-alt"></i>
						<p class="p3">+918019508912</p>
						<p class="p4">+918019508912</p>
					</div>
					<div class="email-info">
						<i class="glyphicon glyphicon-envelope"></i>
						<p class="p3">
							<a href="mailto:email1@example.com">Karthik@gmai</a>
						</p>
						<p class="p4">
							<a href="mailto:email2@example.com">Karthik@gmai</a>
						</p>
					</div>
				</div>
			</div>
			<!-- col -->
			<div class="col-md-4 footer-center">
				<h4>Newsletter</h4>
				<p>Register to our newsletter and be updated with the latests
					information regarding our services, offers and much more.</p>

			</div>
			<!-- col -->
			<div class="col-md-4 footer-right">
				<h4>Support Us</h4>
				<p>Join our professional network to grow.</p>
				<ul class="social-icons2">
					<li><a href="#"><i class="fa fa-facebook"></i></a></li>
					<li><a href="#"><i class="fa fa-twitter"></i></a></li>
					<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
					<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
				</ul>
			</div>
			<!-- col -->
		</div>
		<!-- row -->
	</div>
	<!-- container -->
	<hr>
	<div class="copyright">
		<p>© 2016 Online Portal. All Rights Reserved | Design by Karthik</p>
	</div>
	</section>
	<!-- /Footer Section -->
	<!-- Back To Top -->
	<a href="#0" class="cd-top">Top</a>
	<!-- /Back To Top -->

	<!-- js files -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/SmoothScroll.min.js"></script>
	<!-- js for gallery -->
	<script src="js/darkbox.js"></script>
	<!-- /js for gallery -->
	<!-- js for back to top -->
	<script src="js/main.js"></script>
	<!-- /js for back to top -->
	<!-- js for nav-smooth scroll -->

	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-3.1.0.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/validator.js"></script>

	<script
		src="${pageContext.request.contextPath}/resources/js/ajaxService.js"></script>


	<script>
		$(document).ready(
				function() {
					// Add smooth scrolling to all links in navbar + footer link
					$(".navbar a, footer a[href='#myPage']").on('click',
							function(event) {

								// Store hash
								var hash = this.hash;

								// Using jQuery's animate() method to add smooth page scroll
								// The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
								$('html, body').animate({
									scrollTop : $(hash).offset().top
								}, 900, function() {

									// Add hash (#) to URL when done scrolling (default click behavior)
									window.location.hash = hash;
								});
							});
				})
	</script>
	<!-- /js for nav-smooth scroll -->
	<!-- js for slide animations -->
	<script>
$(window).scroll(function() {
  $(".slideanim").each(function(){
    var pos = $(this).offset().top;

    var winTop = $(window).scrollTop();
    if (pos < winTop + 600) {
      $(this).addClass("slide");
    }
  });
});
</script>
	<!-- /js for slide animations -->
	<!-- /js files -->
</body>
</html>
