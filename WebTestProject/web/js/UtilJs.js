/**
 * Created by Jerry on 2016/12/28.
 */
window.onload = function () {
    var li = document.getElementsByTagName("li");
    for (var j = 0; j < li.length; j++) {
        li[j].onmouseover = function () {
            this.style.backgroundColor = 'blue';
        };
        li[j].onmouseout = function () {
            this.style.backgroundColor = 'white';
        };
    }
}

function changeFocus() {
    this.style.borderStyle='inset';
}

//2-5 JS函数重载
function sendMessage(msg, obj) {
    if (arguments.length == 2) {
        obj.handleMsg(msg);
    } else {
        alert(msg);
    }
}

//2-6显示错误信息和默认信息
function  displayError(msg) {
    if(typeof msg == 'undefined'){
        msg = 'An error occurred.';
    }
    sendMessage(msg);
}
