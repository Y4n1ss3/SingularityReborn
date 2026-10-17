package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import defpackage.g7;
import defpackage.iy;
import defpackage.kn0;
import defpackage.ky;
import defpackage.on0;
import defpackage.pn0;
import defpackage.qn0;
import defpackage.rn0;
import defpackage.te0;
import defpackage.w01;
import defpackage.x6;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionManager_androidKt {
    public static final Modifier addSelectionContainerTextContextMenuComponents(Modifier modifier, SelectionManager selectionManager) {
        return TextContextMenuModifier_androidKt.addTextContextMenuComponentsWithContext(modifier, new on0(selectionManager, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addSelectionContainerTextContextMenuComponents$lambda$0(SelectionManager selectionManager, TextContextMenuBuilderScope textContextMenuBuilderScope, Context context) {
        xe0 contextTextAndSelection$foundation = selectionManager.getContextTextAndSelection$foundation();
        PlatformSelectionBehaviors_androidKt.m1499addPlatformTextContextMenuItems71BSaZU(textContextMenuBuilderScope, context, false, contextTextAndSelection$foundation != null ? (AnnotatedString) contextTextAndSelection$foundation.d : null, contextTextAndSelection$foundation != null ? (TextRange) contextTextAndSelection$foundation.e : null, selectionManager.getPlatformSelectionBehaviors$foundation(), new te0(9, selectionManager, context));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addSelectionContainerTextContextMenuComponents$lambda$0$1(SelectionManager selectionManager, Context context, TextContextMenuBuilderScope textContextMenuBuilderScope) {
        textContextMenuBuilderScope.separator();
        addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem$default(textContextMenuBuilderScope, context, TextContextMenuItems.Copy, selectionManager.isNonEmptySelection$foundation(), null, new kn0(selectionManager, 7), 8, null);
        addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem(textContextMenuBuilderScope, context, TextContextMenuItems.SelectAll, !selectionManager.isEntireContainerSelected$foundation(), new kn0(selectionManager, 8), new kn0(selectionManager, 9));
        textContextMenuBuilderScope.separator();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0(SelectionManager selectionManager) {
        selectionManager.copy$foundation();
        if (selectionManager.isInTouchMode()) {
            selectionManager.onRelease();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1(SelectionManager selectionManager) {
        return (selectionManager.getShowToolbar$foundation() && selectionManager.isInTouchMode()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2(SelectionManager selectionManager) {
        selectionManager.selectAll$foundation();
        return w01.a;
    }

    private static final void addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, TextContextMenuItems textContextMenuItems, boolean z, iy iyVar, iy iyVar2) {
        ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems, z, new pn0(iyVar2, iyVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem$0(iy iyVar, iy iyVar2, TextContextMenuSession textContextMenuSession) {
        iyVar.invoke();
        if (iyVar2 != null ? ((Boolean) iyVar2.invoke()).booleanValue() : true) {
            textContextMenuSession.close();
        }
        return w01.a;
    }

    public static /* synthetic */ void addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem$default(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, TextContextMenuItems textContextMenuItems, boolean z, iy iyVar, iy iyVar2, int i, Object obj) {
        if ((i & 8) != 0) {
            iyVar = null;
        }
        addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem(textContextMenuBuilderScope, context, textContextMenuItems, z, iyVar, iyVar2);
    }

    /* renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m1537isCopyKeyEventZmokQxo(KeyEvent keyEvent) {
        return KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo1116mapZmokQxo(keyEvent) == KeyCommand.COPY;
    }

    public static final Modifier selectionMagnifier(Modifier modifier, SelectionManager selectionManager) {
        return !Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : ComposedModifierKt.composed$default(modifier, null, new x6(selectionManager, 10), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier selectionMagnifier$lambda$0(SelectionManager selectionManager, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-1914520728);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1914520728, i, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:51)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7774boximpl(IntSize.Companion.m7787getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(selectionManager);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new rn0(0, selectionManager, mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        iy iyVar = (iy) rememberedValue2;
        boolean changed = composer.changed(density);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new qn0(density, mutableState, 1);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier animatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, iyVar, (ky) rememberedValue3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return animatedSelectionMagnifier;
    }

    private static final long selectionMagnifier$lambda$0$1(MutableState<IntSize> mutableState) {
        return mutableState.getValue().m7786unboximpl();
    }

    private static final void selectionMagnifier$lambda$0$2(MutableState<IntSize> mutableState, long j) {
        mutableState.setValue(IntSize.m7774boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset selectionMagnifier$lambda$0$3$0(SelectionManager selectionManager, MutableState mutableState) {
        return Offset.m4505boximpl(SelectionManagerKt.m1534calculateSelectionMagnifierCenterAndroidO0kMr_c(selectionManager, selectionMagnifier$lambda$0$1(mutableState)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier selectionMagnifier$lambda$0$4$0(Density density, MutableState mutableState, iy iyVar) {
        return Magnifier_androidKt.m296magnifierjPUL71Q$default(Modifier.Companion, new g7(8, iyVar), null, new qn0(density, mutableState, 0), 0.0f, true, 0L, 0.0f, 0.0f, false, PlatformMagnifierFactory.Companion.getForCurrentPlatform(), 490, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset selectionMagnifier$lambda$0$4$0$0(iy iyVar, Density density) {
        return (Offset) iyVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 selectionMagnifier$lambda$0$4$0$1(Density density, MutableState mutableState, DpSize dpSize) {
        selectionMagnifier$lambda$0$2(mutableState, IntSize.m7777constructorimpl((density.mo361roundToPx0680j_4(DpSize.m7709getWidthD9Ej5fM(dpSize.m7717unboximpl())) << 32) | (density.mo361roundToPx0680j_4(DpSize.m7707getHeightD9Ej5fM(dpSize.m7717unboximpl())) & 4294967295L)));
        return w01.a;
    }
}
