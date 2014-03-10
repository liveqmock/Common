package com.easyhome.sample;

import com.easyhome.common.modules.download.DownloadActivity;
import com.easyhome.common.modules.media.MediaActivity;
import com.easyhome.common.modules.plugin.PluginActivity;
import com.easyhome.common.modules.share.ui.ShareActivity;
import com.easyhome.common.modules.tables.DatabaseActivity;
import com.easyhome.common.uikit.app.BaseFragment;

/**
 * 跳转指示器
 */
public class NavigationIndicator {

    private static final int SELECT_SHARE       = 0; /*分享模块*/
    private static final int SELECT_MEDIA       = 1; /* 媒体播放模块 */
    private static final int SELECT_DOWNLOAD    = 2; /* 下载模块 */
    private static final int SELECT_DATABASE    = 3; /* 数据库模块 */
    private static final int SELECT_PLUGIN      = 4; /* 插件模块 */

    public static BaseFragment create(int position) {
        BaseFragment fragment = null;
        switch (position) {
            case SELECT_SHARE:
                fragment = ShareActivity.ShareFragment.newInstance();
                break;
            case SELECT_MEDIA:
                fragment = MediaActivity.MediaFragment.newInstance();
                break;
            case SELECT_DOWNLOAD:
                fragment = DownloadActivity.DownloadFragment.newInstance();
                break;
            case SELECT_DATABASE:
                fragment = DatabaseActivity.DatabaseFragment.newInstance();
                break;
            case SELECT_PLUGIN:
                fragment = PluginActivity.PluginFragment.newInstance();
                break;
        }
        return fragment;
    }

}