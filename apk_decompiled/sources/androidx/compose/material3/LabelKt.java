package androidx.compose.material3;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.dq;
import defpackage.f6;
import defpackage.i2;
import defpackage.ji0;
import defpackage.my;
import defpackage.ny;
import defpackage.tp;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LabelKt {
    private static final void HandleInteractions(boolean z, TooltipState tooltipState, MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-627258109);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : Fields.SpotShadowColor;
        }
        boolean z2 = false;
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-627258109, i2, -1, "androidx.compose.material3.HandleInteractions (Label.kt:108)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(756598818);
                boolean z3 = (i2 & 896) == 256;
                if ((i2 & 112) == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(tooltipState))) {
                    z2 = true;
                }
                boolean z4 = z3 | z2;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new LabelKt$HandleInteractions$1$1(mutableInteractionSource, tooltipState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                EffectsKt.LaunchedEffect(mutableInteractionSource, (my) rememberedValue, startRestartGroup, (i2 >> 6) & 14);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(757210975);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f6(z, tooltipState, mutableInteractionSource, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HandleInteractions$lambda$7(boolean z, TooltipState tooltipState, MutableInteractionSource mutableInteractionSource, int i, Composer composer, int i2) {
        HandleInteractions(z, tooltipState, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Label(final ny nyVar, Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, my myVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        int i5;
        boolean z2;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        MutableInteractionSource mutableInteractionSource4;
        TooltipState rememberBasicTooltipState;
        Composer startRestartGroup = composer.startRestartGroup(-458575864);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(nyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? Fields.Clip : 8192;
                    }
                    boolean z4 = false;
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z3 = z2;
                    } else {
                        Modifier modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
                        dq dqVar = null;
                        MutableInteractionSource mutableInteractionSource5 = i4 != 0 ? null : mutableInteractionSource2;
                        boolean z5 = i5 != 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-458575864, i3, -1, "androidx.compose.material3.Label (Label.kt:69)");
                        }
                        if (mutableInteractionSource5 == null) {
                            startRestartGroup.startReplaceGroup(857748595);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1690236644);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource4 = mutableInteractionSource5;
                        }
                        PopupPositionProvider m2786rememberTooltipPositionProviderHu5FAss = TooltipDefaults.INSTANCE.m2786rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.Companion.m2773getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2);
                        if (z5) {
                            startRestartGroup.startReplaceGroup(857995293);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new LabelStateImpl(z4, z4, 3, dqVar);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            rememberBasicTooltipState = (LabelStateImpl) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1690246656);
                            rememberBasicTooltipState = BasicTooltipKt.rememberBasicTooltipState(false, false, new MutatorMutex(), startRestartGroup, 0, 3);
                            startRestartGroup.endReplaceGroup();
                        }
                        TooltipState tooltipState = rememberBasicTooltipState;
                        ji0 ji0Var = new ji0();
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        Composer.Companion companion = Composer.Companion;
                        if (rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ji0Var.d = (MutableState) rememberedValue3;
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == companion.getEmpty()) {
                            rememberedValue4 = new TooltipScopeImpl(new i2(ji0Var, 18), m2786rememberTooltipPositionProviderHu5FAss);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        final TooltipScopeImpl tooltipScopeImpl = (TooltipScopeImpl) rememberedValue4;
                        BasicTooltipKt.BasicTooltipBox(m2786rememberTooltipPositionProviderHu5FAss, ComposableLambdaKt.rememberComposableLambda(-1572484206, true, new my() { // from class: androidx.compose.material3.LabelKt$Label$1
                            public final void invoke(Composer composer2, int i7) {
                                if (!composer2.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1572484206, i7, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:88)");
                                }
                                ny.this.invoke(tooltipScopeImpl, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return w01.a;
                            }
                        }, startRestartGroup, 54), tooltipState, modifier4, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-44123786, true, new LabelKt$Label$wrappedContent$1(ji0Var, myVar), startRestartGroup, 54), startRestartGroup, ((i3 << 6) & 7168) | 102432816, 144);
                        startRestartGroup = startRestartGroup;
                        HandleInteractions(!z5, tooltipState, mutableInteractionSource4, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        mutableInteractionSource3 = mutableInteractionSource5;
                        z3 = z5;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new tp(nyVar, modifier3, mutableInteractionSource3, z3, myVar, i, i2, 1));
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i2 & 16) == 0) {
                }
                boolean z42 = false;
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i2 & 16) == 0) {
            }
            boolean z422 = false;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i2 & 16) == 0) {
        }
        boolean z4222 = false;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates Label$lambda$4$lambda$3(ji0 ji0Var) {
        return (LayoutCoordinates) ((MutableState) ji0Var.d).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Label$lambda$5(ny nyVar, Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z, my myVar, int i, int i2, Composer composer, int i3) {
        Label(nyVar, modifier, mutableInteractionSource, z, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
