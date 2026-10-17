package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class ds0 extends ks0 {
    public static String A0(String str, char c) {
        str.getClass();
        str.getClass();
        int l0 = l0(str, c, 0, 6);
        return l0 == -1 ? str : str.substring(0, l0);
    }

    public static String B0(String str, String str2) {
        str.getClass();
        str.getClass();
        int m0 = m0(str, str2, 0, false, 6);
        return m0 == -1 ? str : str.substring(0, m0);
    }

    public static String C0(int i, String str) {
        str.getClass();
        if (i < 0) {
            o.c(j50.i(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static void D0(CharSequence charSequence, PersistentCollection.Builder builder) {
        charSequence.getClass();
        builder.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            builder.add(Character.valueOf(charSequence.charAt(i)));
        }
    }

    public static CharSequence E0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean y = cq.y(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!y) {
                    break;
                }
                length--;
            } else if (y) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence F0(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!cq.y(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String G0(String str, char... cArr) {
        CharSequence charSequence;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char charAt = str.charAt(length);
                int length2 = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        i2 = -1;
                        break;
                    }
                    if (charAt == cArr[i2]) {
                        break;
                    }
                    i2++;
                }
                if (i2 < 0) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static CharSequence H0(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!cq.y(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int i;
        charSequence.getClass();
        charSequence2.getClass();
        boolean z2 = charSequence2 instanceof String;
        if (z2) {
            return m0(charSequence, (String) charSequence2, 0, z, 2) >= 0;
        }
        int length = charSequence.length();
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        k10 k10Var = new k10(0, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = k10Var.f;
        int i3 = k10Var.e;
        if (z3 && z2) {
            if ((i2 > 0 && i3 >= 0) || (i2 < 0 && i3 <= 0)) {
                i = 0;
                while (true) {
                    String str = (String) charSequence2;
                    String str2 = (String) charSequence;
                    int length3 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i, length3) : str.regionMatches(z, 0, str2, i, length3))) {
                        if (i == i3) {
                            break;
                        }
                        i += i2;
                    } else {
                        break;
                    }
                }
            }
            i = -1;
            if (i >= 0) {
            }
        } else {
            if ((i2 > 0 && i3 >= 0) || (i2 < 0 && i3 <= 0)) {
                int i4 = 0;
                while (!s0(charSequence2, 0, charSequence, i4, charSequence2.length(), z)) {
                    if (i4 != i3) {
                        i4 += i2;
                    }
                }
                i = i4;
                if (i >= 0) {
                }
            }
            i = -1;
            if (i >= 0) {
            }
        }
    }

    public static boolean h0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return l0(charSequence, c, 0, 2) >= 0;
    }

    public static boolean j0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ks0.Z((String) charSequence, str, false) : s0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int k0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        k10 k10Var = new k10(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = k10Var.f;
        int i4 = k10Var.e;
        if (!z2) {
            if ((i3 <= 0 || i2 > i4) && (i3 >= 0 || i4 > i2)) {
                return -1;
            }
            int i5 = i2;
            while (!s0(str, 0, charSequence, i5, str.length(), z)) {
                if (i5 == i4) {
                    return -1;
                }
                i5 += i3;
            }
            return i5;
        }
        if ((i3 <= 0 || i2 > i4) && (i3 >= 0 || i4 > i2)) {
            return -1;
        }
        int i6 = i2;
        while (true) {
            String str2 = (String) charSequence;
            int length3 = str.length();
            if (!z ? str.regionMatches(0, str2, i6, length3) : str.regionMatches(z, 0, str2, i6, length3)) {
                return i6;
            }
            if (i6 == i4) {
                return -1;
            }
            i6 += i3;
        }
    }

    public static int l0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(ac.k0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (!cq.m(cArr[0], charSequence.charAt(i), false)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static /* synthetic */ int m0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return k0(charSequence, str, i, z);
    }

    public static boolean n0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!cq.y(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char o0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int p0(CharSequence charSequence, char c) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, length);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ac.k0(cArr), length);
        }
        int length2 = charSequence.length() - 1;
        if (length > length2) {
            length = length2;
        }
        while (-1 < length) {
            if (cq.m(cArr[0], charSequence.charAt(length), false)) {
                return length;
            }
            length--;
        }
        return -1;
    }

    public static cc q0(CharSequence charSequence) {
        charSequence.getClass();
        return new cc(charSequence, 5);
    }

    public static List r0(CharSequence charSequence) {
        charSequence.getClass();
        f50 f50Var = new f50(charSequence);
        if (!f50Var.hasNext()) {
            return ut.d;
        }
        Object next = f50Var.next();
        if (!f50Var.hasNext()) {
            return y80.D(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (f50Var.hasNext()) {
            arrayList.add(f50Var.next());
        }
        return arrayList;
    }

    public static final boolean s0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!cq.m(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String t0(String str, String str2) {
        str.getClass();
        return ks0.c0(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static StringBuilder u0(String str, int i, int i2, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        if (i2 < i) {
            o.r(") is less than start index (", i2, i, "End index (");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, i);
        sb.append(charSequence);
        sb.append((CharSequence) str, i2, str.length());
        return sb;
    }

    public static final List v0(CharSequence charSequence, String str) {
        int k0 = k0(charSequence, str, 0, false);
        if (k0 == -1) {
            return y80.D(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, k0).toString());
            i = str.length() + k0;
            k0 = k0(charSequence, str, i, false);
        } while (k0 != -1);
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public static List w0(String str, String[] strArr) {
        str.getClass();
        int i = 0;
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return v0(str, str2);
            }
        }
        List asList = Arrays.asList(strArr);
        asList.getClass();
        bc bcVar = new bc(new br(str, new w5(asList, 16), i), 6);
        ArrayList arrayList = new ArrayList(zi.a0(bcVar, 10));
        Iterator it = bcVar.iterator();
        while (true) {
            ar arVar = (ar) it;
            if (!arVar.hasNext()) {
                return arrayList;
            }
            k10 k10Var = (k10) arVar.next();
            k10Var.getClass();
            arrayList.add(str.subSequence(k10Var.d, k10Var.e + 1).toString());
        }
    }

    public static String x0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int m0 = m0(str, str2, 0, false, 6);
        return m0 == -1 ? str3 : str.substring(str2.length() + m0, str.length());
    }

    public static String z0(String str) {
        int p0 = p0(str, '/');
        return p0 == -1 ? str : str.substring(p0 + 1, str.length());
    }
}
