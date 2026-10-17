package androidx.compose.foundation;

import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.je0;
import defpackage.ky;
import defpackage.ti;
import defpackage.ui;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    public static final Modifier progressSemantics(Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, true, new je0(9));
    }

    public static Modifier progressSemantics$default(Modifier modifier, float f, ui uiVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            uiVar = new ti(0.0f, 1.0f);
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return progressSemantics(modifier, f, uiVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 progressSemantics$lambda$0(float f, ui uiVar, int i, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) y80.j(Float.valueOf(f), uiVar)).floatValue(), uiVar, i));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 progressSemantics$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.Companion.getIndeterminate());
        return w01.a;
    }

    public static final Modifier progressSemantics(Modifier modifier, final float f, final ui uiVar, final int i) {
        return SemanticsModifierKt.semantics(modifier, true, new ky() { // from class: ch0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 progressSemantics$lambda$0;
                progressSemantics$lambda$0 = ProgressSemanticsKt.progressSemantics$lambda$0(f, uiVar, i, (SemanticsPropertyReceiver) obj);
                return progressSemantics$lambda$0;
            }
        });
    }
}
