package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ro {
    public static volatile bo c;
    public static Map e;
    public static volatile String f;
    public static volatile SharedPreferences g;
    public static final ro a = new ro();
    public static final List b = y80.E("tsens_tz_sensor1", "tsens_tz_sensor7", "tsens_tz_sensor21");
    public static final ob0 d = new ob0();

    public static Object e(us0 us0Var) {
        nq nqVar = nr.a;
        return p01.H(hq.d, new lo(2, null), us0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        if (r15.isEmpty() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
    
        r1 = new defpackage.bo(r15);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9, types: [ut] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(SharedPreferences sharedPreferences) {
        ArrayList arrayList;
        g = sharedPreferences;
        bo boVar = null;
        String string = sharedPreferences.getString("cpu_temp_zone_path", null);
        if (string != null && string.length() != 0 && f == null) {
            f = string;
            Log.d("CpuUtils", "Restored CPU temp path from prefs: ".concat(string));
        }
        if (c == null) {
            String string2 = sharedPreferences.getString("cpu_topology_cache", null);
            if (string2 != null) {
                try {
                    List r0 = ds0.r0(string2);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : r0) {
                        if (!ds0.n0((String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(zi.a0(arrayList2, 10));
                    int size = arrayList2.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Object obj2 = arrayList2.get(i);
                        i++;
                        List w0 = ds0.w0((String) obj2, new String[]{":"});
                        if (w0.size() != 5) {
                            break;
                        }
                        String str = (String) w0.get(0);
                        String str2 = (String) w0.get(1);
                        String str3 = (String) w0.get(2);
                        String str4 = (String) w0.get(3);
                        String str5 = (String) w0.get(4);
                        List w02 = ds0.w0(str2, new String[]{"-"});
                        int parseInt = Integer.parseInt((String) w02.get(0));
                        int parseInt2 = Integer.parseInt((String) w02.get(1));
                        if (ds0.n0(str5)) {
                            arrayList = ut.d;
                        } else {
                            List w03 = ds0.w0(str5, new String[]{","});
                            arrayList = new ArrayList();
                            Iterator it = w03.iterator();
                            while (it.hasNext()) {
                                Integer e0 = ks0.e0((String) it.next());
                                if (e0 != null) {
                                    arrayList.add(e0);
                                }
                            }
                        }
                        arrayList3.add(new zn(str, new k10(parseInt, parseInt2, 1), Integer.parseInt(str3), Integer.parseInt(str4), arrayList));
                    }
                } catch (Exception e2) {
                    Log.w("CpuUtils", "Failed to deserialize cached CPU topology: " + e2.getMessage());
                }
            }
            if (boVar != null) {
                c = boVar;
                Log.d("CpuUtils", "Restored CPU topology from prefs: ".concat(yi.u0(boVar.a, null, null, null, new ed(26), 31)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r9 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(zn znVar, im imVar) {
        eo eoVar;
        int i;
        vn vnVar;
        int i2;
        Object h;
        String str;
        if (imVar instanceof eo) {
            eoVar = (eo) imVar;
            int i3 = eoVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eoVar.h = i3 - Integer.MIN_VALUE;
                Object obj = eoVar.f;
                i = eoVar.h;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    i2 = znVar.b.d;
                    String i4 = j50.i(i2, "/sys/devices/system/cpu/cpu", "/cpufreq/scaling_min_freq");
                    eoVar.e = i2;
                    eoVar.h = 1;
                    obj = h(i4, eoVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = eoVar.d;
                        p10.Q(obj);
                        String str2 = (String) obj;
                        Integer e0 = ks0.e0(str);
                        Integer num = new Integer(e0 == null ? e0.intValue() / 1000 : 0);
                        Integer e02 = ks0.e0(str2);
                        return new xe0(num, new Integer(e02 != null ? e02.intValue() / 1000 : 0));
                    }
                    i2 = eoVar.e;
                    p10.Q(obj);
                }
                String str3 = (String) obj;
                String i5 = j50.i(i2, "/sys/devices/system/cpu/cpu", "/cpufreq/scaling_max_freq");
                eoVar.d = str3;
                eoVar.e = i2;
                eoVar.h = 2;
                h = h(i5, eoVar);
                if (h != vnVar) {
                    obj = h;
                    str = str3;
                    String str22 = (String) obj;
                    Integer e03 = ks0.e0(str);
                    Integer num2 = new Integer(e03 == null ? e03.intValue() / 1000 : 0);
                    Integer e022 = ks0.e0(str22);
                    return new xe0(num2, new Integer(e022 != null ? e022.intValue() / 1000 : 0));
                }
                return vnVar;
            }
        }
        eoVar = new eo(this, imVar);
        Object obj2 = eoVar.f;
        i = eoVar.h;
        vnVar = vn.d;
        if (i != 0) {
        }
        String str32 = (String) obj2;
        String i52 = j50.i(i2, "/sys/devices/system/cpu/cpu", "/cpufreq/scaling_max_freq");
        eoVar.d = str32;
        eoVar.e = i2;
        eoVar.h = 2;
        h = h(i52, eoVar);
        if (h != vnVar) {
        }
        return vnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0096, code lost:
    
        if (r1 == r13) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e3, code lost:
    
        if (r1 == r13) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0232, code lost:
    
        if (r1 == r13) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0272, code lost:
    
        if (r1 == r13) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025e  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r17v12, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v0, types: [ro] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01e1 -> B:19:0x02b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x025c -> B:13:0x0277). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0272 -> B:12:0x0275). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(im imVar) {
        fo foVar;
        int i;
        int intValue;
        int i2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        int i4;
        String str;
        int i5;
        ArrayList arrayList3;
        String str2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object h;
        List list;
        Integer e0;
        if (imVar instanceof fo) {
            foVar = (fo) imVar;
            int i6 = foVar.j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                foVar.j = i6 - Integer.MIN_VALUE;
                Object obj = foVar.h;
                i = foVar.j;
                int i7 = 10;
                ro roVar = a;
                int i8 = 2;
                int i9 = 0;
                int i10 = 1;
                String str3 = null;
                vn vnVar = vn.d;
                switch (i) {
                    case 0:
                        p10.Q(obj);
                        foVar.j = 1;
                        obj = h("/sys/devices/system/cpu/present", foVar);
                        break;
                    case 1:
                        p10.Q(obj);
                        String str4 = (String) obj;
                        str4.getClass();
                        int l0 = ds0.l0(str4, '-', 0, 6);
                        Integer e02 = ks0.e0(l0 == -1 ? "" : str4.substring(l0 + 1, str4.length()));
                        if (e02 == null || (intValue = e02.intValue() + 1) < 2) {
                            return null;
                        }
                        i2 = intValue;
                        arrayList = new ArrayList(intValue);
                        i3 = 0;
                        if (i3 >= i2) {
                            int i11 = i10;
                            ?? r17 = str3;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                go goVar = (go) next;
                                ArrayList arrayList5 = (ArrayList) yi.w0(arrayList4);
                                if (arrayList5 == null || ((go) yi.v0(arrayList5)).c != goVar.c) {
                                    arrayList4.add(y80.a(goVar));
                                } else {
                                    arrayList5.add(goVar);
                                }
                            }
                            int size = arrayList4.size();
                            if (2 > size || size >= 4) {
                                return r17;
                            }
                            List E = arrayList4.size() == 2 ? y80.E("Little", "Big") : y80.E("Little", "Middle", "Big");
                            List F0 = yi.F0(arrayList4, new jb(i8));
                            ArrayList arrayList6 = new ArrayList(zi.a0(F0, 10));
                            int i12 = 0;
                            for (Object obj2 : F0) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    y80.V();
                                    throw r17;
                                }
                                ArrayList arrayList7 = (ArrayList) obj2;
                                String str5 = (String) E.get(i12);
                                int i14 = i11;
                                k10 k10Var = new k10(((go) yi.p0(arrayList7)).a, ((go) yi.v0(arrayList7)).a, i14);
                                Iterator it2 = arrayList7.iterator();
                                if (!it2.hasNext()) {
                                    o.q();
                                    return r17;
                                }
                                int i15 = ((go) it2.next()).b;
                                while (true) {
                                    int i16 = i15;
                                    while (it2.hasNext()) {
                                        i15 = ((go) it2.next()).b;
                                        if (i16 > i15) {
                                            break;
                                        }
                                    }
                                    Iterator it3 = arrayList7.iterator();
                                    if (!it3.hasNext()) {
                                        o.q();
                                        return r17;
                                    }
                                    int i17 = ((go) it3.next()).c;
                                    while (true) {
                                        int i18 = i17;
                                        while (it3.hasNext()) {
                                            i17 = ((go) it3.next()).c;
                                            if (i18 < i17) {
                                                break;
                                            }
                                        }
                                        ArrayList arrayList8 = new ArrayList();
                                        int size2 = arrayList7.size();
                                        int i19 = 0;
                                        while (i19 < size2) {
                                            Object obj3 = arrayList7.get(i19);
                                            i19++;
                                            dj.d0(arrayList8, ((go) obj3).d);
                                        }
                                        arrayList6.add(new zn(str5, k10Var, i16, i18, yi.E0(yi.n0(arrayList8))));
                                        i12 = i13;
                                        i11 = i14;
                                    }
                                }
                            }
                            return new bo(arrayList6);
                        }
                        String i20 = j50.i(i3, "/sys/devices/system/cpu/cpu", "/cpufreq/scaling_available_frequencies");
                        foVar.d = arrayList;
                        foVar.e = str3;
                        foVar.f = i2;
                        foVar.g = i3;
                        foVar.j = 2;
                        obj = h(i20, foVar);
                        break;
                        break;
                    case 2:
                        i3 = foVar.g;
                        i2 = foVar.f;
                        arrayList = foVar.d;
                        p10.Q(obj);
                        ArrayList arrayList9 = arrayList;
                        String obj4 = ds0.E0((String) obj).toString();
                        Pattern compile = Pattern.compile("\\s+");
                        compile.getClass();
                        obj4.getClass();
                        Matcher matcher = compile.matcher(obj4);
                        if (matcher.find()) {
                            ArrayList arrayList10 = new ArrayList(i7);
                            str = str3;
                            do {
                                arrayList10.add(obj4.subSequence(i9, matcher.start()).toString());
                                i9 = matcher.end();
                            } while (matcher.find());
                            arrayList10.add(obj4.subSequence(i9, obj4.length()).toString());
                            list = arrayList10;
                        } else {
                            list = y80.D(obj4.toString());
                            str = str3;
                        }
                        ArrayList arrayList11 = new ArrayList();
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            Integer e03 = ks0.e0((String) it4.next());
                            if (e03 != null) {
                                arrayList11.add(e03);
                            }
                        }
                        ArrayList arrayList12 = new ArrayList();
                        int size3 = arrayList11.size();
                        int i21 = 0;
                        while (i21 < size3) {
                            int i22 = i10;
                            Object obj5 = arrayList11.get(i21);
                            i21++;
                            if (((Number) obj5).intValue() > 0) {
                                arrayList12.add(obj5);
                            }
                            i10 = i22;
                        }
                        i4 = i10;
                        if (arrayList12.isEmpty()) {
                            String i23 = j50.i(i3, "/sys/devices/system/cpu/cpu", "/cpufreq/cpuinfo_max_freq");
                            foVar.d = arrayList9;
                            foVar.f = i2;
                            foVar.g = i3;
                            foVar.j = 3;
                            obj = h(i23, foVar);
                            if (obj != vnVar) {
                                arrayList2 = arrayList9;
                                charSequence2 = (CharSequence) obj;
                                if (ds0.n0(charSequence2)) {
                                    String i24 = j50.i(i3, "/sys/devices/system/cpu/cpu", "/cpufreq/scaling_max_freq");
                                    foVar.d = arrayList2;
                                    foVar.f = i2;
                                    foVar.g = i3;
                                    foVar.j = 4;
                                    obj = roVar.h(i24, foVar);
                                    break;
                                }
                                String str6 = (String) charSequence2;
                                String i25 = j50.i(i3, "/sys/devices/system/cpu/cpu", "/cpufreq/cpuinfo_min_freq");
                                foVar.d = arrayList2;
                                foVar.e = str6;
                                foVar.f = i2;
                                foVar.g = i3;
                                foVar.j = 5;
                                h = h(i25, foVar);
                                if (h != vnVar) {
                                    ArrayList arrayList13 = arrayList2;
                                    i5 = i2;
                                    arrayList3 = arrayList13;
                                    str2 = str6;
                                    obj = h;
                                    charSequence = (CharSequence) obj;
                                    if (ds0.n0(charSequence)) {
                                        String i26 = j50.i(i3, "/sys/devices/system/cpu/cpu", "/cpufreq/scaling_min_freq");
                                        foVar.d = arrayList3;
                                        foVar.e = str2;
                                        foVar.f = i5;
                                        foVar.g = i3;
                                        foVar.j = 6;
                                        obj = roVar.h(i26, foVar);
                                        break;
                                    }
                                    String str7 = (String) charSequence;
                                    e0 = ks0.e0(str2);
                                    if (e0 == null) {
                                        return str;
                                    }
                                    int intValue2 = e0.intValue();
                                    Integer e04 = ks0.e0(str7);
                                    int intValue3 = e04 != null ? e04.intValue() : intValue2;
                                    arrayList3.add(new go(yi.E0(yi.n0(y80.E(new Integer(intValue3), new Integer(intValue2)))), i3, intValue3, intValue2));
                                    int i27 = i5;
                                    arrayList = arrayList3;
                                    i2 = i27;
                                    i3++;
                                    str3 = str;
                                    i10 = i4;
                                    i7 = 10;
                                    i9 = 0;
                                    if (i3 >= i2) {
                                    }
                                }
                            }
                            return vnVar;
                        }
                        Iterator it5 = arrayList12.iterator();
                        if (!it5.hasNext()) {
                            o.q();
                            return str;
                        }
                        ?? r12 = (Comparable) it5.next();
                        while (it5.hasNext()) {
                            Comparable comparable = (Comparable) it5.next();
                            if (r12.compareTo(comparable) > 0) {
                                r12 = comparable;
                            }
                        }
                        int intValue4 = ((Number) r12).intValue();
                        Iterator it6 = arrayList12.iterator();
                        if (!it6.hasNext()) {
                            o.q();
                            return str;
                        }
                        ?? r14 = (Comparable) it6.next();
                        while (it6.hasNext()) {
                            Comparable comparable2 = (Comparable) it6.next();
                            if (r14.compareTo(comparable2) < 0) {
                                r14 = comparable2;
                            }
                            r14 = r14;
                        }
                        arrayList9.add(new go(yi.E0(yi.n0(arrayList12)), i3, intValue4, ((Number) r14).intValue()));
                        arrayList = arrayList9;
                        i3++;
                        str3 = str;
                        i10 = i4;
                        i7 = 10;
                        i9 = 0;
                        if (i3 >= i2) {
                        }
                        break;
                    case 3:
                        i3 = foVar.g;
                        i2 = foVar.f;
                        arrayList2 = foVar.d;
                        p10.Q(obj);
                        i4 = 1;
                        str = null;
                        charSequence2 = (CharSequence) obj;
                        if (ds0.n0(charSequence2)) {
                        }
                        String str62 = (String) charSequence2;
                        String i252 = j50.i(i3, "/sys/devices/system/cpu/cpu", "/cpufreq/cpuinfo_min_freq");
                        foVar.d = arrayList2;
                        foVar.e = str62;
                        foVar.f = i2;
                        foVar.g = i3;
                        foVar.j = 5;
                        h = h(i252, foVar);
                        if (h != vnVar) {
                        }
                        return vnVar;
                    case 4:
                        i3 = foVar.g;
                        i2 = foVar.f;
                        arrayList2 = foVar.d;
                        p10.Q(obj);
                        i4 = 1;
                        str = null;
                        charSequence2 = (String) obj;
                        String str622 = (String) charSequence2;
                        String i2522 = j50.i(i3, "/sys/devices/system/cpu/cpu", "/cpufreq/cpuinfo_min_freq");
                        foVar.d = arrayList2;
                        foVar.e = str622;
                        foVar.f = i2;
                        foVar.g = i3;
                        foVar.j = 5;
                        h = h(i2522, foVar);
                        if (h != vnVar) {
                        }
                        return vnVar;
                    case 5:
                        i3 = foVar.g;
                        int i28 = foVar.f;
                        String str8 = foVar.e;
                        ArrayList arrayList14 = foVar.d;
                        p10.Q(obj);
                        i5 = i28;
                        arrayList3 = arrayList14;
                        str2 = str8;
                        i4 = 1;
                        str = null;
                        charSequence = (CharSequence) obj;
                        if (ds0.n0(charSequence)) {
                        }
                        String str72 = (String) charSequence;
                        e0 = ks0.e0(str2);
                        if (e0 == null) {
                        }
                        break;
                    case 6:
                        i3 = foVar.g;
                        i5 = foVar.f;
                        str2 = foVar.e;
                        arrayList3 = foVar.d;
                        p10.Q(obj);
                        i4 = 1;
                        str = null;
                        charSequence = (String) obj;
                        String str722 = (String) charSequence;
                        e0 = ks0.e0(str2);
                        if (e0 == null) {
                        }
                        break;
                    default:
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        foVar = new fo(this, imVar);
        Object obj6 = foVar.h;
        i = foVar.j;
        int i72 = 10;
        ro roVar2 = a;
        int i82 = 2;
        int i92 = 0;
        int i102 = 1;
        String str32 = null;
        vn vnVar2 = vn.d;
        switch (i) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:40|41))(2:42|(1:44)(6:45|(9:48|49|50|(4:52|53|(1:55)(1:68)|(5:58|59|(1:65)|66|67)(1:57))|69|53|(0)(0)|(0)(0)|46)|72|73|74|(1:76)))|11|12|(4:15|(4:17|18|(1:20)(1:35)|(5:22|23|(1:29)|30|31)(1:33))(1:36)|34|13)|37|38))|78|6|7|(0)(0)|11|12|(1:13)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d2, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[LOOP:1: B:46:0x0049->B:57:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(im imVar) {
        ho hoVar;
        int i;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        String str;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor putString2;
        File file;
        if (imVar instanceof ho) {
            hoVar = (ho) imVar;
            int i2 = hoVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hoVar.f = i2 - Integer.MIN_VALUE;
                Object obj = hoVar.d;
                vn vnVar = vn.d;
                i = hoVar.f;
                if (i != 0) {
                    p10.Q(obj);
                    String str2 = f;
                    if (str2 != null) {
                        return str2;
                    }
                    for (int i3 = 0; i3 < 36; i3++) {
                        try {
                            file = new File(j50.i(i3, "/sys/class/thermal/thermal_zone", "/type"));
                        } catch (Exception unused) {
                        }
                        if (file.canRead()) {
                            str = ds0.E0(uv.L(file)).toString();
                            if (!(!hr.c() ? b.contains(str) : ds0.g0(str, "cpu", true))) {
                                String i4 = j50.i(i3, "/sys/class/thermal/thermal_zone", "/temp");
                                f = i4;
                                SharedPreferences sharedPreferences = g;
                                if (sharedPreferences != null && (edit2 = sharedPreferences.edit()) != null && (putString2 = edit2.putString("cpu_temp_zone_path", i4)) != null) {
                                    putString2.apply();
                                }
                                Log.d("CpuUtils", "CPU temp path found (no-root): ".concat(i4));
                                return i4;
                            }
                        }
                        str = "";
                        if (!(!hr.c() ? b.contains(str) : ds0.g0(str, "cpu", true))) {
                        }
                    }
                    Log.d("CpuUtils", "Falling back to root shell for thermal zone scan");
                    zj0 zj0Var = zj0.a;
                    String u0 = yi.u0(new k10(0, 35, 1), "\n", null, null, new ed(27), 30);
                    hoVar.f = 1;
                    obj = zj0.d(u0, hoVar);
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
                String str3 = (String) obj;
                for (String str4 : ds0.r0(str3)) {
                    int l0 = ds0.l0(str4, ':', 0, 6);
                    if (l0 >= 0) {
                        String substring = str4.substring(0, l0);
                        String obj2 = ds0.E0(str4.substring(l0 + 1)).toString();
                        if (hr.c() ? b.contains(obj2) : ds0.g0(obj2, "cpu", true)) {
                            String d2 = uo.d("/sys/class/thermal/thermal_zone", ds0.t0(substring, "zone"), "/temp");
                            f = d2;
                            SharedPreferences sharedPreferences2 = g;
                            if (sharedPreferences2 != null && (edit = sharedPreferences2.edit()) != null && (putString = edit.putString("cpu_temp_zone_path", d2)) != null) {
                                putString.apply();
                            }
                            Log.d("CpuUtils", "CPU temp path found (root fallback): ".concat(d2));
                            return d2;
                        }
                    }
                }
                return "";
            }
        }
        hoVar = new ho(this, imVar);
        Object obj3 = hoVar.d;
        vn vnVar2 = vn.d;
        i = hoVar.f;
        if (i != 0) {
        }
        String str32 = (String) obj3;
        while (r0.hasNext()) {
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ce A[Catch: Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:24:0x003f, B:25:0x01dd, B:30:0x004c, B:31:0x0070, B:33:0x0078, B:36:0x0083, B:37:0x008b, B:39:0x0091, B:42:0x009f, B:44:0x00a5, B:46:0x00b1, B:48:0x00bb, B:50:0x00d9, B:51:0x0117, B:54:0x011f, B:56:0x0131, B:57:0x0138, B:59:0x0144, B:60:0x014b, B:62:0x0157, B:63:0x015e, B:65:0x016b, B:66:0x0174, B:68:0x0181, B:69:0x0188, B:71:0x0195, B:72:0x019c, B:74:0x01a9, B:75:0x01b0, B:87:0x00e4, B:88:0x00ee, B:91:0x0107, B:98:0x01c6, B:100:0x01ce, B:103:0x01ec, B:104:0x01f4, B:106:0x01fa, B:109:0x0215, B:111:0x0223, B:112:0x022a, B:120:0x0233), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec A[Catch: Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:24:0x003f, B:25:0x01dd, B:30:0x004c, B:31:0x0070, B:33:0x0078, B:36:0x0083, B:37:0x008b, B:39:0x0091, B:42:0x009f, B:44:0x00a5, B:46:0x00b1, B:48:0x00bb, B:50:0x00d9, B:51:0x0117, B:54:0x011f, B:56:0x0131, B:57:0x0138, B:59:0x0144, B:60:0x014b, B:62:0x0157, B:63:0x015e, B:65:0x016b, B:66:0x0174, B:68:0x0181, B:69:0x0188, B:71:0x0195, B:72:0x019c, B:74:0x01a9, B:75:0x01b0, B:87:0x00e4, B:88:0x00ee, B:91:0x0107, B:98:0x01c6, B:100:0x01ce, B:103:0x01ec, B:104:0x01f4, B:106:0x01fa, B:109:0x0215, B:111:0x0223, B:112:0x022a, B:120:0x0233), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[Catch: Exception -> 0x0044, TryCatch #1 {Exception -> 0x0044, blocks: (B:24:0x003f, B:25:0x01dd, B:30:0x004c, B:31:0x0070, B:33:0x0078, B:36:0x0083, B:37:0x008b, B:39:0x0091, B:42:0x009f, B:44:0x00a5, B:46:0x00b1, B:48:0x00bb, B:50:0x00d9, B:51:0x0117, B:54:0x011f, B:56:0x0131, B:57:0x0138, B:59:0x0144, B:60:0x014b, B:62:0x0157, B:63:0x015e, B:65:0x016b, B:66:0x0174, B:68:0x0181, B:69:0x0188, B:71:0x0195, B:72:0x019c, B:74:0x01a9, B:75:0x01b0, B:87:0x00e4, B:88:0x00ee, B:91:0x0107, B:98:0x01c6, B:100:0x01ce, B:103:0x01ec, B:104:0x01f4, B:106:0x01fa, B:109:0x0215, B:111:0x0223, B:112:0x022a, B:120:0x0233), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(im imVar) {
        ko koVar;
        ?? r3;
        Map map;
        LinkedHashMap linkedHashMap;
        Map map2;
        String str;
        Map map3;
        long j;
        List list;
        try {
            if (imVar instanceof ko) {
                koVar = (ko) imVar;
                int i = koVar.h;
                if ((i & Integer.MIN_VALUE) != 0) {
                    koVar.h = i - Integer.MIN_VALUE;
                    Object obj = koVar.f;
                    r3 = koVar.h;
                    int i2 = 3;
                    int i3 = 1;
                    Object obj2 = vn.d;
                    if (r3 != 0) {
                        p10.Q(obj);
                        linkedHashMap = new LinkedHashMap();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        try {
                            koVar.d = linkedHashMap;
                            koVar.e = linkedHashMap2;
                            koVar.h = 1;
                            Object g2 = g(koVar);
                            if (g2 != obj2) {
                                map2 = linkedHashMap2;
                                obj = g2;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            map = linkedHashMap2;
                            Log.e("CpuUtils", "Failed to calculate CPU usage", e);
                            return map;
                        }
                    }
                    if (r3 != 1) {
                        if (r3 == 2) {
                            map2 = koVar.e;
                            p10.Q(obj);
                            koVar.d = null;
                            koVar.e = map2;
                            koVar.h = 3;
                            Object d2 = d(koVar);
                            return d2 != obj2 ? obj2 : d2;
                        }
                        if (r3 != 3) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = koVar.e;
                        try {
                            p10.Q(obj);
                            return obj;
                        } catch (Exception e3) {
                            e = e3;
                            Log.e("CpuUtils", "Failed to calculate CPU usage", e);
                            return map;
                        }
                    }
                    map2 = koVar.e;
                    linkedHashMap = koVar.d;
                    p10.Q(obj);
                    str = (String) obj;
                    if (!ds0.n0(str) && !ks0.c0(str, "Execution failed", false)) {
                        for (String str2 : ds0.r0(str)) {
                            if (ks0.c0(str2, "cpu", false)) {
                                Character valueOf = i2 < str2.length() ? Character.valueOf(str2.charAt(i2)) : null;
                                if (valueOf != null && Character.isDigit(valueOf.charValue()) == i3) {
                                    String obj3 = ds0.E0(str2).toString();
                                    Pattern compile = Pattern.compile("\\s+");
                                    compile.getClass();
                                    obj3.getClass();
                                    Matcher matcher = compile.matcher(obj3);
                                    if (matcher.find()) {
                                        j = 0;
                                        ArrayList arrayList = new ArrayList(10);
                                        int i4 = 0;
                                        do {
                                            arrayList.add(obj3.subSequence(i4, matcher.start()).toString());
                                            i4 = matcher.end();
                                        } while (matcher.find());
                                        arrayList.add(obj3.subSequence(i4, obj3.length()).toString());
                                        list = arrayList;
                                    } else {
                                        list = y80.D(obj3.toString());
                                        j = 0;
                                    }
                                    if (list.size() >= 8) {
                                        String str3 = (String) list.get(0);
                                        Long f0 = ks0.f0((String) list.get(i3));
                                        long longValue = f0 != null ? f0.longValue() : j;
                                        Long f02 = ks0.f0((String) list.get(2));
                                        long longValue2 = f02 != null ? f02.longValue() : j;
                                        Long f03 = ks0.f0((String) list.get(i2));
                                        long longValue3 = f03 != null ? f03.longValue() : j;
                                        Long f04 = ks0.f0((String) list.get(4));
                                        long longValue4 = f04 != null ? f04.longValue() : j;
                                        Long f05 = ks0.f0((String) list.get(5));
                                        long longValue5 = f05 != null ? f05.longValue() : j;
                                        Long f06 = ks0.f0((String) list.get(6));
                                        long longValue6 = f06 != null ? f06.longValue() : j;
                                        Long f07 = ks0.f0((String) list.get(7));
                                        linkedHashMap.put(str3, new co(longValue4, longValue + longValue2 + longValue3 + longValue4 + longValue5 + longValue6 + (f07 != null ? f07.longValue() : j)));
                                    }
                                }
                                i2 = 3;
                                i3 = 1;
                            }
                        }
                        map3 = e;
                        if (map3 != null) {
                            e = linkedHashMap;
                            koVar.d = null;
                            koVar.e = map2;
                            koVar.h = 2;
                            if (y80.p(100L, koVar) == obj2) {
                            }
                            koVar.d = null;
                            koVar.e = map2;
                            koVar.h = 3;
                            Object d22 = d(koVar);
                            if (d22 != obj2) {
                            }
                        } else {
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                String str4 = (String) entry.getKey();
                                co coVar = (co) entry.getValue();
                                co coVar2 = (co) map3.get(str4);
                                if (coVar2 != null) {
                                    long j2 = coVar.b - coVar2.b;
                                    map2.put(str4, new Integer(j2 > 0 ? (int) (((j2 - (coVar.a - coVar2.a)) * 100) / j2) : 0));
                                }
                            }
                            e = linkedHashMap;
                        }
                    }
                    return map2;
                }
            }
            if (r3 != 0) {
            }
            str = (String) obj;
            if (!ds0.n0(str)) {
                while (r1.hasNext()) {
                }
                map3 = e;
                if (map3 != null) {
                }
            }
            return map2;
        } catch (Exception e4) {
            e = e4;
            map = r3;
        }
        koVar = new ko(this, imVar);
        Object obj4 = koVar.f;
        r3 = koVar.h;
        int i22 = 3;
        int i32 = 1;
        Object obj22 = vn.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(im imVar) {
        no noVar;
        int i;
        try {
            if (imVar instanceof no) {
                noVar = (no) imVar;
                int i2 = noVar.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    noVar.f = i2 - Integer.MIN_VALUE;
                    Object obj = noVar.d;
                    i = noVar.f;
                    if (i != 0) {
                        p10.Q(obj);
                        zj0 zj0Var = zj0.a;
                        noVar.f = 1;
                        obj = zj0.d("cat /proc/stat 2>/dev/null", noVar);
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
                    return (String) obj;
                }
            }
            if (i != 0) {
            }
            return (String) obj;
        } catch (Exception unused) {
            return "";
        }
        noVar = new no(this, imVar);
        Object obj2 = noVar.d;
        i = noVar.f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(4:18|19|20|21))(3:22|23|24))(3:26|(3:28|(1:40)(2:32|(2:34|35)(4:36|(1:38)|20|21))|39)|42)|43|42))|7|(0)(0)|43|42) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        if (r9 == r8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        r9 = defpackage.zj0.a;
        r0.d = null;
        r0.g = 3;
        r9 = defpackage.zj0.d("cat " + r10 + " 2>/dev/null", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        if (r9 == r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, im imVar) {
        oo ooVar;
        int i;
        try {
            if (imVar instanceof oo) {
                ooVar = (oo) imVar;
                int i2 = ooVar.g;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ooVar.g = i2 - Integer.MIN_VALUE;
                    Object obj = ooVar.e;
                    i = ooVar.g;
                    vn vnVar = vn.d;
                    if (i == 0) {
                        if (i == 1) {
                            p10.Q(obj);
                            return ds0.E0((String) obj).toString();
                        }
                        if (i == 2) {
                            String str2 = ooVar.d;
                            p10.Q(obj);
                            return ds0.E0((String) obj).toString();
                        }
                        if (i == 3) {
                            p10.Q(obj);
                            return ds0.E0((String) obj).toString();
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    if (str.length() != 0) {
                        if (!ds0.g0(str, "/thermal/", false) && !str.equals("/proc/stat")) {
                            File file = new File(str);
                            if (file.canRead()) {
                                return ds0.E0(uv.L(file)).toString();
                            }
                            zj0 zj0Var = zj0.a;
                            ooVar.d = str;
                            ooVar.g = 2;
                            obj = zj0.d("cat " + str + " 2>/dev/null", ooVar);
                            if (obj == vnVar) {
                            }
                            return ds0.E0((String) obj).toString();
                        }
                        zj0 zj0Var2 = zj0.a;
                        ooVar.d = null;
                        ooVar.g = 1;
                        obj = zj0.d("cat " + str + " 2>/dev/null", ooVar);
                        return vnVar;
                    }
                    return "";
                    return "";
                }
            }
            if (i == 0) {
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
        ooVar = new oo(this, imVar);
        Object obj2 = ooVar.e;
        i = ooVar.g;
        vn vnVar2 = vn.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x025c -> B:11:0x0267). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(im imVar) {
        po poVar;
        int i;
        List list;
        ArrayList arrayList;
        Iterator it;
        int i2;
        int i3;
        ArrayList arrayList2;
        Iterator it2;
        int i4;
        int i5;
        int i6;
        String str;
        Collection collection;
        int i7;
        int i8;
        k10 k10Var;
        Matcher matcher;
        ArrayList arrayList3;
        List list2;
        Iterator it3;
        int size;
        int i9;
        List E0;
        List list3;
        int i10;
        int intValue;
        if (imVar instanceof po) {
            poVar = (po) imVar;
            int i11 = poVar.r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                poVar.r = i11 - Integer.MIN_VALUE;
                Object obj = poVar.p;
                i = poVar.r;
                ro roVar = a;
                int i12 = 1;
                vn vnVar = vn.d;
                if (i != 0) {
                    list = null;
                    p10.Q(obj);
                    List E = hr.d() ? y80.E(new kw0("Little", new k10(0, 3, 1), new Integer(Integer.parseInt("300000"))), new kw0("Middle", new k10(4, 6, 1), new Integer(Integer.parseInt("710000"))), new kw0("Big", new k10(7, 7, 1), new Integer(Integer.parseInt("844000")))) : y80.E(new kw0("Little", new k10(0, 3, 1), new Integer(Integer.parseInt("691200"))), new kw0("Big", new k10(4, 6, 1), new Integer(Integer.parseInt("691200"))));
                    arrayList = new ArrayList(zi.a0(E, 10));
                    it = E.iterator();
                    i2 = 0;
                    i3 = 0;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        int i13 = poVar.o;
                        i8 = poVar.n;
                        i7 = poVar.m;
                        int i14 = poVar.l;
                        int i15 = poVar.k;
                        Collection collection2 = poVar.h;
                        k10 k10Var2 = poVar.g;
                        String str2 = poVar.f;
                        it2 = poVar.e;
                        collection = poVar.d;
                        p10.Q(obj);
                        i6 = i13;
                        k10Var = k10Var2;
                        i4 = i15;
                        arrayList2 = collection2;
                        i5 = i14;
                        str = str2;
                        String obj2 = ds0.E0((String) obj).toString();
                        Pattern compile = Pattern.compile("\\s+");
                        compile.getClass();
                        obj2.getClass();
                        matcher = compile.matcher(obj2);
                        if (matcher.find()) {
                        }
                        ArrayList arrayList4 = new ArrayList();
                        it3 = list2.iterator();
                        while (it3.hasNext()) {
                        }
                        ArrayList arrayList5 = new ArrayList();
                        size = arrayList4.size();
                        i9 = 0;
                        while (i9 < size) {
                        }
                        E0 = yi.E0(yi.n0(arrayList5));
                        String i16 = j50.i(i6, "/sys/devices/system/cpu/cpu", "/cpufreq/cpuinfo_max_freq");
                        poVar.d = arrayList3;
                        poVar.e = it2;
                        poVar.f = str;
                        poVar.g = k10Var;
                        list3 = null;
                        poVar.h = null;
                        poVar.i = E0;
                        poVar.j = arrayList2;
                        poVar.k = i4;
                        poVar.l = i5;
                        poVar.m = i7;
                        poVar.n = i8;
                        poVar.o = i6;
                        poVar.r = 2;
                        obj = roVar.h(i16, poVar);
                        if (obj != vnVar) {
                        }
                        return vnVar;
                    }
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i17 = poVar.n;
                    int i18 = poVar.l;
                    i3 = poVar.k;
                    Collection collection3 = poVar.j;
                    E0 = poVar.i;
                    k10 k10Var3 = poVar.g;
                    String str3 = poVar.f;
                    Iterator it4 = poVar.e;
                    Collection collection4 = poVar.d;
                    p10.Q(obj);
                    list3 = null;
                    String str4 = str3;
                    k10 k10Var4 = k10Var3;
                    it2 = it4;
                    ArrayList arrayList6 = collection4;
                    Integer e0 = ks0.e0((String) obj);
                    if (e0 != null) {
                        Integer num = (Integer) yi.x0(E0);
                        if (num == null) {
                            i10 = i17;
                            if (E0.size() < 2) {
                                Integer[] numArr = {new Integer(i17), e0};
                                ArrayList arrayList7 = new ArrayList();
                                for (int i19 = 0; i19 < 2; i19++) {
                                    Integer num2 = numArr[i19];
                                    if (num2 != null) {
                                        arrayList7.add(num2);
                                    }
                                }
                                E0 = yi.E0(yi.n0(arrayList7));
                            }
                            collection3.add(new zn(str4, k10Var4, i17, i10, E0));
                            arrayList = arrayList6;
                            list = list3;
                            i2 = i18;
                            it = it2;
                            i12 = 1;
                            if (!it.hasNext()) {
                                return new bo(arrayList);
                            }
                            kw0 kw0Var = (kw0) it.next();
                            String str5 = (String) kw0Var.d;
                            k10 k10Var5 = (k10) kw0Var.e;
                            int intValue2 = ((Number) kw0Var.f).intValue();
                            i6 = k10Var5.d;
                            String i20 = j50.i(i6, "/sys/devices/system/cpu/cpu", "/cpufreq/scaling_available_frequencies");
                            ArrayList arrayList8 = arrayList;
                            poVar.d = arrayList8;
                            poVar.e = it;
                            poVar.f = str5;
                            poVar.g = k10Var5;
                            poVar.h = arrayList8;
                            List list4 = list;
                            poVar.i = list4;
                            poVar.j = list4;
                            poVar.k = i3;
                            poVar.l = i2;
                            poVar.m = 0;
                            poVar.n = intValue2;
                            poVar.o = i6;
                            poVar.r = i12;
                            Object h = roVar.h(i20, poVar);
                            if (h != vnVar) {
                                it2 = it;
                                arrayList2 = arrayList;
                                obj = h;
                                k10Var = k10Var5;
                                i4 = i3;
                                i5 = i2;
                                i8 = intValue2;
                                str = str5;
                                i7 = 0;
                                collection = arrayList2;
                                String obj22 = ds0.E0((String) obj).toString();
                                Pattern compile2 = Pattern.compile("\\s+");
                                compile2.getClass();
                                obj22.getClass();
                                matcher = compile2.matcher(obj22);
                                if (matcher.find()) {
                                    list2 = y80.D(obj22.toString());
                                    arrayList3 = collection;
                                } else {
                                    arrayList3 = collection;
                                    ArrayList arrayList9 = new ArrayList(10);
                                    int i21 = 0;
                                    do {
                                        arrayList9.add(obj22.subSequence(i21, matcher.start()).toString());
                                        i21 = matcher.end();
                                    } while (matcher.find());
                                    arrayList9.add(obj22.subSequence(i21, obj22.length()).toString());
                                    list2 = arrayList9;
                                }
                                ArrayList arrayList42 = new ArrayList();
                                it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Integer e02 = ks0.e0((String) it3.next());
                                    if (e02 != null) {
                                        arrayList42.add(e02);
                                    }
                                }
                                ArrayList arrayList52 = new ArrayList();
                                size = arrayList42.size();
                                i9 = 0;
                                while (i9 < size) {
                                    int i22 = size;
                                    Object obj3 = arrayList42.get(i9);
                                    i9++;
                                    if (((Number) obj3).intValue() > 0) {
                                        arrayList52.add(obj3);
                                    }
                                    size = i22;
                                }
                                E0 = yi.E0(yi.n0(arrayList52));
                                String i162 = j50.i(i6, "/sys/devices/system/cpu/cpu", "/cpufreq/cpuinfo_max_freq");
                                poVar.d = arrayList3;
                                poVar.e = it2;
                                poVar.f = str;
                                poVar.g = k10Var;
                                list3 = null;
                                poVar.h = null;
                                poVar.i = E0;
                                poVar.j = arrayList2;
                                poVar.k = i4;
                                poVar.l = i5;
                                poVar.m = i7;
                                poVar.n = i8;
                                poVar.o = i6;
                                poVar.r = 2;
                                obj = roVar.h(i162, poVar);
                                if (obj != vnVar) {
                                    k10Var4 = k10Var;
                                    i17 = i8;
                                    str4 = str;
                                    i18 = i5;
                                    i3 = i4;
                                    collection3 = arrayList2;
                                    arrayList6 = arrayList3;
                                    Integer e03 = ks0.e0((String) obj);
                                    if (e03 != null) {
                                        intValue = e03.intValue();
                                    }
                                }
                            }
                            return vnVar;
                        }
                        intValue = num.intValue();
                    }
                    i10 = intValue;
                    if (E0.size() < 2) {
                    }
                    collection3.add(new zn(str4, k10Var4, i17, i10, E0));
                    arrayList = arrayList6;
                    list = list3;
                    i2 = i18;
                    it = it2;
                    i12 = 1;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        poVar = new po(this, imVar);
        Object obj4 = poVar.p;
        i = poVar.r;
        ro roVar2 = a;
        int i122 = 1;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
    }
}
