(function(){this.JST||(this.JST={});this.JST["template/grs_box"]=function(obj){var __p=[],print=function(){__p.push.apply(__p,arguments)};with(obj||{}){__p.push('<div class="widget-recomendacao-materia"><div class="balao border_top disclaimer-widget-recomendacao-materia"><a href="#" class="close"></a><div class="arrow_right"></div><div class="balao-inner"><p>',intro,'</p></div></div><div class="content-lista-materias"><span class="titulo">',title,'</span><div class="paginacao-container"><div class="botao-pagina-anterior"><a href="#" class="inativo"></a></div><ul class="listagem-materias"></ul></div></div></div>\n')}return __p.join("")}}).call(this);(function(){this.JST||(this.JST={});this.JST["template/grs_materia_img"]=function(obj){var __p=[],print=function(){__p.push.apply(__p,arguments)};with(obj||{}){__p.push('<li class="materia"><a href="',url,'"><div class="content-materia"><span class="borda-interna"></span><span class=\'thumb-container\'><img src="',thumbnail,'" width="110" height="83" onerror="$(this).parent().hide();"/></span><div class="container-titulo-materia"><p class="titulo-materia">',title,"</p></div></div></a></li>\n")}return __p.join("")}}).call(this);(function(){this.JST||(this.JST={});this.JST["template/grs_materia_plain"]=function(obj){var __p=[],print=function(){__p.push.apply(__p,arguments)};with(obj||{}){__p.push('<li class="materia"><div class="container-titulo-materia"><a href="',url,'"><p class="titulo-materia">',title,"</p></a></div></li>\n")}return __p.join("")}}).call(this);function BoxTemplate(d,f,c){var e=$(d);e.html(JST["template/grs_box"]({title:f,intro:c}));var a=$(".listagem-materias",e);var b=$(".disclaimer-widget-recomendacao-materia",e);return{show:function(g){a.html(g);var h=$("#widget-recomendacao-materia .materia").size();a.find(".materia:nth-child("+h+")").attr("id",h);e.show();if(!$.cookie("widget-recomendacao-materia-disclaimer")){b.fadeIn();$.cookie("widget-recomendacao-materia-disclaimer",true,{expires:360,path:"/"})}$("#widget-recomendacao-materia .disclaimer-widget-recomendacao-materia .close").click(function(i){b.fadeOut();i.preventDefault()});$("#widget-recomendacao-materia .disclaimer-widget-recomendacao-materia .close").click(function(i){b.fadeOut();i.preventDefault()})}}}function MateriaTemplate(){var a=JST["template/grs_materia_img"];var b=JST["template/grs_materia_plain"];return{html:function(f){var c={url:f.url,title:f.title};var e=b;var d=__recommendationThumbnail(f);if(d!==undefined&&d!==null){c.thumbnail=d;e=a}return e(c)}}}function RecommendationView(a,c,d){function b(f){var j="";if(f&&f.length){for(var g=0;g<f.length;g++){var e;var h=f[g];j+=c.html(h)}a.show(j)}}return{render:function(){new RecommendationClient("http://recomendacao.globo.com/rec/v2/item",d).getArticles(b)}}}function __recommendationThumbnail(a){return a.thumbnail||(a.photos&&a.photos.thumbnail)}function RecommendationClient(b,a){a=a||{};this.apiUrl=b;this.clientId=a.clientId;this.url=a.url;this.limit=a.limit||6;this.getArticles=function(j,e,c){var g=this,f=[],d=this.apiUrl,i=this.toObject(),e=e||1,c=c||200,h;$.ajax({url:d,data:i,jsonpCallback:"_wrc",cache:true,dataType:"jsonp",success:j,error:function(k){if(e<1){return false}if(k.status==200){j();return true}setTimeout(function(){g.getArticles(j,e-1,c)},c)}})};this.toObject=function(){return{client_id:this.clientId,url:this.url,limit:this.limit,photo_size:"110x83/smart"}}}function recommendationSetup(){if(!window.location.origin){window.location.origin=window.location.protocol+"//"+window.location.hostname+(window.location.port?":"+window.location.port:"")}var e=window.RECOMMENDATION_PARAMETERS||{};var c=e.boxId?e.boxId:"#widget-recomendacao-materia";var f=e.boxTitle?e.boxTitle:"Recomendadas para voc&ecirc;";var d=e.boxIntro?e.boxIntro:"A partir de agora, este espa&ccedil;o oferece conte&uacute;do recomendado especialmente para voc&ecirc;.";var a=e.clientId;var b=e.url?e.url:window.location.origin+window.location.pathname;return{boxId:c,boxTitle:f,boxIntro:d,clientId:a,url:b}}$(function(){if(!$.support.leadingWhitespace){$(".content-lista-materias .titulo").css("font-size","18px");$(".arrow_right").css("background","url(http://s.glbimg.com/bu/rt/rec/seta.png) no-repeat 0px 0px");$(".arrow_right").css("right","-20px");$(".arrow_right").css("top","40%");$(".arrow_right").css("height","24px")}var d=recommendationSetup();var a=new BoxTemplate(d.boxId,d.boxTitle,d.boxIntro);var c=new MateriaTemplate();var b=new RecommendationView(a,c,d);b.render()});