package defpackage;

import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class aa extends us0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa(MutableState mutableState, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.e = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new aa(this.e, hmVar, 0);
            default:
                return new aa(this.e, hmVar, 1);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
            case 0:
                ((aa) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((aa) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.e;
        switch (i) {
            case 0:
                p10.Q(obj);
                ni0 ni0Var = kb.a;
                mutableState.setValue(ut.d);
                break;
            default:
                p10.Q(obj);
                mutableState.setValue(Boolean.TRUE);
                break;
        }
        return w01Var;
    }
}
