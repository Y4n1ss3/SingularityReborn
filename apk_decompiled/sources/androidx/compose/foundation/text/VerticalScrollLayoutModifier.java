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
import defpackage.iy;
import defpackage.j50;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class VerticalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;
    private final TextFieldScrollerPosition scrollerPosition;
    private final iy textLayoutResultProvider;
    private final TransformedText transformedText;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, iy iyVar) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = iyVar;
    }

    public static /* synthetic */ VerticalScrollLayoutModifier copy$default(VerticalScrollLayoutModifier verticalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, iy iyVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textFieldScrollerPosition = verticalScrollLayoutModifier.scrollerPosition;
        }
        if ((i2 & 2) != 0) {
            i = verticalScrollLayoutModifier.cursorOffset;
        }
        if ((i2 & 4) != 0) {
            transformedText = verticalScrollLayoutModifier.transformedText;
        }
        if ((i2 & 8) != 0) {
            iyVar = verticalScrollLayoutModifier.textLayoutResultProvider;
        }
        return verticalScrollLayoutModifier.copy(textFieldScrollerPosition, i, transformedText, iyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(VerticalScrollLayoutModifier verticalScrollLayoutModifier, Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Rect cursorRectInScroller;
        int i2 = verticalScrollLayoutModifier.cursorOffset;
        TransformedText transformedText = verticalScrollLayoutModifier.transformedText;
        TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) verticalScrollLayoutModifier.textLayoutResultProvider.invoke();
        cursorRectInScroller = TextFieldScrollKt.getCursorRectInScroller(placementScope, i2, transformedText, textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, false, placeable.getWidth());
        verticalScrollLayoutModifier.scrollerPosition.update(Orientation.Vertical, cursorRectInScroller, i, placeable.getHeight());
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Math.round(-verticalScrollLayoutModifier.scrollerPosition.getOffset()), 0.0f, 4, null);
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

    public final VerticalScrollLayoutModifier copy(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, iy iyVar) {
        return new VerticalScrollLayoutModifier(textFieldScrollerPosition, i, transformedText, iyVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return q10.b(this.scrollerPosition, verticalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && q10.b(this.transformedText, verticalScrollLayoutModifier.transformedText) && q10.b(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider);
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
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1114measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int min = Math.min(mo6234measureBRTryo0.getHeight(), Constraints.m7563getMaxHeightimpl(j));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), min, null, new ky() { // from class: androidx.compose.foundation.text.i
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = VerticalScrollLayoutModifier.measure_3p2s80s$lambda$0(VerticalScrollLayoutModifier.this, mo6234measureBRTryo0, min, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
