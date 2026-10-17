package androidx.compose.animation;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import defpackage.dq;
import defpackage.o;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionStateMachine {
    public static final int $stable = 8;
    private int lastHandledRequestId;
    private int lastHandledTargetProviderUpdateRequestId;
    private final SharedElement sharedElement;
    private BoundsProvider targetBoundsProvider;
    private final MutableState state$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(NoMatchFound.INSTANCE, null, 2, null);
    private final MutableIntState requestId$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private StateChangeRequest requestToBeHandled = StateChangeRequest.NoRequest;
    private final MutableIntState targetBoundsProviderUpdateRequestId$delegate = SnapshotIntStateKt.mutableIntStateOf(0);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateChangeRequest.values().length];
            try {
                iArr[StateChangeRequest.NoMatchFound.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateChangeRequest.NoRequest.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateChangeRequest.MatchFound.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StateChangeRequest.VisibleContentAbsentDuringTransition.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SharedTransitionStateMachine(SharedElement sharedElement) {
        this.sharedElement = sharedElement;
    }

    private final List<SharedElementEntry> getAllEntries() {
        return this.sharedElement.getAllEntries();
    }

    private final List<SharedElementEntry> getEnabledEntries() {
        return this.sharedElement.getEnabledEntries();
    }

    private final int getRequestId() {
        return this.requestId$delegate.getIntValue();
    }

    private final int getTargetBoundsProviderUpdateRequestId() {
        return this.targetBoundsProviderUpdateRequestId$delegate.getIntValue();
    }

    private final void setRequestId(int i) {
        this.requestId$delegate.setIntValue(i);
    }

    private final void setState(State state) {
        this.state$delegate.setValue(state);
    }

    private final void setTargetBoundsProviderUpdateRequestId(int i) {
        this.targetBoundsProviderUpdateRequestId$delegate.setIntValue(i);
    }

    public final void checkForAndDeferStateUpdates(boolean z) {
        if (getEnabledEntries().size() > 1 && z) {
            deferRequest(StateChangeRequest.MatchFound);
        } else if (!this.sharedElement.getScope().isTransitionActive()) {
            resetState();
        } else if (!z) {
            deferRequest(StateChangeRequest.VisibleContentAbsentDuringTransition);
        }
        invalidateTargetBoundsProvider();
    }

    /* renamed from: configureActiveMatch-L7TYDSY, reason: not valid java name */
    public final void m95configureActiveMatchL7TYDSY(long j, long j2, long j3) {
        State state = getState();
        SharedElement sharedElement = this.sharedElement;
        BoundsProvider boundsProvider = this.targetBoundsProvider;
        boundsProvider.getClass();
        setState(state.mo0configureActiveMatch38uP1EE(sharedElement, boundsProvider, j, j2, j3));
    }

    public final void deferRequest(StateChangeRequest stateChangeRequest) {
        this.requestToBeHandled = stateChangeRequest;
        setRequestId(this.lastHandledRequestId + 1);
    }

    public final boolean getActiveMatchDeferred() {
        return this.requestToBeHandled == StateChangeRequest.MatchFound;
    }

    public final SharedElement getSharedElement() {
        return this.sharedElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final State getState() {
        return (State) this.state$delegate.getValue();
    }

    public final void invalidateTargetBoundsProvider() {
        SharedElementEntry sharedElementEntry;
        List<SharedElementEntry> enabledEntries = getEnabledEntries();
        int size = enabledEntries.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                sharedElementEntry = null;
                break;
            }
            sharedElementEntry = enabledEntries.get(i);
            if (sharedElementEntry.getTarget()) {
                break;
            } else {
                i++;
            }
        }
        SharedElementEntry sharedElementEntry2 = sharedElementEntry;
        if (sharedElementEntry2 == null && this.targetBoundsProvider == null) {
            return;
        }
        if (q10.b(sharedElementEntry2 != null ? sharedElementEntry2.getBoundsProvider() : null, this.targetBoundsProvider)) {
            return;
        }
        setTargetBoundsProviderUpdateRequestId(this.lastHandledTargetProviderUpdateRequestId + 1);
    }

    public final void processPendingRequest() {
        State state;
        if (getRequestId() != this.lastHandledRequestId) {
            this.lastHandledRequestId = getRequestId();
            int i = WhenMappings.$EnumSwitchMapping$0[this.requestToBeHandled.ordinal()];
            if (i == 1) {
                state = NoMatchFound.INSTANCE;
            } else if (i == 2) {
                state = getState();
            } else if (i == 3) {
                state = getState().onMatchFound(this.targetBoundsProvider);
            } else {
                if (i != 4) {
                    o.n();
                    return;
                }
                List<SharedElementEntry> enabledEntries = getEnabledEntries();
                int size = enabledEntries.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        state = getState().onVisibleContentRemovedDuringTransition();
                        break;
                    } else {
                        if (q10.b(enabledEntries.get(i2).getBoundsProvider(), this.targetBoundsProvider)) {
                            state = NoMatchFound.INSTANCE;
                            break;
                        }
                        i2++;
                    }
                }
            }
            setState(state);
            this.requestToBeHandled = StateChangeRequest.NoRequest;
        }
        updateTargetBoundsProvider$animation();
    }

    public final void resetState() {
        this.requestToBeHandled = StateChangeRequest.NoRequest;
        this.lastHandledRequestId = getRequestId();
        setState(NoMatchFound.INSTANCE);
    }

    public final Rect tryInitializingCurrentBounds() {
        processPendingRequest();
        return getState().initializeCurrentBounds(this.sharedElement);
    }

    public final void updateTargetBoundsProvider$animation() {
        SharedElementEntry sharedElementEntry;
        SharedElementEntry sharedElementEntry2;
        if (getTargetBoundsProviderUpdateRequestId() != this.lastHandledTargetProviderUpdateRequestId) {
            int i = 0;
            BoundsProvider boundsProvider = null;
            if (this.sharedElement.getScope().isTransitionActive()) {
                List<SharedElementEntry> enabledEntries = getEnabledEntries();
                int size = enabledEntries.size();
                while (true) {
                    if (i >= size) {
                        sharedElementEntry2 = null;
                        break;
                    }
                    sharedElementEntry2 = enabledEntries.get(i);
                    if (sharedElementEntry2.getTarget()) {
                        break;
                    } else {
                        i++;
                    }
                }
                SharedElementEntry sharedElementEntry3 = sharedElementEntry2;
                if (sharedElementEntry3 != null) {
                    boundsProvider = sharedElementEntry3.getBoundsProvider();
                }
            } else {
                List<SharedElementEntry> allEntries = getAllEntries();
                int size2 = allEntries.size();
                while (true) {
                    if (i >= size2) {
                        sharedElementEntry = null;
                        break;
                    }
                    sharedElementEntry = allEntries.get(i);
                    if (sharedElementEntry.getTarget()) {
                        break;
                    } else {
                        i++;
                    }
                }
                SharedElementEntry sharedElementEntry4 = sharedElementEntry;
                if (sharedElementEntry4 != null) {
                    boundsProvider = sharedElementEntry4.getBoundsProvider();
                }
            }
            if (!q10.b(boundsProvider, this.targetBoundsProvider)) {
                this.targetBoundsProvider = boundsProvider;
            }
            this.lastHandledTargetProviderUpdateRequestId = getTargetBoundsProviderUpdateRequestId();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static abstract class State {
        public static final int $stable = 0;

        public /* synthetic */ State(dq dqVar) {
            this();
        }

        /* renamed from: configureActiveMatch-38uP1EE */
        public State mo0configureActiveMatch38uP1EE(SharedElement sharedElement, BoundsProvider boundsProvider, long j, long j2, long j3) {
            throw new IllegalStateException(("Active match can only be configured in ActiveMatchFoundConfigPending or ActiveMatchConfigured state. Current state: " + this).toString());
        }

        public boolean getActiveMatchFound() {
            return false;
        }

        public Rect getCurrentBounds() {
            return null;
        }

        public boolean getMatchIsOrHasBeenConfigured() {
            return false;
        }

        public TargetData getTargetData() {
            return null;
        }

        public Rect initializeCurrentBounds(SharedElement sharedElement) {
            return getCurrentBounds();
        }

        public abstract State onMatchFound(BoundsProvider boundsProvider);

        public abstract State onVisibleContentRemovedDuringTransition();

        private State() {
        }

        public void updateBounds(Rect rect) {
        }
    }
}
