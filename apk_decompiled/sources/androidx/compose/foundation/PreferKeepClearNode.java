package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.compose.runtime.collection.MutableVector;
import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PreferKeepClearNode extends RectListNode {
    public PreferKeepClearNode(ky kyVar) {
        super(kyVar);
    }

    @Override // androidx.compose.foundation.RectListNode
    public MutableVector<Rect> currentRects() {
        List<? extends Rect> preferKeepClearRects;
        MutableVector<Rect> mutableVector = new MutableVector<>(new Rect[16], 0);
        preferKeepClearRects = getView().getPreferKeepClearRects();
        mutableVector.addAll(mutableVector.getSize(), preferKeepClearRects);
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public void updateRects(MutableVector<Rect> mutableVector) {
        getView().setPreferKeepClearRects(mutableVector.asMutableList());
    }
}
