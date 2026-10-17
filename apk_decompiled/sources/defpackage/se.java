package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.lumi.singularity.system.DnsBlockerService;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class se extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public int e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ SharedPreferences g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(Context context, SharedPreferences sharedPreferences, boolean z, hm hmVar) {
        super(2, hmVar);
        this.f = context;
        this.g = sharedPreferences;
        this.h = z;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        boolean z = this.h;
        SharedPreferences sharedPreferences = this.g;
        Context context = this.f;
        switch (i) {
            case 0:
                return new se(z, context, sharedPreferences, hmVar);
            default:
                return new se(context, sharedPreferences, z, hmVar);
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
        return ((se) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r13 == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009a, code lost:
    
        if (r13 == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008f, code lost:
    
        if (defpackage.y80.p(5000, r12) == r6) goto L38;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        boolean z = this.h;
        vn vnVar = vn.d;
        Context context = this.f;
        SharedPreferences sharedPreferences = this.g;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    break;
                } else if (i2 == 1) {
                    p10.Q(obj);
                } else if (i2 == 2) {
                    p10.Q(obj);
                    if (!((Boolean) obj).booleanValue() || !z) {
                        if (!z) {
                            Log.i("BootReceiver", "Domain Blocker on-boot enabled but not configured — skipped");
                            break;
                        }
                    } else {
                        Log.i("BootReceiver", "Domain Blocker on-boot enabled — applying domain blocker");
                        Map map = hs.a;
                        this.e = 3;
                        obj = hs.c(context, this);
                        break;
                    }
                } else if (i2 != 3) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    if (((Boolean) obj).booleanValue()) {
                        sharedPreferences.edit().putBoolean("root_blocker_is_running", true).apply();
                        break;
                    }
                }
                zj0 zj0Var = zj0.a;
                this.e = 2;
                obj = zj0.b(this);
                break;
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    context.startService(new Intent(context, (Class<?>) DnsBlockerService.class).setAction(DnsBlockerService.ACTION_STOP));
                    sharedPreferences.edit().putBoolean("blocker_is_running", false).apply();
                    if (z) {
                        Map map2 = hs.a;
                        this.e = 1;
                        obj = hs.c(context, this);
                        if (obj == vnVar) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    sharedPreferences.edit().putBoolean("root_blocker_is_running", true).apply();
                    break;
                }
                break;
        }
        return w01Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(boolean z, Context context, SharedPreferences sharedPreferences, hm hmVar) {
        super(2, hmVar);
        this.h = z;
        this.f = context;
        this.g = sharedPreferences;
    }
}
