package defpackage;

import androidx.compose.animation.core.AnimationKt;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class lz extends us0 implements my {
    public int d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz(long j, hm hmVar) {
        super(2, hmVar);
        this.e = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new lz(this.e, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((lz) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i == 0) {
            p10.Q(obj);
            pz pzVar = pz.a;
            this.d = 1;
            obj = pz.e(this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        List list = (List) obj;
        boolean isEmpty = list.isEmpty();
        long j = this.e;
        if (isEmpty) {
            return Boolean.valueOf(j > 0);
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() * AnimationKt.MillisToNanos == j) {
                    break;
                }
            }
        }
        r1 = false;
        return Boolean.valueOf(r1);
    }
}
