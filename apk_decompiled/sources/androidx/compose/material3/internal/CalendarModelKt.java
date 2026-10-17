package androidx.compose.material3.internal;

import defpackage.cq;
import defpackage.ds0;
import defpackage.ks0;
import defpackage.q80;
import defpackage.u80;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000;

    public static final DateInputFormat datePatternAsInputFormat(String str) {
        Pattern compile = Pattern.compile("[^dMy/\\-.]");
        compile.getClass();
        str.getClass();
        String replaceAll = compile.matcher(str).replaceAll("");
        replaceAll.getClass();
        Pattern compile2 = Pattern.compile("d{1,2}");
        compile2.getClass();
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("dd");
        replaceAll2.getClass();
        Pattern compile3 = Pattern.compile("M{1,2}");
        compile3.getClass();
        String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("MM");
        replaceAll3.getClass();
        Pattern compile4 = Pattern.compile("y{1,4}");
        compile4.getClass();
        String replaceAll4 = compile4.matcher(replaceAll3).replaceAll("yyyy");
        replaceAll4.getClass();
        String b0 = ks0.b0(replaceAll4, "My", "M/y");
        if (ds0.j0(b0, ".")) {
            b0 = b0.substring(0, b0.length() - ".".length());
        }
        Pattern compile5 = Pattern.compile("[/\\-.]");
        compile5.getClass();
        Matcher matcher = compile5.matcher(b0);
        matcher.getClass();
        u80 n = cq.n(matcher, 0, b0);
        n.getClass();
        q80 a = n.c.a(0);
        a.getClass();
        return new DateInputFormat(b0, a.a.charAt(0));
    }
}
