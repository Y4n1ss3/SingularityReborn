package androidx.compose.ui.draw;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1 extends f30 implements iy {
    final /* synthetic */ CacheDrawScope $this_apply;
    final /* synthetic */ CacheDrawModifierNodeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl, CacheDrawScope cacheDrawScope) {
        super(0);
        this.this$0 = cacheDrawModifierNodeImpl;
        this.$this_apply = cacheDrawScope;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4291invoke() {
        this.this$0.getBlock().invoke(this.$this_apply);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m4291invoke();
        return w01.a;
    }
}
