package androidx.compose.foundation.text.selection;

import android.content.Context;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.foundation.internal.ClipboardUtils;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifier_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import defpackage.f1;
import defpackage.g7;
import defpackage.gu0;
import defpackage.hm;
import defpackage.hu0;
import defpackage.iy;
import defpackage.ky;
import defpackage.p01;
import defpackage.pn0;
import defpackage.qn0;
import defpackage.r4;
import defpackage.rn0;
import defpackage.un;
import defpackage.w01;
import defpackage.x6;
import defpackage.xn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt {
    public static final Modifier addBasicTextFieldTextContextMenuComponents(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, un unVar) {
        return TextContextMenuModifier_androidKt.addTextContextMenuComponentsWithContext(modifier, new r4(11, textFieldSelectionManager, unVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0(TextFieldSelectionManager textFieldSelectionManager, un unVar, TextContextMenuBuilderScope textContextMenuBuilderScope, Context context) {
        boolean editable = textFieldSelectionManager.getEditable();
        AnnotatedString transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation();
        TextRange textRange = null;
        String text = transformedText$foundation != null ? transformedText$foundation.getText() : null;
        TextRange m1561getLatestSelectionMzsxiRA$foundation = textFieldSelectionManager.m1561getLatestSelectionMzsxiRA$foundation();
        if (m1561getLatestSelectionMzsxiRA$foundation != null) {
            long m7064unboximpl = m1561getLatestSelectionMzsxiRA$foundation.m7064unboximpl();
            OffsetMapping offsetMapping$foundation = textFieldSelectionManager.getOffsetMapping$foundation();
            textRange = TextRange.m7048boximpl(TextRangeKt.TextRange(offsetMapping$foundation.originalToTransformed(TextRange.m7060getStartimpl(m7064unboximpl)), offsetMapping$foundation.originalToTransformed(TextRange.m7055getEndimpl(m7064unboximpl))));
        }
        PlatformSelectionBehaviors_androidKt.m1499addPlatformTextContextMenuItems71BSaZU(textContextMenuBuilderScope, context, editable, text, textRange, textFieldSelectionManager.getPlatformSelectionBehaviors$foundation(), new f1(textFieldSelectionManager, unVar, context, 24));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$3(TextFieldSelectionManager textFieldSelectionManager, un unVar, Context context, TextContextMenuBuilderScope textContextMenuBuilderScope) {
        textContextMenuBuilderScope.separator();
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(textContextMenuBuilderScope, unVar, context, TextContextMenuItems.Cut, textFieldSelectionManager.canShowCutMenuItem$foundation(), new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1(textFieldSelectionManager, null));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(textContextMenuBuilderScope, unVar, context, TextContextMenuItems.Copy, textFieldSelectionManager.canShowCopyMenuItem$foundation(), new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(textFieldSelectionManager, null));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(textContextMenuBuilderScope, unVar, context, TextContextMenuItems.Paste, textFieldSelectionManager.canShowPasteMenuItem$foundation(), new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3(textFieldSelectionManager, null));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem(textContextMenuBuilderScope, context, TextContextMenuItems.SelectAll, textFieldSelectionManager.canShowSelectAllMenuItem$foundation(), new gu0(textFieldSelectionManager, 5), new gu0(textFieldSelectionManager, 6));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$default(textContextMenuBuilderScope, context, TextContextMenuItems.Autofill, textFieldSelectionManager.canShowAutofillMenuItem$foundation(), null, new gu0(textFieldSelectionManager, 7), 8, null);
        textContextMenuBuilderScope.separator();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$0(TextFieldSelectionManager textFieldSelectionManager) {
        return !textFieldSelectionManager.getTextToolbarShown$foundation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$1(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.selectAll$foundation();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$2(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.autofill$foundation();
        return w01.a;
    }

    private static final void addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, TextContextMenuItems textContextMenuItems, boolean z, iy iyVar, iy iyVar2) {
        ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems, z, new pn0(iyVar2, iyVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0(iy iyVar, iy iyVar2, TextContextMenuSession textContextMenuSession) {
        iyVar.invoke();
        if (iyVar2 != null ? ((Boolean) iyVar2.invoke()).booleanValue() : true) {
            textContextMenuSession.close();
        }
        return w01.a;
    }

    public static /* synthetic */ void addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$default(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, TextContextMenuItems textContextMenuItems, boolean z, iy iyVar, iy iyVar2, int i, Object obj) {
        if ((i & 8) != 0) {
            iyVar = null;
        }
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem(textContextMenuBuilderScope, context, textContextMenuItems, z, iyVar, iyVar2);
    }

    private static final void addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(TextContextMenuBuilderScope textContextMenuBuilderScope, un unVar, Context context, TextContextMenuItems textContextMenuItems, boolean z, ky kyVar) {
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$default(textContextMenuBuilderScope, context, textContextMenuItems, z, null, new hu0(unVar, kyVar, 0), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1(un unVar, ky kyVar) {
        p01.t(unVar, null, xn.g, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(kyVar, null), 1);
        return w01.a;
    }

    public static final Object hasAvailableTextToPaste(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        Clipboard clipboard$foundation = textFieldSelectionManager.getClipboard$foundation();
        return Boolean.valueOf(clipboard$foundation != null ? ClipboardUtils.hasText(clipboard$foundation) : false);
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        return TextFieldSelectionManagerKt.isSelectionHandleInVisibleBoundDefault(textFieldSelectionManager, z);
    }

    public static final Modifier textFieldMagnifier(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager) {
        return !Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : ComposedModifierKt.composed$default(modifier, null, new x6(textFieldSelectionManager, 15), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier textFieldMagnifier$lambda$0(TextFieldSelectionManager textFieldSelectionManager, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(1980580247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1980580247, i, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:54)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        int i2 = 2;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7774boximpl(IntSize.Companion.m7787getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(textFieldSelectionManager);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new rn0(i2, textFieldSelectionManager, mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        iy iyVar = (iy) rememberedValue2;
        boolean changed = composer.changed(density);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new qn0(density, mutableState, i2);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier animatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, iyVar, (ky) rememberedValue3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return animatedSelectionMagnifier;
    }

    private static final long textFieldMagnifier$lambda$0$1(MutableState<IntSize> mutableState) {
        return mutableState.getValue().m7786unboximpl();
    }

    private static final void textFieldMagnifier$lambda$0$2(MutableState<IntSize> mutableState, long j) {
        mutableState.setValue(IntSize.m7774boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset textFieldMagnifier$lambda$0$3$0(TextFieldSelectionManager textFieldSelectionManager, MutableState mutableState) {
        return Offset.m4505boximpl(TextFieldSelectionManagerKt.m1567calculateSelectionMagnifierCenterAndroidO0kMr_c(textFieldSelectionManager, textFieldMagnifier$lambda$0$1(mutableState)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier textFieldMagnifier$lambda$0$4$0(Density density, MutableState mutableState, iy iyVar) {
        return Magnifier_androidKt.m296magnifierjPUL71Q$default(Modifier.Companion, new g7(12, iyVar), null, new qn0(density, mutableState, 3), 0.0f, true, 0L, 0.0f, 0.0f, false, PlatformMagnifierFactory.Companion.getForCurrentPlatform(), 490, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset textFieldMagnifier$lambda$0$4$0$0(iy iyVar, Density density) {
        return (Offset) iyVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 textFieldMagnifier$lambda$0$4$0$1(Density density, MutableState mutableState, DpSize dpSize) {
        textFieldMagnifier$lambda$0$2(mutableState, IntSize.m7777constructorimpl((density.mo361roundToPx0680j_4(DpSize.m7709getWidthD9Ej5fM(dpSize.m7717unboximpl())) << 32) | (density.mo361roundToPx0680j_4(DpSize.m7707getHeightD9Ej5fM(dpSize.m7717unboximpl())) & 4294967295L)));
        return w01.a;
    }
}
