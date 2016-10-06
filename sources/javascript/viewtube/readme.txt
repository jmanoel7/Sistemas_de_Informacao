


     *       *  *  * * * *  *     *     *  * * * * *  *     *  * * * *  * * * *
      *     *   *  *         *    *    *       *      *     *  *     *  *
       *   *    *  * * * *    *   *   *        *      *     *  * * * *  * * * *
        * *     *  *           * * * *         *      *     *  *     *  *
         *      *  * * * *      *   *          *      * * * *  * * * *  * * * *

                                                                      by sebaro


     1. About
     2. Browsers
     3. Players
     4. Options
     5. Mods/addons


     -----

     1. About

     This script makes possible viewing videos on video websites with a classic video plugin, an external video player or with
     the HTML5 video player.

     This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License.

     Limitations & Issues:
     -> If the script doesn't work as supposed to, reinstall it or/and clear browser cache/cookies.
     -> If the script doesn't load, refresh the video page.
     -> If a related video is open in the same page by replacing the current video, the script may not work.
        Try to refresh the page or open related videos in new tabs/windows.
     -> On some sites there are videos embedded from an external source/site.
        The script doesn't work for these videos, but for some of them the script shows a link to the original video page.
     -> The script doesn't support playlists but you can watch each video from the playlist if you open it in a new tab/window.
     -> Embedded videos from these sites are not supported but I've made the LinkTube script that replaces the embedded videos
        with a link to the video page.

     -----

     2. Browsers

     Mozilla:
     (Firefox, Seamonkey, IceWeasel, IceCat, TenFourFox etc)
     -> with Greasemonkey add-on: https://addons.mozilla.org/firefox/addon/greasemonkey
     -> or with Scriptish add-on: https://addons.mozilla.org/firefox/addon/scriptish
     Chromium:
     (or based on: Chrome, Iron etc)
     -> no add-on needed, save the script and drag & drop it on the extensions page
     -> or with Tampermonkey add-on: http://code.google.com/p/tampermonkey
     Safari:
     -> for versions < 5.1 with GreaseKit add-on: http://safariaddons.com/en-US/safari/addon/43
     -> for all versions (?) with NinjaKit add-on: http://d.hatena.ne.jp/os0x/20100612/1276330696
     -> as bookmarklet with Geekmonkey add-on: http://surber.us/2006/04/14/geekmonkey
     Opera:
     -> for versions <= 12 no add-on needed, just place the script in the JavaScript files directory
     -> or with Violentmonkey extension: https://addons.opera.com/en/extensions/details/violent-monkey
     -> or with Tampermonkey extension: https://addons.opera.com/en/extensions/details/tampermonkey-beta
     Konqueror:
     -> with KHTML-Userscript extension: http://kde-apps.org/content/show.php?content=140676
     Epiphany:
     -> using the Greasemonkey extension from Epiphany extensions
     Midori:
     -> using “User Addons” extension
     QupZilla:
     -> using the Greasemonkey plugin
     Maxthon:
     -> with ViewTube extention: https://github.com/sebaro/ViewTube/tree/master/Maxthon
     -> or with Violentmonkey extension: http://extension.maxthon.com/detail/index.php?view_id=1680
     -> or with Tampermonkey Chrome extension: https://chrome.google.com/webstore/detail/tampermonkey/dhdgffkkebhmkfjojejmpbldmpobfkfo
     Internet Explorer:
     -> using IE7Pro extension: http://ie7pro.com for IE 9+

     Limitations & Issues:
     -> Some browsers don't allow scripts to be injected on secure pages. Also, because video URLs are not secure, some browsers
        don't allow them to be embedded on secure pages. Some browsers allow the videos to be embedded with HTML5.
        Chrome/ium: http://support.google.com/chrome/bin/answer.py?hl=en&answer=1342714
        Firefox: https://blog.mozilla.org/tanvi/2013/04/10/mixed-content-blocking-enabled-in-firefox-23
        To disabled the blocking in Firefox change "security.mixed_content.block_active_content" to "false" in "about:config".

     -----

     3. Players

     3.1 Plugins

     Linux:
     -> MPlayerPlug-In: http://mplayerplug-in.sourceforge.net
     -> Gecko-MediaPlayer: http://code.google.com/p/gecko-mediaplayer
     -> MozPlugger: http://mozplugger.mozdev.org
     -> Totem: http://projects.gnome.org/totem
     -> VLC: http://videolan.org/vlc
     -> Kaffeine: http://kaffeine.kde.org
     -> Dragon Player: http://kde.org/applications/multimedia/dragonplayer
     -> KMPlayer: http://kmplayer.kde.org
     -> MPlayer (with MozPlugger): http://mplayerhq.hu
     -> mpv (with MozPlugger): http://mpv.io

     Windows:
     -> Windows Media Player: http://www.interoperabilitybridges.com/windows-media-player-firefox-plugin-download
     -> QuickTime: http://apple.com/quicktime
     -> VLC: http://videolan.org/vlc

     Mac:
     -> QuickTime: http://apple.com/quicktime
     -> VLC: http://videolan.org/vlc

     Limitations & Issues:
     -> Not all plugins are able to play all videos from all sites
     -> When using VLC, use the 'Alt' or 'VLC' option to fix the playback delay
     -> For KDE video plugins to work in other browsers use KPartsPlugin: http://www.unix-ag.uni-kl.de/~fischer/kpartsplugin
     -> Newer versions of Firefox disable some plugins. They can be re-enabled by following the steps from:
        https://support.mozilla.org/en-US/kb/windows-media-or-other-plugins-stopped-working

     3.2 External

     If no video plugin is installed it's possible to use an external player for video playback.
     This requires the use of a browser protocol and a script that has to be associated with it.
     Read here for more info: http://isebaro.com/viewtube/protocol

     3.3 Internal

     If no video plugin is installed the browser will use the HTML5 video player for video playback.
     If it doesn't work, select it from the second menu to force its use.

     -----

     4. Options

     Plugin (second menu):
     -> You can choose from: Auto, Alt, HTML5, MPEG, MP4, FLV, VLC, MPV, WMP, WMP2, QT, Totem, Xine, VTP
     -> Auto: videos are embedded with the OBJECT element and played by the plugin associated with the video's mimetype
     -> Alt: videos are embedded with the EMBED element and played by the plugin associated with the video's mimetype
     -> HTML5: videos are embedded with the VIDEO element and played by the HTML5 video plugin
     -> MPEG|MP4|FLV: videos are played by the video plugin associated with these file types
     -> MPV: videos are played by mpv if this is the default video plugin associated with video/mp4 (see DVL)
     -> VLC: videos are played by the VLC video plugin
     -> WMP|WMP2: videos are played by the Windows Media Player video plugin (Windows only)
     -> QT: videos are played by the QuickTime video plugin (Windows and Mac)
     -> Totem: videos are played by the Totem video plugin (Linux)
     -> Xine: videos are played by the Xine video plugin (Linux)
     -> VTP: videos are played by an external video player (see Players/External)

     Autoplay (AP):
     -> Click 'Autoplay' button to turn autoplay on/off. If it's on, the video starts to play when the video page is loaded
        or when a new video format is selected. If it's off, a video thumbnail and a 'Play' button are shown.

     Definition (SD, HD etc):
     -> Click this button to change the default video definition.

     Container (MP4, WebM etc):
     -> Click this button to change the default video container.

     MPEG-DASH (MD):
     -> Click this button to enable/disable MPEG-DASH streams (video with audio) playback. Available options are VLC and HTML5.
        The default option is HTML5. Select "VLC" in the plugins menu to use it instead.
        This is experimental and it may not work as expected.

     Direct Video Link (DVL):
     -> Click to enable/disable auto selection of DVL as the default option in the videos menu. With DVL only the video link
        is embedded so the video streams are fetched by the video plugin, directly or using an external application.
        The plugins that support this are MPV (mozplugger + mpv + youtube-dl) and VLC.

     Widesize (>|<):
     -> Click the right arrow button to enter widesize. Click the left arrow button to go back to normal size.

     Fullsize (+|-):
     -> Click the plus button to enter fullsize. Click the minus button to go back to normal size.

     -----

     5. Mods/addons

     Detach/pop-up player feature by Ram-Z
     -> This mod offers the option to detach the script's player into a standalone pop-up window in Firefox based browsers.
        Link: https://gist.github.com/raw/4564520/aa071ab9f18bd0ce7a6020e51b68e79998aab88a/87011.user.js

     ViewTube_GM by Trupf
     -> This mod is made to improve performance in Firefox. It is specially aimed at use with the VLC plugin but should
        not break compatibiliy with other plugins and probably improve Totem performance the same way as VLC.
        Link 1: https://greasyfork.org/en/scripts/1203-viewtube-gm
        Link 2: https://openuserjs.org/scripts/trupf/httpsuserscripts.orguserstrupf/ViewTube_GM

     ViewTubePlus by hamsterbacke
     -> Addon for ViewTube
        Link (Info): http://hamsterhirn.de/index.php/2015/01/flash-alternative-for-streaming-sites-viewtubeplus/
        Link (Script): https://heliotropium.it/ViewTubePlus.user.js

     ViewTube+ by me
     -> Addon for ViewTube
        Link: http://isebaro.com/viewtube/include/files/viewtubeplus.user.js

