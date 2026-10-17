package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.LongPressResult;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import defpackage.ae;
import defpackage.be;
import defpackage.bq;
import defpackage.dq;
import defpackage.f1;
import defpackage.fc;
import defpackage.h;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.r4;
import defpackage.st;
import defpackage.un;
import defpackage.uo;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.wd;
import defpackage.xd;
import defpackage.zd;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTooltipBox(PopupPositionProvider popupPositionProvider, my myVar, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, my myVar2, Composer composer, int i, int i2) {
        int i3;
        my myVar3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        my myVar4;
        int i6;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        boolean z6;
        BasicTooltipState basicTooltipState2 = basicTooltipState;
        Composer startRestartGroup = composer.startRestartGroup(196062260);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            myVar3 = myVar;
            i3 |= startRestartGroup.changedInstance(myVar3) ? 32 : 16;
        } else {
            myVar3 = myVar;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(basicTooltipState2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
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
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
                        myVar4 = myVar2;
                        i3 |= startRestartGroup.changedInstance(myVar4) ? 1048576 : Fields.BlendMode;
                    } else {
                        myVar4 = myVar2;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        z5 = z4;
                    } else {
                        if (i7 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        boolean z7 = i4 != 0 ? true : z3;
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(196062260, i6, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        Composer.Companion companion = Composer.Companion;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        un unVar = (un) rememberedValue;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        iy constructor = companion3.getConstructor();
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
                        uo.h(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (basicTooltipState.isVisible()) {
                            startRestartGroup.startReplaceGroup(1833353604);
                            int i8 = i6 >> 3;
                            z6 = false;
                            TooltipPopup(popupPositionProvider, basicTooltipState, unVar, z7, myVar3, startRestartGroup, (i6 & 14) | (i8 & 112) | (i8 & 7168) | ((i6 << 9) & 57344));
                            z3 = z7;
                            startRestartGroup = startRestartGroup;
                        } else {
                            z3 = z7;
                            z6 = false;
                            startRestartGroup.startReplaceGroup(1829588468);
                        }
                        startRestartGroup.endReplaceGroup();
                        int i9 = i6 >> 3;
                        int i10 = ((i6 >> 15) & 14) | (i9 & 112) | (i9 & 896) | ((i6 >> 9) & 7168);
                        basicTooltipState2 = basicTooltipState;
                        Modifier modifier3 = modifier2;
                        boolean z8 = z4;
                        WrappedAnchor(z8, basicTooltipState2, modifier3, myVar4, startRestartGroup, i10, 0);
                        startRestartGroup.endNode();
                        if ((i6 & 896) == 256) {
                            z6 = true;
                        }
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z6 || rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = new h(basicTooltipState2, 8);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        EffectsKt.DisposableEffect(basicTooltipState2, (ky) rememberedValue2, startRestartGroup, (i6 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z8;
                        modifier2 = modifier3;
                    }
                    boolean z9 = z3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new be(popupPositionProvider, myVar, basicTooltipState2, modifier2, z9, z5, myVar2, i, i2, 0));
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((1572864 & i) != 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                }
                boolean z92 = z3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((1572864 & i) != 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
            }
            boolean z922 = z3;
            endRestartGroup = startRestartGroup.endRestartGroup();
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
        z4 = z2;
        if ((1572864 & i) != 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
        }
        boolean z9222 = z3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BasicTooltipBox$lambda$1$0(final BasicTooltipState basicTooltipState, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                BasicTooltipState.this.onDispose();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTooltipBox$lambda$2(PopupPositionProvider popupPositionProvider, my myVar, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, my myVar2, int i, int i2, Composer composer, int i3) {
        BasicTooltipBox(popupPositionProvider, myVar, basicTooltipState, modifier, z, z2, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final BasicTooltipState BasicTooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(z, z2, mutatorMutex);
    }

    public static /* synthetic */ BasicTooltipState BasicTooltipState$default(boolean z, boolean z2, MutatorMutex mutatorMutex, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z, z2, mutatorMutex);
    }

    private static final void TooltipPopup(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, un unVar, boolean z, my myVar, Composer composer, int i) {
        PopupPositionProvider popupPositionProvider2;
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1882542163);
        int i3 = 2;
        if ((i & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i2 = (startRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(unVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.Clip : 8192;
        }
        if (startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1882542163, i2, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)");
            }
            String description = BasicTooltipStrings.INSTANCE.description(startRestartGroup, 6);
            boolean changedInstance = startRestartGroup.changedInstance(unVar) | ((i2 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new xd(basicTooltipState, unVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider2, (iy) rememberedValue, new PopupProperties(z, false, false, false, 14, (dq) null), ComposableLambdaKt.rememberComposableLambda(916917707, true, new r4(i3, description, myVar), startRestartGroup, 54), startRestartGroup, (i2 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new zd(popupPositionProvider, basicTooltipState, unVar, z, myVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TooltipPopup$lambda$0$0(BasicTooltipState basicTooltipState, un unVar) {
        if (basicTooltipState.isVisible()) {
            p01.t(unVar, null, null, new BasicTooltipKt$TooltipPopup$1$1$1(basicTooltipState, null), 3);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TooltipPopup$lambda$1(String str, my myVar, Composer composer, int i) {
        int i2 = 0;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(916917707, i, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.kt:144)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean changed = composer.changed(str);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new wd(str, i2);
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            iy constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
            uo.h(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (fc.l(myVar, composer, 0)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TooltipPopup$lambda$1$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6846setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m6819getAssertive0phEisY());
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TooltipPopup$lambda$2(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, un unVar, boolean z, my myVar, int i, Composer composer, int i2) {
        TooltipPopup(popupPositionProvider, basicTooltipState, unVar, z, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final void WrappedAnchor(boolean z, BasicTooltipState basicTooltipState, Modifier modifier, my myVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1381511093);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1381511093, i3, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier anchorSemantics = anchorSemantics(handleGestures(modifier, z, basicTooltipState), BasicTooltipStrings.INSTANCE.label(startRestartGroup, 6), z, basicTooltipState, (un) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, anchorSemantics);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            iy constructor = companion.getConstructor();
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
            uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (fc.l(myVar, startRestartGroup, (i3 >> 9) & 14)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ae(z, basicTooltipState, modifier2, myVar, i, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 WrappedAnchor$lambda$1(boolean z, BasicTooltipState basicTooltipState, Modifier modifier, my myVar, int i, int i2, Composer composer, int i3) {
        WrappedAnchor(z, basicTooltipState, modifier, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final Modifier anchorSemantics(Modifier modifier, String str, boolean z, BasicTooltipState basicTooltipState, un unVar) {
        return z ? SemanticsModifierKt.semantics(modifier, true, new f1(str, unVar, basicTooltipState, 5)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 anchorSemantics$lambda$0(String str, un unVar, BasicTooltipState basicTooltipState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str, new xd(unVar, basicTooltipState));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean anchorSemantics$lambda$0$0(un unVar, BasicTooltipState basicTooltipState) {
        p01.t(unVar, null, null, new BasicTooltipKt$anchorSemantics$1$1$1(basicTooltipState, null), 3);
        return true;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z, final BasicTooltipState basicTooltipState) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier, basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt$handleGestures$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {162}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends us0 implements my {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {166, 169, 175}, m = "invokeSuspend", v = 1)
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00011 extends ij0 implements my {
                    final /* synthetic */ un $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                    @bq(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {172}, m = "invokeSuspend", v = 1)
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00021 extends us0 implements my {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00021(BasicTooltipState basicTooltipState, hm hmVar) {
                            super(2, hmVar);
                            this.$state = basicTooltipState;
                        }

                        @Override // defpackage.mc
                        public final hm create(Object obj, hm hmVar) {
                            return new C00021(this.$state, hmVar);
                        }

                        @Override // defpackage.my
                        public final Object invoke(un unVar, hm hmVar) {
                            return ((C00021) create(unVar, hmVar)).invokeSuspend(w01.a);
                        }

                        @Override // defpackage.mc
                        public final Object invokeSuspend(Object obj) {
                            int i = this.label;
                            if (i == 0) {
                                p10.Q(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                Object show = basicTooltipState.show(mutatePriority, this);
                                vn vnVar = vn.d;
                                if (show == vnVar) {
                                    return vnVar;
                                }
                            } else {
                                if (i != 1) {
                                    o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                p10.Q(obj);
                            }
                            return w01.a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00011(un unVar, BasicTooltipState basicTooltipState, hm hmVar) {
                        super(hmVar);
                        this.$$this$coroutineScope = unVar;
                        this.$state = basicTooltipState;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        C00011 c00011 = new C00011(this.$$this$coroutineScope, this.$state, hmVar);
                        c00011.L$0 = obj;
                        return c00011;
                    }

                    @Override // defpackage.my
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                        return ((C00011) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
                    
                        if (r13 == r5) goto L28;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
                    @Override // defpackage.mc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        C00011 c00011;
                        AwaitPointerEventScope awaitPointerEventScope;
                        PointerEventPass pointerEventPass;
                        AwaitPointerEventScope awaitPointerEventScope2;
                        int i = this.label;
                        vn vnVar = vn.d;
                        if (i == 0) {
                            p10.Q(obj);
                            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                            this.L$0 = awaitPointerEventScope3;
                            this.L$1 = pointerEventPass2;
                            this.label = 1;
                            c00011 = this;
                            obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, pointerEventPass2, c00011, 1, null);
                            if (obj != vnVar) {
                                awaitPointerEventScope = awaitPointerEventScope3;
                                pointerEventPass = pointerEventPass2;
                            }
                            return vnVar;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                p10.Q(obj);
                                List<PointerInputChange> changes = ((PointerEvent) obj).getChanges();
                                int size = changes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    changes.get(i2).consume();
                                }
                                return w01.a;
                            }
                            pointerEventPass = (PointerEventPass) this.L$1;
                            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                            p10.Q(obj);
                            c00011 = this;
                            if (((LongPressResult) obj) instanceof LongPressResult.Success) {
                                p01.t(c00011.$$this$coroutineScope, null, null, new C00021(c00011.$state, null), 3);
                                c00011.L$0 = null;
                                c00011.L$1 = null;
                                c00011.label = 3;
                                obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, c00011);
                            }
                            return w01.a;
                        }
                        pointerEventPass = (PointerEventPass) this.L$1;
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        p10.Q(obj);
                        c00011 = this;
                        int m6104getTypeT8wyACA = ((PointerInputChange) obj).m6104getTypeT8wyACA();
                        PointerType.Companion companion = PointerType.Companion;
                        if (PointerType.m6174equalsimpl0(m6104getTypeT8wyACA, companion.m6181getTouchT8wyACA()) || PointerType.m6174equalsimpl0(m6104getTypeT8wyACA, companion.m6180getStylusT8wyACA())) {
                            c00011.L$0 = awaitPointerEventScope;
                            c00011.L$1 = pointerEventPass;
                            c00011.label = 2;
                            obj = TapGestureDetectorKt.waitForLongPress(awaitPointerEventScope, pointerEventPass, c00011);
                            if (obj != vnVar) {
                                awaitPointerEventScope2 = awaitPointerEventScope;
                                if (((LongPressResult) obj) instanceof LongPressResult.Success) {
                                }
                            }
                            return vnVar;
                        }
                        return w01.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, hm hmVar) {
                    super(2, hmVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(un unVar, hm hmVar) {
                    return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
                }

                @Override // defpackage.mc
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        p10.Q(obj);
                        un unVar = (un) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00011 c00011 = new C00011(unVar, this.$state, null);
                        this.label = 1;
                        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, c00011, this);
                        vn vnVar = vn.d;
                        if (awaitEachGesture == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    return w01.a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object n = p10.n(new AnonymousClass1(pointerInputScope, BasicTooltipState.this, null), hmVar);
                return n == vn.d ? n : w01.a;
            }
        }), basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt$handleGestures$2

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {186}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends us0 implements my {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {190}, m = "invokeSuspend", v = 1)
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00031 extends ij0 implements my {
                    final /* synthetic */ un $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                    @bq(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {195}, m = "invokeSuspend", v = 1)
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00041 extends us0 implements my {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00041(BasicTooltipState basicTooltipState, hm hmVar) {
                            super(2, hmVar);
                            this.$state = basicTooltipState;
                        }

                        @Override // defpackage.mc
                        public final hm create(Object obj, hm hmVar) {
                            return new C00041(this.$state, hmVar);
                        }

                        @Override // defpackage.my
                        public final Object invoke(un unVar, hm hmVar) {
                            return ((C00041) create(unVar, hmVar)).invokeSuspend(w01.a);
                        }

                        @Override // defpackage.mc
                        public final Object invokeSuspend(Object obj) {
                            int i = this.label;
                            if (i == 0) {
                                p10.Q(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                Object show = basicTooltipState.show(mutatePriority, this);
                                vn vnVar = vn.d;
                                if (show == vnVar) {
                                    return vnVar;
                                }
                            } else {
                                if (i != 1) {
                                    o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                p10.Q(obj);
                            }
                            return w01.a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00031(un unVar, BasicTooltipState basicTooltipState, hm hmVar) {
                        super(hmVar);
                        this.$$this$coroutineScope = unVar;
                        this.$state = basicTooltipState;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        C00031 c00031 = new C00031(this.$$this$coroutineScope, this.$state, hmVar);
                        c00031.L$0 = obj;
                        return c00031;
                    }

                    @Override // defpackage.my
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                        return ((C00031) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                    }

                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[RETURN] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0030 -> B:5:0x0033). Please report as a decompilation issue!!! */
                    @Override // defpackage.mc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                        /*
                            r6 = this;
                            int r0 = r6.label
                            r1 = 0
                            r2 = 1
                            if (r0 == 0) goto L1a
                            if (r0 != r2) goto L14
                            java.lang.Object r0 = r6.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r0 = (androidx.compose.ui.input.pointer.PointerEventPass) r0
                            java.lang.Object r3 = r6.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                            defpackage.p10.Q(r7)
                            goto L33
                        L14:
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            defpackage.o.f(r6)
                            return r1
                        L1a:
                            defpackage.p10.Q(r7)
                            java.lang.Object r7 = r6.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            r3 = r7
                        L24:
                            r6.L$0 = r3
                            r6.L$1 = r0
                            r6.label = r2
                            java.lang.Object r7 = r3.awaitPointerEvent(r0, r6)
                            vn r4 = defpackage.vn.d
                            if (r7 != r4) goto L33
                            return r4
                        L33:
                            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
                            java.util.List r4 = r7.getChanges()
                            r5 = 0
                            java.lang.Object r4 = r4.get(r5)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            int r4 = r4.m6104getTypeT8wyACA()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.Companion
                            int r5 = r5.m6179getMouseT8wyACA()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerType.m6174equalsimpl0(r4, r5)
                            if (r4 == 0) goto L24
                            int r7 = r7.m6034getType7fucELk()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                            int r5 = r4.m6045getEnter7fucELk()
                            boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m6041equalsimpl0(r7, r5)
                            if (r5 == 0) goto L6e
                            un r7 = r6.$$this$coroutineScope
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1 r4 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1
                            androidx.compose.foundation.BasicTooltipState r5 = r6.$state
                            r4.<init>(r5, r1)
                            r5 = 3
                            defpackage.p01.t(r7, r1, r1, r4, r5)
                            goto L24
                        L6e:
                            int r4 = r4.m6046getExit7fucELk()
                            boolean r7 = androidx.compose.ui.input.pointer.PointerEventType.m6041equalsimpl0(r7, r4)
                            if (r7 == 0) goto L24
                            androidx.compose.foundation.BasicTooltipState r7 = r6.$state
                            r7.dismiss()
                            goto L24
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00031.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, hm hmVar) {
                    super(2, hmVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(un unVar, hm hmVar) {
                    return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
                }

                @Override // defpackage.mc
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        p10.Q(obj);
                        un unVar = (un) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00031 c00031 = new C00031(unVar, this.$state, null);
                        this.label = 1;
                        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(c00031, this);
                        vn vnVar = vn.d;
                        if (awaitPointerEventScope == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    return w01.a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object n = p10.n(new AnonymousClass1(pointerInputScope, BasicTooltipState.this, null), hmVar);
                return n == vn.d ? n : w01.a;
            }
        }) : modifier;
    }

    public static final BasicTooltipState rememberBasicTooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1123859613, i, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:245)");
        }
        boolean z3 = ((((i & 112) ^ 48) > 32 && composer.changed(z2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BasicTooltipStateImpl(z, z2, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        BasicTooltipStateImpl basicTooltipStateImpl = (BasicTooltipStateImpl) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return basicTooltipStateImpl;
    }
}
