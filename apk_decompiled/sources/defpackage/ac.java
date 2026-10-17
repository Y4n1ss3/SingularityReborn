package defpackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ac extends q10 {
    public static List K(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static boolean L(Object[] objArr, Object obj) {
        objArr.getClass();
        return g0(objArr, obj) >= 0;
    }

    public static void M(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void N(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
    }

    public static void O(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void P(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void Q(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void S(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        O(iArr, iArr2, i, 0, i2);
    }

    public static /* synthetic */ void U(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        Q(objArr, objArr2, 0, i, i2);
    }

    public static Object[] V(Object[] objArr, int i, int i2) {
        objArr.getClass();
        q10.j(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static List W(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0) {
            o.c(j50.i(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            o.c(j50.i(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return ut.d;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return n0(objArr);
        }
        if (length == 1) {
            return y80.D(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = length2 - length; i2 < length2; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static void X(Object[] objArr, int i, int i2, Object obj) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void Y(int[] iArr, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        iArr.getClass();
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void Z(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static Object a0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Float b0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static Object c0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static k10 d0(int[] iArr) {
        return new k10(0, iArr.length - 1, 1);
    }

    public static int e0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int f0(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static int g0(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String h0(String str, Object[] objArr) {
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            p10.c(sb, obj, null);
        }
        sb.append((CharSequence) ")");
        return sb.toString();
    }

    public static Float i0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static int j0(int[] iArr) {
        if (iArr.length == 0) {
            o.q();
            return 0;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static char k0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        o.m("Array has more than one element.");
        return (char) 0;
    }

    public static List l0(Object[] objArr, k10 k10Var) {
        objArr.getClass();
        k10Var.getClass();
        if (k10Var.isEmpty()) {
            return ut.d;
        }
        List asList = Arrays.asList(V(objArr, k10Var.d, k10Var.e + 1));
        asList.getClass();
        return asList;
    }

    public static final void m0(Object[] objArr, AbstractSet abstractSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List n0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new ob(objArr, false)) : y80.D(objArr[0]) : ut.d;
    }

    public static Set o0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return xt.d;
        }
        if (length == 1) {
            return p01.C(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(p80.L(objArr.length));
        m0(objArr, linkedHashSet);
        return linkedHashSet;
    }
}
