package com.youzu.taobao.base.json.smiley;

import com.youzu.taobao.base.json.BaseJson;

/**
 * Created by tangh on 2015/8/10.
 */
public class EmojiLoadZipJson extends BaseJson {

   private EmojiLoadZipVariables Variables;

    @Override
    public EmojiLoadZipVariables getVariables() {
        return Variables;
    }

    public void setVariables(EmojiLoadZipVariables variables) {
        Variables = variables;
    }
}
