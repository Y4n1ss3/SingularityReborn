package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import defpackage.hi0;
import defpackage.hl;
import defpackage.iy;
import defpackage.ky;
import defpackage.ni0;
import defpackage.p5;
import defpackage.r80;
import defpackage.tz;
import defpackage.u80;
import defpackage.uz;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HandwritingGestureApi34 {
    public static final int $stable = 0;
    public static final HandwritingGestureApi34 INSTANCE = new HandwritingGestureApi34();

    private HandwritingGestureApi34() {
    }

    private final int fallback(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        String fallbackText;
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.clearHighlight$foundation();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, fallbackText, true, null, false, 12, null);
        return 5;
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture handwritingGesture, ky kyVar) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        kyVar.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m1281highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j, int i) {
        if (!TextRange.m7054getCollapsedimpl(j)) {
            transformedTextFieldState.m1360highlightCharsIn7RAjNK8(i, j);
            return;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.clearHighlight$foundation();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, ky kyVar) {
        int granularity;
        RectF deletionArea;
        long m1302getRangeForScreenRectOH9lIzo;
        granularity = deleteGesture.getGranularity();
        int m1285toTextGranularityNUwxegE = m1285toTextGranularityNUwxegE(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        m1302getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1302getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deletionArea), m1285toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m7054getCollapsedimpl(m1302getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(tz.z(deleteGesture), kyVar);
        }
        m1283performDeletionOnLegacyTextFieldvJH6DeI(m1302getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m7018equalsimpl0(m1285toTextGranularityNUwxegE, TextGranularity.Companion.m7023getWordDRrd7Zo()), kyVar);
        return 1;
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, ky kyVar) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        long m1304getRangeForScreenRectsO048IG0;
        granularity = deleteRangeGesture.getGranularity();
        int m1285toTextGranularityNUwxegE = m1285toTextGranularityNUwxegE(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        m1304getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1304getRangeForScreenRectsO048IG0(legacyTextFieldState, composeRect, RectHelper_androidKt.toComposeRect(deletionEndArea), m1285toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m7054getCollapsedimpl(m1304getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(tz.z(deleteRangeGesture), kyVar);
        }
        m1283performDeletionOnLegacyTextFieldvJH6DeI(m1304getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m7018equalsimpl0(m1285toTextGranularityNUwxegE, TextGranularity.Companion.m7023getWordDRrd7Zo()), kyVar);
        return 1;
    }

    /* renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m1282performDeletionSbBc2M(TransformedTextFieldState transformedTextFieldState, long j, boolean z) {
        if (z) {
            j = HandwritingGesture_androidKt.m1294adjustHandwritingDeleteGestureRange72CqOWE(j, transformedTextFieldState.getVisualText());
        }
        TransformedTextFieldState.m1359replaceTextM8tDOmk$default(transformedTextFieldState, "", j, null, false, 12, null);
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m1283performDeletionOnLegacyTextFieldvJH6DeI(long j, AnnotatedString annotatedString, boolean z, ky kyVar) {
        EditCommand compoundEditCommand;
        if (z) {
            j = HandwritingGesture_androidKt.m1294adjustHandwritingDeleteGestureRange72CqOWE(j, annotatedString);
        }
        compoundEditCommand = HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m7055getEndimpl(j), TextRange.m7055getEndimpl(j)), new DeleteSurroundingTextCommand(TextRange.m7056getLengthimpl(j), 0));
        kyVar.invoke(compoundEditCommand);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r3 == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int performInsertGesture(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, ky kyVar) {
        PointF insertionPoint;
        long offset;
        int m1297getOffsetForHandwritingGestured4ec7I;
        String textToInsert;
        TextLayoutResult value;
        boolean isBiDiBoundary;
        if (viewConfiguration == null) {
            return fallbackOnLegacyTextField(tz.m(insertGesture), kyVar);
        }
        insertionPoint = insertGesture.getInsertionPoint();
        offset = HandwritingGesture_androidKt.toOffset(insertionPoint);
        m1297getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1297getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, offset, viewConfiguration);
        if (m1297getOffsetForHandwritingGestured4ec7I != -1) {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult != null && (value = layoutResult.getValue()) != null) {
                isBiDiBoundary = HandwritingGesture_androidKt.isBiDiBoundary(value, m1297getOffsetForHandwritingGestured4ec7I);
            }
            textToInsert = insertGesture.getTextToInsert();
            performInsertionOnLegacyTextField(m1297getOffsetForHandwritingGestured4ec7I, textToInsert, kyVar);
            return 1;
        }
        return fallbackOnLegacyTextField(tz.z(insertGesture), kyVar);
    }

    private final void performInsertionOnLegacyTextField(int i, String str, ky kyVar) {
        EditCommand compoundEditCommand;
        compoundEditCommand = HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(i, i), new CommitTextCommand(str, 1));
        kyVar.invoke(compoundEditCommand);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r8 == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int performJoinOrSplitGesture(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, ky kyVar) {
        PointF joinOrSplitPoint;
        long offset;
        int m1297getOffsetForHandwritingGestured4ec7I;
        long rangeOfWhitespaces;
        TextLayoutResult value;
        boolean isBiDiBoundary;
        if (viewConfiguration == null) {
            return fallbackOnLegacyTextField(tz.m(joinOrSplitGesture), kyVar);
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        offset = HandwritingGesture_androidKt.toOffset(joinOrSplitPoint);
        m1297getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1297getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, offset, viewConfiguration);
        if (m1297getOffsetForHandwritingGestured4ec7I != -1) {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult != null && (value = layoutResult.getValue()) != null) {
                isBiDiBoundary = HandwritingGesture_androidKt.isBiDiBoundary(value, m1297getOffsetForHandwritingGestured4ec7I);
            }
            rangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(annotatedString, m1297getOffsetForHandwritingGestured4ec7I);
            if (TextRange.m7054getCollapsedimpl(rangeOfWhitespaces)) {
                performInsertionOnLegacyTextField(TextRange.m7060getStartimpl(rangeOfWhitespaces), " ", kyVar);
                return 1;
            }
            m1283performDeletionOnLegacyTextFieldvJH6DeI(rangeOfWhitespaces, annotatedString, false, kyVar);
            return 1;
        }
        return fallbackOnLegacyTextField(tz.z(joinOrSplitGesture), kyVar);
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, ky kyVar) {
        PointF startPoint;
        long offset;
        PointF endPoint;
        long offset2;
        long m1300getRangeForRemoveSpaceGesture5iVPX68;
        EditCommand compoundEditCommand;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
        startPoint = removeSpaceGesture.getStartPoint();
        offset = HandwritingGesture_androidKt.toOffset(startPoint);
        endPoint = removeSpaceGesture.getEndPoint();
        offset2 = HandwritingGesture_androidKt.toOffset(endPoint);
        m1300getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m1300getRangeForRemoveSpaceGesture5iVPX68(value, offset, offset2, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m7054getCollapsedimpl(m1300getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(tz.z(removeSpaceGesture), kyVar);
        }
        hi0 hi0Var = new hi0();
        hi0Var.d = -1;
        hi0 hi0Var2 = new hi0();
        hi0Var2.d = -1;
        String a = new ni0("\\s+").a(TextRangeKt.m7067substringFDrldGo(annotatedString, m1300getRangeForRemoveSpaceGesture5iVPX68), new uz(hi0Var, hi0Var2, 1));
        if (hi0Var.d == -1 || hi0Var2.d == -1) {
            return fallbackOnLegacyTextField(tz.z(removeSpaceGesture), kyVar);
        }
        compoundEditCommand = HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m7060getStartimpl(m1300getRangeForRemoveSpaceGesture5iVPX68) + hi0Var.d, TextRange.m7060getStartimpl(m1300getRangeForRemoveSpaceGesture5iVPX68) + hi0Var2.d), new CommitTextCommand(a.substring(hi0Var.d, a.length() - (TextRange.m7056getLengthimpl(m1300getRangeForRemoveSpaceGesture5iVPX68) - hi0Var2.d)), 1));
        kyVar.invoke(compoundEditCommand);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence performRemoveSpaceGesture$lambda$1(hi0 hi0Var, hi0 hi0Var2, r80 r80Var) {
        if (hi0Var.d == -1) {
            hi0Var.d = ((u80) r80Var).b().d;
        }
        hi0Var2.d = ((u80) r80Var).b().e + 1;
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence performRemoveSpaceGesture$lambda$3(hi0 hi0Var, hi0 hi0Var2, r80 r80Var) {
        if (hi0Var.d == -1) {
            hi0Var.d = ((u80) r80Var).b().d;
        }
        hi0Var2.d = ((u80) r80Var).b().e + 1;
        return "";
    }

    private final int performSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState, iy iyVar) {
        RectF selectionArea;
        int granularity;
        long m1303getRangeForScreenRectOH9lIzo;
        selectionArea = selectGesture.getSelectionArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionArea);
        granularity = selectGesture.getGranularity();
        m1303getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1303getRangeForScreenRectOH9lIzo(textLayoutState, composeRect, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m7054getCollapsedimpl(m1303getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, tz.z(selectGesture));
        }
        transformedTextFieldState.m1366selectCharsIn5zctL8(m1303getRangeForScreenRectOH9lIzo);
        if (iyVar == null) {
            return 1;
        }
        iyVar.invoke();
        return 1;
    }

    private final int performSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState, iy iyVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        long m1305getRangeForScreenRectsO048IG0;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Rect composeRect2 = RectHelper_androidKt.toComposeRect(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        m1305getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1305getRangeForScreenRectsO048IG0(textLayoutState, composeRect, composeRect2, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m7054getCollapsedimpl(m1305getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, tz.z(selectRangeGesture));
        }
        transformedTextFieldState.m1366selectCharsIn5zctL8(m1305getRangeForScreenRectsO048IG0);
        if (iyVar == null) {
            return 1;
        }
        iyVar.invoke();
        return 1;
    }

    /* renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m1284performSelectionOnLegacyTextField8ffj60Q(long j, TextFieldSelectionManager textFieldSelectionManager, ky kyVar) {
        kyVar.invoke(new SetSelectionCommand(TextRange.m7060getStartimpl(j), TextRange.m7055getEndimpl(j)));
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.enterSelectionMode$foundation(true);
        }
    }

    private final void previewDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        RectF deletionArea;
        int granularity;
        long m1303getRangeForScreenRectOH9lIzo;
        deletionArea = deleteGesture.getDeletionArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(deletionArea);
        granularity = deleteGesture.getGranularity();
        m1303getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1303getRangeForScreenRectOH9lIzo(textLayoutState, composeRect, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        m1281highlightRangeXJREzCE(transformedTextFieldState, m1303getRangeForScreenRectOH9lIzo, TextHighlightType.Companion.m1252getHandwritingDeletePreviewsxJuwY());
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        long m1305getRangeForScreenRectsO048IG0;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        Rect composeRect2 = RectHelper_androidKt.toComposeRect(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        m1305getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1305getRangeForScreenRectsO048IG0(textLayoutState, composeRect, composeRect2, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        m1281highlightRangeXJREzCE(transformedTextFieldState, m1305getRangeForScreenRectsO048IG0, TextHighlightType.Companion.m1252getHandwritingDeletePreviewsxJuwY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$0(TransformedTextFieldState transformedTextFieldState) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.clearHighlight$foundation();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$1(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation();
        }
    }

    private final void previewSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        RectF selectionArea;
        int granularity;
        long m1303getRangeForScreenRectOH9lIzo;
        selectionArea = selectGesture.getSelectionArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionArea);
        granularity = selectGesture.getGranularity();
        m1303getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1303getRangeForScreenRectOH9lIzo(textLayoutState, composeRect, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        m1281highlightRangeXJREzCE(transformedTextFieldState, m1303getRangeForScreenRectOH9lIzo, TextHighlightType.Companion.m1253getHandwritingSelectPreviewsxJuwY());
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        long m1305getRangeForScreenRectsO048IG0;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Rect composeRect2 = RectHelper_androidKt.toComposeRect(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        m1305getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1305getRangeForScreenRectsO048IG0(textLayoutState, composeRect, composeRect2, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        m1281highlightRangeXJREzCE(transformedTextFieldState, m1305getRangeForScreenRectsO048IG0, TextHighlightType.Companion.m1253getHandwritingSelectPreviewsxJuwY());
    }

    /* renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m1285toTextGranularityNUwxegE(int i) {
        return i != 1 ? i != 2 ? TextGranularity.Companion.m7022getCharacterDRrd7Zo() : TextGranularity.Companion.m7022getCharacterDRrd7Zo() : TextGranularity.Companion.m7023getWordDRrd7Zo();
    }

    public final int performHandwritingGesture$foundation(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, ky kyVar) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!untransformedText.equals((layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (p5.p(handwritingGesture)) {
            return performSelectGesture(legacyTextFieldState, p5.j(handwritingGesture), textFieldSelectionManager, kyVar);
        }
        if (tz.u(handwritingGesture)) {
            return performDeleteGesture(legacyTextFieldState, tz.k(handwritingGesture), untransformedText, kyVar);
        }
        if (tz.A(handwritingGesture)) {
            return performSelectRangeGesture(legacyTextFieldState, tz.o(handwritingGesture), textFieldSelectionManager, kyVar);
        }
        if (tz.B(handwritingGesture)) {
            return performDeleteRangeGesture(legacyTextFieldState, tz.l(handwritingGesture), untransformedText, kyVar);
        }
        if (tz.C(handwritingGesture)) {
            return performJoinOrSplitGesture(legacyTextFieldState, tz.n(handwritingGesture), untransformedText, viewConfiguration, kyVar);
        }
        if (p5.v(handwritingGesture)) {
            return performInsertGesture(legacyTextFieldState, p5.h(handwritingGesture), viewConfiguration, kyVar);
        }
        if (p5.x(handwritingGesture)) {
            return performRemoveSpaceGesture(legacyTextFieldState, p5.i(handwritingGesture), untransformedText, viewConfiguration, kyVar);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!untransformedText.equals((layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (p5.p(previewableHandwritingGesture)) {
            previewSelectGesture(legacyTextFieldState, p5.j(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (tz.u(previewableHandwritingGesture)) {
            previewDeleteGesture(legacyTextFieldState, tz.k(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (tz.A(previewableHandwritingGesture)) {
            previewSelectRangeGesture(legacyTextFieldState, tz.o(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!tz.B(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, tz.l(previewableHandwritingGesture), textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new hl(textFieldSelectionManager, 2));
        return true;
    }

    private final void previewDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF deletionArea;
        int granularity;
        long m1302getRangeForScreenRectOH9lIzo;
        if (textFieldSelectionManager != null) {
            deletionArea = deleteGesture.getDeletionArea();
            Rect composeRect = RectHelper_androidKt.toComposeRect(deletionArea);
            granularity = deleteGesture.getGranularity();
            m1302getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1302getRangeForScreenRectOH9lIzo(legacyTextFieldState, composeRect, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
            textFieldSelectionManager.m1563setDeletionPreviewHighlight5zctL8$foundation(m1302getRangeForScreenRectOH9lIzo);
        }
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF selectionArea;
        int granularity;
        long m1302getRangeForScreenRectOH9lIzo;
        if (textFieldSelectionManager != null) {
            selectionArea = selectGesture.getSelectionArea();
            Rect composeRect = RectHelper_androidKt.toComposeRect(selectionArea);
            granularity = selectGesture.getGranularity();
            m1302getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1302getRangeForScreenRectOH9lIzo(legacyTextFieldState, composeRect, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
            textFieldSelectionManager.m1565setSelectionPreviewHighlight5zctL8$foundation(m1302getRangeForScreenRectOH9lIzo);
        }
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        long m1304getRangeForScreenRectsO048IG0;
        if (textFieldSelectionManager != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            Rect composeRect = RectHelper_androidKt.toComposeRect(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            Rect composeRect2 = RectHelper_androidKt.toComposeRect(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            m1304getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1304getRangeForScreenRectsO048IG0(legacyTextFieldState, composeRect, composeRect2, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
            textFieldSelectionManager.m1563setDeletionPreviewHighlight5zctL8$foundation(m1304getRangeForScreenRectsO048IG0);
        }
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        long m1304getRangeForScreenRectsO048IG0;
        if (textFieldSelectionManager != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            Rect composeRect = RectHelper_androidKt.toComposeRect(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            Rect composeRect2 = RectHelper_androidKt.toComposeRect(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            m1304getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1304getRangeForScreenRectsO048IG0(legacyTextFieldState, composeRect, composeRect2, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
            textFieldSelectionManager.m1565setSelectionPreviewHighlight5zctL8$foundation(m1304getRangeForScreenRectsO048IG0);
        }
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, ky kyVar) {
        RectF selectionArea;
        int granularity;
        long m1302getRangeForScreenRectOH9lIzo;
        selectionArea = selectGesture.getSelectionArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionArea);
        granularity = selectGesture.getGranularity();
        m1302getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1302getRangeForScreenRectOH9lIzo(legacyTextFieldState, composeRect, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m7054getCollapsedimpl(m1302getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(tz.z(selectGesture), kyVar);
        }
        m1284performSelectionOnLegacyTextField8ffj60Q(m1302getRangeForScreenRectOH9lIzo, textFieldSelectionManager, kyVar);
        return 1;
    }

    private final int performDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        int granularity;
        RectF deletionArea;
        long m1303getRangeForScreenRectOH9lIzo;
        granularity = deleteGesture.getGranularity();
        int m1285toTextGranularityNUwxegE = m1285toTextGranularityNUwxegE(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        m1303getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1303getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deletionArea), m1285toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m7054getCollapsedimpl(m1303getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, tz.z(deleteGesture));
        }
        m1282performDeletionSbBc2M(transformedTextFieldState, m1303getRangeForScreenRectOH9lIzo, TextGranularity.m7018equalsimpl0(m1285toTextGranularityNUwxegE, TextGranularity.Companion.m7023getWordDRrd7Zo()));
        return 1;
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, ky kyVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        long m1304getRangeForScreenRectsO048IG0;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Rect composeRect2 = RectHelper_androidKt.toComposeRect(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        m1304getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1304getRangeForScreenRectsO048IG0(legacyTextFieldState, composeRect, composeRect2, m1285toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m7054getCollapsedimpl(m1304getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(tz.z(selectRangeGesture), kyVar);
        }
        m1284performSelectionOnLegacyTextField8ffj60Q(m1304getRangeForScreenRectsO048IG0, textFieldSelectionManager, kyVar);
        return 1;
    }

    private final int performInsertGesture(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        PointF insertionPoint;
        long offset;
        int m1298getOffsetForHandwritingGestured4ec7I;
        String textToInsert;
        insertionPoint = insertGesture.getInsertionPoint();
        offset = HandwritingGesture_androidKt.toOffset(insertionPoint);
        m1298getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1298getOffsetForHandwritingGestured4ec7I(textLayoutState, offset, viewConfiguration);
        if (m1298getOffsetForHandwritingGestured4ec7I != -1) {
            textToInsert = insertGesture.getTextToInsert();
            TransformedTextFieldState.m1359replaceTextM8tDOmk$default(transformedTextFieldState, textToInsert, TextRangeKt.TextRange(m1298getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
            return 1;
        }
        return fallback(transformedTextFieldState, tz.z(insertGesture));
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        long m1305getRangeForScreenRectsO048IG0;
        granularity = deleteRangeGesture.getGranularity();
        int m1285toTextGranularityNUwxegE = m1285toTextGranularityNUwxegE(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        m1305getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1305getRangeForScreenRectsO048IG0(textLayoutState, composeRect, RectHelper_androidKt.toComposeRect(deletionEndArea), m1285toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m7054getCollapsedimpl(m1305getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, tz.z(deleteRangeGesture));
        }
        m1282performDeletionSbBc2M(transformedTextFieldState, m1305getRangeForScreenRectsO048IG0, TextGranularity.m7018equalsimpl0(m1285toTextGranularityNUwxegE, TextGranularity.Companion.m7023getWordDRrd7Zo()));
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r12 == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int performJoinOrSplitGesture(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        PointF joinOrSplitPoint;
        long offset;
        int m1298getOffsetForHandwritingGestured4ec7I;
        long rangeOfWhitespaces;
        boolean isBiDiBoundary;
        if (transformedTextFieldState.getOutputText() != transformedTextFieldState.getUntransformedText()) {
            return 3;
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        offset = HandwritingGesture_androidKt.toOffset(joinOrSplitPoint);
        m1298getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1298getOffsetForHandwritingGestured4ec7I(textLayoutState, offset, viewConfiguration);
        if (m1298getOffsetForHandwritingGestured4ec7I != -1) {
            TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
            if (layoutResult != null) {
                isBiDiBoundary = HandwritingGesture_androidKt.isBiDiBoundary(layoutResult, m1298getOffsetForHandwritingGestured4ec7I);
            }
            rangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(transformedTextFieldState.getVisualText(), m1298getOffsetForHandwritingGestured4ec7I);
            if (TextRange.m7054getCollapsedimpl(rangeOfWhitespaces)) {
                TransformedTextFieldState.m1359replaceTextM8tDOmk$default(transformedTextFieldState, " ", rangeOfWhitespaces, null, false, 12, null);
                return 1;
            }
            m1282performDeletionSbBc2M(transformedTextFieldState, rangeOfWhitespaces, false);
            return 1;
        }
        return fallback(transformedTextFieldState, tz.z(joinOrSplitGesture));
    }

    public final boolean previewHandwritingGesture$foundation(TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        if (p5.p(previewableHandwritingGesture)) {
            previewSelectGesture(transformedTextFieldState, p5.j(previewableHandwritingGesture), textLayoutState);
        } else if (tz.u(previewableHandwritingGesture)) {
            previewDeleteGesture(transformedTextFieldState, tz.k(previewableHandwritingGesture), textLayoutState);
        } else if (tz.A(previewableHandwritingGesture)) {
            previewSelectRangeGesture(transformedTextFieldState, tz.o(previewableHandwritingGesture), textLayoutState);
        } else {
            if (!tz.B(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(transformedTextFieldState, tz.l(previewableHandwritingGesture), textLayoutState);
        }
        int i = 1;
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new hl(transformedTextFieldState, i));
        }
        return true;
    }

    public final int performHandwritingGesture$foundation(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, iy iyVar, ViewConfiguration viewConfiguration) {
        if (p5.p(handwritingGesture)) {
            return performSelectGesture(transformedTextFieldState, p5.j(handwritingGesture), textLayoutState, iyVar);
        }
        if (tz.u(handwritingGesture)) {
            return performDeleteGesture(transformedTextFieldState, tz.k(handwritingGesture), textLayoutState);
        }
        if (tz.A(handwritingGesture)) {
            return performSelectRangeGesture(transformedTextFieldState, tz.o(handwritingGesture), textLayoutState, iyVar);
        }
        if (tz.B(handwritingGesture)) {
            return performDeleteRangeGesture(transformedTextFieldState, tz.l(handwritingGesture), textLayoutState);
        }
        if (tz.C(handwritingGesture)) {
            return performJoinOrSplitGesture(transformedTextFieldState, tz.n(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (p5.v(handwritingGesture)) {
            return performInsertGesture(transformedTextFieldState, p5.h(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (p5.x(handwritingGesture)) {
            return performRemoveSpaceGesture(transformedTextFieldState, p5.i(handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        PointF startPoint;
        long offset;
        PointF endPoint;
        long offset2;
        long m1300getRangeForRemoveSpaceGesture5iVPX68;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        startPoint = removeSpaceGesture.getStartPoint();
        offset = HandwritingGesture_androidKt.toOffset(startPoint);
        endPoint = removeSpaceGesture.getEndPoint();
        offset2 = HandwritingGesture_androidKt.toOffset(endPoint);
        m1300getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m1300getRangeForRemoveSpaceGesture5iVPX68(layoutResult, offset, offset2, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m7054getCollapsedimpl(m1300getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallback(transformedTextFieldState, tz.z(removeSpaceGesture));
        }
        hi0 hi0Var = new hi0();
        hi0Var.d = -1;
        hi0 hi0Var2 = new hi0();
        hi0Var2.d = -1;
        String a = new ni0("\\s+").a(TextRangeKt.m7067substringFDrldGo(transformedTextFieldState.getVisualText(), m1300getRangeForRemoveSpaceGesture5iVPX68), new uz(hi0Var, hi0Var2, 0));
        if (hi0Var.d != -1 && hi0Var2.d != -1) {
            TransformedTextFieldState.m1359replaceTextM8tDOmk$default(transformedTextFieldState, a.substring(hi0Var.d, a.length() - (TextRange.m7056getLengthimpl(m1300getRangeForRemoveSpaceGesture5iVPX68) - hi0Var2.d)), TextRangeKt.TextRange(TextRange.m7060getStartimpl(m1300getRangeForRemoveSpaceGesture5iVPX68) + hi0Var.d, TextRange.m7060getStartimpl(m1300getRangeForRemoveSpaceGesture5iVPX68) + hi0Var2.d), null, false, 12, null);
            return 1;
        }
        return fallback(transformedTextFieldState, tz.z(removeSpaceGesture));
    }
}
