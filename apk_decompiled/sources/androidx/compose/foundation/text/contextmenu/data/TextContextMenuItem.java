package androidx.compose.foundation.text.contextmenu.data;

import defpackage.dq;
import defpackage.fc;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuItem extends TextContextMenuComponent {
    public static final int $stable = 8;
    private final String label;
    private final int leadingIcon;
    private final ky onClick;

    public TextContextMenuItem(Object obj, String str, int i, ky kyVar) {
        super(obj);
        this.label = str;
        this.leadingIcon = i;
        this.onClick = kyVar;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getLeadingIcon() {
        return this.leadingIcon;
    }

    public final ky getOnClick() {
        return this.onClick;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(getKey());
        sb.append(", label=\"");
        sb.append(this.label);
        sb.append("\", leadingIcon=");
        return fc.e(sb, this.leadingIcon, ')');
    }

    public /* synthetic */ TextContextMenuItem(Object obj, String str, int i, ky kyVar, int i2, dq dqVar) {
        this(obj, str, (i2 & 4) != 0 ? 0 : i, kyVar);
    }
}
