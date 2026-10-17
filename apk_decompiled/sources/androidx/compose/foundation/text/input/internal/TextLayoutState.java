package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.hm0;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextLayoutState {
    public static final int $stable = 8;
    private final BringIntoViewRequester bringIntoViewRequester;
    private final MutableState coreNodeCoordinates$delegate;
    private final MutableState decoratorNodeCoordinates$delegate;
    private TextFieldLayoutStateCache layoutCache;
    private final TextFieldLayoutStateCache layoutResult$delegate;
    private final MutableState minHeightForSingleLineField$delegate;
    private my onTextLayout;
    private final MutableState textLayoutNodeCoordinates$delegate;

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult$delegate = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.coreNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.decoratorNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.minHeightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m7609boximpl(Dp.m7611constructorimpl(0.0f)), null, 2, null);
        this.bringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m1346getOffsetForPosition3MmeM6k$default(TextLayoutState textLayoutState, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutState.m1349getOffsetForPosition3MmeM6k(j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLayoutResult layoutWithNewMeasureInputs__hBUhpc$lambda$0$0(TextLayoutState textLayoutState) {
        return textLayoutState.layoutCache.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r1 == null) goto L11;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m1347coercedInVisibleBoundsOfInputTextMKHz9U$foundation(long j) {
        Rect zero;
        LayoutCoordinates textLayoutNodeCoordinates = getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (textLayoutNodeCoordinates.isAttached()) {
                LayoutCoordinates decoratorNodeCoordinates = getDecoratorNodeCoordinates();
                zero = null;
                if (decoratorNodeCoordinates != null) {
                    zero = LayoutCoordinates.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
                }
            } else {
                zero = Rect.Companion.getZero();
            }
        }
        zero = Rect.Companion.getZero();
        return TextLayoutStateKt.m1353coerceIn3MmeM6k(j, zero);
    }

    public final BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final LayoutCoordinates getCoreNodeCoordinates() {
        return (LayoutCoordinates) this.coreNodeCoordinates$delegate.getValue();
    }

    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates$delegate.getValue();
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m1348getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m7625unboximpl();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m1349getOffsetForPosition3MmeM6k(long j, boolean z) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (z) {
            j = m1347coercedInVisibleBoundsOfInputTextMKHz9U$foundation(j);
        }
        return layoutResult.m7030getOffsetForPositionk4lQ0M(TextLayoutStateKt.m1354fromDecorationToTextLayoutUv8p0NA(this, j));
    }

    public final my getOnTextLayout() {
        return this.onTextLayout;
    }

    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates$delegate.getValue();
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m1350isPositionOnTextk4lQ0M(long j) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long m1354fromDecorationToTextLayoutUv8p0NA = TextLayoutStateKt.m1354fromDecorationToTextLayoutUv8p0NA(this, m1347coercedInVisibleBoundsOfInputTextMKHz9U$foundation(j));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(Float.intBitsToFloat((int) (4294967295L & m1354fromDecorationToTextLayoutUv8p0NA)));
        int i = (int) (m1354fromDecorationToTextLayoutUv8p0NA >> 32);
        return Float.intBitsToFloat(i) >= layoutResult.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i) <= layoutResult.getLineRight(lineForVerticalPosition);
    }

    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m1351layoutWithNewMeasureInputshBUhpc(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        TextLayoutResult m1340layoutWithNewMeasureInputshBUhpc = this.layoutCache.m1340layoutWithNewMeasureInputshBUhpc(density, layoutDirection, resolver, j);
        my myVar = this.onTextLayout;
        if (myVar != null) {
            myVar.invoke(density, new hm0(this, 14));
        }
        return m1340layoutWithNewMeasureInputshBUhpc;
    }

    public final void setCoreNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void setDecoratorNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m1352setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m7609boximpl(f));
    }

    public final void setOnTextLayout(my myVar) {
        this.onTextLayout = myVar;
    }

    public final void setTextLayoutNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void updateNonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, boolean z2, KeyboardOptions keyboardOptions) {
        this.layoutCache.updateNonMeasureInputs(transformedTextFieldState, textStyle, z, z2, keyboardOptions);
    }
}
