package defpackage;

import android.util.Log;
import androidx.compose.animation.core.AnimationKt;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class oz extends us0 implements my {
    public Long d;
    public long e;
    public int f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz(String str, hm hmVar) {
        super(2, hmVar);
        this.g = str;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new oz(this.g, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((oz) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (defpackage.zj0.c(r15, false, r14) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
    
        if (r15 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010d  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long f0;
        long longValue;
        long j;
        String str;
        long j2;
        String str2;
        String valueOf;
        vn vnVar = vn.d;
        int i = this.f;
        boolean z = false;
        if (i == 0) {
            p10.Q(obj);
            f0 = ks0.f0(this.g);
            if (f0 == null) {
                Log.w("GpuUtils", "setGpuMaxFreq: non-numeric input '" + this.g + "'");
                return Boolean.FALSE;
            }
            pz pzVar = pz.a;
            long longValue2 = f0.longValue();
            this.d = f0;
            this.f = 1;
            nq nqVar = nr.a;
            obj = p01.H(hq.d, new lz(longValue2, null), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    longValue = this.e;
                    p10.Q(obj);
                    if (pz.m != null) {
                        j = longValue;
                        str = pz.m;
                        if (str != null) {
                        }
                        str2 = "";
                        j2 = j;
                        valueOf = String.valueOf(j2);
                        String obj2 = ds0.E0(this.g).toString();
                        if (str2.equals(valueOf)) {
                        }
                        Log.d("GpuUtils", "VERIFIED: GPU max freq set to " + j2 + " MHz (" + this.g + " Hz) via " + pz.m);
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    pz pzVar2 = pz.a;
                    List list = pz.d;
                    this.d = null;
                    this.e = longValue;
                    this.f = 3;
                    obj = pzVar2.d(list, this);
                    if (obj != vnVar) {
                        j = longValue;
                        pz.m = (String) obj;
                        str = pz.m;
                        if (str != null) {
                        }
                        str2 = "";
                        j2 = j;
                        valueOf = String.valueOf(j2);
                        String obj22 = ds0.E0(this.g).toString();
                        if (str2.equals(valueOf)) {
                        }
                        Log.d("GpuUtils", "VERIFIED: GPU max freq set to " + j2 + " MHz (" + this.g + " Hz) via " + pz.m);
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    return vnVar;
                }
                if (i != 3) {
                    if (i != 4) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = this.e;
                    p10.Q(obj);
                    str2 = (String) obj;
                    if (str2 == null) {
                        j = j2;
                        str2 = "";
                        j2 = j;
                    }
                    valueOf = String.valueOf(j2);
                    String obj222 = ds0.E0(this.g).toString();
                    if (!str2.equals(valueOf) || str2.equals(obj222)) {
                        Log.d("GpuUtils", "VERIFIED: GPU max freq set to " + j2 + " MHz (" + this.g + " Hz) via " + pz.m);
                        z = true;
                    } else {
                        String str3 = pz.m;
                        StringBuilder k = j50.k("VERIFICATION FAILED: expected ", valueOf, " MHz / ", obj222, " Hz, got '");
                        k.append(str2);
                        k.append("' from ");
                        k.append(str3);
                        Log.w("GpuUtils", k.toString());
                    }
                    return Boolean.valueOf(z);
                }
                j = this.e;
                p10.Q(obj);
                pz.m = (String) obj;
                str = pz.m;
                if (str != null) {
                    pz pzVar3 = pz.a;
                    this.d = null;
                    this.e = j;
                    this.f = 4;
                    obj = pzVar3.i(str, this);
                    if (obj != vnVar) {
                        j2 = j;
                        str2 = (String) obj;
                        if (str2 == null) {
                        }
                        valueOf = String.valueOf(j2);
                        String obj2222 = ds0.E0(this.g).toString();
                        if (str2.equals(valueOf)) {
                        }
                        Log.d("GpuUtils", "VERIFIED: GPU max freq set to " + j2 + " MHz (" + this.g + " Hz) via " + pz.m);
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    return vnVar;
                }
                str2 = "";
                j2 = j;
                valueOf = String.valueOf(j2);
                String obj22222 = ds0.E0(this.g).toString();
                if (str2.equals(valueOf)) {
                }
                Log.d("GpuUtils", "VERIFIED: GPU max freq set to " + j2 + " MHz (" + this.g + " Hz) via " + pz.m);
                z = true;
                return Boolean.valueOf(z);
            }
            f0 = this.d;
            p10.Q(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            Log.w("GpuUtils", "setGpuMaxFreq: " + this.g + " Hz is not in the allowed frequency table for this device");
            return Boolean.FALSE;
        }
        longValue = f0.longValue() / AnimationKt.MillisToNanos;
        zj0 zj0Var = zj0.a;
        String str4 = this.g;
        String W = es0.W("\n            echo '" + longValue + "' > /sys/class/kgsl/kgsl-3d0/max_clock_mhz 2>/dev/null\n            echo '" + str4 + "' > " + pz.i + " 2>/dev/null\n            echo '" + str4 + "' > " + pz.j + " 2>/dev/null\n            ");
        this.d = null;
        this.e = longValue;
        this.f = 2;
    }
}
