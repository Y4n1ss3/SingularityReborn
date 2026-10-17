package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.f30;
import defpackage.fc;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.uo;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Dialog(iy iyVar, DialogProperties dialogProperties, my myVar, Composer composer, int i, int i2) {
        int i3;
        DialogProperties dialogProperties2;
        int i4;
        DialogProperties dialogProperties3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(826668973);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            dialogProperties2 = dialogProperties;
            i3 |= startRestartGroup.changed(dialogProperties2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                dialogProperties3 = dialogProperties2;
            } else {
                dialogProperties3 = i5 != 0 ? new DialogProperties(false, false, false, 7, (dq) null) : dialogProperties2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(826668973, i4, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:249)");
                }
                View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(myVar, startRestartGroup, (i4 >> 6) & 14);
                Object[] objArr = new Object[0];
                Object rememberedValue = startRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = AndroidDialog_androidKt$Dialog$dialogId$1$1.INSTANCE;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                UUID uuid = (UUID) RememberSaveableKt.rememberSaveable(objArr, (iy) rememberedValue, startRestartGroup, 48);
                boolean changed = startRestartGroup.changed(view) | startRestartGroup.changed(density) | startRestartGroup.changed(dialogProperties3.getWindowType()) | startRestartGroup.changed(dialogProperties3.getWindowToken());
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == companion.getEmpty()) {
                    DialogWrapper dialogWrapper = new DialogWrapper(iyVar, dialogProperties3, view, layoutDirection, density, uuid);
                    dialogWrapper.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-1338939603, true, new AndroidDialog_androidKt$Dialog$dialog$1$1$1(rememberUpdatedState)));
                    startRestartGroup.updateRememberedValue(dialogWrapper);
                    rememberedValue2 = dialogWrapper;
                }
                DialogWrapper dialogWrapper2 = (DialogWrapper) rememberedValue2;
                boolean changedInstance = startRestartGroup.changedInstance(dialogWrapper2);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new AndroidDialog_androidKt$Dialog$1$1(dialogWrapper2);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                EffectsKt.DisposableEffect(dialogWrapper2, (ky) rememberedValue3, startRestartGroup, 0);
                boolean changedInstance2 = startRestartGroup.changedInstance(dialogWrapper2) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | startRestartGroup.changed(layoutDirection.ordinal());
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new AndroidDialog_androidKt$Dialog$2$1(dialogWrapper2, iyVar, dialogProperties3, layoutDirection);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                EffectsKt.SideEffect((iy) rememberedValue4, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new AndroidDialog_androidKt$Dialog$3(iyVar, dialogProperties3, myVar, i, i2));
                return;
            }
            return;
        }
        dialogProperties2 = dialogProperties;
        if ((i & 384) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final my Dialog$lambda$0(State<? extends my> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DialogLayout(Modifier modifier, my myVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1090521195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1090521195, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:752)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i5 = 0;
                        int i6 = 0;
                        for (int i7 = 0; i7 < size; i7++) {
                            Placeable mo6234measureBRTryo0 = list.get(i7).mo6234measureBRTryo0(j);
                            i5 = Math.max(i5, mo6234measureBRTryo0.getWidth());
                            i6 = Math.max(i6, mo6234measureBRTryo0.getHeight());
                            arrayList.add(mo6234measureBRTryo0);
                        }
                        if (list.isEmpty()) {
                            i5 = Constraints.m7566getMinWidthimpl(j);
                            i6 = Constraints.m7565getMinHeightimpl(j);
                        }
                        return MeasureScope.layout$default(measureScope, i5, i6, null, new AnonymousClass1(arrayList), 4, null);
                    }

                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends f30 implements ky {
                        final /* synthetic */ List<Placeable> $placeables;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass1(List<? extends Placeable> list) {
                            super(1);
                            this.$placeables = list;
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                            List<Placeable> list = this.$placeables;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i), 0, 0, 0.0f, 4, null);
                            }
                        }

                        @Override // defpackage.ky
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return w01.a;
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int i5 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
            int i6 = ((i5 << 6) & 896) | 6;
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            uo.h(companion, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
            Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
            if (fc.l(myVar, startRestartGroup, (i6 >> 6) & 14)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidDialog_androidKt$DialogLayout$2(modifier, myVar, i, i2));
        }
    }
}
