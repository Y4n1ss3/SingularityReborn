package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import defpackage.iy;
import defpackage.ky;
import defpackage.p01;
import defpackage.q10;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class OnFirstVisibleNode extends Modifier.Node implements ObserverModifierNode {
    private iy callback;
    private DelegatableNode.RegistrationHandle handle;
    private z10 job;
    private RelativeLayoutBounds lastBounds;
    private boolean lastResult;
    private RelativeLayoutBounds lastViewport;
    private long minDurationMs;
    private float minFractionVisible;
    private final ky rectChanged = new OnFirstVisibleNode$rectChanged$1(this);
    private LayoutBoundsHolder viewportBounds;

    public OnFirstVisibleNode(long j, float f, LayoutBoundsHolder layoutBoundsHolder, iy iyVar) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = iyVar;
        this.viewportBounds = layoutBoundsHolder;
    }

    public final void cancelTimer() {
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
    }

    public final void checkVisibility(float f, RelativeLayoutBounds relativeLayoutBounds, RelativeLayoutBounds relativeLayoutBounds2) {
        this.lastBounds = relativeLayoutBounds;
        if (relativeLayoutBounds2 != null || this.viewportBounds == null) {
            float fractionVisibleIn = relativeLayoutBounds2 != null ? relativeLayoutBounds.fractionVisibleIn(relativeLayoutBounds2) : relativeLayoutBounds.fractionVisibleInWindow();
            boolean z = fractionVisibleIn > f || fractionVisibleIn == 1.0f;
            if (z && !this.lastResult) {
                startTimer();
            } else if (!z && this.lastResult) {
                cancelTimer();
            }
            this.lastResult = z;
        }
    }

    public final void forceUpdate() {
        RelativeLayoutBounds relativeLayoutBounds = this.lastBounds;
        if (relativeLayoutBounds != null) {
            checkVisibility(this.minFractionVisible, relativeLayoutBounds, this.lastViewport);
        }
    }

    public final iy getCallback() {
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
        updateViewport();
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        setLastViewport(null);
    }

    public final void setCallback(iy iyVar) {
        this.callback = iyVar;
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

    public final void setLastResult(boolean z) {
        this.lastResult = z;
    }

    public final void setLastViewport(RelativeLayoutBounds relativeLayoutBounds) {
        if (q10.b(this.lastViewport, relativeLayoutBounds)) {
            return;
        }
        this.lastViewport = relativeLayoutBounds;
        forceUpdate();
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

    public final void startTimer() {
        long j = this.minDurationMs;
        if (j == 0) {
            triggerCallback();
            return;
        }
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.job = p01.t(getCoroutineScope(), null, null, new OnFirstVisibleNode$startTimer$1(j, this, null), 3);
    }

    public final void triggerCallback() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.callback.invoke();
    }

    public final void updateViewport() {
        if (this.viewportBounds == null) {
            setLastViewport(null);
        } else {
            ObserverModifierNodeKt.observeReads(this, new OnFirstVisibleNode$updateViewport$1(this));
        }
    }
}
