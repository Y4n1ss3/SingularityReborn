package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import defpackage.ds0;
import defpackage.iy;
import defpackage.my;
import defpackage.ny;
import defpackage.q6;
import defpackage.sy;
import defpackage.w01;
import defpackage.wl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuScope {
    public static final int $stable = 0;
    private final SnapshotStateList<ny> composables = SnapshotStateKt.mutableStateListOf();
    private final sy itemUi;

    public ContextMenuScope(sy syVar) {
        this.itemUi = syVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Content$lambda$1(ContextMenuScope contextMenuScope, ContextMenuColors contextMenuColors, int i, Composer composer, int i2) {
        contextMenuScope.Content$foundation(contextMenuColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static /* synthetic */ void item$default(ContextMenuScope contextMenuScope, my myVar, Modifier modifier, boolean z, ny nyVar, iy iyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            nyVar = null;
        }
        contextMenuScope.item(myVar, modifier2, z2, nyVar, iyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 item$lambda$0(my myVar, ContextMenuScope contextMenuScope, Modifier modifier, boolean z, ny nyVar, iy iyVar, ContextMenuColors contextMenuColors, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(contextMenuColors) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1789283891, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.kt:297)");
            }
            String str = (String) myVar.invoke(composer, 0);
            if (ds0.n0(str)) {
                InlineClassHelperKt.throwIllegalStateException("Label must not be blank");
            }
            contextMenuScope.itemUi.invoke(modifier, str, Boolean.valueOf(z), contextMenuColors, nyVar, iyVar, composer, Integer.valueOf((i2 << 9) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    public final void Content$foundation(ContextMenuColors contextMenuColors, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-798501095);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(contextMenuColors) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-798501095, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.kt:255)");
            }
            SnapshotStateList<ny> snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                snapshotStateList.get(i3).invoke(contextMenuColors, startRestartGroup, Integer.valueOf(i2 & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, contextMenuColors, i, 9));
        }
    }

    public final void clear$foundation() {
        this.composables.clear();
    }

    public final void item(my myVar, Modifier modifier, boolean z, ny nyVar, iy iyVar) {
        this.composables.add(ComposableLambdaKt.composableLambdaInstance(-1789283891, true, new wl(myVar, this, modifier, z, nyVar, iyVar)));
    }

    public final void separator() {
        this.composables.add(ComposableSingletons$ContextMenuUiKt.INSTANCE.m329getLambda$1455401925$foundation());
    }
}
