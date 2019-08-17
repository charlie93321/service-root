$(function () {
    console.log("load inject .js ");

    var hmtlDoc = "<html><head></head><body>hello</body></html>;


    document.body.innerHTML = '<iframe src="' + window.location.href + '" width="80%"  height="900" >' +
        '</iframe><iframe srcdoc="' + hmtlDoc + '" width="15%"  height="900"></iframe>'

});