package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class re extends us0 implements my {
    public String d;
    public String e;
    public Context f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public final /* synthetic */ SharedPreferences m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Context o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(SharedPreferences sharedPreferences, int i, Context context, hm hmVar) {
        super(2, hmVar);
        this.m = sharedPreferences;
        this.n = i;
        this.o = context;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new re(this.m, this.n, this.o, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((re) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (defpackage.y80.p(8000, r17) == r10) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0100 -> B:7:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i;
        Context context;
        String str3;
        int i2;
        int i3;
        String str4;
        String str5;
        Object obj2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.l;
        w01 w01Var = w01.a;
        int i10 = this.n;
        String str6 = "";
        vn vnVar = vn.d;
        if (i9 == 0) {
            p10.Q(obj);
            str = this.m.getBoolean("fps_display_scaling", false) ? "setprop debug.oculus.forceDisplayScaling 1; " : "";
            str2 = str + "setprop debug.oculus.refreshRate " + i10;
            this.d = str;
            this.e = str2;
            this.l = 1;
        } else if (i9 == 1) {
            str2 = this.e;
            str = this.d;
            p10.Q(obj);
        } else if (i9 == 2) {
            int i11 = this.k;
            int i12 = this.j;
            int i13 = this.i;
            int i14 = this.h;
            int i15 = this.g;
            Context context2 = this.f;
            str5 = this.e;
            String str7 = this.d;
            p10.Q(obj);
            obj2 = obj;
            str4 = str7;
            i6 = i12;
            i7 = i11;
            i8 = i13;
            i5 = i15;
            i4 = i14;
            context = context2;
            if (obj2 == null) {
            }
        } else {
            if (i9 != 3) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i8 = this.i;
            int i16 = this.h;
            i5 = this.g;
            context = this.f;
            String str8 = this.e;
            String str9 = this.d;
            p10.Q(obj);
            String str10 = "";
            str5 = str8;
            i = i5;
            str3 = str9;
            str6 = str10;
            i2 = i16;
            i3 = i8 + 1;
            str2 = str5;
            if (i3 < i) {
                this.d = str3;
                this.e = str2;
                this.f = context;
                this.g = i;
                this.h = i2;
                this.i = i3;
                this.j = i3;
                this.k = 0;
                this.l = 2;
                obj2 = j4.i(context, str2, this);
                if (obj2 != vnVar) {
                    str5 = str2;
                    i8 = i3;
                    str4 = str3;
                    i5 = i;
                    i4 = i2;
                    i7 = 0;
                    i6 = i8;
                    if (obj2 == null) {
                        if (str4.length() > 0) {
                            str6 = " with display scaling";
                        }
                        Log.i("BootReceiver", "FPS on Boot: set " + i4 + " Hz" + str6);
                        return w01Var;
                    }
                    str9 = str4;
                    this.d = str9;
                    this.e = str5;
                    this.f = context;
                    this.g = i5;
                    this.h = i4;
                    this.i = i8;
                    this.j = i6;
                    this.k = i7;
                    this.l = 3;
                    str10 = str6;
                    if (y80.p(5000L, this) != vnVar) {
                        i16 = i4;
                        i = i5;
                        str3 = str9;
                        str6 = str10;
                        i2 = i16;
                        i3 = i8 + 1;
                        str2 = str5;
                        if (i3 < i) {
                            Log.w("BootReceiver", "FPS on Boot: wireless ADB was not available, skipped");
                            return w01Var;
                        }
                    }
                }
                return vnVar;
            }
        }
        i = 2;
        context = this.o;
        str3 = str;
        i2 = i10;
        i3 = 0;
        if (i3 < i) {
        }
    }
}
