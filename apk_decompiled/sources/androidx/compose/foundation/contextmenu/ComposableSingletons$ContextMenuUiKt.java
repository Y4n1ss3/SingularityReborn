package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import defpackage.iy;
import defpackage.ny;
import defpackage.sy;
import defpackage.w01;
import defpackage.xk;
import defpackage.yk;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableSingletons$ContextMenuUiKt {
    public static final ComposableSingletons$ContextMenuUiKt INSTANCE = new ComposableSingletons$ContextMenuUiKt();

    /* renamed from: lambda$-1571120048, reason: not valid java name */
    private static sy f7lambda$1571120048 = ComposableLambdaKt.composableLambdaInstance(-1571120048, false, new yk());

    /* renamed from: lambda$-1455401925, reason: not valid java name */
    private static ny f6lambda$1455401925 = ComposableLambdaKt.composableLambdaInstance(-1455401925, false, new xk(4));

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda__1455401925$lambda$0(ContextMenuColors contextMenuColors, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(contextMenuColors) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1455401925, i, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1455401925.<anonymous> (ContextMenuUi.kt:305)");
            }
            Modifier.Companion companion = Modifier.Companion;
            ContextMenuSpec contextMenuSpec = ContextMenuSpec.INSTANCE;
            BoxKt.Box(BackgroundKt.m227backgroundbw27NRU$default(SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m764paddingVpY3zN4$default(companion, 0.0f, contextMenuSpec.m341getDividerVerticalPaddingD9Ej5fM(), 1, null), 0.0f, 1, null), contextMenuSpec.m340getDividerHeightD9Ej5fM()), contextMenuColors.m334getIconColor0d7_KjU(), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda__1571120048$lambda$0(Modifier modifier, String str, boolean z, ContextMenuColors contextMenuColors, ny nyVar, iy iyVar, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (composer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= composer.changed(contextMenuColors) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= composer.changedInstance(nyVar) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= composer.changedInstance(iyVar) ? Fields.RenderEffect : 65536;
        }
        if (composer.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1571120048, i2, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1571120048.<anonymous> (ContextMenuUi.kt:136)");
            }
            ContextMenuUiKt.ContextMenuItem(str, z, contextMenuColors, modifier, nyVar, iyVar, composer, ((i2 >> 3) & 1022) | ((i2 << 9) & 7168) | (57344 & i2) | (i2 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* renamed from: getLambda$-1455401925$foundation, reason: not valid java name */
    public final ny m329getLambda$1455401925$foundation() {
        return f6lambda$1455401925;
    }

    /* renamed from: getLambda$-1571120048$foundation, reason: not valid java name */
    public final sy m330getLambda$1571120048$foundation() {
        return f7lambda$1571120048;
    }
}
