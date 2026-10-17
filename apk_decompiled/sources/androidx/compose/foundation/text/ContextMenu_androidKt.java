package androidx.compose.foundation.text;

import android.content.res.Resources;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Fields;
import defpackage.jj;
import defpackage.kj;
import defpackage.ky;
import defpackage.lj;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenu_androidKt {
    public static final void ContextMenuArea(TextFieldSelectionState textFieldSelectionState, boolean z, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-579239002);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-579239002, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
            }
            CommonContextMenuAreaKt.CommonContextMenuArea(textFieldSelectionState, z, myVar, startRestartGroup, i2 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new lj(textFieldSelectionState, z, myVar, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuArea$lambda$0(TextFieldSelectionManager textFieldSelectionManager, my myVar, int i, Composer composer, int i2) {
        ContextMenuArea(textFieldSelectionManager, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuArea$lambda$1(TextFieldSelectionState textFieldSelectionState, boolean z, my myVar, int i, Composer composer, int i2) {
        ContextMenuArea(textFieldSelectionState, z, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuArea$lambda$2(SelectionManager selectionManager, my myVar, int i, Composer composer, int i2) {
        ContextMenuArea(selectionManager, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void textItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Resources resources, TextContextMenuItems textContextMenuItems, boolean z, ky kyVar) {
        if (z) {
            TextContextMenuBuilderScope_androidKt.item(textContextMenuBuilderScope, textContextMenuItems.getKey(), resources.getString(textContextMenuItems.m1163getStringId9Hzcbyc()), textContextMenuItems.m1162getDrawableId3I4p1mQ(), kyVar);
        }
    }

    public static final void ContextMenuArea(TextFieldSelectionManager textFieldSelectionManager, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2080741862);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2080741862, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:33)");
            }
            CommonContextMenuAreaKt.CommonContextMenuArea(textFieldSelectionManager, myVar, startRestartGroup, i2 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new jj(textFieldSelectionManager, myVar, i, i3));
        }
    }

    public static final void ContextMenuArea(SelectionManager selectionManager, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-954926513);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(selectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-954926513, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:49)");
            }
            CommonContextMenuAreaKt.CommonContextMenuArea(selectionManager, myVar, startRestartGroup, i2 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kj(selectionManager, myVar, i, i3));
        }
    }
}
