package androidx.compose.foundation;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;
import defpackage.q6;
import defpackage.w01;
import defpackage.wd;
import defpackage.z5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CanvasKt {
    public static final void Canvas(Modifier modifier, String str, ky kyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1162737955);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162737955, i2, -1, "androidx.compose.foundation.Canvas (Canvas.kt:60)");
            }
            Modifier drawBehind = DrawModifierKt.drawBehind(modifier, kyVar);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new wd(str, i3);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SpacerKt.Spacer(SemanticsModifierKt.semantics$default(drawBehind, false, (ky) rememberedValue, 1, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 4, modifier, str, kyVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Canvas$lambda$0(Modifier modifier, ky kyVar, int i, Composer composer, int i2) {
        Canvas(modifier, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Canvas$lambda$1$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Canvas$lambda$2(Modifier modifier, String str, ky kyVar, int i, Composer composer, int i2) {
        Canvas(modifier, str, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void Canvas(Modifier modifier, ky kyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-932836462);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-932836462, i2, -1, "androidx.compose.foundation.Canvas (Canvas.kt:40)");
            }
            SpacerKt.Spacer(DrawModifierKt.drawBehind(modifier, kyVar), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(modifier, kyVar, i, i3));
        }
    }
}
