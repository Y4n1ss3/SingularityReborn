package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchBarColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long dividerColor;
    private final TextFieldColors inputFieldColors;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SearchBarColors(long j, long j2) {
        this(j, j2, r5, null);
        TextFieldColors textFieldColors;
        textFieldColors = SearchBarKt.UnspecifiedTextFieldColors;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarColors)) {
            return false;
        }
        SearchBarColors searchBarColors = (SearchBarColors) obj;
        return Color.m4762equalsimpl0(this.containerColor, searchBarColors.containerColor) && Color.m4762equalsimpl0(this.dividerColor, searchBarColors.dividerColor) && q10.b(this.inputFieldColors, searchBarColors.inputFieldColors);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2303getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m2304getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    public final TextFieldColors getInputFieldColors() {
        return this.inputFieldColors;
    }

    public int hashCode() {
        return this.inputFieldColors.hashCode() + kp0.d(this.dividerColor, Color.m4768hashCodeimpl(this.containerColor) * 31, 31);
    }

    public /* synthetic */ SearchBarColors(long j, long j2, TextFieldColors textFieldColors, dq dqVar) {
        this(j, j2, textFieldColors);
    }

    private SearchBarColors(long j, long j2, TextFieldColors textFieldColors) {
        this.containerColor = j;
        this.dividerColor = j2;
        this.inputFieldColors = textFieldColors;
    }

    @er
    public /* synthetic */ SearchBarColors(long j, long j2, dq dqVar) {
        this(j, j2);
    }
}
