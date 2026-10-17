package androidx.compose.runtime;

import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class LinkRememberObserverHolder implements RememberObserverHolder {
    public static final int $stable = 8;
    private LinkAnchor after;
    private RememberObserver wrapped;

    public LinkRememberObserverHolder(RememberObserver rememberObserver, LinkAnchor linkAnchor) {
        this.wrapped = rememberObserver;
        this.after = linkAnchor;
    }

    public final LinkAnchor getAfter() {
        return this.after;
    }

    @Override // androidx.compose.runtime.RememberObserverHolder
    public RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setAfter(LinkAnchor linkAnchor) {
        this.after = linkAnchor;
    }

    @Override // androidx.compose.runtime.RememberObserverHolder
    public void setWrapped(RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
