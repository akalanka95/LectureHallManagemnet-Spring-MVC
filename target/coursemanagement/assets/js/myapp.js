$(function(){


    var $alert = $('.alert');

    if($alert.length){
        setTimeout(function(){
            $alert.fadeOut('slow');
        },3000)
    }

    /*var products =[
      ['2','abc'],
      ['2','abc'],
      ['2','abc']

    ];*/

	var $table = $('#lectureList');
	
	/*if($table.length) {

        $table.DataTable({
            data: products
        });

    }*/

        var jsonUrl = window.root + '/json/data/lectures';

       /* if(window.categoryId == ''){
            jsonUrl = window.root + '/json/data/all/products';
            console.log(window.root);
        }else{
            jsonUrl = root +'/json/data/category/'+categoryId+'/products';
        }*/

        console.log('Inside the table');
        $table.DataTable({

            pageLength: 5,
            lengthMenu: [[3, 5, 10, -1], ["3 Records", "5 Records", "10 Records", "All"]],
            ajax: {
                url: jsonUrl,
                dataSrc: ''
            },
            columns: [
                {
                    data : 'imageUrl',
                    mRender : function(data,type,row){
                        return '<img src="'+window.root+'/resources/images/'+data+'.jpg" class="dataTableImg" style="border-radius: 50%;">';
                    }
                },
                {
                    data: 'fullName'
                },
                {
                    data: 'address'
                },
                {
                    data: 'email'

                },
                {
                    data: 'department.departmentName'

                },
                {
                    data: 'contact'

                },
                {
                    data : 'active',
                    bSortable : false,
                    mRender : function(data,type,row){

                        var str = '';

                        str += '<label class="switch">';

                        if(data){
                            str +='<input type="checkbox" checked="checked" data-toggle="toggle" value="'+row.id+'"/>' ;

                        }else{
                            str +='<input type="checkbox"  data-toggle="toggle" value="'+row.id+'"/>' ;

                        }


                        str += '<div class="slider round"></div></label>';
                        return str;

                    }



                },
                {
                    data : 'id',
                    bSortable :false,
                    mRender : function(data,type,row){
                        var str = '';
                        str += '<a href="'+window.root+'/view/lectures/'+data+'" class="btn btn-primary"><i class="fa fa-eye" aria-hidden="true"></i></a> &nbsp';
                        str += '<a href="'+window.root+'/manage/'+data+'/lecture" class="btn btn-warning"><i class="fa fa-pencil-square" aria-hidden="true"></i></a>' ;

                        return str;
                    }

                }
            ],

            initComplete: function(){
                var api = this.api();
                api.$('.switch input[type="checkbox"]').on('change',function(){

                    var checkbox = $(this);
                    var checked = checkbox.prop('checked');
                    var dMsg = (checked)? 'You want to activate the Lecture Account?':
                        'You want to deactivate the Lecture Account?';
                    var value = checkbox.prop('value');
                    bootbox.confirm({
                        size : 'medium',
                        title: 'Lectures Account Activation and Deactivation',
                        message : dMsg,
                        callback : function(confirmed){
                            if(confirmed){

                                var activationUrl = window.root + '/manage/lecture/'+value+'/activation';
                                $.post(activationUrl ,function(data){

                                    bootbox.alert({
                                        size : 'medium',
                                        title : 'Information',
                                        message : data
                                    });


                                });


                            }else{
                                checkbox.prop('checked', !checked);
                            }
                        }
                    });

                });
            }
        });


    var $table = $('#courselist');
    var jsonUrl = window.root + '/json/data/course';
    $table.DataTable({

        pageLength: 8,
        lengthMenu: [[3, 5, 10, -1], ["3 Records", "5 Records", "10 Records", "All"]],
        ajax: {
            url: jsonUrl,
            dataSrc: ''
        },
        columns: [
            {
                data : 'courseCode'

            },
            {
                data: 'courseName'
            },
            {
                data: 'year'
            },
            {
                data: 'semester.semesterName'

            },
            {
                data: 'department.departmentName'


            },
            {
                data: 'lecture.fullName'


            }



        ]


    });








    /*Student ref datatable added here

     */

    var $table = $('#departmentRefList');

    /*if($table.length) {

        $table.DataTable({
            data: products
        });

    }*/

    var jsonUrl = window.root + '/json/data/departmentref';

    /* if(window.categoryId == ''){
         jsonUrl = window.root + '/json/data/all/products';
         console.log(window.root);
     }else{
         jsonUrl = root +'/json/data/category/'+categoryId+'/products';
     }*/

    console.log('Inside the table');
    $table.DataTable({

        pageLength: 8,
        lengthMenu: [[3, 5, 10, -1], ["3 Records", "5 Records", "10 Records", "All"]],
        ajax: {
            url: jsonUrl,
            dataSrc: ''
        },
        columns: [
            {
                data : 'imageUrl',
                mRender : function(data,type,row){
                    return '<img src="'+window.root+'/resources/images/'+data+'.jpg" class="dataTableImg" style="border-radius: 50%;">';
                }
            },
            {
                data: 'name'
            },
            {
                data: 'address'
            },
            {
                data: 'email'

            },
            {
                data: 'department',
                mRender : function(data,type,row){
                    var str='';
                    if(data==1){
                        str += 'Computing And Information System';
                    }
                    return str;
                }

            },
            {
                data: 'contact'

            },
            {
                data : 'active',
                bSortable : false,
                mRender : function(data,type,row){

                    var str = '';

                    str += '<label class="switch">';

                    if(data){
                        str +='<input type="checkbox" checked="checked" data-toggle="toggle" value="'+row.id+'"/>' ;

                    }else{
                        str +='<input type="checkbox"  data-toggle="toggle" value="'+row.id+'"/>' ;

                    }


                    str += '<div class="slider round"></div></label>';
                    return str;

                }



            },
            {
                data : 'id',
                bSortable :false,
                mRender : function(data,type,row){
                    var str = '';
                    str += '<a href="'+window.root+'/view/departmentRef/'+data+'" class="btn btn-primary"><i class="fa fa-eye" aria-hidden="true"></i></a> &nbsp';
                    str += '<a href="'+window.root+'/manage/'+data+'/departmentRef" class="btn btn-warning"><i class="fa fa-pencil-square" aria-hidden="true"></i></a>' ;

                    return str;
                }

            }
        ],

        initComplete: function(){
            var api = this.api();
            api.$('.switch input[type="checkbox"]').on('change',function(){

                var checkbox = $(this);
                var checked = checkbox.prop('checked');
                var dMsg = (checked)? 'You want to activate the Ref Account?':
                    'You want to deactivate the Ref Account?';
                var value = checkbox.prop('value');
                bootbox.confirm({
                    size : 'medium',
                    title: 'DepartmentRef Account Activation and Deactivation',
                    message : dMsg,
                    callback : function(confirmed){
                        if(confirmed){



                            var activationUrl = window.root + '/manage/departmentRef/'+value+'/activation';
                            $.post(activationUrl ,function(data){

                                bootbox.alert({
                                    size : 'medium',
                                    title : 'Information',
                                    message : data
                                });


                            });


                        }else{
                            checkbox.prop('checked', !checked);
                        }
                    }
                });

            });
        }
    });



});



