package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.compose.runtime.collection.MutableVector;
import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureNode extends RectListNode {
    public ExcludeFromSystemGestureNode(ky kyVar) {
        super(kyVar);
    }

    @Override // androidx.compose.foundation.RectListNode
    public MutableVector<Rect> currentRects() {
        MutableVector<Rect> mutableVector = new MutableVector<>(new Rect[16], 0);
        mutableVector.addAll(mutableVector.getSize(), (List<? extends Rect>) getView().getSystemGestureExclusionRects());
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public void updateRects(MutableVector<Rect> mutableVector) {
        getView().setSystemGestureExclusionRects(mutableVector.asMutableList());
    }
}
