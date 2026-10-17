package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentTransform {
    public static final int $stable = 8;
    private final ExitTransition initialContentExit;
    private SizeTransform sizeTransform;
    private final EnterTransition targetContentEnter;
    private final MutableFloatState targetContentZIndex$delegate;

    public /* synthetic */ ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f, SizeTransform sizeTransform, int i, dq dqVar) {
        this(enterTransition, exitTransition, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? AnimatedContentKt.SizeTransform$default(false, null, 3, null) : sizeTransform);
    }

    public final ExitTransition getInitialContentExit() {
        return this.initialContentExit;
    }

    public final SizeTransform getSizeTransform() {
        return this.sizeTransform;
    }

    public final EnterTransition getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float getTargetContentZIndex() {
        return this.targetContentZIndex$delegate.getFloatValue();
    }

    public final void setSizeTransform$animation(SizeTransform sizeTransform) {
        this.sizeTransform = sizeTransform;
    }

    public final void setTargetContentZIndex(float f) {
        this.targetContentZIndex$delegate.setFloatValue(f);
    }

    public ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f, SizeTransform sizeTransform) {
        this.targetContentEnter = enterTransition;
        this.initialContentExit = exitTransition;
        this.targetContentZIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.sizeTransform = sizeTransform;
    }
}
