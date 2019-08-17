function injectJs(jsPath) {
    var inject = document.createElement('script');
    inject.setAttribute('type', 'text/javascript');
    inject.src = chrome.extension.getURL(jsPath);
    inject.onload = function () {
        // 放在页面不好看，执行完后移除掉
        this.parentNode.removeChild(this);
    };
    document.head.appendChild(inject);
}

document.addEventListener('DOMContentLoaded', function () {
    console.info('content_script.js 我开始执行了！');
    injectJs("js/jquery.min.js");
    injectJs("js/inject.js");
    console.info('content_script.js 我执行完毕了！');
});