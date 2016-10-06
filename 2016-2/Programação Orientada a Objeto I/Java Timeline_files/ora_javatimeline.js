var ora_local="ora_code_javatimeline.js";var ora_global="ora_code.js";var host_type=(window.location.protocol.toLowerCase().indexOf("https")!=-1)?"https":"http";
var is_test=(location.host.indexOf("-stage")!=-1||location.host.indexOf("localhost")!=-1||location.host.indexOf("-dev")!=-1);
var ora_path=(is_test==true)?"://www-content-stage.oracle.com/us/assets/metrics/":"://www.oracleimg.com/us/assets/metrics/";
document.write("<script type='text/javascript' src='"+host_type+ora_path+ora_local+"'><\/script>");
document.write("<script type='text/javascript' src='"+host_type+ora_path+ora_global+"'><\/script>");
