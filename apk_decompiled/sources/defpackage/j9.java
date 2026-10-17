package defpackage;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class j9 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;

    public /* synthetic */ j9(un unVar, int i) {
        this.d = i;
        this.e = unVar;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 CommonContextMenuArea$lambda$8$0;
        int i = this.d;
        un unVar = this.e;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 2;
                if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2058186133, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:825)");
                    }
                    boolean changedInstance = composer.changedInstance(unVar);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new x8(unVar, i2);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    ButtonKt.Button((iy) rememberedValue, null, false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.h, composer, 805306368, 502);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01.a;
            default:
                CommonContextMenuArea$lambda$8$0 = CommonContextMenuAreaKt.CommonContextMenuArea$lambda$8$0(unVar, (TextFieldSelectionState) obj, (TextContextMenuItems) obj2);
                return CommonContextMenuArea$lambda$8$0;
        }
    }
}
