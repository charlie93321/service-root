$(function () {
    $('input[name="my-checkbox"]').bootstrapSwitch({
        "onColor": "success",
        "offColor": "danger",
        "onText": "开",
        "offText": "关",
        "animate": false,
        "size": "normal",
        "handleWidth": "auto",
        "onInit": function () {
            var bg = chrome.extension.getBackgroundPage();
            bg.setAjax(true);
            $("data").css("display", "block");
        },
        "onSwitchChange": function (event, state) {
            var bg = chrome.extension.getBackgroundPage();
            // 开关开启
            if (state) {
                bg.setAjax(true);
                $("data").css("display", "block");
            } else {
                bg.setAjax(false);
                $("data").css("display", "none");
            }
        }
    });
});