package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.fb0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.oy;
import defpackage.q10;
import defpackage.ql0;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    private static final long UnspecifiedSize = IntSize.m7777constructorimpl(-9223372034707292160L);

    /* JADX WARN: Removed duplicated region for block: B:138:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(Transition<S> transition, Modifier modifier, ky kyVar, Alignment alignment, ky kyVar2, oy oyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        ky kyVar3;
        int i4;
        Alignment alignment2;
        int i5;
        ky kyVar4;
        oy oyVar2;
        Modifier modifier3;
        ky kyVar5;
        ScopeUpdateScope endRestartGroup;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        SnapshotStateList snapshotStateList;
        int i6;
        Transition<S> transition2 = transition;
        Composer startRestartGroup = composer.startRestartGroup(511725103);
        int i7 = (i & 6) == 0 ? (startRestartGroup.changed(transition2) ? 4 : 2) | i : i;
        int i8 = i2 & 1;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 2;
            if (i3 == 0) {
                i7 |= 384;
            } else if ((i & 384) == 0) {
                kyVar3 = kyVar;
                i7 |= startRestartGroup.changedInstance(kyVar3) ? Fields.RotationX : Fields.SpotShadowColor;
                i4 = i2 & 4;
                if (i4 != 0) {
                    i7 |= 3072;
                } else if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i7 |= startRestartGroup.changed(alignment2) ? Fields.CameraDistance : Fields.RotationZ;
                    i5 = i2 & 8;
                    if (i5 == 0) {
                        i7 |= 24576;
                    } else if ((i & 24576) == 0) {
                        kyVar4 = kyVar2;
                        i7 |= startRestartGroup.changedInstance(kyVar4) ? Fields.Clip : 8192;
                        if ((196608 & i) == 0) {
                            oyVar2 = oyVar;
                            i7 |= startRestartGroup.changedInstance(oyVar2) ? Fields.RenderEffect : 65536;
                        } else {
                            oyVar2 = oyVar;
                        }
                        if (startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
                            Modifier modifier4 = i8 != 0 ? Modifier.Companion : modifier2;
                            if (i3 != 0) {
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = AnimatedContentKt$AnimatedContent$4$1.INSTANCE;
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                kyVar5 = (ky) rememberedValue;
                            } else {
                                kyVar5 = kyVar3;
                            }
                            if (i4 != 0) {
                                alignment2 = Alignment.Companion.getTopStart();
                            }
                            if (i5 != 0) {
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = AnimatedContentKt$AnimatedContent$5$1.INSTANCE;
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                kyVar4 = (ky) rememberedValue2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(511725103, i7, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            int i9 = i7 & 14;
                            boolean z = i9 == 4;
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = new AnimatedContentTransitionScopeImpl(transition2, alignment2, layoutDirection);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) rememberedValue3;
                            boolean z2 = i9 == 4;
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (z2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                rememberedValue4 = SnapshotStateKt.mutableStateListOf(transition2.getCurrentState());
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue4;
                            boolean z3 = i9 == 4;
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue5 == Composer.Companion.getEmpty()) {
                                long[] jArr = ql0.a;
                                rememberedValue5 = new fb0();
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            fb0 fb0Var = (fb0) rememberedValue5;
                            if (!snapshotStateList2.contains(transition2.getCurrentState())) {
                                snapshotStateList2.clear();
                                snapshotStateList2.add(transition2.getCurrentState());
                            }
                            if (q10.b(transition2.getCurrentState(), transition2.getTargetState())) {
                                if (snapshotStateList2.size() != 1 || !q10.b(snapshotStateList2.get(0), transition2.getCurrentState())) {
                                    snapshotStateList2.clear();
                                    snapshotStateList2.add(transition2.getCurrentState());
                                }
                                if (fb0Var.e != 1 || fb0Var.b(transition2.getCurrentState())) {
                                    fb0Var.f();
                                }
                                animatedContentTransitionScopeImpl2.setContentAlignment(alignment2);
                                animatedContentTransitionScopeImpl2.setLayoutDirection$animation(layoutDirection);
                            }
                            if (!q10.b(transition2.getCurrentState(), transition2.getTargetState()) && !snapshotStateList2.contains(transition2.getTargetState())) {
                                Iterator<T> it = snapshotStateList2.iterator();
                                int i10 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i10 = -1;
                                        break;
                                    } else if (q10.b(kyVar4.invoke(it.next()), kyVar4.invoke(transition2.getTargetState()))) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                                if (i10 == -1) {
                                    snapshotStateList2.add(transition2.getTargetState());
                                } else {
                                    snapshotStateList2.set(i10, transition2.getTargetState());
                                }
                            }
                            if (fb0Var.b(transition2.getTargetState()) && fb0Var.b(transition2.getCurrentState())) {
                                startRestartGroup.startReplaceGroup(1925931827);
                                startRestartGroup.endReplaceGroup();
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl2;
                                snapshotStateList = snapshotStateList2;
                                i6 = 0;
                            } else {
                                startRestartGroup.startReplaceGroup(1966410449);
                                fb0Var.f();
                                int size = snapshotStateList2.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    int i12 = i11;
                                    Object obj = snapshotStateList2.get(i12);
                                    SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                    fb0Var.l(obj, ComposableLambdaKt.rememberComposableLambda(-23915175, true, new AnimatedContentKt$AnimatedContent$6$1(transition2, obj, kyVar5, animatedContentTransitionScopeImpl3, snapshotStateList3, oyVar2), startRestartGroup, 54));
                                    i11 = i12 + 1;
                                    transition2 = transition;
                                    oyVar2 = oyVar;
                                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl3;
                                    size = size;
                                    snapshotStateList2 = snapshotStateList3;
                                }
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl2;
                                snapshotStateList = snapshotStateList2;
                                i6 = 0;
                                startRestartGroup.endReplaceGroup();
                            }
                            boolean changed = startRestartGroup.changed(transition.getSegment()) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                            Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue6 == Composer.Companion.getEmpty()) {
                                rememberedValue6 = (ContentTransform) kyVar5.invoke(animatedContentTransitionScopeImpl);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            Modifier then = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation((ContentTransform) rememberedValue6, startRestartGroup, i6));
                            Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == Composer.Companion.getEmpty()) {
                                rememberedValue7 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) rememberedValue7;
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i6));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
                            Updater.m3886setimpl(m3878constructorimpl, animatedContentMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                            startRestartGroup.startReplaceGroup(-860173498);
                            int size2 = snapshotStateList.size();
                            for (int i13 = i6; i13 < size2; i13++) {
                                Object obj2 = snapshotStateList.get(i13);
                                startRestartGroup.startMovableGroup(-2026002954, kyVar4.invoke(obj2));
                                my myVar = (my) fb0Var.d(obj2);
                                if (myVar == null) {
                                    startRestartGroup.startReplaceGroup(1618454323);
                                } else {
                                    startRestartGroup.startReplaceGroup(-2026001778);
                                    myVar.invoke(startRestartGroup, Integer.valueOf(i6));
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.endMovableGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            kyVar5 = kyVar3;
                        }
                        Alignment alignment3 = alignment2;
                        ky kyVar6 = kyVar4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new AnimatedContentKt$AnimatedContent$9(transition, modifier3, kyVar5, alignment3, kyVar6, oyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    kyVar4 = kyVar2;
                    if ((196608 & i) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
                    }
                    Alignment alignment32 = alignment2;
                    ky kyVar62 = kyVar4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i5 = i2 & 8;
                if (i5 == 0) {
                }
                kyVar4 = kyVar2;
                if ((196608 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
                }
                Alignment alignment322 = alignment2;
                ky kyVar622 = kyVar4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            kyVar3 = kyVar;
            i4 = i2 & 4;
            if (i4 != 0) {
            }
            alignment2 = alignment;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            kyVar4 = kyVar2;
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
            }
            Alignment alignment3222 = alignment2;
            ky kyVar6222 = kyVar4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 2;
        if (i3 == 0) {
        }
        kyVar3 = kyVar;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        alignment2 = alignment;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        kyVar4 = kyVar2;
        if ((196608 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
        }
        Alignment alignment32222 = alignment2;
        ky kyVar62222 = kyVar4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final SizeTransform SizeTransform(boolean z, my myVar) {
        return new SizeTransformImpl(z, myVar);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, my myVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            myVar = AnimatedContentKt$SizeTransform$1.INSTANCE;
        }
        return SizeTransform(z, myVar);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @er
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(S s, Modifier modifier, ky kyVar, Alignment alignment, String str, ky kyVar2, oy oyVar, Composer composer, int i, int i2) {
        int i3;
        int i4;
        ky kyVar3;
        int i5;
        Alignment alignment2;
        int i6;
        int i7;
        ky kyVar4;
        oy oyVar2;
        Modifier modifier2;
        String str2;
        ky kyVar5;
        Alignment alignment3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Modifier modifier3;
        ky kyVar6;
        int i9;
        Alignment alignment4;
        Composer startRestartGroup = composer.startRestartGroup(1501828832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(s) : startRestartGroup.changedInstance(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                kyVar3 = kyVar;
                i3 |= startRestartGroup.changedInstance(kyVar3) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(str) ? Fields.Clip : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            kyVar4 = kyVar2;
                            i3 |= startRestartGroup.changedInstance(kyVar4) ? Fields.RenderEffect : 65536;
                            if ((1572864 & i) != 0) {
                                oyVar2 = oyVar;
                                i3 |= startRestartGroup.changedInstance(oyVar2) ? 1048576 : Fields.BlendMode;
                            } else {
                                oyVar2 = oyVar;
                            }
                            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                if (i10 != 0) {
                                    modifier3 = Modifier.Companion;
                                    i8 = i6;
                                } else {
                                    i8 = i6;
                                    modifier3 = modifier;
                                }
                                if (i4 != 0) {
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = AnimatedContentKt$AnimatedContent$1$1.INSTANCE;
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    kyVar6 = (ky) rememberedValue;
                                } else {
                                    kyVar6 = kyVar3;
                                }
                                if (i5 != 0) {
                                    alignment4 = Alignment.Companion.getTopStart();
                                    i9 = i7;
                                } else {
                                    i9 = i7;
                                    alignment4 = alignment2;
                                }
                                String str3 = i8 != 0 ? "AnimatedContent" : str;
                                if (i9 != 0) {
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = AnimatedContentKt$AnimatedContent$2$1.INSTANCE;
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    kyVar4 = (ky) rememberedValue2;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                                int i11 = i3 & 8176;
                                int i12 = i3 >> 3;
                                AnimatedContent(updateTransition, modifier3, kyVar6, alignment4, kyVar4, oyVar2, startRestartGroup, i11 | (57344 & i12) | (i12 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str2 = str3;
                                modifier2 = modifier3;
                                kyVar5 = kyVar6;
                                alignment3 = alignment4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                str2 = str;
                                kyVar5 = kyVar3;
                                alignment3 = alignment2;
                            }
                            ky kyVar7 = kyVar4;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new AnimatedContentKt$AnimatedContent$3(s, modifier2, kyVar5, alignment3, str2, kyVar7, oyVar, i, i2));
                                return;
                            }
                            return;
                        }
                        kyVar4 = kyVar2;
                        if ((1572864 & i) != 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        ky kyVar72 = kyVar4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    kyVar4 = kyVar2;
                    if ((1572864 & i) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    ky kyVar722 = kyVar4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                kyVar4 = kyVar2;
                if ((1572864 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                ky kyVar7222 = kyVar4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            kyVar3 = kyVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            kyVar4 = kyVar2;
            if ((1572864 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            ky kyVar72222 = kyVar4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        kyVar3 = kyVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        kyVar4 = kyVar2;
        if ((1572864 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        ky kyVar722222 = kyVar4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
