package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import defpackage.xe0;
import java.util.Comparator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class TopBottomBoundsComparator implements Comparator<xe0> {
    public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

    private TopBottomBoundsComparator() {
    }

    @Override // java.util.Comparator
    public int compare(xe0 xe0Var, xe0 xe0Var2) {
        int compare = Float.compare(((Rect) xe0Var.d).getTop(), ((Rect) xe0Var2.d).getTop());
        return compare != 0 ? compare : Float.compare(((Rect) xe0Var.d).getBottom(), ((Rect) xe0Var2.d).getBottom());
    }
}
