package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Fields;
import defpackage.al;
import defpackage.iy;
import defpackage.py;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt {
    public static final ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt INSTANCE = new ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt();
    private static py lambda$129995601 = ComposableLambdaKt.composableLambdaInstance(129995601, false, new al(0));
    private static py lambda$636288403 = ComposableLambdaKt.composableLambdaInstance(636288403, false, new al(1));

    /* renamed from: lambda$-1357803046, reason: not valid java name */
    private static py f55lambda$1357803046 = ComposableLambdaKt.composableLambdaInstance(-1357803046, false, new al(2));

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda_129995601$lambda$0(TextContextMenuSession textContextMenuSession, TextContextMenuDataProvider textContextMenuDataProvider, iy iyVar, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(textContextMenuSession) : composer.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(textContextMenuDataProvider) : composer.changedInstance(textContextMenuDataProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changedInstance(iyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(129995601, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$129995601.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:75)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, iyVar, composer, i2 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda_636288403$lambda$0(TextContextMenuSession textContextMenuSession, TextContextMenuDataProvider textContextMenuDataProvider, iy iyVar, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(textContextMenuSession) : composer.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(textContextMenuDataProvider) : composer.changedInstance(textContextMenuDataProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changedInstance(iyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(636288403, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$636288403.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:90)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, iyVar, composer, i2 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda__1357803046$lambda$0(TextContextMenuSession textContextMenuSession, TextContextMenuDataProvider textContextMenuDataProvider, iy iyVar, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(textContextMenuSession) : composer.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(textContextMenuDataProvider) : composer.changedInstance(textContextMenuDataProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changedInstance(iyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357803046, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$-1357803046.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:99)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, iyVar, composer, i2 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* renamed from: getLambda$-1357803046$foundation, reason: not valid java name */
    public final py m1209getLambda$1357803046$foundation() {
        return f55lambda$1357803046;
    }

    public final py getLambda$129995601$foundation() {
        return lambda$129995601;
    }

    public final py getLambda$636288403$foundation() {
        return lambda$636288403;
    }
}
