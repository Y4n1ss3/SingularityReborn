package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ni0 implements Serializable {
    public final Pattern d;

    public ni0(String str) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.d = compile;
    }

    public final String a(String str, ky kyVar) {
        str.getClass();
        Matcher matcher = this.d.matcher(str);
        matcher.getClass();
        int i = 0;
        u80 n = cq.n(matcher, 0, str);
        if (n == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, n.b().d);
            sb.append((CharSequence) kyVar.invoke(n));
            i = n.b().e + 1;
            n = n.c();
            if (i >= length) {
                break;
            }
        } while (n != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String toString() {
        String pattern = this.d.toString();
        pattern.getClass();
        return pattern;
    }
}
