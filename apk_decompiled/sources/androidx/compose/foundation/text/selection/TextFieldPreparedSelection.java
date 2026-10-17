package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.dq;
import defpackage.ky;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    public static final int $stable = 8;
    private final TextFieldValue currentValue;
    private final TextLayoutResultProxy layoutResultProxy;

    public TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.getAnnotatedString(), textFieldValue.m7310getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, textPreparedSelectionState, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int jumpByPagesOffset(TextLayoutResultProxy textLayoutResultProxy, int i) {
        Rect zero;
        LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
        if (innerTextFieldCoordinates != null) {
            LayoutCoordinates decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates();
            zero = decorationBoxCoordinates != null ? LayoutCoordinates.localBoundingBoxOf$default(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null) : null;
        }
        zero = Rect.Companion.getZero();
        Rect cursorRect = textLayoutResultProxy.getValue().getCursorRect(getOffsetMapping().originalToTransformed(TextRange.m7055getEndimpl(this.currentValue.m7310getSelectiond9O1mEE())));
        return getOffsetMapping().transformedToOriginal(textLayoutResultProxy.getValue().m7030getOffsetForPositionk4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(cursorRect.getLeft()) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (zero.m4549getSizeNHjbRc() & 4294967295L)) * i) + cursorRect.getTop()) & 4294967295L))));
    }

    public final List<EditCommand> deleteIfSelectedOr(ky kyVar) {
        if (!TextRange.m7054getCollapsedimpl(m1480getSelectiond9O1mEE())) {
            return y80.E(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m7058getMinimpl(m1480getSelectiond9O1mEE()), TextRange.m7058getMinimpl(m1480getSelectiond9O1mEE())));
        }
        EditCommand editCommand = (EditCommand) kyVar.invoke(this);
        if (editCommand != null) {
            return y80.D(editCommand);
        }
        return null;
    }

    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    public final TextFieldValue getValue() {
        return TextFieldValue.m7305copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m1480getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        return this;
    }

    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState, int i, dq dqVar) {
        this(textFieldValue, (i & 2) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, textLayoutResultProxy, (i & 8) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState);
    }
}
