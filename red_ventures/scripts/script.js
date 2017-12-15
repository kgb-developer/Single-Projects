(function ($) {
    var pool_pros = (function() {
        // Show util func.
        function show(el, cl) {
            el.className += ' ' + cl;
        }

        // Hide util func.
        function hide(el, cl) {
            el.classList.remove(cl);
        }

        var overlay = function() {
            var overlay             = document.getElementById('overlay'),
                overlay_close       = document.getElementById('overlay__button__close'),
                overlay_active      = 'overlay--active',
                overlay_inactive    = 'overlay--inactive';

            overlay.className += ' ' + overlay_active; // Activate overlay after 4s via css

            function closeOverlay() {
                // Let's hide the overlay when user closes without submitting so we can spam them again at will
                // If we were coding this to submit, we'd remove the overlay from the DOM when user submits
                overlay.className += ' ' + overlay_inactive;
                overlay.classList.remove(overlay_active);
            }

            overlay_close.onclick = function() {
                closeOverlay(); // Fadeout overlay via css
            };
        }

        var mobile_nav = function() {
            var nav         = document.getElementById('nav_mobile'),
                nav_btn     = document.getElementById('nav_mobile_btn'),
                nav_close   = document.getElementById('nav_mobile_close'),
                nav_active  = 'header__nav__mobile--active';

            nav_btn.onclick = function() {
                show(nav, nav_active); // Keeping script light with show util
            };
    
            nav_close.onclick = function() {
                hide(nav, nav_active); // Keeping script light with hide util
            }
        }

        var mobile_filter_menu = function() {
            var filter_results_btn      = document.getElementById('filter_results_mobile'),
                filter_results_show     = document.getElementById('filter_results_show'),
                filter_results_active   = 'form__filter__fieldset--active',
                filter_results_inactive = 'form__filter__fieldset--inactive',
                trigger                 = true;

            // Toggle 'filter_results' menu
            filter_results_btn.onclick = function() {
                if(trigger) {
                    trigger = false;
                    hide(filter_results_show, filter_results_active);
                    show(filter_results_show, filter_results_inactive);
                } else {
                    trigger = true;
                    show(filter_results_show, filter_results_active);
                    hide(filter_results_show, filter_results_inactive);
                }
            }
        }

        var build_card = function(cert_type) {
            var pool_pros_data      = json,
                dealers             = pool_pros_data.dealers,
                card_container      = $("#filter_content"),
                card_service        = document.getElementsByClassName('contact__card__services__list__item'),
                append_to_card      = '',
                append_to_certs     = '',
                CONST_SPACE         = ' ',
                CONST_TAP_TO_CALL   = 'Tap to call',
                CONST_CANT_TALK     = 'Can\'t talk now? Click below to send an email.',
                CONST_CONTACT_PRO   = 'Contact this Pro',
                CONST_BUSINESS_HRS  = 'Business Hours',
                CONST_WEEKDAYS      = 'Weekdays',
                CONST_SATURDAYS     = 'Saturdays',
                CONST_SUNDAYS       = 'Sundays',
                CONST_ONCALL        = 'On Call',
                CONST_NA            = 'Not Available',
                card_template, i, j, x;

            card_template = _.template(
                '<div id="<%= data.companyID %>" class="contact__card">' +
                    '<div class="contact__card__wrap">' +
                        '<h2><%= data.name %></h2>' +
                        '<div class="contact__card__content">' +
                            '<div class="contact__card__phone">' +
                                '<a href="tel:<%= data.phone1 %>" class="link icon ss-phone"><span>' + CONST_TAP_TO_CALL + '</span><%= data.phone1 %></a>' +
                                '<span>' + CONST_CANT_TALK + '</span>' +
                            '</div>' +
                            '<a class="button" href="mailto:<%= data.email %>?Subject=Pool%20Pros%20Inquiry">' + CONST_CONTACT_PRO + '</a>' +
                            '<div class="contact__card__hours">' +
                                '<div class="contact__card__hours__title">' + CONST_BUSINESS_HRS + '</div>' +
                                '<ul class="contact__card__hours__list">' +
                                    '<li class="contact__card__hours__list__item">' + CONST_WEEKDAYS + CONST_SPACE + '<%= data.weekHours.mon %></li>' +
                                    '<li class="contact__card__hours__list__item">' + CONST_SATURDAYS + CONST_SPACE + '<%= data.weekHours.sat %></li>' +
                                    '<li class="contact__card__hours__list__item">' + CONST_SUNDAYS + CONST_SPACE + '<%= data.weekHours.sun %></li>' +
                                '</ul>' +
                            '</div>' +
                        '</div>' +
                        '<div class="contact__card__services">' +
                            '<ul class="contact__card__services__list">' +
                                '<li class="contact__card__services__list__item icon"><%= data.certifications[0] %></li>' +
                                '<li class="contact__card__services__list__item icon"><%= data.certifications[1] %></li>' +
                                '<li class="contact__card__services__list__item icon"><%= data.certifications[2] %></li>' +
                                '<li class="contact__card__services__list__item icon"><%= data.certifications[3] %></li>' +
                            '</ul>' +
                        '</div>' +
                    '</div>' +
                '</div>'
            );

            // Let's loop through our dealers and pull the correct info per company
            for (i = 0; i < dealers.length; i++) {
                var data = dealers[i].data,
                    certs = data.certifications,
                    weekHours;

                // If a value/time in 'weekHours' is empty/'', default it to 'Not Available'
                for (var key in data.weekHours) {
                    weekHours = data.weekHours[key];

                    if(!weekHours.length > 0) {
                        data.weekHours[key] = CONST_NA;
                    }
                }

                if(certs.indexOf(cert_type) > -1) {
                    append_to_card += card_template(dealers[i]);
                }
            }

            card_container.append(append_to_card); // Append our card to filter content container

            for (x = 0; x < card_service.length; x++) {
                var div         = card_service[x],
                    content     = div.innerHTML.trim();
              
                if(content === 'Installation Pro') {
                    div.classList.add('ss-star');
                } else if(content === 'Commercial Pro') {
                    div.classList.add('ss-users');
                } else if(content === 'Residential Pro') {
                    div.classList.add('ss-home');
                }  else if(content === 'Service Pro') {
                    div.classList.add('ss-settings');
                }
            }
        }

        // Sorting left unfinished - would need a little guidance
        var sort_cards = function() {
            var self                    = this,
                trigger                 = true,
                card_container          = document.getElementById('filter_content'),
                cb                      = document.getElementsByClassName('form__filter__checkbox'),
                cb_service              = document.getElementById('cb_service'),
                cb_installation         = document.getElementById('cb_installation'),
                cb_residential          = document.getElementById('cb_residential'),
                cb_commerical           = document.getElementById('cb_commerical'),
                CONST_CB_SERVICE        = 'Service Pro',
                CONST_CB_INSTALL        = 'Installation Pro',
                CONST_CB_RESIDENTIAL    = 'Residential Pro',
                CONST_CB_COMMERCIAL     = 'Commercial Pro';

            function sort(cb_const) {
                if(trigger) {
                    trigger = false;
                    self.checked = true;
                    build_card(cb_const);
                } else {
                    trigger = true;
                    self.checked = false;
                    card_container.innerHTML = '';
                }
            }

            // Sort default
            sort(CONST_CB_SERVICE);
            
            cb_service.onclick = function() {
                sort(CONST_CB_SERVICE);
                // console.log('cb_service checked');
            };

            cb_installation.onclick = function() {
                sort(CONST_CB_INSTALL);
                // console.log('cb_installation checked');
            };

            cb_residential.onclick = function() {
                sort(CONST_CB_RESIDENTIAL);
                // console.log('cb_residential checked');
            };

            cb_commerical.onclick = function() {
                sort(CONST_CB_COMMERCIAL);
                // console.log('cb_commerical checked');
            };
        }

        return {
            init: function() {
                overlay();
                mobile_nav();
                mobile_filter_menu();
                sort_cards();
            }
        };
    })();

    pool_pros.init();

})(jQuery); 