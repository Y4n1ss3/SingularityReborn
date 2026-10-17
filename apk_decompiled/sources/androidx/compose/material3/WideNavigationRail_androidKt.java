package androidx.compose.material3;

import android.view.View;
import androidx.compose.foundation.DarkThemeKt;
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
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ff;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.sn0;
import defpackage.w01;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRail_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ModalWideNavigationRailDialog(iy iyVar, final ModalWideNavigationRailProperties modalWideNavigationRailProperties, ky kyVar, iy iyVar2, RailPredictiveBackState railPredictiveBackState, my myVar, Composer composer, int i) {
        int i2;
        View view;
        int i3;
        int i4;
        boolean changedInstance;
        Object rememberedValue;
        int i5;
        int i6;
        Object rememberedValue2;
        final iy iyVar3 = iyVar;
        Composer startRestartGroup = composer.startRestartGroup(2015914411);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(iyVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modalWideNavigationRailProperties) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(railPredictiveBackState) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2015914411, i2, -1, "androidx.compose.material3.ModalWideNavigationRailDialog (WideNavigationRail.android.kt:124)");
            }
            View view2 = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(myVar, startRestartGroup, (i2 >> 15) & 14);
            Object[] objArr = new Object[0];
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new sn0(22);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            UUID uuid = (UUID) RememberSaveableKt.rememberSaveable(objArr, (iy) rememberedValue3, startRestartGroup, 48);
            boolean isSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
            boolean changed = startRestartGroup.changed(view2) | startRestartGroup.changed(density);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed) {
                view = view2;
            } else {
                view = view2;
                if (rememberedValue4 != companion.getEmpty()) {
                    i3 = 0;
                    iyVar3 = iyVar;
                    i4 = i2;
                    final ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper = (ModalWideNavigationRailDialogWrapper) rememberedValue4;
                    changedInstance = startRestartGroup.changedInstance(modalWideNavigationRailDialogWrapper);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == companion.getEmpty()) {
                        i5 = 1;
                        rememberedValue = new p0(modalWideNavigationRailDialogWrapper, i5);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    } else {
                        i5 = 1;
                    }
                    EffectsKt.DisposableEffect(modalWideNavigationRailDialogWrapper, (ky) rememberedValue, startRestartGroup, i3);
                    int i7 = (startRestartGroup.changedInstance(modalWideNavigationRailDialogWrapper) ? 1 : 0) | ((i4 & 14) != 4 ? i5 : i3);
                    if ((i4 & 112) != 32) {
                        i5 = i3;
                    }
                    i6 = i7 | i5 | (startRestartGroup.changed(layoutDirection.ordinal()) ? 1 : 0);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (i6 == 0 || rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new iy() { // from class: androidx.compose.material3.v1
                            @Override // defpackage.iy
                            public final Object invoke() {
                                w01 ModalWideNavigationRailDialog$lambda$9$lambda$8;
                                ModalWideNavigationRailDialog$lambda$9$lambda$8 = WideNavigationRail_androidKt.ModalWideNavigationRailDialog$lambda$9$lambda$8(ModalWideNavigationRailDialogWrapper.this, iyVar3, modalWideNavigationRailProperties, layoutDirection);
                                return ModalWideNavigationRailDialog$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    EffectsKt.SideEffect((iy) rememberedValue2, startRestartGroup, i3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            i3 = 0;
            i4 = i2;
            iyVar3 = iyVar;
            ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper2 = new ModalWideNavigationRailDialogWrapper(iyVar3, modalWideNavigationRailProperties, view, layoutDirection, density, uuid, kyVar, iyVar2, railPredictiveBackState, isSystemInDarkTheme);
            modalWideNavigationRailDialogWrapper2.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-406777160, true, new WideNavigationRail_androidKt$ModalWideNavigationRailDialog$dialog$1$1$1(rememberUpdatedState)));
            startRestartGroup.updateRememberedValue(modalWideNavigationRailDialogWrapper2);
            rememberedValue4 = modalWideNavigationRailDialogWrapper2;
            final ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper3 = (ModalWideNavigationRailDialogWrapper) rememberedValue4;
            changedInstance = startRestartGroup.changedInstance(modalWideNavigationRailDialogWrapper3);
            rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            i5 = 1;
            rememberedValue = new p0(modalWideNavigationRailDialogWrapper3, i5);
            startRestartGroup.updateRememberedValue(rememberedValue);
            EffectsKt.DisposableEffect(modalWideNavigationRailDialogWrapper3, (ky) rememberedValue, startRestartGroup, i3);
            int i72 = (startRestartGroup.changedInstance(modalWideNavigationRailDialogWrapper3) ? 1 : 0) | ((i4 & 14) != 4 ? i5 : i3);
            if ((i4 & 112) != 32) {
            }
            i6 = i72 | i5 | (startRestartGroup.changed(layoutDirection.ordinal()) ? 1 : 0);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (i6 == 0) {
            }
            rememberedValue2 = new iy() { // from class: androidx.compose.material3.v1
                @Override // defpackage.iy
                public final Object invoke() {
                    w01 ModalWideNavigationRailDialog$lambda$9$lambda$8;
                    ModalWideNavigationRailDialog$lambda$9$lambda$8 = WideNavigationRail_androidKt.ModalWideNavigationRailDialog$lambda$9$lambda$8(ModalWideNavigationRailDialogWrapper.this, iyVar3, modalWideNavigationRailProperties, layoutDirection);
                    return ModalWideNavigationRailDialog$lambda$9$lambda$8;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            EffectsKt.SideEffect((iy) rememberedValue2, startRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ff(iyVar3, modalWideNavigationRailProperties, kyVar, iyVar2, railPredictiveBackState, myVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final my ModalWideNavigationRailDialog$lambda$0(State<? extends my> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRailDialog$lambda$10(iy iyVar, ModalWideNavigationRailProperties modalWideNavigationRailProperties, ky kyVar, iy iyVar2, RailPredictiveBackState railPredictiveBackState, my myVar, int i, Composer composer, int i2) {
        ModalWideNavigationRailDialog(iyVar, modalWideNavigationRailProperties, kyVar, iyVar2, railPredictiveBackState, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ModalWideNavigationRailDialog$lambda$7$lambda$6(final ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper, DisposableEffectScope disposableEffectScope) {
        modalWideNavigationRailDialogWrapper.show();
        return new DisposableEffectResult() { // from class: androidx.compose.material3.WideNavigationRail_androidKt$ModalWideNavigationRailDialog$lambda$7$lambda$6$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ModalWideNavigationRailDialogWrapper.this.dismiss();
                ModalWideNavigationRailDialogWrapper.this.disposeComposition();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalWideNavigationRailDialog$lambda$9$lambda$8(ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper, iy iyVar, ModalWideNavigationRailProperties modalWideNavigationRailProperties, LayoutDirection layoutDirection) {
        modalWideNavigationRailDialogWrapper.updateParameters(iyVar, modalWideNavigationRailProperties, layoutDirection);
        return w01.a;
    }

    public static final ModalWideNavigationRailProperties createDefaultModalWideNavigationRailProperties() {
        return new ModalWideNavigationRailProperties(false, 1, null);
    }
}
