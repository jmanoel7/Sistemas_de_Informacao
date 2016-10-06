//tealium universal tag - utag.167 ut4.0.201605091821, Copyright 2016 Tealium.com Inc. All Rights Reserved.
try{(function(id,loader){var u={};utag.o[loader].sender[id]=u;if(utag===undefined){utag={};}
if(utag.ut===undefined){utag.ut={};}
if(utag.ut.loader===undefined){u.loader=function(o){var a,b,c,l;a=document;if(o.type==="iframe"){b=a.createElement("iframe");b.setAttribute("height","1");b.setAttribute("width","1");b.setAttribute("style","display:none");b.setAttribute("src",o.src);}else if(o.type==="img"){utag.DB("Attach img: "+o.src);b=new Image();b.src=o.src;return;}else{b=a.createElement("script");b.language="javascript";b.type="text/javascript";b.async=1;b.charset="utf-8";b.src=o.src;}
if(o.id){b.id=o.id;}
if(typeof o.cb==="function"){if(b.addEventListener){b.addEventListener("load",function(){o.cb();},false);}else{b.onreadystatechange=function(){if(this.readyState==="complete"||this.readyState==="loaded"){this.onreadystatechange=null;o.cb();}};}}
l=o.loc||"head";c=a.getElementsByTagName(l)[0];if(c){utag.DB("Attach to "+l+": "+
o.src);if(l==="script"){c.parentNode.insertBefore(b,c);}else{c.appendChild(b);}}};}else{u.loader=utag.ut.loader;}
u.ev={'view':1};u.initialized=false;u.map={};u.extend=[];u.send=function(a,b){if(u.ev[a]||u.ev.all!==undefined){var c,d,e,f,i;u.data={};for(d in utag.loader.GV(u.map)){if(b[d]!==undefined&&b[d]!==""){e=u.map[d].split(",");for(f=0;f<e.length;f++){u.data[e[f]]=b[d];}}}
u.loader_cb=function(){u.initialized=true;function getCookie(cname){var name=cname+"=";var ca=document.cookie.split(';');for(var i=0;i<ca.length;i++){var c=ca[i];while(c.charAt(0)==' ')c=c.substring(1);if(c.indexOf(name)===0)return c.substring(name.length,c.length);}
return"";}
try{Cadun.Event.subscribe("userInfoAvailable",function(user){var c_id=user.id;if(Cadun.user.me.provider!="cadun"){c_id+=":"+Cadun.user.me.provider;}
utag_data.cadun_id=c_id;localStorage.setItem('krux_utag',JSON.stringify(utag_data));});}catch(err){}
window.cadun_cookie=getCookie("CADUN_ID");cadun_cookie=cadun_cookie.slice(1,-1);if(cadun_cookie){var regEx=new RegExp("\\D","g");var ind=cadun_cookie.search(regEx);if(!utag_data.cadun_id){var c_id=parseInt(cadun_cookie.substr(0,ind));utag_data.cadun_id=c_id;}
var c_dem=cadun_cookie.substr(ind);c_dem=window.atob(c_dem);var c_gender="";if(c_dem.substr(0,1).toLowerCase()=="m"){c_gender="Male";}else if(c_dem.substr(0,1).toLowerCase()=="f"){c_gender="Female";}
utag_data.cadun_gender=c_gender;var c_age="";if(c_dem.substr(1,2)){c_age=c_dem.substr(1,2);}
utag_data.cadun_age=c_age;var c_state="";if(c_dem.substr(3,2)){c_state=c_dem.substr(3,2);}
utag_data.cadun_state=c_state;}
var krux_utag=JSON.parse(localStorage.getItem('krux_utag')||"{}");for(var prop in utag_data)krux_utag[prop]=utag_data[prop];localStorage.setItem('krux_utag',JSON.stringify(krux_utag));};if(!u.initialized){u.loader({"type":"script","src":"//s.glbimg.com/pc/ca/cadun.js","cb":u.loader_cb,"loc":"script","id":'cadun_js'});}}};utag.o[loader].loader.LOAD(id);})("167","globo.techtudo");}catch(error){utag.DB(error);}
