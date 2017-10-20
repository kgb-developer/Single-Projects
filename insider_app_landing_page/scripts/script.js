(function ($) {
	var elDesktop   = $('.insiderApp__hero__content'),
        elMobile    = $('.insiderApp__hero__content'),
        subHeader   = $('.insiderApp__subHeader'),
        fadeIn      = 'fadeIn',
        mq          = window.matchMedia("(min-width: 767px)"),
        el          = (mq.matches ? elDesktop : elMobile);

    function scrollFunc() {
        if($(window).scrollTop() >= el.offset().top) {
            subHeader.addClass(fadeIn);
        } else {
            subHeader.removeClass(fadeIn);
        }
    }

    $(window).on("scroll", scrollFunc);
})(jQuery); 