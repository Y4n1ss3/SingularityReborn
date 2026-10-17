package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLinkStyles;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextLinkScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNullOrEmpty(TextLinkStyles textLinkStyles) {
        if (textLinkStyles != null) {
            return textLinkStyles.getStyle() == null && textLinkStyles.getFocusedStyle() == null && textLinkStyles.getHoveredStyle() == null && textLinkStyles.getPressedStyle() == null;
        }
        return true;
    }
}
