var i = 0;
var ajax = false;
setInterval(function () {
    console.debug("我是后台js,我被执行了" + i + "次.ajax is :" + ajax);
    i = i + 1;
}, 1000);


function setAjax(isAjax) {
    ajax = isAjax;
}

chrome.webRequest.onBeforeRequest.addListener(
    function (details) {
        if (ajax) {
            console.log('parentFrameId:' + details.parentFrameId + ',tableId:' + details.tabId);
            var views = chrome.extension.getViews({type: 'popup'});
            if (views && views.length > 0) {
               var popWin = views[0];
               var popDoc=popWin.document;
               var data=popDoc.getElementById("data");
               data.innerHTML="<div>hello></div>";
            }
        }
    },
    {urls: ["<all_urls>"]},
    ["blocking"]);
