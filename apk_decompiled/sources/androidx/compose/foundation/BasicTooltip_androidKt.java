package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.be;
import defpackage.er;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0065  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTooltipBox(PopupPositionProvider popupPositionProvider, my myVar, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, my myVar2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        Composer composer2;
        boolean z4;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1368136524);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(basicTooltipState) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? Fields.Clip : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar2) ? 1048576 : Fields.BlendMode;
                    }
                    if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        z4 = z3;
                        z5 = z2;
                    } else {
                        Modifier modifier3 = i6 != 0 ? Modifier.Companion : modifier2;
                        boolean z6 = i4 != 0 ? true : z3;
                        boolean z7 = i5 != 0 ? true : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1368136524, i3, -1, "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)");
                        }
                        composer2 = startRestartGroup;
                        BasicTooltipKt.BasicTooltipBox(popupPositionProvider, myVar, basicTooltipState, modifier3, z6, z7, myVar2, composer2, i3 & 4194302, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z4 = z6;
                        z5 = z7;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new be(popupPositionProvider, myVar, basicTooltipState, modifier2, z4, z5, myVar2, i, i2, 1));
                        return;
                    }
                    return;
                }
                if ((1572864 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTooltipBoxAndroid$lambda$0(PopupPositionProvider popupPositionProvider, my myVar, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, my myVar2, int i, int i2, Composer composer, int i3) {
        BasicTooltipBox(popupPositionProvider, myVar, basicTooltipState, modifier, z, z2, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
