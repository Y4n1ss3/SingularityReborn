package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class hd0 {
    private final CopyOnWriteArrayList<eg> cancellables = new CopyOnWriteArrayList<>();
    private iy enabledChangedCallback;
    private boolean isEnabled;

    public hd0(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(eg egVar) {
        egVar.getClass();
        this.cancellables.add(egVar);
    }

    public final iy getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((eg) it.next()).cancel();
        }
    }

    public final void removeCancellable(eg egVar) {
        egVar.getClass();
        this.cancellables.remove(egVar);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        iy iyVar = this.enabledChangedCallback;
        if (iyVar != null) {
            iyVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(iy iyVar) {
        this.enabledChangedCallback = iyVar;
    }

    public void handleOnBackCancelled() {
    }

    public void handleOnBackProgressed(gc gcVar) {
    }

    public void handleOnBackStarted(gc gcVar) {
    }
}
