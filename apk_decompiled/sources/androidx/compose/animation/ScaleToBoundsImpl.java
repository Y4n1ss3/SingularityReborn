package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ContentScale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScaleToBoundsImpl implements SharedTransitionScope.ResizeMode {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final ContentScale contentScale;

    public ScaleToBoundsImpl(ContentScale contentScale, Alignment alignment) {
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }
}
