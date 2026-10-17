package androidx.compose.foundation.text;

import androidx.compose.ui.text.Placeholder;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final ny children;
    private final Placeholder placeholder;

    public InlineTextContent(Placeholder placeholder, ny nyVar) {
        this.placeholder = placeholder;
        this.children = nyVar;
    }

    public final ny getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
