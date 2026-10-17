package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import defpackage.fi0;
import defpackage.gi0;
import defpackage.ky;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        int i = this.d;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = Animatable$runAnimation$2.invokeSuspend$lambda$0((Animatable) obj5, (AnimationState) obj4, (ky) obj3, (fi0) obj2, (AnimationScope) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = InfiniteTransition$run$1$1.invokeSuspend$lambda$0((MutableState) obj5, (InfiniteTransition) obj4, (gi0) obj3, (un) obj2, ((Long) obj).longValue());
                return invokeSuspend$lambda$02;
        }
    }
}
