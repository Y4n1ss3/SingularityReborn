package androidx.compose.foundation.text.contextmenu.data;

import android.view.textclassifier.TextClassification;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuTextClassificationItem extends TextContextMenuComponent {
    public static final int $stable = 8;
    private final int index;
    private final TextClassification textClassification;

    public TextContextMenuTextClassificationItem(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.textClassification = textClassification;
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }

    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(getKey());
        sb.append(", textClassification=");
        sb.append(this.textClassification);
        sb.append(", index=");
        return fc.e(sb, this.index, ')');
    }
}
