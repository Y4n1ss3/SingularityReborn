package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.j50;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class HorizontalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;
    private final TextFieldScrollerPosition scrollerPosition;
    private final iy textLayoutResultProvider;
    private final TransformedText transformedText;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, iy iyVar) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = iyVar;
    }

    public static /* synthetic */ HorizontalScrollLayoutModifier copy$default(HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, iy iyVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textFieldScrollerPosition = horizontalScrollLayoutModifier.scrollerPosition;
        }
        if ((i2 & 2) != 0) {
            i = horizontalScrollLayoutModifier.cursorOffset;
        }
        if ((i2 & 4) != 0) {
            transformedText = horizontalScrollLayoutModifier.transformedText;
        }
        if ((i2 & 8) != 0) {
            iyVar = horizontalScrollLayoutModifier.textLayoutResultProvider;
        }
        return horizontalScrollLayoutModifier.copy(textFieldScrollerPosition, i, transformedText, iyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, MeasureScope measureScope, Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Rect cursorRectInScroller;
        int i2 = horizontalScrollLayoutModifier.cursorOffset;
        TransformedText transformedText = horizontalScrollLayoutModifier.transformedText;
        TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) horizontalScrollLayoutModifier.textLayoutResultProvider.invoke();
        cursorRectInScroller = TextFieldScrollKt.getCursorRectInScroller(placementScope, i2, transformedText, textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, measureScope.getLayoutDirection() == LayoutDirection.Rtl, placeable.getWidth());
        horizontalScrollLayoutModifier.scrollerPosition.update(Orientation.Horizontal, cursorRectInScroller, i, placeable.getWidth());
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, Math.round(-horizontalScrollLayoutModifier.scrollerPosition.getOffset()), 0, 0.0f, 4, null);
        return w01.a;
    }

    public final TextFieldScrollerPosition component1() {
        return this.scrollerPosition;
    }

    public final int component2() {
        return this.cursorOffset;
    }

    public final TransformedText component3() {
        return this.transformedText;
    }

    public final iy component4() {
        return this.textLayoutResultProvider;
    }

    public final HorizontalScrollLayoutModifier copy(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, iy iyVar) {
        return new HorizontalScrollLayoutModifier(textFieldScrollerPosition, i, transformedText, iyVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return q10.b(this.scrollerPosition, horizontalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == horizontalScrollLayoutModifier.cursorOffset && q10.b(this.transformedText, horizontalScrollLayoutModifier.transformedText) && q10.b(this.textLayoutResultProvider, horizontalScrollLayoutModifier.textLayoutResultProvider);
    }

    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    public final iy getTextLayoutResultProvider() {
        return this.textLayoutResultProvider;
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public int hashCode() {
        return this.textLayoutResultProvider.hashCode() + ((this.transformedText.hashCode() + j50.b(this.cursorOffset, this.scrollerPosition.hashCode() * 31, 31)) * 31);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo1114measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        long j2;
        if (measurable.maxIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j)) < Constraints.m7564getMaxWidthimpl(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = Constraints.m7554copyZbe2FdA$default(j2, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        final int min = Math.min(mo6234measureBRTryo0.getWidth(), Constraints.m7564getMaxWidthimpl(j2));
        return MeasureScope.layout$default(measureScope, min, mo6234measureBRTryo0.getHeight(), null, new ky() { // from class: androidx.compose.foundation.text.f
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = HorizontalScrollLayoutModifier.measure_3p2s80s$lambda$0(HorizontalScrollLayoutModifier.this, measureScope, mo6234measureBRTryo0, min, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
