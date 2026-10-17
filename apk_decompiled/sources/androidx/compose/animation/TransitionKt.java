package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final <S> State<Color> animateColor(final Transition<S> transition, ny nyVar, String str, ny nyVar2, Composer composer, int i, int i2) {
        Object currentState;
        if ((i2 & 1) != 0) {
            nyVar = TransitionKt$animateColor$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        ColorSpace m4765getColorSpaceimpl = Color.m4765getColorSpaceimpl(((Color) nyVar2.invoke(transition.getTargetState(), composer, Integer.valueOf((i >> 6) & 112))).m4771unboximpl());
        boolean changed = composer.changed(m4765getColorSpaceimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
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
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new iy() { // from class: androidx.compose.animation.TransitionKt$animateColor$$inlined$animateValue$1
                /* JADX WARN: Type inference failed for: r0v2, types: [S, java.lang.Object] */
                @Override // defpackage.iy
                public final S invoke() {
                    return Transition.this.getTargetState();
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        Object invoke2 = nyVar2.invoke(((State) rememberedValue2).getValue(), composer, Integer.valueOf(i6));
        boolean z3 = (i8 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object rememberedValue3 = composer.rememberedValue();
        if (z3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new iy() { // from class: androidx.compose.animation.TransitionKt$animateColor$$inlined$animateValue$2
                @Override // defpackage.iy
                public final Transition.Segment<S> invoke() {
                    return Transition.this.getSegment();
                }
            });
            composer.updateRememberedValue(rememberedValue3);
        }
        return androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, invoke, invoke2, (FiniteAnimationSpec) nyVar.invoke(((State) rememberedValue3).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), twoWayConverter, str2, composer, i7 | ((i5 << 6) & 458752));
    }

    /* renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m118animateColorDTcfvLk(InfiniteTransition infiniteTransition, long j, long j2, InfiniteRepeatableSpec<Color> infiniteRepeatableSpec, String str, Composer composer, int i, int i2) {
        Composer composer2;
        String str2 = (i2 & 8) != 0 ? "ColorAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i, -1, "androidx.compose.animation.animateColor (Transition.kt:97)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4765getColorSpaceimpl(j2));
            composer2 = composer;
            composer2.updateRememberedValue(rememberedValue);
        } else {
            composer2 = composer;
        }
        int i3 = i << 3;
        State<Color> animateValue = InfiniteTransitionKt.animateValue(infiniteTransition, Color.m4751boximpl(j), Color.m4751boximpl(j2), (TwoWayConverter) rememberedValue, infiniteRepeatableSpec, str2, composer2, InfiniteTransition.$stable | (i & 14) | (i & 112) | (i & 896) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & i3) | (i3 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValue;
    }

    @er
    /* renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m119animateColorRIQooxk(InfiniteTransition infiniteTransition, long j, long j2, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i, -1, "androidx.compose.animation.animateColor (Transition.kt:112)");
        }
        State<Color> m118animateColorDTcfvLk = m118animateColorDTcfvLk(infiniteTransition, j, j2, infiniteRepeatableSpec, "ColorAnimation", composer, InfiniteTransition.$stable | 24576 | (i & 14) | (i & 112) | (i & 896) | (InfiniteRepeatableSpec.$stable << 9) | (i & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m118animateColorDTcfvLk;
    }
}
