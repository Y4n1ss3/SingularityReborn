package androidx.compose.material3.internal;

import android.view.View;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.dq;
import defpackage.e1;
import defpackage.iy;
import defpackage.ky;
import defpackage.ny;
import defpackage.o;
import defpackage.oc;
import defpackage.w01;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicEdgeToEdgeDialog_androidKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicEdgeToEdgeDialog(final iy iyVar, Modifier modifier, DialogProperties dialogProperties, boolean z, boolean z2, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        DialogProperties dialogProperties2;
        boolean z3;
        boolean z4;
        Modifier modifier3;
        DialogProperties dialogProperties3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Modifier modifier4;
        DialogProperties dialogProperties4;
        int i6;
        boolean z5;
        Object obj;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(814581409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                dialogProperties2 = dialogProperties;
                i3 |= startRestartGroup.changed(dialogProperties2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        z3 = z;
                        if (startRestartGroup.changed(z3)) {
                            i9 = Fields.CameraDistance;
                            i3 |= i9;
                        }
                    } else {
                        z3 = z;
                    }
                    i9 = Fields.RotationZ;
                    i3 |= i9;
                } else {
                    z3 = z;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z4 = z2;
                        if (startRestartGroup.changed(z4)) {
                            i8 = Fields.Clip;
                            i3 |= i8;
                        }
                    } else {
                        z4 = z2;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    z4 = z2;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
                }
                if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                        DialogProperties dialogProperties5 = i4 != 0 ? new DialogProperties(false, false, false, 7, (dq) null) : dialogProperties2;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            z3 = ColorKt.m4813luminance8_81llA(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl()) < 0.5f;
                        }
                        if ((i2 & 16) != 0) {
                            i5 = i3 & (-57345);
                            modifier4 = modifier5;
                            z4 = ColorKt.m4813luminance8_81llA(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl()) < 0.5f;
                        } else {
                            i5 = i3;
                            modifier4 = modifier5;
                        }
                        dialogProperties4 = dialogProperties5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i5 = i3;
                        modifier4 = modifier2;
                        dialogProperties4 = dialogProperties2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(814581409, i5, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog (BasicEdgeToEdgeDialog.android.kt:90)");
                    }
                    View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    final LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                    Object[] objArr = new Object[0];
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new e1(8);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    UUID uuid = (UUID) RememberSaveableKt.rememberSaveable(objArr, (iy) rememberedValue, startRestartGroup, 48);
                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(nyVar, startRestartGroup, (i5 >> 15) & 14);
                    int i11 = i5 & 14;
                    State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(iyVar, startRestartGroup, i11);
                    State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(dialogProperties4.getDismissOnBackPress()), startRestartGroup, 0);
                    boolean changed = startRestartGroup.changed(view) | startRestartGroup.changed(density);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == companion.getEmpty()) {
                        i6 = i5;
                        DialogWrapper dialogWrapper = new DialogWrapper(iyVar, dialogProperties4, view, layoutDirection, density, uuid, z3, z4);
                        z5 = true;
                        dialogWrapper.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-635938462, true, new BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1(modifier4, rememberUpdatedState3, rememberUpdatedState2, rememberUpdatedState)));
                        startRestartGroup.updateRememberedValue(dialogWrapper);
                        obj = dialogWrapper;
                    } else {
                        i6 = i5;
                        z5 = true;
                        obj = rememberedValue2;
                    }
                    final DialogWrapper dialogWrapper2 = (DialogWrapper) obj;
                    boolean changedInstance = startRestartGroup.changedInstance(dialogWrapper2);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                        i7 = 0;
                        rememberedValue3 = new e(dialogWrapper2, i7);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    } else {
                        i7 = 0;
                    }
                    EffectsKt.DisposableEffect(dialogWrapper2, (ky) rememberedValue3, startRestartGroup, i7);
                    int i12 = i6;
                    boolean changedInstance2 = startRestartGroup.changedInstance(dialogWrapper2) | (i11 == 4 ? z5 : false) | ((i12 & 896) == 256 ? z5 : false) | startRestartGroup.changed(layoutDirection.ordinal()) | (((((i12 & 7168) ^ 3072) <= 2048 || !startRestartGroup.changed(z3)) && (i12 & 3072) != 2048) ? false : z5) | (((((57344 & i12) ^ 24576) <= 16384 || !startRestartGroup.changed(z4)) && (i12 & 24576) != 16384) ? false : z5);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                        final DialogProperties dialogProperties6 = dialogProperties4;
                        final boolean z6 = z3;
                        final boolean z7 = z4;
                        iy iyVar2 = new iy() { // from class: androidx.compose.material3.internal.f
                            @Override // defpackage.iy
                            public final Object invoke() {
                                w01 BasicEdgeToEdgeDialog$lambda$11$lambda$10;
                                BasicEdgeToEdgeDialog$lambda$11$lambda$10 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$11$lambda$10(DialogWrapper.this, iyVar, dialogProperties6, layoutDirection, z6, z7);
                                return BasicEdgeToEdgeDialog$lambda$11$lambda$10;
                            }
                        };
                        dialogProperties4 = dialogProperties6;
                        startRestartGroup.updateRememberedValue(iyVar2);
                        rememberedValue4 = iyVar2;
                    }
                    EffectsKt.SideEffect((iy) rememberedValue4, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    dialogProperties3 = dialogProperties4;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    dialogProperties3 = dialogProperties2;
                }
                boolean z8 = z3;
                boolean z9 = z4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new oc(iyVar, modifier3, dialogProperties3, z8, z9, nyVar, i, i2));
                    return;
                }
                return;
            }
            dialogProperties2 = dialogProperties;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            }
            boolean z82 = z3;
            boolean z92 = z4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
        }
        boolean z822 = z3;
        boolean z922 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicEdgeToEdgeDialog$lambda$11$lambda$10(DialogWrapper dialogWrapper, iy iyVar, DialogProperties dialogProperties, LayoutDirection layoutDirection, boolean z, boolean z2) {
        dialogWrapper.updateParameters(iyVar, dialogProperties, layoutDirection, z, z2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicEdgeToEdgeDialog$lambda$12(iy iyVar, Modifier modifier, DialogProperties dialogProperties, boolean z, boolean z2, ny nyVar, int i, int i2, Composer composer, int i3) {
        BasicEdgeToEdgeDialog(iyVar, modifier, dialogProperties, z, z2, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ny BasicEdgeToEdgeDialog$lambda$2(State<? extends ny> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iy BasicEdgeToEdgeDialog$lambda$3(State<? extends iy> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BasicEdgeToEdgeDialog$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BasicEdgeToEdgeDialog$lambda$9$lambda$8(final DialogWrapper dialogWrapper, DisposableEffectScope disposableEffectScope) {
        dialogWrapper.show();
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$lambda$9$lambda$8$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                DialogWrapper.this.dismiss();
                DialogWrapper.this.disposeComposition();
            }
        };
    }

    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        o.n();
        return false;
    }
}
