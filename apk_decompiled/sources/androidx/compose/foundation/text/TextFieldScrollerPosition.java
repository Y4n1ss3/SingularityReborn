package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import defpackage.dq;
import defpackage.fo0;
import defpackage.ll0;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new ll0(25), new fo0(26));
    private final MutableFloatState maximum$delegate;
    private final MutableFloatState offset$delegate;
    private final MutableState orientation$delegate;
    private Rect previousCursorRect;
    private long previousSelection;
    private final MutableIntState viewportSize$delegate;

    public TextFieldScrollerPosition(Orientation orientation, float f) {
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.maximum$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m7065getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
        return y80.E(Float.valueOf(textFieldScrollerPosition.getOffset()), Boolean.valueOf(textFieldScrollerPosition.getOrientation() == Orientation.Vertical));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldScrollerPosition Saver$lambda$1(List list) {
        Object obj = list.get(1);
        obj.getClass();
        Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
        Object obj2 = list.get(0);
        obj2.getClass();
        return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
    }

    private final void setMaximum(float f) {
        this.maximum$delegate.setFloatValue(f);
    }

    private final void setViewportSize(int i) {
        this.viewportSize$delegate.setIntValue(i);
    }

    public final void coerceOffset$foundation(float f, float f2, int i) {
        float offset = getOffset();
        float f3 = i;
        float f4 = offset + f3;
        setOffset(getOffset() + ((f2 <= f4 && (f >= offset || f2 - f <= f3)) ? (f >= offset || f2 - f > f3) ? 0.0f : f - offset : f2 - f4));
    }

    public final float getMaximum() {
        return this.maximum$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m1193getOffsetToFollow5zctL8(long j) {
        return TextRange.m7060getStartimpl(j) != TextRange.m7060getStartimpl(this.previousSelection) ? TextRange.m7060getStartimpl(j) : TextRange.m7055getEndimpl(j) != TextRange.m7055getEndimpl(this.previousSelection) ? TextRange.m7055getEndimpl(j) : TextRange.m7058getMinimpl(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m1194getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    public final void setOffset(float f) {
        this.offset$delegate.setFloatValue(f);
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation$delegate.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m1195setPreviousSelection5zctL8(long j) {
        this.previousSelection = j;
    }

    public final void update(Orientation orientation, Rect rect, int i, int i2) {
        float f = i2 - i;
        setMaximum(f);
        if (rect.getLeft() != this.previousCursorRect.getLeft() || rect.getTop() != this.previousCursorRect.getTop()) {
            boolean z = orientation == Orientation.Vertical;
            coerceOffset$foundation(z ? rect.getTop() : rect.getLeft(), z ? rect.getBottom() : rect.getRight(), i);
            this.previousCursorRect = rect;
        }
        setOffset(y80.g(getOffset(), 0.0f, f));
        setViewportSize(i);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f, int i, dq dqVar) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
