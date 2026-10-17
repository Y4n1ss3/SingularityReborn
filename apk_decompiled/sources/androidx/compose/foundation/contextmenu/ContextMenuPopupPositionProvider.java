package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.dq;
import defpackage.iy;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final iy anchorPositionBlock;
    private final my onPositionCalculated;

    public /* synthetic */ ContextMenuPopupPositionProvider(long j, my myVar, int i, dq dqVar) {
        this(j, (i & 2) != 0 ? null : myVar, null);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        long m7748unboximpl = ((IntOffset) this.anchorPositionBlock.invoke()).m7748unboximpl();
        long m7733constructorimpl = IntOffset.m7733constructorimpl((ContextMenuPopupPositionProviderKt.alignPopupAxis(IntOffset.m7739getXimpl(m7748unboximpl) + intRect.getLeft(), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.Ltr) << 32) | (4294967295L & ContextMenuPopupPositionProviderKt.alignPopupAxis$default(IntOffset.m7740getYimpl(m7748unboximpl) + intRect.getTop(), (int) (j2 & 4294967295L), (int) (j & 4294967295L), false, 8, null)));
        my myVar = this.onPositionCalculated;
        if (myVar != null) {
            myVar.invoke(IntOffset.m7730boximpl(m7748unboximpl), IntRectKt.m7772IntRectVbeCjmY(m7733constructorimpl, j2));
        }
        return m7733constructorimpl;
    }

    public ContextMenuPopupPositionProvider(iy iyVar, my myVar) {
        this.anchorPositionBlock = iyVar;
        this.onPositionCalculated = myVar;
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(iy iyVar, my myVar, int i, dq dqVar) {
        this(iyVar, (i & 2) != 0 ? null : myVar);
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(long j, my myVar, dq dqVar) {
        this(j, myVar);
    }

    private ContextMenuPopupPositionProvider(final long j, my myVar) {
        this(new iy() { // from class: vl
            @Override // defpackage.iy
            public final Object invoke() {
                IntOffset m7730boximpl;
                m7730boximpl = IntOffset.m7730boximpl(j);
                return m7730boximpl;
            }
        }, myVar);
    }
}
