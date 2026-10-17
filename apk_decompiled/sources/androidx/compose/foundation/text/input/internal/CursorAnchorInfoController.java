package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.p01;
import defpackage.un;
import defpackage.xn;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    private final ComposeInputMethodManager composeImm;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private boolean monitorEnabled;
    private z10 monitorJob;
    private final un monitorScope;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m5005constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, un unVar) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.composeImm = composeInputMethodManager;
        this.monitorScope = unVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo calculateCursorAnchorInfo() {
        LayoutCoordinates coreNodeCoordinates;
        LayoutCoordinates decoratorNodeCoordinates;
        TextLayoutResult layoutResult;
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (coreNodeCoordinates = this.textLayoutState.getCoreNodeCoordinates()) != null) {
                if (!coreNodeCoordinates.isAttached()) {
                    coreNodeCoordinates = null;
                }
                if (coreNodeCoordinates != null && (decoratorNodeCoordinates = this.textLayoutState.getDecoratorNodeCoordinates()) != null) {
                    if (!decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates == null || (layoutResult = this.textLayoutState.getLayoutResult()) == null) {
                        return null;
                    }
                    TextFieldCharSequence visualText = this.textFieldState.getVisualText();
                    Matrix.m5014resetimpl(this.matrix);
                    textLayoutNodeCoordinates.mo6250transformToScreen58bKbWc(this.matrix);
                    AndroidMatrixConversions_androidKt.m4628setFromEL8BTi8(this.androidMatrix, this.matrix);
                    Rect visibleBounds = SelectionManagerKt.visibleBounds(coreNodeCoordinates);
                    Offset.Companion companion = Offset.Companion;
                    return CursorAnchorInfoBuilder_androidKt.m1277buildvxqZcH0(this.builder, visualText, visualText.m1239getSelectiond9O1mEE(), visualText.m1238getCompositionMzsxiRA(), layoutResult, this.androidMatrix, visibleBounds.m4553translatek4lQ0M(textLayoutNodeCoordinates.mo6243localPositionOfR5De75A(coreNodeCoordinates, companion.m4532getZeroF1C5BW0())), SelectionManagerKt.visibleBounds(decoratorNodeCoordinates).m4553translatek4lQ0M(textLayoutNodeCoordinates.mo6243localPositionOfR5De75A(decoratorNodeCoordinates, companion.m4532getZeroF1C5BW0())), this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds);
                }
            }
        }
        return null;
    }

    private final void startOrStopMonitoring() {
        boolean z = this.monitorEnabled;
        z10 z10Var = this.monitorJob;
        if (!z) {
            if (z10Var != null) {
                z10Var.cancel(null);
            }
            this.monitorJob = null;
        } else if (z10Var == null || !z10Var.isActive()) {
            this.monitorJob = p01.t(this.monitorScope, null, xn.g, new CursorAnchorInfoController$startOrStopMonitoring$1(this, null), 1);
        }
    }

    public final void requestUpdates(int i) {
        CursorAnchorInfoController cursorAnchorInfoController;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            boolean z8 = (i & 16) != 0;
            boolean z9 = (i & 8) != 0;
            boolean z10 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z8 || z9 || z10 || z5) {
                z2 = z5;
                z = z10;
                z4 = z9;
                z3 = z8;
                cursorAnchorInfoController = this;
            } else {
                cursorAnchorInfoController = this;
                if (i2 >= 34) {
                    z3 = true;
                    z4 = true;
                    z = true;
                    z2 = true;
                } else {
                    z2 = z5;
                    z3 = true;
                    z4 = true;
                    z = true;
                }
            }
        } else {
            cursorAnchorInfoController = this;
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        cursorAnchorInfoController.requestUpdates(z6, z7, z3, z4, z, z2);
    }

    private final void requestUpdates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.includeInsertionMarker = z3;
        this.includeCharacterBounds = z4;
        this.includeEditorBounds = z5;
        this.includeLineBounds = z6;
        if (z) {
            this.hasPendingImmediateRequest = true;
            CursorAnchorInfo calculateCursorAnchorInfo = calculateCursorAnchorInfo();
            if (calculateCursorAnchorInfo != null) {
                this.composeImm.updateCursorAnchorInfo(calculateCursorAnchorInfo);
            }
        }
        this.monitorEnabled = z2;
        startOrStopMonitoring();
    }
}
