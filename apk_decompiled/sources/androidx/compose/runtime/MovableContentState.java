package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MovableContentState {
    public static final int $stable = 0;
    private final SlotStorage slotStorage;

    public MovableContentState(SlotStorage slotStorage) {
        this.slotStorage = slotStorage;
    }

    public final void dispose$runtime() {
        this.slotStorage.dispose();
    }

    public final SlotStorage getSlotStorage$runtime() {
        return this.slotStorage;
    }
}
