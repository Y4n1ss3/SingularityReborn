package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.a10;
import defpackage.er;
import defpackage.g30;
import defpackage.g40;
import defpackage.iy;
import defpackage.jw0;
import defpackage.ky;
import defpackage.lk;
import defpackage.my;
import defpackage.ny;
import defpackage.qu0;
import defpackage.sn0;
import defpackage.te0;
import defpackage.w01;
import defpackage.y80;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final float NoReset = -1.0f;
    private static final float ResetAnimationSnap = -3.0f;
    private static final float ResetAnimationSnapCurrent = -4.0f;
    private static final float ResetAnimationSnapTarget = -5.0f;
    private static final float ResetNoSnap = -2.0f;
    private static final ky SeekableTransitionStateTotalDurationChanged = new qu0(13);
    private static final g30 SeekableStateObserver$delegate = y80.B(g40.e, new sn0(18));

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotStateObserver SeekableStateObserver_delegate$lambda$0() {
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new qu0(14));
        snapshotStateObserver.start();
        return snapshotStateObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SeekableStateObserver_delegate$lambda$0$0(iy iyVar) {
        iyVar.invoke();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SeekableTransitionStateTotalDurationChanged$lambda$0(SeekableTransitionState seekableTransitionState) {
        seekableTransitionState.onTotalDurationChanged$animation_core();
        return w01.a;
    }

    private static final <S, T, V extends AnimationVector> void UpdateInitialAndTargetValues(Transition<S> transition, Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(867041821);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(transitionAnimationState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & Fields.RotationY) == 0 ? startRestartGroup.changed(t) : startRestartGroup.changedInstance(t) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & Fields.TransformOrigin) == 0 ? startRestartGroup.changed(t2) : startRestartGroup.changedInstance(t2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? startRestartGroup.changed(finiteAnimationSpec) : startRestartGroup.changedInstance(finiteAnimationSpec) ? Fields.Clip : 8192;
        }
        if (startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867041821, i2, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1907)");
            }
            if (transition.isSeeking()) {
                transitionAnimationState.updateInitialAndTargetValue$animation_core(t, t2, finiteAnimationSpec);
            } else {
                transitionAnimationState.updateTargetValue$animation_core(t2, finiteAnimationSpec);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new lk(transition, transitionAnimationState, t, t2, finiteAnimationSpec, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 UpdateInitialAndTargetValues$lambda$0(Transition transition, Transition.TransitionAnimationState transitionAnimationState, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, int i, Composer composer, int i2) {
        UpdateInitialAndTargetValues(transition, transitionAnimationState, obj, obj2, finiteAnimationSpec, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final <S> State<Dp> animateDp(Transition<S> transition, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        if ((i2 & 1) != 0) {
            nyVar = new ny() { // from class: androidx.compose.animation.core.TransitionKt$animateDp$1
                public final SpringSpec<Dp> invoke(Transition.Segment<S> segment, Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1953972046);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1953972046, i3, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1977)");
                    }
                    SpringSpec<Dp> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m7609boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i5 & 14) ^ 6) > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        int i6 = (i5 >> 9) & 112;
        Object invoke = nyVar2.invoke(currentState, composer, Integer.valueOf(i6));
        int i7 = i5 & 14;
        int i8 = i7 ^ 6;
        boolean z2 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue).getValue(), composer, Integer.valueOf(i6));
        boolean z3 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i7 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Float> animateFloat(Transition<S> transition, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        if ((i2 & 1) != 0) {
            nyVar = new ny() { // from class: androidx.compose.animation.core.TransitionKt$animateFloat$1
                public final SpringSpec<Float> invoke(Transition.Segment<S> segment, Composer composer2, int i3) {
                    composer2.startReplaceGroup(-985243360);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-985243360, i3, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1947)");
                    }
                    SpringSpec<Float> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zv.a);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i5 & 14) ^ 6) > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        int i6 = (i5 >> 9) & 112;
        Object invoke = nyVar2.invoke(currentState, composer, Integer.valueOf(i6));
        int i7 = i5 & 14;
        int i8 = i7 ^ 6;
        boolean z2 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue).getValue(), composer, Integer.valueOf(i6));
        boolean z3 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i7 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Integer> animateInt(Transition<S> transition, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        if ((i2 & 1) != 0) {
            nyVar = new ny() { // from class: androidx.compose.animation.core.TransitionKt$animateInt$1
                public final SpringSpec<Integer> invoke(Transition.Segment<S> segment, Composer composer2, int i3) {
                    composer2.startReplaceGroup(2109424115);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2109424115, i3, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2101)");
                    }
                    SpringSpec<Integer> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(a10.a);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i5 & 14) ^ 6) > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        int i6 = (i5 >> 9) & 112;
        Object invoke = nyVar2.invoke(currentState, composer, Integer.valueOf(i6));
        int i7 = i5 & 14;
        int i8 = i7 ^ 6;
        boolean z2 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue).getValue(), composer, Integer.valueOf(i6));
        boolean z3 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i7 | ((i5 << 6) & 458752));
    }

    public static final <S> State<IntOffset> animateIntOffset(Transition<S> transition, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        if ((i2 & 1) != 0) {
            nyVar = new ny() { // from class: androidx.compose.animation.core.TransitionKt$animateIntOffset$1
                public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer composer2, int i3) {
                    composer2.startReplaceGroup(-428458074);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-428458074, i3, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2070)");
                    }
                    SpringSpec<IntOffset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m7730boximpl(IntOffset.m7733constructorimpl(InlineClassHelperKt.Uint64Low32)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i5 & 14) ^ 6) > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        int i6 = (i5 >> 9) & 112;
        Object invoke = nyVar2.invoke(currentState, composer, Integer.valueOf(i6));
        int i7 = i5 & 14;
        int i8 = i7 ^ 6;
        boolean z2 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue).getValue(), composer, Integer.valueOf(i6));
        boolean z3 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i7 | ((i5 << 6) & 458752));
    }

    public static final <S> State<IntSize> animateIntSize(Transition<S> transition, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        if ((i2 & 1) != 0) {
            nyVar = new ny() { // from class: androidx.compose.animation.core.TransitionKt$animateIntSize$1
                public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer composer2, int i3) {
                    composer2.startReplaceGroup(811932052);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(811932052, i3, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2132)");
                    }
                    SpringSpec<IntSize> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m7774boximpl(IntSize.m7777constructorimpl(InlineClassHelperKt.Uint64Low32)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i5 & 14) ^ 6) > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        int i6 = (i5 >> 9) & 112;
        Object invoke = nyVar2.invoke(currentState, composer, Integer.valueOf(i6));
        int i7 = i5 & 14;
        int i8 = i7 ^ 6;
        boolean z2 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue).getValue(), composer, Integer.valueOf(i6));
        boolean z3 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i7 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Offset> animateOffset(Transition<S> transition, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        if ((i2 & 1) != 0) {
            nyVar = new ny() { // from class: androidx.compose.animation.core.TransitionKt$animateOffset$1
                public final SpringSpec<Offset> invoke(Transition.Segment<S> segment, Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1662821959);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1662821959, i3, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:2007)");
                    }
                    SpringSpec<Offset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m4505boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i5 & 14) ^ 6) > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        int i6 = (i5 >> 9) & 112;
        Object invoke = nyVar2.invoke(currentState, composer, Integer.valueOf(i6));
        int i7 = i5 & 14;
        int i8 = i7 ^ 6;
        boolean z2 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue).getValue(), composer, Integer.valueOf(i6));
        boolean z3 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i7 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Rect> animateRect(Transition<S> transition, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        if ((i2 & 1) != 0) {
            nyVar = new ny() { // from class: androidx.compose.animation.core.TransitionKt$animateRect$1
                public final SpringSpec<Rect> invoke(Transition.Segment<S> segment, Composer composer2, int i3) {
                    composer2.startReplaceGroup(946173386);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(946173386, i3, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2162)");
                    }
                    SpringSpec<Rect> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i5 & 14) ^ 6) > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        int i6 = (i5 >> 9) & 112;
        Object invoke = nyVar2.invoke(currentState, composer, Integer.valueOf(i6));
        int i7 = i5 & 14;
        int i8 = i7 ^ 6;
        boolean z2 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue).getValue(), composer, Integer.valueOf(i6));
        boolean z3 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i7 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Size> animateSize(Transition<S> transition, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        if ((i2 & 1) != 0) {
            nyVar = new ny() { // from class: androidx.compose.animation.core.TransitionKt$animateSize$1
                public final SpringSpec<Size> invoke(Transition.Segment<S> segment, Composer composer2, int i3) {
                    composer2.startReplaceGroup(493329511);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(493329511, i3, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2037)");
                    }
                    SpringSpec<Size> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m4573boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
        }
        if ((i2 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.Companion);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i5 & 14) ^ 6) > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        int i6 = (i5 >> 9) & 112;
        Object invoke = nyVar2.invoke(currentState, composer, Integer.valueOf(i6));
        int i7 = i5 & 14;
        int i8 = i7 ^ 6;
        boolean z2 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue).getValue(), composer, Integer.valueOf(i6));
        boolean z3 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i7 | ((i5 << 6) & 458752));
    }

    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        ny nyVar3 = (i2 & 2) != 0 ? new ny() { // from class: androidx.compose.animation.core.TransitionKt$animateValue$1
            public final SpringSpec<T> invoke(Transition.Segment<S> segment, Composer composer2, int i3) {
                composer2.startReplaceGroup(-2137771706);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2137771706, i3, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1834)");
                }
                SpringSpec<T> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return spring$default;
            }

            @Override // defpackage.ny
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        } : nyVar;
        String str2 = (i2 & 4) != 0 ? "ValueAnimation" : str;
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (((i & 14) ^ 6) > 4 && composer.changed(transition)) || (i & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        int i3 = (i >> 9) & 112;
        Object invoke = nyVar2.invoke(currentState, composer, Integer.valueOf(i3));
        int i4 = i & 14;
        int i5 = i4 ^ 6;
        boolean z2 = (i5 > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(rememberedValue);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue).getValue(), composer, Integer.valueOf(i3));
        boolean z3 = (i5 > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(rememberedValue2);
        }
        return createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar3.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf((i >> 3) & 112)), twoWayConverter, str2, composer, (57344 & (i << 9)) | i4 | (458752 & (i << 6)));
    }

    public static final <S, T> Transition<T> createChildTransition(Transition<S> transition, String str, ny nyVar, Composer composer, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i3 = i & 14;
        if (((i3 ^ 6) <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(rememberedValue);
        }
        if (transition.isSeeking()) {
            rememberedValue = transition.getCurrentState();
        }
        int i4 = (i >> 3) & 112;
        return createChildTransitionInternal(transition, nyVar.invoke(rememberedValue, composer, Integer.valueOf(i4)), nyVar.invoke(transition.getTargetState(), composer, Integer.valueOf(i4)), str2, composer, i3 | ((i << 6) & 7168));
    }

    public static final <S, T> Transition<T> createChildTransitionInternal(Transition<S> transition, T t, T t2, String str, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1780)");
        }
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition(new MutableTransitionState(t), transition, transition.getLabel() + " > " + str);
            composer.updateRememberedValue(rememberedValue);
        }
        Transition<T> transition2 = (Transition) rememberedValue;
        if ((i2 <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean changed = composer.changed(transition2) | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new te0(20, transition, transition2);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(transition2, (ky) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t, t2, transition.getLastSeekedTimeNanos$animation_core());
        } else {
            transition2.updateTarget$animation_core(t2);
            transition2.setSeeking$animation_core(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult createChildTransitionInternal$lambda$1$0(final Transition transition, final Transition transition2, DisposableEffectScope disposableEffectScope) {
        transition.addTransition$animation_core(transition2);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Transition.this.removeTransition$animation_core(transition2);
            }
        };
    }

    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1738)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) rememberedValue;
        if ((i3 <= 4 || !composer.changed(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance = composer.changedInstance(deferredAnimation) | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new te0(21, transition, deferredAnimation);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(deferredAnimation, (ky) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return deferredAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult createDeferredAnimation$lambda$1$0(final Transition transition, final Transition.DeferredAnimation deferredAnimation, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Transition.this.removeAnimation$animation_core(deferredAnimation);
            }
        };
    }

    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(Transition<S> transition, T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i) {
        Snapshot snapshot;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1869)");
        }
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                snapshot = makeCurrentNonObservable;
                try {
                    Object transitionAnimationState = transition.new TransitionAnimationState(t, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t2), twoWayConverter, str);
                    companion.restoreNonObservable(currentThreadSnapshot, snapshot, readObserver);
                    composer.updateRememberedValue(transitionAnimationState);
                    rememberedValue = transitionAnimationState;
                } catch (Throwable th) {
                    th = th;
                    companion.restoreNonObservable(currentThreadSnapshot, snapshot, readObserver);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                snapshot = makeCurrentNonObservable;
            }
        }
        Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) rememberedValue;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        UpdateInitialAndTargetValues(transition, transitionAnimationState2, t, t2, finiteAnimationSpec, composer, (i4 << 9) | (i4 << 6) | i2 | (i5 & 896) | (i5 & 7168) | (57344 & i5));
        boolean changed = composer.changed(transitionAnimationState2) | ((i3 > 4 && composer.changed(transition)) || (i & 6) == 4);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new te0(22, transition, transitionAnimationState2);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(transitionAnimationState2, (ky) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult createTransitionAnimation$lambda$1$0(final Transition transition, final Transition.TransitionAnimationState transitionAnimationState, DisposableEffectScope disposableEffectScope) {
        transition.addAnimation$animation_core(transitionAnimationState);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Transition.this.removeAnimation$animation_core(transitionAnimationState);
            }
        };
    }

    public static final SnapshotStateObserver getSeekableStateObserver() {
        return (SnapshotStateObserver) SeekableStateObserver$delegate.getValue();
    }

    public static final <T> Transition<T> rememberTransition(TransitionState<T> transitionState, String str, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:804)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        int i4 = 0;
        boolean z2 = (i3 > 4 && composer.changed(transitionState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                Object transition = new Transition((TransitionState) transitionState, str);
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                composer.updateRememberedValue(transition);
                rememberedValue = transition;
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        Transition<T> transition2 = (Transition) rememberedValue;
        if (transitionState instanceof SeekableTransitionState) {
            composer.startReplaceGroup(-1357607479);
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) transitionState;
            Object currentState = seekableTransitionState.getCurrentState();
            Object targetState = seekableTransitionState.getTargetState();
            if ((i3 <= 4 || !composer.changed(transitionState)) && (i & 6) != 4) {
                z = false;
            }
            Object rememberedValue2 = composer.rememberedValue();
            if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.LaunchedEffect(currentState, targetState, (my) rememberedValue2, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1357145920);
            transition2.animateTo$animation_core(transitionState.getTargetState(), composer, 0);
            composer.endReplaceGroup();
        }
        boolean changed = composer.changed(transition2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new jw0(transition2, i4);
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.DisposableEffect(transition2, (ky) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberTransition$lambda$2$0(final Transition transition, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Transition.this.onDisposed$animation_core();
            }
        };
    }

    public static final <T> Transition<T> updateTransition(T t, String str, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:87)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new Transition(t, str);
            composer.updateRememberedValue(rememberedValue);
        }
        Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core(t, composer, (i & 8) | 48 | (i & 14));
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new jw0(transition, 1);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(transition, (ky) rememberedValue2, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult updateTransition$lambda$1$0(final Transition transition, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Transition.this.onDisposed$animation_core();
            }
        };
    }

    @er
    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> mutableTransitionState, String str, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:863)");
        }
        Transition<T> rememberTransition = rememberTransition(mutableTransitionState, str, composer, i & 126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberTransition;
    }
}
