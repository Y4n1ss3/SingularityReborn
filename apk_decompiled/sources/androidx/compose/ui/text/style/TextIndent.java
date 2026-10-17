package androidx.compose.ui.text.style;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextIndent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    public /* synthetic */ TextIndent(long j, long j2, int i, dq dqVar) {
        this((i & 1) != 0 ? TextUnitKt.getSp(0) : j, (i & 2) != 0 ? TextUnitKt.getSp(0) : j2, null);
    }

    /* renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ TextIndent m7517copyNB67dxo$default(TextIndent textIndent, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = textIndent.firstLine;
        }
        if ((i & 2) != 0) {
            j2 = textIndent.restLine;
        }
        return textIndent.m7518copyNB67dxo(j, j2);
    }

    /* renamed from: copy-NB67dxo, reason: not valid java name */
    public final TextIndent m7518copyNB67dxo(long j, long j2) {
        return new TextIndent(j, j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.m7802equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m7802equalsimpl0(this.restLine, textIndent.restLine);
    }

    /* renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m7519getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m7520getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return TextUnit.m7806hashCodeimpl(this.restLine) + (TextUnit.m7806hashCodeimpl(this.firstLine) * 31);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m7812toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m7812toStringimpl(this.restLine)) + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final TextIndent getNone() {
            return TextIndent.None;
        }

        private Companion() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }
    }

    private TextIndent(long j, long j2) {
        this.firstLine = j;
        this.restLine = j2;
    }

    public /* synthetic */ TextIndent(long j, long j2, dq dqVar) {
        this(j, j2);
    }
}
