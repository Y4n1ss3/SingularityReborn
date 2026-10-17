package androidx.compose.foundation.text.contextmenu.data;

import androidx.compose.ui.util.ListUtilsKt;
import defpackage.dq;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuData {
    private final List<TextContextMenuComponent> components;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TextContextMenuData Empty = new TextContextMenuData(ut.d);

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuData(List<? extends TextContextMenuComponent> list) {
        this.components = list;
    }

    public final List<TextContextMenuComponent> getComponents() {
        return this.components;
    }

    public String toString() {
        return "TextContextMenuData(components=" + ListUtilsKt.fastJoinToString$default(this.components, "\n\t", "[\n\t", "\n]", 0, null, null, 56, null) + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final TextContextMenuData getEmpty() {
            return TextContextMenuData.Empty;
        }

        private Companion() {
        }
    }
}
