package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MaintainWindowPositionPopupPositionProvider implements PopupPositionProvider {
    private final PopupPositionProvider popupPositionProvider;
    private LayoutDirection previousLayoutDirection;
    private IntSize previousPopupContentSize;
    private IntOffset previousPosition;
    private IntSize previousWindowSize;

    public MaintainWindowPositionPopupPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.popupPositionProvider = popupPositionProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        IntOffset intOffset = this.previousPosition;
        if (intOffset != null) {
            IntSize intSize = this.previousWindowSize;
            if ((intSize == null ? false : IntSize.m7780equalsimpl0(intSize.m7786unboximpl(), j)) && this.previousLayoutDirection == layoutDirection) {
                IntSize intSize2 = this.previousPopupContentSize;
                if (intSize2 != null ? IntSize.m7780equalsimpl0(intSize2.m7786unboximpl(), j2) : false) {
                    return intOffset.m7748unboximpl();
                }
            }
        }
        long mo336calculatePositionllwVHH4 = this.popupPositionProvider.mo336calculatePositionllwVHH4(intRect, j, layoutDirection, j2);
        this.previousWindowSize = IntSize.m7774boximpl(j);
        this.previousLayoutDirection = layoutDirection;
        this.previousPopupContentSize = IntSize.m7774boximpl(j2);
        this.previousPosition = IntOffset.m7730boximpl(mo336calculatePositionllwVHH4);
        return mo336calculatePositionllwVHH4;
    }

    public final PopupPositionProvider getPopupPositionProvider() {
        return this.popupPositionProvider;
    }

    public final LayoutDirection getPreviousLayoutDirection() {
        return this.previousLayoutDirection;
    }

    /* renamed from: getPreviousPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m1213getPreviousPopupContentSizebOM6tXw() {
        return this.previousPopupContentSize;
    }

    /* renamed from: getPreviousPosition-JyOPPKE, reason: not valid java name */
    public final IntOffset m1214getPreviousPositionJyOPPKE() {
        return this.previousPosition;
    }

    /* renamed from: getPreviousWindowSize-bOM6tXw, reason: not valid java name */
    public final IntSize m1215getPreviousWindowSizebOM6tXw() {
        return this.previousWindowSize;
    }

    public final void setPreviousLayoutDirection(LayoutDirection layoutDirection) {
        this.previousLayoutDirection = layoutDirection;
    }

    /* renamed from: setPreviousPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1216setPreviousPopupContentSizefhxjrPA(IntSize intSize) {
        this.previousPopupContentSize = intSize;
    }

    /* renamed from: setPreviousPosition-fg0MpWk, reason: not valid java name */
    public final void m1217setPreviousPositionfg0MpWk(IntOffset intOffset) {
        this.previousPosition = intOffset;
    }

    /* renamed from: setPreviousWindowSize-fhxjrPA, reason: not valid java name */
    public final void m1218setPreviousWindowSizefhxjrPA(IntSize intSize) {
        this.previousWindowSize = intSize;
    }
}
