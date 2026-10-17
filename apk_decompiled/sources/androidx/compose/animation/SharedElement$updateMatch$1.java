package androidx.compose.animation;

import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedElement$updateMatch$1 extends f30 implements ky {
    final /* synthetic */ SharedElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedElement$updateMatch$1(SharedElement sharedElement) {
        super(1);
        this.this$0 = sharedElement;
    }

    @Override // defpackage.ky
    public final Boolean invoke(SharedElementEntry sharedElementEntry) {
        return Boolean.valueOf((this.this$0.getAllEntries().contains(sharedElementEntry) && sharedElementEntry.isEnabled()) ? false : true);
    }
}
