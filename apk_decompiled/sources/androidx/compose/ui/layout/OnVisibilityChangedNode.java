package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.UnplacedAwareModifierNode;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import defpackage.ky;
import defpackage.p01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnVisibilityChangedNode extends Modifier.Node implements ObserverModifierNode, UnplacedAwareModifierNode {
    public static final int $stable = 8;
    private ky callback;
    private DelegatableNode.RegistrationHandle handle;
    private z10 job;
    private RelativeLayoutBounds lastBounds;
    private boolean lastReportedResult;
    private boolean lastResult;
    private RelativeLayoutBounds lastViewport;
    private long minDurationMs;
    private float minFractionVisible;
    private final ky rectChanged = new OnVisibilityChangedNode$rectChanged$1(this);
    private LayoutBoundsHolder viewportBounds;

    public OnVisibilityChangedNode(long j, float f, LayoutBoundsHolder layoutBoundsHolder, ky kyVar) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = kyVar;
        this.viewportBounds = layoutBoundsHolder;
    }

    public final void checkVisibility(float f, RelativeLayoutBounds relativeLayoutBounds, RelativeLayoutBounds relativeLayoutBounds2) {
        this.lastBounds = relativeLayoutBounds;
        if (relativeLayoutBounds2 != null || this.viewportBounds == null) {
            float fractionVisibleIn = relativeLayoutBounds2 != null ? relativeLayoutBounds.fractionVisibleIn(relativeLayoutBounds2) : relativeLayoutBounds.fractionVisibleInWindow();
            boolean z = fractionVisibleIn > f || fractionVisibleIn == 1.0f;
            if (z != this.lastResult) {
                this.lastResult = z;
                z10 z10Var = this.job;
                if (z10Var != null) {
                    z10Var.cancel(null);
                }
                this.job = null;
                if (z != this.lastReportedResult) {
                    if (!z || this.minDurationMs <= 0) {
                        triggerCallback();
                    } else {
                        this.job = p01.t(getCoroutineScope(), null, null, new OnVisibilityChangedNode$checkVisibility$1(this, null), 3);
                    }
                }
            }
        }
    }

    public final void fireExitIfNeeded() {
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.job = null;
        this.lastResult = false;
        if (this.lastReportedResult) {
            triggerCallback();
        }
    }

    public final void forceUpdate() {
        RelativeLayoutBounds relativeLayoutBounds = this.lastBounds;
        if (relativeLayoutBounds != null) {
            checkVisibility(this.minFractionVisible, relativeLayoutBounds, this.lastViewport);
        }
    }

    public final ky getCallback() {
        return this.callback;
    }

    public final DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final z10 getJob() {
        return this.job;
    }

    public final RelativeLayoutBounds getLastBounds() {
        return this.lastBounds;
    }

    public final boolean getLastReportedResult() {
        return this.lastReportedResult;
    }

    public final boolean getLastResult() {
        return this.lastResult;
    }

    public final RelativeLayoutBounds getLastViewport() {
        return this.lastViewport;
    }

    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final ky getRectChanged() {
        return this.rectChanged;
    }

    public final LayoutBoundsHolder getViewportBounds() {
        return this.viewportBounds;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        fireExitIfNeeded();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        fireExitIfNeeded();
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        this.lastViewport = null;
    }

    @Override // androidx.compose.ui.node.UnplacedAwareModifierNode
    public void onUnplaced() {
        fireExitIfNeeded();
    }

    public final void setCallback(ky kyVar) {
        this.callback = kyVar;
    }

    public final void setHandle(DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final void setJob(z10 z10Var) {
        this.job = z10Var;
    }

    public final void setLastBounds(RelativeLayoutBounds relativeLayoutBounds) {
        this.lastBounds = relativeLayoutBounds;
    }

    public final void setLastReportedResult(boolean z) {
        this.lastReportedResult = z;
    }

    public final void setLastResult(boolean z) {
        this.lastResult = z;
    }

    public final void setLastViewport(RelativeLayoutBounds relativeLayoutBounds) {
        this.lastViewport = relativeLayoutBounds;
    }

    public final void setMinDurationMs(long j) {
        this.minDurationMs = j;
    }

    public final void setMinFractionVisible(float f) {
        this.minFractionVisible = f;
    }

    public final void setViewportBounds(LayoutBoundsHolder layoutBoundsHolder) {
        this.viewportBounds = layoutBoundsHolder;
        updateViewport();
    }

    public final void triggerCallback() {
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.job = null;
        this.callback.invoke(Boolean.valueOf(this.lastResult));
        this.lastReportedResult = this.lastResult;
    }

    public final void updateViewport() {
        if (this.viewportBounds != null) {
            ObserverModifierNodeKt.observeReads(this, new OnVisibilityChangedNode$updateViewport$1(this));
        } else if (this.lastViewport != null) {
            this.lastViewport = null;
            forceUpdate();
        }
    }
}
