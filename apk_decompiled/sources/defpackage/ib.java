package defpackage;

import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ib extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ SnackbarHostState f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib(SnackbarHostState snackbarHostState, String str, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = snackbarHostState;
        this.g = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        String str = this.g;
        SnackbarHostState snackbarHostState = this.f;
        switch (i) {
            case 0:
                return new ib(snackbarHostState, str, hmVar, 0);
            case 1:
                return new ib(snackbarHostState, str, hmVar, 1);
            case 2:
                return new ib(snackbarHostState, str, hmVar, 2);
            case 3:
                return new ib(snackbarHostState, str, hmVar, 3);
            case 4:
                return new ib(snackbarHostState, str, hmVar, 4);
            case 5:
                return new ib(snackbarHostState, str, hmVar, 5);
            case 6:
                return new ib(snackbarHostState, str, hmVar, 6);
            default:
                return new ib(snackbarHostState, str, hmVar, 7);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((ib) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        String str = this.g;
        SnackbarHostState snackbarHostState = this.f;
        vn vnVar = vn.d;
        hm hmVar = null;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                SnackbarDuration snackbarDuration = SnackbarDuration.Indefinite;
                this.e = 1;
                Object showSnackbar$default = SnackbarHostState.showSnackbar$default(this.f, this.g, null, false, snackbarDuration, this, 6, null);
                return showSnackbar$default == vnVar ? vnVar : showSnackbar$default;
            case 1:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
                    if (currentSnackbarData != null) {
                        currentSnackbarData.dismiss();
                    }
                    ib ibVar = new ib(snackbarHostState, str, hmVar, 0);
                    this.e = 1;
                    if (d41.R(2000L, ibVar, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i3 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                SnackbarData currentSnackbarData2 = snackbarHostState.getCurrentSnackbarData();
                if (currentSnackbarData2 == null) {
                    return w01Var;
                }
                currentSnackbarData2.dismiss();
                return w01Var;
            case 2:
                int i4 = this.e;
                if (i4 != 0) {
                    if (i4 == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                SnackbarDuration snackbarDuration2 = SnackbarDuration.Indefinite;
                this.e = 1;
                Object showSnackbar$default2 = SnackbarHostState.showSnackbar$default(this.f, this.g, null, false, snackbarDuration2, this, 6, null);
                return showSnackbar$default2 == vnVar ? vnVar : showSnackbar$default2;
            case 3:
                int i5 = this.e;
                if (i5 == 0) {
                    p10.Q(obj);
                    SnackbarData currentSnackbarData3 = snackbarHostState.getCurrentSnackbarData();
                    if (currentSnackbarData3 != null) {
                        currentSnackbarData3.dismiss();
                    }
                    ib ibVar2 = new ib(snackbarHostState, str, hmVar, 2);
                    this.e = 1;
                    if (d41.R(2000L, ibVar2, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i5 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                SnackbarData currentSnackbarData4 = snackbarHostState.getCurrentSnackbarData();
                if (currentSnackbarData4 == null) {
                    return w01Var;
                }
                currentSnackbarData4.dismiss();
                return w01Var;
            case 4:
                int i6 = this.e;
                if (i6 != 0) {
                    if (i6 == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                SnackbarDuration snackbarDuration3 = SnackbarDuration.Indefinite;
                this.e = 1;
                Object showSnackbar$default3 = SnackbarHostState.showSnackbar$default(this.f, this.g, null, false, snackbarDuration3, this, 6, null);
                return showSnackbar$default3 == vnVar ? vnVar : showSnackbar$default3;
            case 5:
                int i7 = this.e;
                if (i7 == 0) {
                    p10.Q(obj);
                    SnackbarData currentSnackbarData5 = snackbarHostState.getCurrentSnackbarData();
                    if (currentSnackbarData5 != null) {
                        currentSnackbarData5.dismiss();
                    }
                    ib ibVar3 = new ib(snackbarHostState, str, hmVar, 4);
                    this.e = 1;
                    if (d41.R(2000L, ibVar3, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i7 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                SnackbarData currentSnackbarData6 = snackbarHostState.getCurrentSnackbarData();
                if (currentSnackbarData6 == null) {
                    return w01Var;
                }
                currentSnackbarData6.dismiss();
                return w01Var;
            case 6:
                int i8 = this.e;
                if (i8 != 0) {
                    if (i8 == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                SnackbarDuration snackbarDuration4 = SnackbarDuration.Indefinite;
                this.e = 1;
                Object showSnackbar$default4 = SnackbarHostState.showSnackbar$default(this.f, this.g, null, false, snackbarDuration4, this, 6, null);
                return showSnackbar$default4 == vnVar ? vnVar : showSnackbar$default4;
            default:
                int i9 = this.e;
                if (i9 == 0) {
                    p10.Q(obj);
                    SnackbarData currentSnackbarData7 = snackbarHostState.getCurrentSnackbarData();
                    if (currentSnackbarData7 != null) {
                        currentSnackbarData7.dismiss();
                    }
                    ib ibVar4 = new ib(snackbarHostState, str, hmVar, 6);
                    this.e = 1;
                    if (d41.R(2000L, ibVar4, this) == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i9 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                SnackbarData currentSnackbarData8 = snackbarHostState.getCurrentSnackbarData();
                if (currentSnackbarData8 == null) {
                    return w01Var;
                }
                currentSnackbarData8.dismiss();
                return w01Var;
        }
    }
}
