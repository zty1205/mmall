$.validator.setDefaults({
    submitHandler: function (form) {
        $(form).ajaxSubmit({
            type:"POST",
            url:"./user/register.do",
            //beforeSubmit: showRequest,
            success: function (res) {
                if (res.status == 0){
                    alert("注册成功");
                    window.location.href='./user/goLogin.do'
                }else {
                    alert("注册失败,请重试");
                }
            }
        });
    }
});
function GetRemoteInfo(postUrl,data){
    var remote = {
        type: "POST",
        async: false,
        url: postUrl,
        dataType: "json",
        data: data
    };
    return remote;
}
$().ready(function () {
    // 手机号码验证
    jQuery.validator.addMethod("isMobile", function (value, element) {
        var length = value.length;
        var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
        return this.optional(element) || (length == 11 && mobile.test(value));
    }, "请正确填写您的手机号码");
// 在键盘按下并释放及提交后验证提交表单
    $("#signupForm").validate({
        rules: {
            username: {
                required: true,
                minlength: 2,
                remote: GetRemoteInfo('./user/check_valid.do',{
                    str:function(){return $("#username").val()},
                    type: "USERNAME"
                })
            },
            password: {
                required: true,
                minlength: 6
            },
            password_confirm: {
                required: true,
                minlength: 6,
                equalTo: "#password"
            },
            phone: {
                required: true,
                minlength: 11,
                isMobile: true
            },
            email: {
                required: true,
                email: true,
                remote:GetRemoteInfo('./user/check_valid.do',{
                    str:function(){return $("#email").val()},
                    type: "EMAIL"
                })
            },
            question: "required",
            answer: "required"
        },
        messages: {
            username: {
                require: "请输入用户名",
                remote: '用户名已经被注册'
            },
            password: {
                required: "请输入密码",
                minlength: "密码长度不能小于 6 个字母"
            },
            password_confirm: {
                required: "请输入密码",
                minlength: "密码长度不能小于 5 个字母",
                equalTo: "两次密码输入不一致"
            },
            phone: {
              required: "手机号不能为空",
              isMobile: "输入正确的手机号"
            },
            email: {
                required: "邮箱地址不能为空",
                email: "请输入正确的邮箱地址",
                remote: '该邮箱已注册'
            },
            question: "请输入用于找回密码的问题",
            answer: "请输入用于找回密码问题的答案"
        },
        errorPlacement: function(error, element) {
            element.parent().after(error);
        }
    });
});
