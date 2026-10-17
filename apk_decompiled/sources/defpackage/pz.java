package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.animation.core.AnimationKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pz {
    public static volatile String l;
    public static volatile String m;
    public static volatile String n;
    public static volatile String o;
    public static volatile String p;
    public static volatile List q;
    public static volatile SharedPreferences s;
    public static final pz a = new pz();
    public static final List b = y80.E(305, 400, 441, 490, 525, 587);
    public static final List c = y80.E("/sys/class/kgsl/kgsl-3d0/gpuclk", "/sys/class/kgsl/kgsl-3d0/devfreq/cur_freq");
    public static final List d = y80.E("/sys/class/kgsl/kgsl-3d0/max_clock_mhz", "/sys/class/kgsl/kgsl-3d0/devfreq/max_freq", "/sys/class/kgsl/kgsl-3d0/max_gpuclk");
    public static final List e = y80.E("/sys/class/kgsl/kgsl-3d0/min_clock_mhz", "/sys/class/kgsl/kgsl-3d0/devfreq/min_freq");
    public static final List f = y80.E("/sys/class/kgsl/kgsl-3d0/gpubusy", "/sys/class/kgsl/kgsl-3d0/gpu_busy_percentage");
    public static final List g = y80.E("/sys/class/kgsl/kgsl-3d0/temp", "/sys/class/thermal/thermal_zone25/temp", "/sys/class/thermal/thermal_zone15/temp", "/sys/class/thermal/thermal_zone24/temp");
    public static final List h = y80.E("tsens_tz_sensor12", "tsens_tz_sensor13");
    public static final String i = "/sys/class/kgsl/kgsl-3d0/devfreq/max_freq";
    public static final String j = "/sys/class/kgsl/kgsl-3d0/max_gpuclk";
    public static final List k = y80.E("/sys/class/kgsl/kgsl-3d0/devfreq/available_frequencies", "/sys/class/kgsl/kgsl-3d0/gpu_available_frequencies");
    public static final ob0 r = new ob0();

    public static int a(String str) {
        Long f0 = ks0.f0(str);
        long longValue = f0 != null ? f0.longValue() : 0L;
        if (longValue > 100000000) {
            return (int) (longValue / AnimationKt.MillisToNanos);
        }
        if (longValue > 0) {
            return (int) longValue;
        }
        return 0;
    }

    public static Object e(us0 us0Var) {
        nq nqVar = nr.a;
        int i2 = 2;
        return p01.H(hq.d, new gv(i2, i2, null), us0Var);
    }

    public static Object f(im imVar) {
        nq nqVar = nr.a;
        return p01.H(hq.d, new z9(2, 25, null), imVar);
    }

    public static void g(SharedPreferences sharedPreferences) {
        s = sharedPreferences;
        if (q == null) {
            ArrayList arrayList = null;
            String string = sharedPreferences.getString("gpu_available_freqs_cache", null);
            if (string != null) {
                List w0 = ds0.w0(string, new String[]{","});
                ArrayList arrayList2 = new ArrayList();
                Iterator it = w0.iterator();
                while (it.hasNext()) {
                    Integer e0 = ks0.e0((String) it.next());
                    if (e0 != null) {
                        arrayList2.add(e0);
                    }
                }
                if (arrayList2.size() >= 2) {
                    arrayList = arrayList2;
                }
            }
            if (arrayList != null) {
                q = arrayList;
                Log.d("GpuUtils", "Restored GPU available frequencies from prefs: " + arrayList);
            }
        }
    }

    public static int h(String str) {
        String obj;
        Integer e0;
        try {
            obj = ds0.E0(ks0.b0(str, "%", "")).toString();
            e0 = ks0.e0(obj);
        } catch (Exception unused) {
        }
        if (e0 != null) {
            return e0.intValue();
        }
        List w0 = ds0.w0(obj, new String[]{" "});
        if (w0.size() >= 2) {
            Long f0 = ks0.f0((String) w0.get(0));
            long longValue = f0 != null ? f0.longValue() : 0L;
            Long f02 = ks0.f0((String) w0.get(1));
            long longValue2 = f02 != null ? f02.longValue() : 1L;
            if (longValue2 > 0) {
                return (int) ((longValue * 100) / longValue2);
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:10:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(im imVar) {
        iz izVar;
        int i2;
        Iterator it;
        List list;
        if (imVar instanceof iz) {
            izVar = (iz) imVar;
            int i3 = izVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                izVar.g = i3 - Integer.MIN_VALUE;
                Object obj = izVar.e;
                i2 = izVar.g;
                if (i2 != 0) {
                    p10.Q(obj);
                    it = k.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = izVar.d;
                    p10.Q(obj);
                    String str = (String) obj;
                    if (!ds0.n0(str)) {
                        String obj2 = ds0.E0(str).toString();
                        Pattern compile = Pattern.compile("\\s+");
                        compile.getClass();
                        obj2.getClass();
                        Matcher matcher = compile.matcher(obj2);
                        int i4 = 0;
                        if (matcher.find()) {
                            ArrayList arrayList = new ArrayList(10);
                            int i5 = 0;
                            do {
                                arrayList.add(obj2.subSequence(i5, matcher.start()).toString());
                                i5 = matcher.end();
                            } while (matcher.find());
                            arrayList.add(obj2.subSequence(i5, obj2.length()).toString());
                            list = arrayList;
                        } else {
                            list = y80.D(obj2.toString());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            Long f0 = ks0.f0((String) it2.next());
                            if (f0 != null) {
                                arrayList2.add(f0);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj3 = arrayList2.get(i6);
                            i6++;
                            if (((Number) obj3).longValue() > 0) {
                                arrayList3.add(obj3);
                            }
                        }
                        if (arrayList3.size() >= 2) {
                            ArrayList arrayList4 = new ArrayList(zi.a0(arrayList3, 10));
                            int size2 = arrayList3.size();
                            while (i4 < size2) {
                                Object obj4 = arrayList3.get(i4);
                                i4++;
                                long longValue = ((Number) obj4).longValue();
                                if (longValue > 100000000) {
                                    longValue /= AnimationKt.MillisToNanos;
                                }
                                arrayList4.add(new Integer((int) longValue));
                            }
                            List E0 = yi.E0(yi.n0(arrayList4));
                            if (E0.size() >= 2) {
                                return E0;
                            }
                        }
                    }
                    if (it.hasNext()) {
                        String str2 = (String) it.next();
                        izVar.d = it;
                        izVar.g = 1;
                        obj = i(str2, izVar);
                        Object obj5 = vn.d;
                        if (obj == obj5) {
                            return obj5;
                        }
                        String str3 = (String) obj;
                        if (!ds0.n0(str3)) {
                        }
                        if (it.hasNext()) {
                            return null;
                        }
                    }
                }
            }
        }
        izVar = new iz(this, imVar);
        Object obj6 = izVar.e;
        i2 = izVar.g;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:31|32))(6:33|(8:36|37|38|(3:40|41|(3:44|45|46)(1:43))|47|41|(0)(0)|34)|50|51|52|(1:54))|12|13|(4:16|(3:18|19|(3:21|22|23)(1:25))(1:27)|26|14)|28|29))|56|6|7|(0)(0)|12|13|(1:14)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067 A[LOOP:1: B:34:0x0039->B:43:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, im imVar) {
        jz jzVar;
        int i2;
        String str;
        File file;
        if (imVar instanceof jz) {
            jzVar = (jz) imVar;
            int i3 = jzVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jzVar.g = i3 - Integer.MIN_VALUE;
                Object obj = jzVar.e;
                i2 = jzVar.g;
                int i4 = 0;
                if (i2 != 0) {
                    p10.Q(obj);
                    for (int i5 = 0; i5 < 36; i5++) {
                        try {
                            file = new File(j50.i(i5, "/sys/class/thermal/thermal_zone", "/type"));
                        } catch (Exception unused) {
                        }
                        if (file.canRead()) {
                            str = ds0.E0(uv.L(file)).toString();
                            if (!list.contains(str)) {
                                return j50.i(i5, "/sys/class/thermal/thermal_zone", "/temp");
                            }
                        }
                        str = "";
                        if (!list.contains(str)) {
                        }
                    }
                    zj0 zj0Var = zj0.a;
                    String u0 = yi.u0(new k10(0, 35, 1), "\n", null, null, new hz(i4), 30);
                    jzVar.d = list;
                    jzVar.g = 1;
                    obj = zj0.d(u0, jzVar);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = jzVar.d;
                    p10.Q(obj);
                }
                String str2 = (String) obj;
                for (String str3 : ds0.r0(str2)) {
                    int l0 = ds0.l0(str3, ':', 0, 6);
                    if (l0 >= 0) {
                        String substring = str3.substring(0, l0);
                        if (list.contains(ds0.E0(str3.substring(l0 + 1)).toString())) {
                            return uo.d("/sys/class/thermal/thermal_zone", ds0.t0(substring, "zone"), "/temp");
                        }
                    }
                }
                return "";
            }
        }
        jzVar = new jz(this, imVar);
        Object obj2 = jzVar.e;
        i2 = jzVar.g;
        int i42 = 0;
        if (i2 != 0) {
        }
        String str22 = (String) obj2;
        while (r12.hasNext()) {
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, im imVar) {
        kz kzVar;
        int i2;
        Iterator it;
        if (imVar instanceof kz) {
            kzVar = (kz) imVar;
            int i3 = kzVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kzVar.h = i3 - Integer.MIN_VALUE;
                Object obj = kzVar.f;
                i2 = kzVar.h;
                if (i2 != 0) {
                    p10.Q(obj);
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = kzVar.e;
                    it = kzVar.d;
                    p10.Q(obj);
                    String str2 = (String) obj;
                    if (str2.length() > 0 && !ds0.g0(str2, "No such file", false) && !ds0.g0(str2, "Permission denied", false)) {
                        return str;
                    }
                    if (it.hasNext()) {
                        str = (String) it.next();
                        kzVar.d = it;
                        kzVar.e = str;
                        kzVar.h = 1;
                        obj = i(str, kzVar);
                        Object obj2 = vn.d;
                        if (obj == obj2) {
                            return obj2;
                        }
                        String str22 = (String) obj;
                        if (str22.length() > 0) {
                            return str;
                        }
                        if (it.hasNext()) {
                            return "";
                        }
                    }
                }
            }
        }
        kzVar = new kz(this, imVar);
        Object obj3 = kzVar.f;
        i2 = kzVar.h;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(4:18|19|20|21))(3:22|23|24))(3:26|(3:28|(4:30|(1:32)|23|24)(2:34|(2:36|37)(4:38|(1:40)|20|21))|33)|41)|42|41))|7|(0)(0)|42|41) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        r9 = defpackage.zj0.a;
        r0.d = null;
        r0.g = 3;
        r9 = defpackage.zj0.d("cat " + r10 + " 2>/dev/null", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        if (r9 != r8) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, im imVar) {
        mz mzVar;
        int i2;
        try {
            if (imVar instanceof mz) {
                mzVar = (mz) imVar;
                int i3 = mzVar.g;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    mzVar.g = i3 - Integer.MIN_VALUE;
                    Object obj = mzVar.e;
                    i2 = mzVar.g;
                    vn vnVar = vn.d;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            p10.Q(obj);
                            return ds0.E0((String) obj).toString();
                        }
                        if (i2 == 2) {
                            String str2 = mzVar.d;
                            p10.Q(obj);
                            return ds0.E0((String) obj).toString();
                        }
                        if (i2 == 3) {
                            p10.Q(obj);
                            return ds0.E0((String) obj).toString();
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    if (str.length() != 0) {
                        if (ds0.g0(str, "/thermal/", false)) {
                            zj0 zj0Var = zj0.a;
                            mzVar.d = null;
                            mzVar.g = 1;
                            obj = zj0.d("cat " + str + " 2>/dev/null", mzVar);
                            if (obj == vnVar) {
                            }
                            return ds0.E0((String) obj).toString();
                        }
                        File file = new File(str);
                        if (file.canRead()) {
                            return ds0.E0(uv.L(file)).toString();
                        }
                        zj0 zj0Var2 = zj0.a;
                        mzVar.d = str;
                        mzVar.g = 2;
                        obj = zj0.d("cat " + str + " 2>/dev/null", mzVar);
                        if (obj == vnVar) {
                        }
                        return ds0.E0((String) obj).toString();
                        return vnVar;
                    }
                    return "";
                    return "";
                }
            }
            if (i2 == 0) {
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
        mzVar = new mz(this, imVar);
        Object obj2 = mzVar.e;
        i2 = mzVar.g;
        vn vnVar2 = vn.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (r5 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        if (r5 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r5 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        if (r5 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0066, code lost:
    
        if (r5 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0052, code lost:
    
        if (r5 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(im imVar) {
        nz nzVar;
        String str;
        if (imVar instanceof nz) {
            nzVar = (nz) imVar;
            int i2 = nzVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nzVar.f = i2 - Integer.MIN_VALUE;
                Object obj = nzVar.d;
                Object obj2 = vn.d;
                switch (nzVar.f) {
                    case 0:
                        p10.Q(obj);
                        if (l == null) {
                            List list = c;
                            nzVar.f = 1;
                            obj = d(list, nzVar);
                            break;
                        }
                        if (m == null) {
                            List list2 = d;
                            nzVar.f = 2;
                            obj = d(list2, nzVar);
                            break;
                        }
                        if (n == null) {
                            List list3 = e;
                            nzVar.f = 3;
                            obj = d(list3, nzVar);
                            break;
                        }
                        if (o == null) {
                            List list4 = f;
                            nzVar.f = 4;
                            obj = d(list4, nzVar);
                            break;
                        }
                        if (p == null) {
                            if (!hr.c()) {
                                List list5 = g;
                                nzVar.f = 6;
                                obj = d(list5, nzVar);
                                break;
                            } else {
                                List list6 = h;
                                nzVar.f = 5;
                                obj = c(list6, nzVar);
                                break;
                            }
                            return obj2;
                        }
                        return w01.a;
                    case 1:
                        p10.Q(obj);
                        l = (String) obj;
                        if (m == null) {
                        }
                        if (n == null) {
                        }
                        if (o == null) {
                        }
                        if (p == null) {
                        }
                        return w01.a;
                    case 2:
                        p10.Q(obj);
                        m = (String) obj;
                        if (n == null) {
                        }
                        if (o == null) {
                        }
                        if (p == null) {
                        }
                        return w01.a;
                    case 3:
                        p10.Q(obj);
                        n = (String) obj;
                        if (o == null) {
                        }
                        if (p == null) {
                        }
                        return w01.a;
                    case 4:
                        p10.Q(obj);
                        o = (String) obj;
                        if (p == null) {
                        }
                        return w01.a;
                    case 5:
                        p10.Q(obj);
                        str = (String) obj;
                        p = str;
                        return w01.a;
                    case 6:
                        p10.Q(obj);
                        str = (String) obj;
                        p = str;
                        return w01.a;
                    default:
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        nzVar = new nz(this, imVar);
        Object obj3 = nzVar.d;
        Object obj22 = vn.d;
        switch (nzVar.f) {
        }
    }
}
