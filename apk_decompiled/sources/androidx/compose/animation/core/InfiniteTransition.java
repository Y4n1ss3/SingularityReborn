package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import defpackage.dq;
import defpackage.my;
import defpackage.oi;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InfiniteTransition {
    public static final int $stable = 8;
    private final String label;
    private final MutableVector<TransitionAnimationState<?, ?>> _animations = new MutableVector<>(new TransitionAnimationState[16], 0);
    private final MutableState refreshChildNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private long startTimeNanos = Long.MIN_VALUE;
    private final MutableState isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private TargetBasedAnimation<T, V> animation;
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;
        private final String label;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;

        public TransitionAnimationState(T t, T t2, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, String str) {
            this.initialValue = t;
            this.targetValue = t2;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, twoWayConverter, this.initialValue, this.targetValue, (AnimationVector) null, 16, (dq) null);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final T getInitialValue$animation_core() {
            return this.initialValue;
        }

        public final String getLabel() {
            return this.label;
        }

        public final T getTargetValue$animation_core() {
            return this.targetValue;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core() {
            return this.isFinished;
        }

        public final void onPlayTimeChanged$animation_core(long j) {
            InfiniteTransition.this.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = j;
            }
            long j2 = j - this.playTimeNanosOffset;
            setValue$animation_core(this.animation.getValueFromNanos(j2));
            this.isFinished = this.animation.isFinishedFromNanos(j2);
        }

        public final void reset$animation_core() {
            this.startOnTheNextFrame = true;
        }

        public final void setAnimation$animation_core(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation = targetBasedAnimation;
        }

        public final void setFinished$animation_core(boolean z) {
            this.isFinished = z;
        }

        public final void setInitialValue$animation_core(T t) {
            this.initialValue = t;
        }

        public final void setTargetValue$animation_core(T t) {
            this.targetValue = t;
        }

        public void setValue$animation_core(T t) {
            this.value$delegate.setValue(t);
        }

        public final void skipToEnd$animation_core() {
            setValue$animation_core(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void updateValues$animation_core(T t, T t2, AnimationSpec<T> animationSpec) {
            this.initialValue = t;
            this.targetValue = t2;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, t, t2, (AnimationVector) null, 16, (dq) null);
            InfiniteTransition.this.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    public InfiniteTransition(String str) {
        this.label = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long j) {
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = this._animations;
        TransitionAnimationState<?, ?>[] transitionAnimationStateArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            TransitionAnimationState<?, ?> transitionAnimationState = transitionAnimationStateArr[i];
            if (!transitionAnimationState.isFinished$animation_core()) {
                transitionAnimationState.onPlayTimeChanged$animation_core(j);
            }
            if (!transitionAnimationState.isFinished$animation_core()) {
                z = false;
            }
        }
        setRunning(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 run$lambda$2(InfiniteTransition infiniteTransition, int i, Composer composer, int i2) {
        infiniteTransition.run$animation_core(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z) {
        this.refreshChildNeeded$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setRunning(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final void addAnimation$animation_core(TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.add(transitionAnimationState);
        setRefreshChildNeeded(true);
    }

    public final List<TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations.asMutableList();
    }

    public final String getLabel() {
        return this.label;
    }

    public final void removeAnimation$animation_core(TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    public final void run$animation_core(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-318043801);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-318043801, i2, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (isRunning() || getRefreshChildNeeded()) {
                startRestartGroup.startReplaceGroup(-144841960);
                boolean changedInstance = startRestartGroup.changedInstance(this);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new InfiniteTransition$run$1$1(mutableState, this, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                EffectsKt.LaunchedEffect(this, (my) rememberedValue2, startRestartGroup, i2 & 14);
            } else {
                startRestartGroup.startReplaceGroup(-151918981);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new oi(this, i, 3));
        }
    }
}
