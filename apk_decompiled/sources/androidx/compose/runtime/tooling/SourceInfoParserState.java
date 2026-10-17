package androidx.compose.runtime.tooling;

import defpackage.ds0;
import defpackage.ks0;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SourceInfoParserState {
    private final String data;
    private int i;

    public SourceInfoParserState(String str) {
        this.data = str;
    }

    public static /* synthetic */ void advance$default(SourceInfoParserState sourceInfoParserState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        sourceInfoParserState.advance(i);
    }

    public final void advance(int i) {
        this.i += i;
    }

    public final boolean atEnd() {
        return this.i >= this.data.length();
    }

    public final char current() {
        return this.data.charAt(this.i);
    }

    public final void expect(char c) {
        if (matches(c)) {
            return;
        }
        throwParseError("expected " + c);
        o.j();
    }

    public final String getData() {
        return this.data;
    }

    public final int getI() {
        return this.i;
    }

    public final boolean matches(char c) {
        return this.i < this.data.length() && this.data.charAt(this.i) == c;
    }

    public final void setI(int i) {
        this.i = i;
    }

    public final void skipUntil(String str) {
        while (this.i < this.data.length() && !ds0.h0(str, this.data.charAt(this.i))) {
            this.i++;
        }
    }

    public final int takeIntUntil(String str) {
        Integer e0 = ks0.e0(takeUntil(str));
        if (e0 != null) {
            return e0.intValue();
        }
        throwParseError("expected int");
        o.j();
        return 0;
    }

    public final String takeUntil(String str) {
        int i = this.i;
        skipUntil(str);
        int i2 = this.i;
        return i2 > i ? this.data.substring(i, i2) : "";
    }

    public final String takeUntilEnd() {
        String str = this.data;
        return str.substring(this.i, str.length());
    }

    public final Void throwParseError(String str) {
        int min = Math.min(this.i, this.data.length());
        throw new ParseException("Error while parsing source information: " + str + " at " + this.data.substring(0, min) + '|' + this.data.substring(min));
    }
}
