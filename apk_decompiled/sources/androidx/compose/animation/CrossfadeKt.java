package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.dj;
import defpackage.er;
import defpackage.fb0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.ql0;
import defpackage.uo;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:116:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void Crossfade(Transition<T> transition, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, ky kyVar, ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        FiniteAnimationSpec<Float> finiteAnimationSpec2;
        int i4;
        ky kyVar2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1877370462);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changed(transition) ? 4 : 2) | i : i;
        int i6 = i2 & 1;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 2;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                finiteAnimationSpec2 = finiteAnimationSpec;
                i5 |= startRestartGroup.changedInstance(finiteAnimationSpec2) ? Fields.RotationX : Fields.SpotShadowColor;
                i4 = i2 & 4;
                if (i4 != 0) {
                    i5 |= 3072;
                } else if ((i & 3072) == 0) {
                    kyVar2 = kyVar;
                    i5 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) == 0) {
                        i5 |= startRestartGroup.changedInstance(nyVar) ? Fields.Clip : 8192;
                    }
                    if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                    } else {
                        if (i6 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if (i3 != 0) {
                            finiteAnimationSpec2 = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                        }
                        if (i4 != 0) {
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = CrossfadeKt$Crossfade$3$1.INSTANCE;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            kyVar2 = (ky) rememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1877370462, i5, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                        }
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        Composer.Companion companion = Composer.Companion;
                        Object obj = rememberedValue2;
                        if (rememberedValue2 == companion.getEmpty()) {
                            SnapshotStateList mutableStateListOf = SnapshotStateKt.mutableStateListOf();
                            mutableStateListOf.add(transition.getCurrentState());
                            startRestartGroup.updateRememberedValue(mutableStateListOf);
                            obj = mutableStateListOf;
                        }
                        SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == companion.getEmpty()) {
                            long[] jArr = ql0.a;
                            rememberedValue3 = new fb0();
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        fb0 fb0Var = (fb0) rememberedValue3;
                        if (q10.b(transition.getCurrentState(), transition.getTargetState())) {
                            startRestartGroup.startReplaceGroup(321145192);
                            if (snapshotStateList.size() == 1 && q10.b(snapshotStateList.get(0), transition.getTargetState())) {
                                startRestartGroup.startReplaceGroup(316295552);
                            } else {
                                startRestartGroup.startReplaceGroup(321279546);
                                boolean z = (i5 & 14) == 4;
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (z || rememberedValue4 == companion.getEmpty()) {
                                    rememberedValue4 = new CrossfadeKt$Crossfade$4$1(transition);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                dj.g0((ky) rememberedValue4, snapshotStateList);
                                fb0Var.f();
                            }
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(316295552);
                        }
                        startRestartGroup.endReplaceGroup();
                        if (fb0Var.a(transition.getTargetState())) {
                            startRestartGroup.startReplaceGroup(316295552);
                        } else {
                            startRestartGroup.startReplaceGroup(321536443);
                            Iterator<T> it = snapshotStateList.iterator();
                            int i7 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i7 = -1;
                                    break;
                                } else if (q10.b(kyVar2.invoke(it.next()), kyVar2.invoke(transition.getTargetState()))) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            if (i7 == -1) {
                                snapshotStateList.add(transition.getTargetState());
                            } else {
                                snapshotStateList.set(i7, transition.getTargetState());
                            }
                            fb0Var.f();
                            int size = snapshotStateList.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                T t = snapshotStateList.get(i8);
                                fb0Var.l(t, ComposableLambdaKt.rememberComposableLambda(-934471669, true, new CrossfadeKt$Crossfade$5$1(transition, finiteAnimationSpec2, t, nyVar), startRestartGroup, 54));
                            }
                        }
                        startRestartGroup.endReplaceGroup();
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        iy constructor = companion2.getConstructor();
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
                        uo.h(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1312707512);
                        int size2 = snapshotStateList.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            T t2 = snapshotStateList.get(i9);
                            startRestartGroup.startMovableGroup(1171574969, kyVar2.invoke(t2));
                            my myVar = (my) fb0Var.d(t2);
                            if (myVar == null) {
                                startRestartGroup.startReplaceGroup(1959122128);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1171576145);
                                myVar.invoke(startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endMovableGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    FiniteAnimationSpec<Float> finiteAnimationSpec3 = finiteAnimationSpec2;
                    ky kyVar3 = kyVar2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new CrossfadeKt$Crossfade$7(transition, modifier2, finiteAnimationSpec3, kyVar3, nyVar, i, i2));
                        return;
                    }
                    return;
                }
                kyVar2 = kyVar;
                if ((i & 24576) == 0) {
                }
                if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                }
                FiniteAnimationSpec<Float> finiteAnimationSpec32 = finiteAnimationSpec2;
                ky kyVar32 = kyVar2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            i4 = i2 & 4;
            if (i4 != 0) {
            }
            kyVar2 = kyVar;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
            }
            FiniteAnimationSpec<Float> finiteAnimationSpec322 = finiteAnimationSpec2;
            ky kyVar322 = kyVar2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 2;
        if (i3 == 0) {
        }
        finiteAnimationSpec2 = finiteAnimationSpec;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        kyVar2 = kyVar;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
        }
        FiniteAnimationSpec<Float> finiteAnimationSpec3222 = finiteAnimationSpec2;
        ky kyVar3222 = kyVar2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @er
    public static final /* synthetic */ void Crossfade(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        ny nyVar2;
        FiniteAnimationSpec finiteAnimationSpec2;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(-160948176);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(obj) : startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(finiteAnimationSpec) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            FiniteAnimationSpec finiteAnimationSpec3 = finiteAnimationSpec;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160948176, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:68)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, startRestartGroup, i3 & 14, 2), modifier3, (FiniteAnimationSpec<Float>) finiteAnimationSpec3, (ky) null, nyVar, startRestartGroup, (i3 & 1008) | ((i3 << 3) & 57344), 4);
            nyVar2 = nyVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpec3;
        } else {
            nyVar2 = nyVar;
            startRestartGroup.skipToGroupEnd();
            finiteAnimationSpec2 = finiteAnimationSpec;
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CrossfadeKt$Crossfade$2(obj, modifier2, finiteAnimationSpec2, nyVar2, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void Crossfade(T t, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, String str, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        FiniteAnimationSpec<Float> finiteAnimationSpec2;
        int i5;
        Modifier modifier3;
        FiniteAnimationSpec<Float> finiteAnimationSpec3;
        String str2;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(t) : startRestartGroup.changedInstance(t) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                finiteAnimationSpec2 = finiteAnimationSpec;
                i3 |= startRestartGroup.changedInstance(finiteAnimationSpec2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(str) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.Clip : 8192;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        if (i7 != 0) {
                            modifier4 = Modifier.Companion;
                            i6 = i5;
                        } else {
                            i6 = i5;
                            modifier4 = modifier2;
                        }
                        FiniteAnimationSpec<Float> tween$default = i4 != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : finiteAnimationSpec2;
                        String str3 = i6 != 0 ? "Crossfade" : str;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-513216493, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, startRestartGroup, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier4, tween$default, (ky) null, nyVar, startRestartGroup, i3 & 58352, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str2 = str3;
                        modifier3 = modifier4;
                        finiteAnimationSpec3 = tween$default;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        finiteAnimationSpec3 = finiteAnimationSpec2;
                        str2 = str;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new CrossfadeKt$Crossfade$1(t, modifier3, finiteAnimationSpec3, str2, nyVar, i, i2));
                        return;
                    }
                    return;
                }
                if ((i & 24576) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        finiteAnimationSpec2 = finiteAnimationSpec;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
