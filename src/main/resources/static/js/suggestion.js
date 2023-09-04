$(document).ready(function(){

     $.ajax({
            type: "get",
            url: "/getRegion",
            dataType: 'json',
            cache: false,
            timeout: 600000,
            success: function (data){
                console.log("SUCCESS : ", data);
                for(i=0;i<data.length;i++){
                    $('#region').append(`<option value="${data[i].name}">
                                                                           ${data[i].name}
                                                                      </option>`);
                }
            },
            error: function (e) {
               console.log("ERROR : ", e);
            }
        });

        $('#region').change(function () {
            var region = $(this).find('option:selected').text();
            loadStates(region);
        });
        function loadStates(region){
                    $.ajax({
                        type: "POST",
                        url: "/getState",
                        dataType: 'json',
                        cache: false,
                        data:"region="+region,
                        timeout: 600000,
                        success: function (data){
                            console.log("SUCCESS : ", data);
                            for(i=0;i<data.length;i++){
                                $('#state').append(`<option value="${data[i].name}">
                                                     ${data[i].name}
                                                     </option>`);
                            }

                        },
                        error: function (e) {
                           console.log("ERROR : ", e);
                        }
                    });
        }
        $('#state').change(function () {
          var region = $(this).find('option:selected').text();
          loadTravelType();
         });
                 function loadTravelType(){
                 alert("travel type called");
                             $.ajax({
                                    type: "GET",
                                    url: "/getTouristType",
                                    dataType: 'json',
                                    cache: false,
                                    timeout: 600000,
                                    success: function (data){
                                        console.log("SUCCESS : ", data);
                                        for(i=0;i<data.length;i++){
                                            $('#traveltype').append(`<option value="${data[i].traveltype}">
                                                                 ${data[i].traveltype}
                                                                 </option>`);
                                        }

                                    },
                                    error: function (e) {
                                       console.log("ERROR : ", e);
                                    }
                                });
                            }

         $("#search").click(function(){
         alert("button clicked");
            var tval = $('#traveltype').val();
            $("#tourtext").removeClass('d-none');

            if(tval === 'Trekking'){
            $("#adventure").addClass('d-none');
                $("#trekking").removeClass('d-none');
            }else if(tval === 'Adventure'){
                 $("#adventure").removeClass('d-none');
                 $("#trekking").addClass('d-none');
            }

         });
});