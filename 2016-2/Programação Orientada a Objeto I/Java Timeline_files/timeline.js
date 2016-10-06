/**
 * @description:  Website bootstrap
 * @author: duong.nguyen
 * @version: 1.0 
**/

//==============================================================================================//
//									Global Objects												//
//==============================================================================================//
var Timeline = {
	instances: {
		
	},
	omniture: {
		name: 'java-timeline',
		lang: 'en-us',
		tab: 'year-tab'
	},
	memory: {
		templates: null,
		data: null,
		uniqueid: 100
	},
	load: function(xmlstr){
		var root;
		if ($.browser.msie){
			root = new ActiveXObject('Microsoft.XMLDOM');
			root.async = false;
			root.loadXML(xmlstr);
		}else{
			root = new DOMParser().parseFromString(xmlstr, 'text/xml');
		}
		
		return root;	
	},
	padding: function(str, num){
		while(str.length < num){
			str = '0' + str;
		}
		
		return str;
	},
	substitute: function(str, obj){
		return str.replace((/\\?\{([^{}]+)\}/g), function(match, name){
			if (match.charAt(0) == '\\') return match.slice(1);
			return (obj[name] != null) ? obj[name] : '';
		});
	}
};

//==============================================================================================//
//									Bootstrap													//
//==============================================================================================//
jQuery(document).ready(function(){
	
	var agent = navigator.userAgent.toLowerCase(),
		ipad = agent.indexOf('ipad') > -1,
		mobile = agent.indexOf('mobile') > -1 && !ipad,
		tablet = ipad || (agent.indexOf('android') > -1 && !mobile),
		desktop = !(mobile || tablet),
		platform = 'web';
		
	if(mobile){
		platform = 'mobile'
	}else if(tablet){
		platform = 'tablet'
	}
	
	var head = document.getElementsByTagName('head')[0],
		csstag = document.createElement('link');
		
	csstag.setAttribute('rel', 'stylesheet');
	csstag.setAttribute('type', 'text/css');
	csstag.setAttribute('href', 'css/' + platform + '.css');
	
	head.appendChild(csstag);
	
	$.ajax({
		url: 'templates/' + platform + '/index' + ((($.browser.msie && parseInt($.browser.version) < 9) || ($.browser.mozilla && parseFloat($.browser.version) <= 3.6)) ? '_fallback' : '') + '.xml',
		type: 'GET',
		dataType: 'xml',
		complete: function(xmlreq){
			var jsonTemplate = {},
				xmldoc = xmlreq.responseXML;
				
			if(!xmldoc){
				xmldoc = Timeline.load(xmlreq.responseText);
			}
			
			var templates = xmldoc.getElementsByTagName('template');
			for(var i = 0, il = templates.length; i < il; i++){
				jsonTemplate[templates[i].getAttribute('type')] = templates[i].textContent || templates[i].text;
			}
			
			Timeline.memory.templates = jsonTemplate;
			
			xmldoc = null;
			templates = null;
			jsonTemplate = null;
		}
	});
	
	$.ajax({
		url: 'xml/timelines.xml',
		type: 'GET',
		dataType: 'xml',
		complete: function(xmlreq){
			var xmldoc = xmlreq.responseXML;
				
			if(!xmldoc){
				xmldoc = Timeline.load(xmlreq.responseText);
			}
			
			Timeline.memory.data = xmldoc;
			
			xmldoc = null;
		}
	});
	
	$.getScript('js/' + platform + '.js', function(){
		Timeline.memory.initInterval = setInterval(function(){
			if(Timeline.memory.templates && Timeline.memory.data){
				clearInterval(Timeline.memory.initInterval);
				delete Timeline.memory.initInterval;
				
				Timeline.initialize();
			}
		}, 250);
	});
});