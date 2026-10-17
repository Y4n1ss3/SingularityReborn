package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import defpackage.gi0;
import defpackage.ky;
import defpackage.w01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
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
                invokeSuspend$lambda$0 = ContentInViewNode$launchAnimation$2.AnonymousClass1.invokeSuspend$lambda$0((ContentInViewNode) obj5, (UpdatableAnimationState) obj4, (z10) obj3, (NestedScrollScope) obj2, ((Float) obj).floatValue());
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = DefaultFlingBehavior$performFling$2.invokeSuspend$lambda$0((gi0) obj5, (ScrollScope) obj4, (gi0) obj3, (DefaultFlingBehavior) obj2, (AnimationScope) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
