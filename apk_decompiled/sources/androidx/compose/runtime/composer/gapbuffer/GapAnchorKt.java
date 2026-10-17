package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.Anchor;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GapAnchorKt {
    public static final GapAnchor asGapAnchor(Anchor anchor) {
        GapAnchor gapAnchor = anchor instanceof GapAnchor ? (GapAnchor) anchor : null;
        if (gapAnchor != null) {
            return gapAnchor;
        }
        throw uf.a("Inconsistent composition");
    }
}
