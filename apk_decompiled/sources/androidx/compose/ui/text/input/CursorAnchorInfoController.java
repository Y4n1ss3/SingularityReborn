package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private Rect innerTextFieldBounds;
    private final InputMethodManager inputMethodManager;
    private boolean monitorEnabled;
    private OffsetMapping offsetMapping;
    private final MatrixPositionCalculator rootPositionCalculator;
    private TextFieldValue textFieldValue;
    private TextLayoutResult textLayoutResult;
    private final Object lock = new Object();
    private ky textFieldToRootTransform = CursorAnchorInfoController$textFieldToRootTransform$1.INSTANCE;
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m5005constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager) {
        this.rootPositionCalculator = matrixPositionCalculator;
        this.inputMethodManager = inputMethodManager;
    }

    private final void updateCursorAnchorInfo() {
        if (this.inputMethodManager.isActive()) {
            this.textFieldToRootTransform.invoke(Matrix.m5003boximpl(this.matrix));
            this.rootPositionCalculator.mo6007localToScreen58bKbWc(this.matrix);
            AndroidMatrixConversions_androidKt.m4628setFromEL8BTi8(this.androidMatrix, this.matrix);
            InputMethodManager inputMethodManager = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            textFieldValue.getClass();
            OffsetMapping offsetMapping = this.offsetMapping;
            offsetMapping.getClass();
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            textLayoutResult.getClass();
            android.graphics.Matrix matrix = this.androidMatrix;
            Rect rect = this.innerTextFieldBounds;
            rect.getClass();
            Rect rect2 = this.decorationBoxBounds;
            rect2.getClass();
            inputMethodManager.updateCursorAnchorInfo(CursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.textFieldToRootTransform = CursorAnchorInfoController$invalidate$1$1.INSTANCE;
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
        }
    }

    public final void requestUpdate(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        synchronized (this.lock) {
            try {
                this.includeInsertionMarker = z3;
                this.includeCharacterBounds = z4;
                this.includeEditorBounds = z5;
                this.includeLineBounds = z6;
                if (z) {
                    this.hasPendingImmediateRequest = true;
                    if (this.textFieldValue != null) {
                        updateCursorAnchorInfo();
                    }
                }
                this.monitorEnabled = z2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, ky kyVar, Rect rect, Rect rect2) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
                this.textFieldToRootTransform = kyVar;
                this.innerTextFieldBounds = rect;
                this.decorationBoxBounds = rect2;
                if (!this.hasPendingImmediateRequest) {
                    if (this.monitorEnabled) {
                    }
                }
                updateCursorAnchorInfo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
