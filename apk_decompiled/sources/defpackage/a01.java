package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a01 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ my g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a01(boolean z, my myVar, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = z;
        this.g = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new a01(this.f, this.g, hmVar, 0);
            case 1:
                return new a01(this.f, this.g, hmVar, 1);
            default:
                return new a01(this.f, this.g, hmVar, 2);
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
        return ((a01) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        my myVar = this.g;
        boolean z = this.f;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    String str = z ? "oculuspreferences --setc navigator_background_disabled false\nam force-stop com.oculus.vrshell" : "oculuspreferences --setc navigator_background_disabled true\nam force-stop com.oculus.vrshell";
                    this.e = 1;
                    if (myVar.invoke(str, this) == vnVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    String str2 = z ? "oculuspreferences --setc panel_scaling true\nam force-stop com.oculus.vrshell" : "oculuspreferences --setc panel_scaling false\nam force-stop com.oculus.vrshell";
                    this.e = 1;
                    if (myVar.invoke(str2, this) == vnVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            default:
                int i4 = this.e;
                if (i4 == 0) {
                    p10.Q(obj);
                    String str3 = z ? "oculuspreferences --setc debug_infinite_spatial_panels_enabled true\nam force-stop com.oculus.vrshell" : "oculuspreferences --setc debug_infinite_spatial_panels_enabled false\nam force-stop com.oculus.vrshell";
                    this.e = 1;
                    if (myVar.invoke(str3, this) == vnVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
        }
        return vnVar;
    }
}
