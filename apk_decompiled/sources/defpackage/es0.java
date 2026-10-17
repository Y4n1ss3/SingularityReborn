package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class es0 extends p10 {
    public static String W(String str) {
        List r0 = ds0.r0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : r0) {
            if (!ds0.n0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(zi.a0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!cq.y(str2.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i3));
        }
        Integer num = (Integer) yi.y0(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        r0.size();
        int size2 = r0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = r0.iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length2);
                yi.t0(arrayList3, sb, null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                y80.V();
                throw null;
            }
            String str4 = (String) next;
            if ((i != 0 && i != size2) || !ds0.n0(str4)) {
                str4.getClass();
                if (intValue >= 0) {
                    int length3 = str4.length();
                    if (intValue <= length3) {
                        length3 = intValue;
                    }
                    str3 = str4.substring(length3);
                } else {
                    o.c(j50.i(intValue, "Requested character count ", " is less than zero."));
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i4;
        }
    }

    public static String X(String str) {
        if (ds0.n0("|")) {
            o.m("marginPrefix must be non-blank string.");
            return null;
        }
        List r0 = ds0.r0(str);
        int length = str.length();
        r0.size();
        int size = r0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : r0) {
            int i2 = i + 1;
            if (i < 0) {
                y80.V();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && ds0.n0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!cq.y(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        yi.t0(arrayList, sb, null, 124);
        return sb.toString();
    }
}
