package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultBasicAlertDialogOverride implements BasicAlertDialogOverride {
    public static final int $stable = 0;
    public static final DefaultBasicAlertDialogOverride INSTANCE = new DefaultBasicAlertDialogOverride();

    private DefaultBasicAlertDialogOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicAlertDialog$lambda$0(DefaultBasicAlertDialogOverride defaultBasicAlertDialogOverride, BasicAlertDialogOverrideScope basicAlertDialogOverrideScope, int i, Composer composer, int i2) {
        defaultBasicAlertDialogOverride.BasicAlertDialog(basicAlertDialogOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    @Override // androidx.compose.material3.BasicAlertDialogOverride
    public void BasicAlertDialog(BasicAlertDialogOverrideScope basicAlertDialogOverrideScope, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1565826668);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(basicAlertDialogOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1565826668, i2, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog (AlertDialog.kt:163)");
            }
            AndroidDialog_androidKt.Dialog(basicAlertDialogOverrideScope.getOnDismissRequest(), basicAlertDialogOverrideScope.getProperties(), ComposableLambdaKt.rememberComposableLambda(1163527043, true, new DefaultBasicAlertDialogOverride$BasicAlertDialog$1(basicAlertDialogOverrideScope), startRestartGroup, 54), startRestartGroup, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(this, basicAlertDialogOverrideScope, i, 13));
        }
    }
}
