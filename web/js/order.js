$(document).ready(function() {
    $('#menu').hide();
    $('#menuForm input').button();

    $('#menu').mouseleave(function() {//not mouseout because it bubbles
        $('#menu').hide();
        $('.selected').removeClass('selected');
    });

    $('body').on('click', '.item', function(e) {//dynamic click handler
        var item = $(e.currentTarget);
        //add selected - might not be necessary
        $('.selected').removeClass('selected');
        item.addClass('selected');
        //setup/show menu
        $('#menu').css('left', e.clientX - 20).css('top', e.clientY - 20);
        if (item.parent().attr('id') === 'menuItems') {
            $('#menu .add').removeClass('ui-state-disabled');
            $('#menu .remove').addClass('ui-state-disabled');
        } else {
            $('#menu .add').addClass('ui-state-disabled');
            $('#menu .remove').removeClass('ui-state-disabled');
        }
        $('#menu').menu().show();
    });


    $('#menu li').click(function(e) {
        var menuItem = $(e.currentTarget);
        if (!menuItem.hasClass('ui-state-disabled')) {
            $('#menu').hide();
            var selected = $('.selected');
            if (selected.parent().attr('id') === 'menuItems') {
                $('#orderItems').animate({width: 340, height: $('#orderItems').height() + selected.outerHeight() + 5}, 900, 'swing', function() {
                    $('#orderItems').attr('style', '');
                });
                selected.effect('transfer', {to: $('#orderItems'), className: 'ui-effects-transfer'}, 450, function() {
                    selected.fadeOut(400, function() {
                        $('#orderItems').append(selected.remove().hide().fadeIn());

                    });
                });
            } else {
                $('#menuItems').animate({width: 340, height: $('#menuItems').height() + selected.outerHeight() + 5}, 900, 'swing', function() {
                    $('#menuItems').attr('style', '');
                });
                selected.effect('transfer', {to: $('#menuItems'), className: 'ui-effects-transfer'}, 450, function() {
                    selected.fadeOut(400, function() {
                        $('#menuItems').append(selected.remove().hide().fadeIn());
                    });
                });
            }

            $('.selected').removeClass('selected');
        }
    });


    $('#menuForm').submit(function() {
        console.log('submitted');
        var newForm = $('<form/>');
        newForm
                .attr('action', 'OrderConfirmationController')
                .css('display', 'none');

        $('#orderItems .item').each(function(idx, el) {
            var input = $('<input/>').attr({
                'type': 'checkbox',
                'name': $(el).attr('id'),
                value: 1,
                'checked': ''
            });
            newForm.append(input);
        });
        $('body').append(newForm);

        newForm.submit();
    });


});