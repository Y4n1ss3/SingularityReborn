package androidx.compose.animation;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedElement$observingVisibilityChange$1 extends f30 implements iy {
    final /* synthetic */ SharedElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedElement$observingVisibilityChange$1(SharedElement sharedElement) {
        super(0);
        this.this$0 = sharedElement;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m85invoke() {
        List<SharedElementEntry> allEntries = this.this$0.getAllEntries();
        int size = allEntries.size();
        for (int i = 0; i < size; i++) {
            SharedElementEntry sharedElementEntry = allEntries.get(i);
            if (sharedElementEntry.getTarget() && sharedElementEntry.isEnabled()) {
                return;
            }
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m85invoke();
        return w01.a;
    }
}
