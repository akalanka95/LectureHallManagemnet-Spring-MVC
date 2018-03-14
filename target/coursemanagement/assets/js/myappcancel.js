$(function(){
    $('#resetlectureschedule').on('click', function(event){
        //var addressValue = $(this).attr("href");
        event.preventDefault();

        bootbox.confirm("Confirm Resting the Lecture ?", function(result) {

            if (result) {
                //include the href duplication link here?;
                //window.location =
                //var activationUrl = window.root + '/canceling/lecture';
                //var activationUrl = this.attr('href');
                var activationUrl = window.root + '/reset/lecture/schedule';
                $.post(activationUrl,function(data){
                    bootbox.alert({
                        size : 'medium',
                        title : 'Information',
                        message : data
                    });


                });


            }


        });
    });

});

