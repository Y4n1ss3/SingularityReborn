package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class u80 implements r80 {
    public final Matcher a;
    public final CharSequence b;
    public final t80 c;
    public s80 d;

    public u80(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new t80(this);
    }

    public final List a() {
        s80 s80Var = this.d;
        if (s80Var != null) {
            return s80Var;
        }
        s80 s80Var2 = new s80(this);
        this.d = s80Var2;
        return s80Var2;
    }

    public final k10 b() {
        Matcher matcher = this.a;
        return y80.W(matcher.start(), matcher.end());
    }

    public final u80 c() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return cq.n(matcher2, end, charSequence);
    }
}
